package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Bean
    public Board board() {
        return new Board(getTaskList(), getTaskList(), getTaskList());
    }

    @Bean
    @Scope(value = "prototype")
    public TaskList getTaskList() {
        return new TaskList();
    }
}
