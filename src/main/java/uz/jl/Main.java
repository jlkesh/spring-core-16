package uz.jl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import uz.jl.domains.Configs;
import uz.jl.domains.Student;
import uz.jl.domains.User;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfigurer.class);
//        User bean = context.getBean(User.class);
//        System.out.println("bean = " + bean);
//        Student student = context.getBean(Student.class);
//        System.out.println("student = " + student);

        Configs bean = context.getBean(Configs.class);
        System.out.println(bean);

    }

}