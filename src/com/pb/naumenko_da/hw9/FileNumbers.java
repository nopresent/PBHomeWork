package com.pb.naumenko_da.hw9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class FileNumbers {

    public static void main(String[] args) {

        createNumbersFile();
        createOddNumbersFile();

    }

    public static void createNumbersFile() {

        String fileName = "numbers.txt";
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
            // ex.printStackTrace();
            System.out.println("Error with file write: " + ex);
            // Добавить логирование, если не смогли открыть файл для записи
        }

    }

    public static void createOddNumbersFile() {
        String fileName = "numbers.txt";
        Path path = Paths.get(fileName);

        String oddFileName = "odd-numbers.txt";
        Path oddPath = Paths.get(oddFileName);

        try (BufferedReader reader = Files.newBufferedReader(path); BufferedWriter writer = Files.newBufferedWriter(oddPath)) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(oddToZero(line));
                writer.newLine();
            }

            System.out.println("Write to file: " + oddPath.toAbsolutePath() + " - done!");
        } catch (Exception ex) {
            // ex.printStackTrace();
            System.out.println("Error with file reader: " + ex);
            // Добавить логирование, если не смогли открыть файл для записи
        }
    }

    public static String oddToZero(String string) {
        StringBuilder strBuffer = new StringBuilder();
        int nextNumber;
        Scanner scan = new Scanner(string);
        scan.useDelimiter(" ");
        while (scan.hasNext()) {
            nextNumber = scan.nextInt();
            if (nextNumber % 2 == 0) {
                strBuffer.append("0 ");
            } else {
                strBuffer.append(nextNumber + " ");
            }
        }
        return strBuffer.toString();
    }

}
