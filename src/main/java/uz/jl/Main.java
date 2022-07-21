package uz.jl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import uz.jl.domains.User;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextConfig.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);

    }

}