package hi.world.two.hiworldtwo.controllers;

import hi.world.two.hiworldtwo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GettingInjectedControllerTest {
    private GetterInjectedController getterInjectedController;
    @Before
    public void setUp() throws Exception {
        this.getterInjectedController = new GetterInjectedController();
        // Если не задать через setter, тогда возникнет NullPointerException
        this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
    }
    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, getterInjectedController.sayHello());
    }
}
