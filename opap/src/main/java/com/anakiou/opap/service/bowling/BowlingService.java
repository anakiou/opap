package com.anakiou.opap.service.bowling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.anakiou.opap.model.GameName;
import com.anakiou.opap.model.bowling.BowlingDraw;
import com.anakiou.opap.model.bowling.BowlingDraws;
import com.anakiou.opap.service.GenericServiceImpl;

@Service
public class BowlingService extends GenericServiceImpl<BowlingDraw, BowlingDraws> {

    @SuppressWarnings("unused")
    private RestTemplate restTemplate;

    @Autowired
    public BowlingService(final RestTemplate restTemplate) {
        super(restTemplate, GameName.KINO);
    }

}
