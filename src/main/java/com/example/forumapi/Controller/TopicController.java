package com.example.forumapi.Controller;

import com.example.forumapi.modelo.Course;
import com.example.forumapi.modelo.Topic;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping( "/Forum")
public class TopicController {
    @GetMapping(value = "/Topics")
    public List<TopicDto> lista (){
        Topic topic = new Topic("Duvida","Duvida Spring", new Course("Spring","Promgramação"));
        return TopicDto.converter(Arrays.asList(topic,topic,topic));

    }
}
