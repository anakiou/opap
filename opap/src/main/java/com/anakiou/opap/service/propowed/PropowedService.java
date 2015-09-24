package com.anakiou.opap.service.propowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.anakiou.opap.model.GameName;
import com.anakiou.opap.model.propowed.PropowedDraw;
import com.anakiou.opap.model.propowed.PropowedDraws;
import com.anakiou.opap.service.GenericServiceImpl;

@Service
public class PropowedService extends GenericServiceImpl<PropowedDraw, PropowedDraws> {

    @SuppressWarnings("unused")
    private RestTemplate restTemplate;

    @Autowired
    public PropowedService(final RestTemplate restTemplate) {
        super(restTemplate, GameName.PROPOWED);
    }

}
