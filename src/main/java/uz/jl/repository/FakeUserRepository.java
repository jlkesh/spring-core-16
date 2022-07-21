package uz.jl.repository;

import org.springframework.stereotype.Component;

@Component("fRepository")
public class FakeUserRepository implements UserRepository{
    @Override
    public void callDb() {
        System.out.println("Calling fake in memory database 😒");
    }
}
