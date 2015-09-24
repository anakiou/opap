package com.anakiou.opap.penalties;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.anakiou.opap.OpapApplication;
import com.anakiou.opap.model.penalties.PenaltiesDraw;
import com.anakiou.opap.service.penalties.PenaltiesService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = OpapApplication.class)
@WebAppConfiguration
public class PenaltiesTest {

    @Autowired
    private PenaltiesService penaltiesService;

    @Test
    public void testGetDrawByNo() {
        PenaltiesDraw k = null;

        for (int i = 1; i < 10; i++) {
            k = penaltiesService.getDrawByNo(i);
            assertNotNull(k.getDraw().getDrawNo());
            System.out.println(k);
        }
    }

    @Test
    public void testGetLatestDraw() {
        final PenaltiesDraw k = penaltiesService.getLatestDraw();

        assertNotNull(k.getDraw().getDrawNo());
        System.out.println(k);
    }

    @Test
    public void testGetByDate() {
        penaltiesService.getDrawsForDate(1, 2, 2014).getDraws().getDraw().forEach(d -> {
            assertNotNull(d.getDrawNo());
            System.out.println(d);
        });
    }
}
