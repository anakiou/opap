package com.anakiou.opap.service.extra5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.anakiou.opap.model.GameName;
import com.anakiou.opap.model.extra5.Extra5Draw;
import com.anakiou.opap.model.extra5.Extra5Draws;
import com.anakiou.opap.service.GenericServiceImpl;

@Service
public class Extra5Service extends GenericServiceImpl<Extra5Draw, Extra5Draws> {

    @SuppressWarnings("unused")
    private RestTemplate restTemplate;

    @Autowired
    public Extra5Service(final RestTemplate restTemplate) {
        super(restTemplate, GameName.EXTRA5);
    }

}
