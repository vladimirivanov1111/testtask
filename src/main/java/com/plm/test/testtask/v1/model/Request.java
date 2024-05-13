package com.plm.test.testtask.v1.model;

import com.plm.test.testtask.v1.model.enums.RequestStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "request_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Request {


    /**
     * Идентификатор заявки
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    /**
     * Название заявки
     */
    @Column(name = "title", length = 32, nullable = false)
    String title;

    /**
     * Описание заявки
     */
    @Column(name = "description", length = 64, nullable = false)
    String description;

    /**
     * Статус выполнения заявки
     */
    @Enumerated
    RequestStatus status;

    /**
     * Ответственный за выполнение заявки
     */
    @ManyToOne
    @JoinColumn(name = "user_id")
    User responsible;
}
