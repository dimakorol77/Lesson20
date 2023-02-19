package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {


        public static void main(String[] args) {
            try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Дима\\IdeaProjects\\Lesson 20\\src\\Files\\dimon"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.err.println("Error reading file: " + e.getMessage());
            }
        }
    }


