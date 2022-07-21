package uz.jl.domains;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@ToString
@Component
public class User {
    private String id;
    private String username;
    private List<Card> cards;
}

@Getter
@Setter
@ToString
@Component
class Card {
    private String id;
    private String pan;
    private String expiry;
}
