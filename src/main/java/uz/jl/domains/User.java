package uz.jl.domains;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

@Getter
@Setter
@ToString
public class User {
    private String id;
    private String username;
    private Map<String, Card> cards;
}
