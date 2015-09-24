package com.anakiou.opap.service.proto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.anakiou.opap.model.GameName;
import com.anakiou.opap.model.proto.ProtoDraw;
import com.anakiou.opap.model.proto.ProtoDraws;
import com.anakiou.opap.service.GenericServiceImpl;

@Service
public class ProtoService extends GenericServiceImpl<ProtoDraw, ProtoDraws> {

    @SuppressWarnings("unused")
    private RestTemplate restTemplate;

    @Autowired
    public ProtoService(final RestTemplate restTemplate) {
        super(restTemplate, GameName.PROTO);
    }

}
