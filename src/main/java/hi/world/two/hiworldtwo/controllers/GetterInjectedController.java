package hi.world.two.hiworldtwo.controllers;

import hi.world.two.hiworldtwo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller // чтобы не было ошибки No qualifying bean, если вызываем через HiWorldTwoApllication
public class GetterInjectedController {
    private GreetingService greetingService;

    public String sayHello(){
        // Задаем через setter
        return greetingService.sayGreeting();
    }
    @Autowired // чтобы не было ошибки NullPointerException, если вызываем через HiWorldTwoApllication
    public void setGreetingService(GreetingService greetingService){
        // Вызов через getter
        this.greetingService = greetingService;
    }
}
