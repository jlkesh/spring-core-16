package uz.jl.repository;

import org.springframework.stereotype.Component;

@Component("pRepository")
public class PostgresqlDBRepository implements UserRepository{
    @Override
    public void callDb() {
        System.out.println("real  db is calling 😊");
    }
}
