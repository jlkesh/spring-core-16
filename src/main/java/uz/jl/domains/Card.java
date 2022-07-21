package uz.jl.domains;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Card {

    private String id;

    private String pan;

//    @ToString.Exclude
    private String expiry;
}
