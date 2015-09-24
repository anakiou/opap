package com.anakiou.opap.service.lotto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.anakiou.opap.model.GameName;
import com.anakiou.opap.model.lotto.LottoDraw;
import com.anakiou.opap.model.lotto.LottoDraws;
import com.anakiou.opap.service.GenericServiceImpl;

@Service
public class LottoService extends GenericServiceImpl<LottoDraw, LottoDraws> {

    @SuppressWarnings("unused")
    private RestTemplate restTemplate;

    @Autowired
    public LottoService(final RestTemplate restTemplate) {
        super(restTemplate, GameName.LOTTO);
    }

}
