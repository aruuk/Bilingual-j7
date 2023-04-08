package com.example.bilingualj7.db.entity;

import com.example.bilingualj7.db.enums.Status;
import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

import static javax.persistence.CascadeType.*;


@Entity
@Table(name = "results")
@Getter
@Setter
@NoArgsConstructor
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "test_gen")
    @SequenceGenerator(name = "test_seq", sequenceName = "test_seq", allocationSize = 1)
    private Long id;

    private String userName;

    private LocalDateTime dateOfSubmission;

    private int score;

    private Boolean isRead;

    @ManyToOne(cascade = {DETACH, REFRESH, MERGE})
    private Test test;

    private Status status;

}
