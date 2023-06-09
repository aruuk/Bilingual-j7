package com.example.bilingualj7.db.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import static javax.persistence.CascadeType.*;

@Entity
@Table(name = "options")
@Getter
@Setter
@NoArgsConstructor
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "test_gen")
    @SequenceGenerator(name = "test_seq", sequenceName = "test_seq", allocationSize = 1,initialValue = 11)
    private Long id;

    private String option;

    private Boolean isTrue;

    @ManyToOne(cascade = {DETACH, REFRESH, MERGE}, fetch = FetchType.EAGER)
    private Question question;

    @OneToMany(cascade = {DETACH, MERGE, REFRESH, REMOVE}, mappedBy = "option")
    private List<UserQuestionOption> userQuestionOptions;
}
