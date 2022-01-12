package com.example.forumapi.Controller;

import com.example.forumapi.modelo.Topic;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class TopicDto {
    private Long id;
    private String title;
    private String menssage;
    private LocalDateTime dataCriacao;


    public TopicDto(Topic topic){
        this.id = topic.getId();
        this.menssage = topic.getMenssage();
        this.title = topic.getTitle();
        this.dataCriacao = topic.getDataCriacao();
    }

    public static List<TopicDto> converter(List<Topic> topic) {
        return topic.stream().map(TopicDto::new).collect(Collectors.toList());
    }
}
