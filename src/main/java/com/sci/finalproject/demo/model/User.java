package com.sci.finalproject.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
@Table(name="userprofile")
public class User {

        public User()
        {
                role = "user";
        }

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
        private String firstname;

        @Size(min = 3, max = 30, message = "Minim 3 caractere.")
        private String lastname;


        private String city;

        private String address;

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

        public String getFirstname() {
                return firstname;
        }

        public void setFirstname(String firstname) {
                this.firstname = firstname;
        }

        public String getLastname() {
                return lastname;
        }

        public void setLastname(String lastname) {
                this.lastname = lastname;
        }

        public String getCity() {
                return city;
        }

        public void setCity(String city) {
                this.city = city;
        }

        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
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

        @Override
        public String toString() {
                return "User{" +
                        "id=" + id +
                        ", username='" + username + '\'' +
                        ", password='" + password + '\'' +
                        ", passwordConfirm='" + passwordConfirm + '\'' +
                        ", firstname='" + firstname + '\'' +
                        ", lastname='" + lastname + '\'' +
                        ", city='" + city + '\'' +
                        ", address='" + address + '\'' +
                        ", phone='" + phone + '\'' +
                        ", role='" + role + '\'' +
                        '}';
        }
}
