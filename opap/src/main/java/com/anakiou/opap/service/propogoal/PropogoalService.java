package com.anakiou.opap.service.propogoal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.anakiou.opap.model.GameName;
import com.anakiou.opap.model.propogoal.PropogoalDraw;
import com.anakiou.opap.model.propogoal.PropogoalDraws;
import com.anakiou.opap.service.GenericServiceImpl;

@Service
public class PropogoalService extends GenericServiceImpl<PropogoalDraw, PropogoalDraws> {

    @SuppressWarnings("unused")
    private RestTemplate restTemplate;

    @Autowired
    public PropogoalService(final RestTemplate restTemplate) {
        super(restTemplate, GameName.PROPOGOAL);
    }

}
