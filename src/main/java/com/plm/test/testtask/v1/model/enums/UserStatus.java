package com.plm.test.testtask.v1.model.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum UserStatus {

    ONLINE("Работает"), // 0
    OFFLINE("Отдыхает");  // 1

    String label;
}
