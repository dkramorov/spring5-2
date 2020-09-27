package hi.world.two.hiworldtwo.controllers;

import hi.world.two.hiworldtwo.services.GreetingServiceImpl;

public class PropertyInjectedController {
    // Будем переопределять через свойство
    public GreetingServiceImpl greetingService;

    String sayHello(){
        // Вызов через свойство
        return greetingService.sayGreeting();
    }
}
