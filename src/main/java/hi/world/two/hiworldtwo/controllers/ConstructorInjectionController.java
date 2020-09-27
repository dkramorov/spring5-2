package hi.world.two.hiworldtwo.controllers;

import hi.world.two.hiworldtwo.services.GreetingService;
import hi.world.two.hiworldtwo.services.GreetingServiceImpl;

public class ConstructorInjectionController {
    private GreetingService greetingService;

    public ConstructorInjectionController(GreetingService greetingService){
        // Задаем через конструктор
        this.greetingService = greetingService;
    }
    String sayHello(){
        // Вызов через конструктор
        return greetingService.sayGreeting();
    }
}
