package hi.world.two.hiworldtwo.controllers;

import hi.world.two.hiworldtwo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {
    private PropertyInjectedController propertyInjectedController;
    @Before
    public void setUp() throws Exception {
        this.propertyInjectedController = new PropertyInjectedController();
        // Если мы не зададим свойство, то в тесте будет NullPointerException
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }
    @Test
    public void testGreeting() throws  Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectedController.sayHello());
    }
}
