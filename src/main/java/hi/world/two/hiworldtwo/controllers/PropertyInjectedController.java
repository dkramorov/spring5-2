package hi.world.two.hiworldtwo.controllers;

import hi.world.two.hiworldtwo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller // чтобы не было ошибки No qualifying bean, если вызываем через HiWorldTwoApllication
public class PropertyInjectedController {
    // Будем переопределять через свойство
    @Autowired // чтобы не было ошибки NullPointerException, если вызываем через HiWorldTwoApllication
    public GreetingServiceImpl greetingService;

    public String sayHello(){
        // Вызов через свойство
        return greetingService.sayGreeting();
    }
}
