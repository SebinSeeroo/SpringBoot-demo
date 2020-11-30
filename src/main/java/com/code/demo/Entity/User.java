package com.code.demo.Entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table
public class User {
    @Id
    private long id;
    private String firstName;
    private String lastName;
    private String addressLineOne;
    private String addressLineTwo;
    private String city;
    private int age;
    private Date insertedDate;
    private Date updatedDate;
}
