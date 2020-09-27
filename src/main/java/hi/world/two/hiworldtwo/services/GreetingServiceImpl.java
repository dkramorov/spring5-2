package hi.world.two.hiworldtwo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements  GreetingService{
    public static final String HELLO_GURUS = "Hello Gurus!!!";
    public String sayGreeting(){
        // Функция для интерфейса
        return HELLO_GURUS;
    }
}
