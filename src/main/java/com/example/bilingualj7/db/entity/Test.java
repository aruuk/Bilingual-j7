package com.example.bilingualj7.db.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import static javax.persistence.CascadeType.*;

@Entity
@Table(name = "tests")
@Getter
@Setter
@NoArgsConstructor
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "test_gen")
    @SequenceGenerator(name = "test_seq", sequenceName = "test_seq", allocationSize = 1, initialValue = 2)
    private Long id;

    @Column(length = 10000)
    private String testName;

    @Column(length = 10000)
    private String shortDescription;

    @OneToMany(cascade = ALL, mappedBy = "test")
    private List<Question> questions;

    @ManyToMany(cascade = {MERGE, DETACH, REFRESH}, mappedBy = "userTests")
    private List<User> users;

    @OneToOne(cascade = {DETACH, REFRESH, MERGE, REMOVE})
    private Result result;
}
