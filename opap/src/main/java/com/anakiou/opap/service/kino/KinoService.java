package com.anakiou.opap.service.kino;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.anakiou.opap.model.GameName;
import com.anakiou.opap.model.kino.KinoDraw;
import com.anakiou.opap.model.kino.KinoDraws;
import com.anakiou.opap.service.GenericServiceImpl;

@Service
public class KinoService extends GenericServiceImpl<KinoDraw, KinoDraws> {

    @SuppressWarnings("unused")
    private RestTemplate restTemplate;

    @Autowired
    public KinoService(RestTemplate restTemplate) {
        super(restTemplate, GameName.KINO);
    }

}
