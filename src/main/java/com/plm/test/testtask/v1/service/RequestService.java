package com.plm.test.testtask.v1.service;

import com.plm.test.testtask.v1.structs.CreateRequestDto;

public interface RequestService {

    String addNewRequest(CreateRequestDto createRequestDto);
}
