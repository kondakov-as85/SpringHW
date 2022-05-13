package ru.mycomp.springHW;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import javax.inject.Inject;

import static junit.framework.TestCase.assertTrue;

@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = ru.mycomp.springHW.ContextConfiguration.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class AppIT {

    @Inject
    private ApplicationContext context;

    @Test
    public void testSpring() {
        Greeter greeter = context.getBean(Greeter.class);
        assertTrue(greeter.greet().startsWith("Hello"));

    }
}
