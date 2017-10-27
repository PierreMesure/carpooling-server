package se.collectivesunshine;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.collectivesunshine.config.AppConfig;
import se.collectivesunshine.entity.User;
import se.collectivesunshine.service.UserService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = (UserService) ctx.getBean("userServiceImpl");

        List<User> list = userService.findAllUsers();
        System.out.println("User count: " + list.size());

        User user = new User();
        user.setFirstName("John");
        user.setLastName("Doe");
        userService.insertUser(user);
        System.out.println("User inserted!");

        list = userService.findAllUsers();
        System.out.println("User count: " + list.size());
    }
}
