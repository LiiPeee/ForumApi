package com.example.forumapi.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Objects;

@NoArgsConstructor

@Getter
@Setter
public class Course {
    @Id
    private long id;
    private String name;
    private String categoria;

    public Course (String name,String categoria){
        this.name = name;
        this.categoria = categoria;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return id == course.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
