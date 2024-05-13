package com.plm.test.testtask.v1.model;

import com.plm.test.testtask.v1.model.enums.UserStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "user_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    /**
     * Идентификатор пользователя
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    /**
     * Логин пользователя
     */
    @Column(name = "login", length = 32, nullable = false)
    String login;

    /**
     * ФИО пользователя
     */
    @Column(name = "fullName", length = 64, nullable = false)
    String fullName;

    /**
     * Статус пользователя
     */
    @Enumerated
    UserStatus userStatus;
}
