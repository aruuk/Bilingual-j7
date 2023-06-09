package com.example.bilingualj7.db.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static javax.persistence.CascadeType.*;

@Entity
@Table(name = "user_question_options")
@Getter
@Setter
@NoArgsConstructor
public class UserQuestionOption {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "test_gen")
    @SequenceGenerator(name = "test_seq", sequenceName = "test_seq", allocationSize = 1, initialValue = 2)
    private Long id;

    @ManyToOne(cascade = {DETACH, REFRESH, MERGE})
    private User user;

    @ManyToOne(cascade = {DETACH, REFRESH, MERGE})
    private Question question;

    @ManyToOne(cascade = {DETACH, REFRESH, MERGE})
    private Option option;
}
