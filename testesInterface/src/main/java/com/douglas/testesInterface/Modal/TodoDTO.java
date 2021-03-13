package com.douglas.testesInterface.Modal;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class TodoDTO {

    @Id
    @GeneratedValue
    private Long id;

    private String content;
}
