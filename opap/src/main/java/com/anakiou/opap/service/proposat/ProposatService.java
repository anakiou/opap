package com.anakiou.opap.service.proposat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.anakiou.opap.model.GameName;
import com.anakiou.opap.model.proposat.ProposatDraw;
import com.anakiou.opap.model.proposat.ProposatDraws;
import com.anakiou.opap.service.GenericServiceImpl;

@Service
public class ProposatService extends GenericServiceImpl<ProposatDraw, ProposatDraws> {

    @SuppressWarnings("unused")
    private RestTemplate restTemplate;

    @Autowired
    public ProposatService(final RestTemplate restTemplate) {
        super(restTemplate, GameName.PROPOSAT);
    }

}
