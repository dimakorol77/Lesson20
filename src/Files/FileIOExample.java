package Files;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

    public class FileIOExample {
        public static void main(String[] args) {
            // Создаем объект FileWriter и оборачиваем его в объект BufferedWriter
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt"))) {
                // Записываем произвольные данные в файл
                writer.write("Это пример записанных данных.\n");
                writer.write("Мы закончили записывать данные в файл.\n");
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Создаем объект FileReader и оборачиваем его в объект BufferedReader
            try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
                // Читаем данные из файла и выводим их на экран
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


