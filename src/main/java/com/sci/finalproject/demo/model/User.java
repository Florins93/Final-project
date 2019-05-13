package com.sci.finalproject.demo.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;


@Entity
@Table(name="users")
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;

        @Size(min = 3, max = 20, message = "Cel putin 3 caractere")
        private String username;


        @NotBlank
        private String password;

        @NotNull
        private int profile_id;
}
