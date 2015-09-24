package com.anakiou.opap.service.penalties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.anakiou.opap.model.GameName;
import com.anakiou.opap.model.penalties.PenaltiesDraw;
import com.anakiou.opap.model.penalties.PenaltiesDraws;
import com.anakiou.opap.service.GenericServiceImpl;

@Service
public class PenaltiesService extends GenericServiceImpl<PenaltiesDraw, PenaltiesDraws> {

    @SuppressWarnings("unused")
    private RestTemplate restTemplate;

    @Autowired
    public PenaltiesService(final RestTemplate restTemplate) {
        super(restTemplate, GameName.PENALTIES);
    }

}
