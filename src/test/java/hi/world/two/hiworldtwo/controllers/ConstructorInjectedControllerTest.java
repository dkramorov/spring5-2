package hi.world.two.hiworldtwo.controllers;

import hi.world.two.hiworldtwo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {
    private ConstructorInjectionController constructorInjectionController;
    @Before
    public void setUp() throws Exception {
        this.constructorInjectionController = new ConstructorInjectionController(new GreetingServiceImpl());
    }
    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectionController.sayHello());
    }
}
