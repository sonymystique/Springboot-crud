package com.example.SpringBootRestAPIProject.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
//@RequiredArgsConstructor
public class Location {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    public String place;
    public String description;
    public double longitude;
    public double latitude;




}
