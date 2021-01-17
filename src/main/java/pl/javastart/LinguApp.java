package pl.javastart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.javastart.controllers.LinguController;

@SpringBootApplication
public class LinguApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(LinguApp.class, args);
        LinguController controller = ctx.getBean(LinguController.class);
        controller.mainLoop();
    }
}