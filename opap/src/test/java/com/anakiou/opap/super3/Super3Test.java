package com.anakiou.opap.super3;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.anakiou.opap.OpapApplication;
import com.anakiou.opap.model.super3.Super3Draw;
import com.anakiou.opap.service.super3.Super3Service;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = OpapApplication.class)
@WebAppConfiguration
public class Super3Test {

    @Autowired
    private Super3Service super3Service;

    @Test
    public void testGetDrawByNo() {
        Super3Draw k = null;

        for (int i = 1; i < 10; i++) {
            k = super3Service.getDrawByNo(i);
            assertNotNull(k.getDraw().getDrawNo());
            System.out.println(k);
        }
    }

    @Test
    public void testGetLatestDraw() {
        final Super3Draw k = super3Service.getLatestDraw();

        assertNotNull(k.getDraw().getDrawNo());
        System.out.println(k);
    }

    @Test
    public void testGetByDate() {
        super3Service.getDrawsForDate(1, 2, 2014).getDraws().getDraw().forEach(d -> {
            assertNotNull(d.getDrawNo());
            System.out.println(d);
        });
    }
}
