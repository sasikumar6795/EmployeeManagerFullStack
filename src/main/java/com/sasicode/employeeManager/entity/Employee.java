package com.sasicode.employeeManager.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Employee implements Serializable {
    @Id
    @SequenceGenerator(name = "employee_id_sequence",
            sequenceName = "employee_id_sequence",
            allocationSize =1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "employee_id_sequence"
    )
    @Column(name="ID",nullable = false, updatable =false)
    private Long id;
    @Column(name="NAME")
    private String name;
    @Column(name="EMAIL")
    private String email;
    @Column(name="JOB_TITLE")
    private String jobTitle;
    @Column(name="IMAGE_URL")
    private String imageUrl;
    @Column(name="EMPLOYEE_CODE",nullable = false, updatable =false)
    private String employeeCode;
    @Column(name="PHONE_NUMBER")
    private String phoneNumber;

}
