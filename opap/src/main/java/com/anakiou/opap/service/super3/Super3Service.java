package com.anakiou.opap.service.super3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.anakiou.opap.model.GameName;
import com.anakiou.opap.model.super3.Super3Draw;
import com.anakiou.opap.model.super3.Super3Draws;
import com.anakiou.opap.service.GenericServiceImpl;

@Service
public class Super3Service extends GenericServiceImpl<Super3Draw, Super3Draws> {

    @SuppressWarnings("unused")
    private RestTemplate restTemplate;

    @Autowired
    public Super3Service(final RestTemplate restTemplate) {
        super(restTemplate, GameName.SUPER3);
    }

}
