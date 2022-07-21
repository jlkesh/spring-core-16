package uz.jl.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Bservice {
    private final Aservice aservice;

    public Bservice(@Lazy Aservice aservice) {
        this.aservice = aservice;
    }
}
