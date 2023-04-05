package com.example.bilingualj7.db.entity;

import com.example.bilingualj7.db.enums.QuestionType;
import com.example.bilingualj7.db.enums.Status;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;
import java.util.List;

import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "questions")
@Getter
@Setter
@NoArgsConstructor
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "question_gen")
    @SequenceGenerator(name = "question_seq", sequenceName = "question_seq", allocationSize = 1,initialValue = 16)
    private Long id;

    private String questionName;

    @ManyToOne(cascade = {DETACH, REFRESH, MERGE}, fetch = FetchType.EAGER)
    private Test test;

    private LocalTime time;

    private String file;

    private int numberOfReplays;

    private int minNumberOfWords;

    private String passage;

    private String questionTextForPassage;

    private int score;

    @OneToMany(cascade = ALL)
    private List<Option> options;

    private Status status;

    private QuestionType questionType;

    @ManyToMany(cascade = {MERGE, REFRESH, DETACH})
    private List<User> users;

    @OneToMany(cascade = {DETACH, MERGE, REFRESH, REMOVE}, mappedBy = "question")
    private List<UserQuestionOption> userQuestionOptions;


}
