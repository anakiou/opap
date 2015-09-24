package com.anakiou.opap.extra5;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.anakiou.opap.OpapApplication;
import com.anakiou.opap.model.extra5.Extra5Draw;
import com.anakiou.opap.service.extra5.Extra5Service;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = OpapApplication.class)
@WebAppConfiguration
public class Extra5Test {

    @Autowired
    private Extra5Service extra5Service;

    @Test
    public void testGetDrawByNo() {
        Extra5Draw k = null;

        for (int i = 1; i < 10; i++) {
            k = extra5Service.getDrawByNo(i);
            assertNotNull(k.getDraw().getDrawNo());
            System.out.println(k);
        }
    }

    @Test
    public void testGetLatestDraw() {
        final Extra5Draw k = extra5Service.getLatestDraw();

        assertNotNull(k.getDraw().getDrawNo());
        System.out.println(k);
    }

    @Test
    public void testGetByDate() {
        extra5Service.getDrawsForDate(1, 2, 2014).getDraws().getDraw().forEach(d -> {
            assertNotNull(d.getDrawNo());
            System.out.println(d);
        });
    }
}
