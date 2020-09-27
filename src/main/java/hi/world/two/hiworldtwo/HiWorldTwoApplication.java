package hi.world.two.hiworldtwo;

import hi.world.two.hiworldtwo.controllers.ConstructorInjectionController;
import hi.world.two.hiworldtwo.controllers.GetterInjectedController;
import hi.world.two.hiworldtwo.controllers.MyController;
import hi.world.two.hiworldtwo.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HiWorldTwoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(HiWorldTwoApplication.class, args);
        MyController controller = (MyController) ctx.getBean("myController");
        controller.hello();

        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectionController.class).sayHello());
    }

}
