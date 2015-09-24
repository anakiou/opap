package com.anakiou.opap.joker;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.anakiou.opap.OpapApplication;
import com.anakiou.opap.model.joker.JokerDraw;
import com.anakiou.opap.service.joker.JokerService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = OpapApplication.class)
@WebAppConfiguration
public class JokerServiceTest {

    @Autowired
    private JokerService jokerService;

    @Test
    public void testGetDrawByNo() {
        JokerDraw k = null;

        for (int i = 1; i < 10; i++) {
            k = jokerService.getDrawByNo(i);
            assertNotNull(k.getDraw().getDrawNo());
            System.out.println(k);
        }
    }

    @Test
    public void testGetLatestDraw() {
        final JokerDraw k = jokerService.getLatestDraw();

        assertNotNull(k.getDraw().getDrawNo());
        System.out.println(k);
    }

    @Test
    public void testGetByDate() {
        jokerService.getDrawsForDate(1, 2, 2014).getDraws().getDraw().forEach(d -> {
            assertNotNull(d.getDrawNo());
            System.out.println(d);
        });
    }
}
