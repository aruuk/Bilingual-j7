package com.example.bilingualj7.db.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "user_question_options")
@Getter
@Setter
@NoArgsConstructor
public class UserQuestionOption {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "test_gen")
    @SequenceGenerator(name = "test_seq", sequenceName = "test_seq", allocationSize = 1)
    private Long id;

    @OneToOne(cascade = {DETACH, REFRESH, MERGE})
    private User user;

    @OneToOne(cascade = {DETACH, REFRESH, MERGE})
    private Question question;

    @OneToOne(cascade = {DETACH, REFRESH, MERGE})
    private Option option;
}
