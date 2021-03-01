package com.coach.service.CoachService.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
@Entity
@AllArgsConstructor @NoArgsConstructor @ToString
@Data

public class Coach {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 75)
    private String Code;
    private String photo;
    private String description;
    @Column(length = 75)
    private String first_name;
    @Column(length = 75)
    private String last_name;
    private Date birthday;
    @Column(length = 75)
    private String email;
    private String phonenumber;
    @Column(length = 285)
    private String address;
    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Sport> SportsList ;



}
