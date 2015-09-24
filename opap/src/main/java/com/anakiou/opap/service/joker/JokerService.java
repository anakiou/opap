package com.anakiou.opap.service.joker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.anakiou.opap.model.GameName;
import com.anakiou.opap.model.joker.JokerDraw;
import com.anakiou.opap.model.joker.JokerDraws;
import com.anakiou.opap.service.GenericServiceImpl;

@Service
public class JokerService extends GenericServiceImpl<JokerDraw, JokerDraws> {

    @SuppressWarnings("unused")
    private RestTemplate restTemplate;

    @Autowired
    public JokerService(RestTemplate restTemplate) {
        super(restTemplate, GameName.JOKER);
    }

}