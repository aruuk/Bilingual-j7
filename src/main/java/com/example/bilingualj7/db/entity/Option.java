package com.example.bilingualj7.db.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "options")
@Getter
@Setter
@NoArgsConstructor
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "test_gen")
    @SequenceGenerator(name = "test_seq", sequenceName = "test_seq", allocationSize = 1)
    private Long id;
    private String option;
    private Boolean isTrue;
    @ManyToOne(cascade = {DETACH, REFRESH, PERSIST, MERGE}, fetch = FetchType.EAGER)
    private Question question;
}
