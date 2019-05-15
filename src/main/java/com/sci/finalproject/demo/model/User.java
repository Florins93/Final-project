package com.sci.finalproject.demo.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;


@Entity
@Table(name="userprofile")
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Size(min = 5, max = 30, message = "Minim 5 caractere.")
        private String username;

        @Size(min = 6, max = 4000000, message = "Minim 6 caractere.")
        @NotBlank
        private String password;

        @Size(min = 6, max = 4000000, message = "Minim 6 caractere.")
        private String passwordConfirm;

        @Size(min = 3, max = 30, message = "Minim 3 caractere.")
        private String firstName;

        @Size(min = 3, max = 30, message = "Minim 3 caractere.")
        private String lastName;


        private String city;

        private String adress;

        private String phone;

        private String role;

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getUsername() {
                return username;
        }

        public void setUsername(String username) {
                this.username = username;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public String getPasswordConfirm() {
                return passwordConfirm;
        }

        public void setPasswordConfirm(String passwordConfirm) {
                this.passwordConfirm = passwordConfirm;
        }

        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public String getCity() {
                return city;
        }

        public void setCity(String city) {
                this.city = city;
        }

        public String getAdress() {
                return adress;
        }

        public void setAdress(String adress) {
                this.adress = adress;
        }

        public String getPhone() {
                return phone;
        }

        public void setPhone(String phone) {
                this.phone = phone;
        }



        public void setRole(String role) {
                this.role = role;
        }


}
