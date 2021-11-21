package com.pb.naumenko_da.hw9;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class FileNumbers {

    public static void main(String[] args) {

        String fileName = "numbers.txt";
        createNumbersFile(fileName);

    }

    public static void createNumbersFile(String fileName) {

        Path path = Paths.get(fileName);
        Random rand = new Random();

        try (BufferedWriter writer = Files.newBufferedWriter(path)) {

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    writer.write(rand.nextInt(100) + " ");
                }
                writer.newLine();
            }

            System.out.println("Write to file: " + path.toAbsolutePath() + " - done!");

        } catch (Exception ex) {
            // e.printStackTrace();
            System.out.println("Error with file write: " + ex);
            // Добавить логирование, если не смогли открыть файл для записи
        }

    }

    public static void createOddNumbersFile() {

    }

}
