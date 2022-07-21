package uz.jl;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
public class DbConfiguration {
    private String url;
    private String username;
    private String password;
    private String driver;
}
