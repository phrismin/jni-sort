package com.example.jnisort.service;

public interface ClientService {
    int[] sortArray(int[] array);

    void writeResultInFile(int[] array);
}
