package com.anakiou.opap.service.powerspin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.anakiou.opap.model.GameName;
import com.anakiou.opap.model.powerspin.PowerspinDraw;
import com.anakiou.opap.model.powerspin.PowerspinDraws;
import com.anakiou.opap.service.GenericServiceImpl;

@Service
public class PowerspinService extends GenericServiceImpl<PowerspinDraw, PowerspinDraws> {

    @SuppressWarnings("unused")
    private RestTemplate restTemplate;

    @Autowired
    public PowerspinService(final RestTemplate restTemplate) {
        super(restTemplate, GameName.POWERSPIN);
    }

}
