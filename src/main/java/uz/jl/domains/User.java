package uz.jl.domains;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@ToString
@Component
public class User {
    private Integer id;
    private String username;

    private List<Card> cards;

    private Student student;

    @Autowired
    public void setStudent(Student student) {
        this.student = student;
    }
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
