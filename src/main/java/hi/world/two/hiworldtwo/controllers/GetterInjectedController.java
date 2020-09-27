package hi.world.two.hiworldtwo.controllers;

import hi.world.two.hiworldtwo.services.GreetingService;

public class GetterInjectedController {
    private GreetingService greetingService;

    String sayHello(){
        // Задаем через setter
        return greetingService.sayGreeting();
    }
    public void setGreetingService(GreetingService greetingService){
        // Вызов через getter
        this.greetingService = greetingService;
    }
}
