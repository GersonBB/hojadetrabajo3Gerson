package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        generateRandomNumbersToFile("random_numbers.txt", 3000);
    }

    public static void generateRandomNumbersToFile(String filename, int count) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            Random random = new Random();
            for (int i = 0; i < count; i++) {
                int randomNumber = random.nextInt(10000); // Change the upper limit as needed
                writer.write(Integer.toString(randomNumber));
                writer.newLine();
            }
            System.out.println("Random numbers generated and saved to file: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
