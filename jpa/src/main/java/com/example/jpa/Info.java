package com.example.jpa;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "info")
@Data
public class Info {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String uname;

}
