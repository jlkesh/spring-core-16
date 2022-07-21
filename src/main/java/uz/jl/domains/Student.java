package uz.jl.domains;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Student {
    private String id;
    private List<Subject> subjects;
}
