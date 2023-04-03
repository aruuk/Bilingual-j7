package com.example.bilingualj7.db.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.CascadeType.*;

@Entity
 @Table(name = "roles")
 @Getter
 @Setter
 @NoArgsConstructor
 public class Role {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_gen")
  @SequenceGenerator(name = "role_seq", sequenceName = "role_seq", allocationSize = 1, initialValue = 2)
  private Long id;

  private String roleName;

  @OneToMany(cascade = {MERGE, DETACH, REFRESH}, mappedBy = "role")
  private List<User> users = new ArrayList<>();
 }

