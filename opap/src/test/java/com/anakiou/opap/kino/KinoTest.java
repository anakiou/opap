package com.anakiou.opap.kino;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.anakiou.opap.OpapApplication;
import com.anakiou.opap.model.kino.KinoDraw;
import com.anakiou.opap.service.kino.KinoService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = OpapApplication.class)
@WebAppConfiguration
public class KinoTest {

    @Autowired
    private KinoService kinoService;

    @Test
    public void testGetDrawByNo() {
        KinoDraw k = null;

        for (int i = 1; i < 10; i++) {
            k = kinoService.getDrawByNo(i);
            assertNotNull(k.getDraw().getDrawNo());
            System.out.println(k);
        }
    }

    @Test
    public void testGetLatestDraw() {
        final KinoDraw k = kinoService.getLatestDraw();

        assertNotNull(k.getDraw().getDrawNo());
        System.out.println(k);
    }

    @Test
    public void testGetByDate() {
        kinoService.getDrawsForDate(1, 2, 2014).getDraws().getDraw().forEach(d -> {
            assertNotNull(d.getDrawNo());
            System.out.println(d);
        });
    }
}
