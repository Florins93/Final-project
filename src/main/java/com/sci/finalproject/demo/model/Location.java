package com.sci.finalproject.demo.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.sql.Blob;
import java.time.LocalDate;

@Entity
@Table(name ="locations")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @Size(min = 2, max = 100, message = "Minim 2 caractere")
    private String locationName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "dateFrom")
    private LocalDate dateFrom;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "dateTo")
    private LocalDate dateTo;

    private String impression;

        private String photo1;

        private String photo2;

     public String getPhoto1() {
          return photo1;
    }

    public void setPhoto1(String photo1) {
        this.photo1 = photo1;
    }

    public String getPhoto2() {
        return photo2;
    }

    public void setPhoto2(String photo2) {
        this.photo2 = photo2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public String getImpression() {
        return impression;
    }

    public void setImpression(String impression) {
        this.impression = impression;
    }






}