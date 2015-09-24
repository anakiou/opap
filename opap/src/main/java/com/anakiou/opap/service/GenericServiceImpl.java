package com.anakiou.opap.service;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.anakiou.opap.model.GameName;

public abstract class GenericServiceImpl<T, S> implements GenericService<T, S> {

    private final Class<T> typeT;
    private final Class<S> typeS;

    private static final Logger log = LoggerFactory.getLogger(GenericServiceImpl.class);

    private final RestTemplate restTemplate;

    private final GameName gameName;

    private final String BASE_URL_BY_NO      = "http://applications.opap.gr/DrawsRestServices/%1$s/%2$d.json";
    private final String BASE_URL_LAST       = "http://applications.opap.gr/DrawsRestServices/%1$s/last.json";
    private final String BASE_URL_dd_MM_yyyy = "http://applications.opap.gr/DrawsRestServices/%1$s/drawDate/%2$d-%3$d-%4$d.json";

    @SuppressWarnings("unchecked")
    @Autowired
    public GenericServiceImpl(final RestTemplate restTemplate, GameName gameName) {
        final Type t = getClass().getGenericSuperclass();
        final ParameterizedType pt = (ParameterizedType) t;
        typeT = (Class<T>) pt.getActualTypeArguments()[0];
        typeS = (Class<S>) pt.getActualTypeArguments()[1];
        this.restTemplate = restTemplate;
        this.gameName = gameName;
    }

    @Override
    public T getDrawByNo(int no) {
        if (log.isDebugEnabled()) {
            log.debug("New {} GET request {} -> {}", typeT.getSimpleName(), "getDrawByNo", getByNoURL(no));
        }
        return restTemplate.getForObject(getByNoURL(no), typeT);
    }

    @Override
    public T getLatestDraw() {
        if (log.isDebugEnabled()) {
            log.debug("New {} GET request {} -> {}", typeT.getSimpleName(), "getLatestDraw", getLatestURL());
        }

        return restTemplate.getForObject(getLatestURL(), typeT);
    }

    @Override
    public S getDrawsForDate(int dayOfMonth, int month, int year) {
        if (log.isDebugEnabled()) {
            log.debug("New {} GET request {} -> {}", typeS.getSimpleName(), "getDrawsForDate", getByDateURL(dayOfMonth, month, year));
        }

        return restTemplate.getForObject(getByDateURL(dayOfMonth, month, year), typeS);
    }

    public String getByNoURL(int no) {
        return String.format(BASE_URL_BY_NO, gameName.getName(), no);
    }

    public String getLatestURL() {
        return String.format(BASE_URL_LAST, gameName.getName());
    }

    public String getByDateURL(int dayOfMonth, int month, int year) {
        return String.format(BASE_URL_dd_MM_yyyy, gameName.getName(), dayOfMonth, month, year);
    }

}
