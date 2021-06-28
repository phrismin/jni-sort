package com.example.jnisort.service;

import com.example.jnisort.model.JNISortingUtils;
import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;

@Service
public class ClientServiceImpl implements ClientService {

    @Override
    public int[] sortArray(int[] array) {
        JNISortingUtils jniSortingUtils = new JNISortingUtils();
        return jniSortingUtils.sortArrayNumber(array);
    }

    public void writeResultInFile(int[] array) {
        File file = Path.of("src", "main", "resources", "result.txt").toFile();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(Arrays.toString(array) + '\n');
        } catch (IOException e) {
            System.err.println("Error record file");
        }
    }
}
