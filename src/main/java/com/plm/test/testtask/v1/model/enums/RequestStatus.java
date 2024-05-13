package com.plm.test.testtask.v1.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum RequestStatus {

    OPEN("Открыто"), // 0
    CLOSED("Закрыто");  //1

    String label;

}
