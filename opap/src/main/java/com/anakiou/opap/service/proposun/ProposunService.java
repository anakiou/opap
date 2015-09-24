package com.anakiou.opap.service.proposun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.anakiou.opap.model.GameName;
import com.anakiou.opap.model.proposun.ProposunDraw;
import com.anakiou.opap.model.proposun.ProposunDraws;
import com.anakiou.opap.service.GenericServiceImpl;

@Service
public class ProposunService extends GenericServiceImpl<ProposunDraw, ProposunDraws> {

    @SuppressWarnings("unused")
    private RestTemplate restTemplate;

    @Autowired
    public ProposunService(final RestTemplate restTemplate) {
        super(restTemplate, GameName.PROPOSUN);
    }

}
