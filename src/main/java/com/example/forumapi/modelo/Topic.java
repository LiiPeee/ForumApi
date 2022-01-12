package com.example.forumapi.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor

public class Topic {
    private Long id;
    private String title;
    private String menssage;
    private LocalDateTime dataCriacao = LocalDateTime.now();
    private StatusTopic status = StatusTopic.NO_RESPONSE;
    private User author;
    private Course course;

    private List<Response> responses = new ArrayList<>();

    public Topic (String title,String menssage, Course course){
        this.title = title;
        this.menssage = menssage;
        this.course = course;
    }

   // public Topic(String duvida, String duvida_spring, Course course) {
  //  }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Topic topic = (Topic) o;
        return Objects.equals(id, topic.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
