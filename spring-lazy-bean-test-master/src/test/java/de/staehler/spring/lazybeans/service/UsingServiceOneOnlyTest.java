package de.staehler.spring.lazybeans.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.kubek2k.springockito.annotations.SpringockitoContextLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.Assert.assertNotNull;

@ContextConfiguration(locations = {"classpath:/META-INF/spring/applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("test")
public class UsingServiceOneOnlyTest {

    @Autowired
    private ServiceOne serviceOne;

    @Test
    public void injectAndCheck() {
        assertNotNull(serviceOne);
    }

}
