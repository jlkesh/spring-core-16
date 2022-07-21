package uz.jl.domains;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@ToString
@Component
@PropertySource("classpath:application.properties")
public class Configs {
    @Value("${application.name}")
    private String appName;

    @Value("${prog.langs}")
    private List<String> langs;
}
