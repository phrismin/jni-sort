package com.example.jnisort.controllers;

import com.example.jnisort.model.Data;
import com.example.jnisort.service.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping(value = "/api/v1/sort/array")
    public ResponseEntity<Data> inputData(@RequestBody Data data) {
        Data sortData = new Data();
        sortData.setData(clientService.sortArray(data.getData()));
        clientService.writeResultInFile(sortData.getData());
        return new ResponseEntity<>(sortData, HttpStatus.OK);
    }
}
