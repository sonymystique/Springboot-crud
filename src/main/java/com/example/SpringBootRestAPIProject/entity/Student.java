package com.example.SpringBootRestAPIProject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollNo;
    @Column(name = "student_name")
    private String name;
    @Column(name = "student_percentage")
    private float percentage;
    @Column(name = "student_branch")
    private String branch;

//    public Student(){
//
//    }

//    public Student(String name, float percentage, String branch) {
//        super();
//        this.name = name;
//        this.percentage = percentage;
//        this.branch = branch;
//    }
//
//    public void setRollNo(int rollNo) {
//        this.rollNo = rollNo;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public float getPercentage() {
//        return percentage;
//    }
//
//    public void setPercentage(float percentage) {
//        this.percentage = percentage;
//    }
//
//    public String getBranch() {
//        return branch;
//    }
//
//    public void setBranch(String branch) {
//        this.branch = branch;
//    }
//
//    @Override
//    public String toString() {
//        return "student{" +
//                "rollNo=" + rollNo +
//                ", name='" + name + '\'' +
//                ", percentage=" + percentage +
//                ", branch='" + branch + '\'' +
//                '}';
//    }

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name="location_id")
    private Location location;



}
