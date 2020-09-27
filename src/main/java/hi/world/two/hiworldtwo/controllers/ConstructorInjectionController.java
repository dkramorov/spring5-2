package hi.world.two.hiworldtwo.controllers;

import hi.world.two.hiworldtwo.services.GreetingService;
import hi.world.two.hiworldtwo.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller // чтобы не было ошибки No qualifying bean, если вызываем через HiWorldTwoApllication
public class ConstructorInjectionController {
    private GreetingService greetingService;
    // @Autowired не нужен для конструктора
    public ConstructorInjectionController(GreetingService greetingService){
        // Задаем через конструктор
        this.greetingService = greetingService;
    }
    public String sayHello(){
        // Вызов через конструктор
        return greetingService.sayGreeting();
    }
}
