package com.plm.test.testtask.v1.service.impl;

import com.plm.test.testtask.v1.model.Request;
import com.plm.test.testtask.v1.model.User;
import com.plm.test.testtask.v1.repository.RequestRepository;
import com.plm.test.testtask.v1.service.RequestService;
import com.plm.test.testtask.v1.structs.CreateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RequestServiceImpl implements RequestService {

    private final RequestRepository requestRepository;

    @Override
    public String addNewRequest(CreateRequestDto createRequestDto) {
        Request request = new Request();
        request.setTitle(createRequestDto.getTitle());
        request.setDescription(createRequestDto.getDescription());
        Optional<User> responsible = requestRepository.findUserWithFewestRequests().stream().findFirst();
        request.setResponsible(responsible.get());
        requestRepository.save(request);
        return "Заявка успешно сохранена и назначена на пользователя + " + request;
    }
}
