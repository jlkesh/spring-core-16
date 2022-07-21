package uz.jl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import uz.jl.domains.Student;

@Configuration
@ComponentScan(basePackages = "uz.jl.*")
public class ApplicationConfigurer {


    @Bean
    @Scope("prototype")
    public Student student() {
        return new Student();
    }

    @Bean
    public String string() {
        return "";
    }

    /*@Bean
    @Scope("prototype")
    public Faker faker() {
        return new Faker();
    }*/

}
