package com.mycode.demo_base_spring.model.dao;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@Entity
@Getter
@Setter
public class Student{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Long maSv;

    @NotNull
    private String tenSv;

    @NotNull
    private String tuoiSv;

    @NotNull
    private String queQuan;

    @NotNull
    private String truong;
}
