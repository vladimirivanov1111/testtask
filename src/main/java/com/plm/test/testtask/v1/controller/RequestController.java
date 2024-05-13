package com.plm.test.testtask.v1.controller;

import com.plm.test.testtask.v1.service.RequestService;
import com.plm.test.testtask.v1.structs.CreateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/request")
@RequiredArgsConstructor
public class RequestController {

    private final RequestService requestService;

    @PostMapping(value = "/add",
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public String addNewRequest(@RequestBody CreateRequestDto createRequestDto) {
        return requestService.addNewRequest(createRequestDto);
    }
}
