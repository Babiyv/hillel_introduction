package com.hillel.lesson13.homework.task1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*Задача 1:
Создайте программу-опросник(Можно  вынести  в  отдельный класс с  необходимым(и) методом(ами)).
Данная программа должна просить ввести пользователя свое имя, после чего проводить опрос(достаточно 2-3 вопроса).
Введенные данные  сохраняются в виде ключ-значение,  где ключ - это имя пользователя,
а значение это данные  в  виде тоже ключ-значение(где ключ - это вопрос, а значение - ответ).
Тип значения ответа на  вопрос указать на  свое усмотрение.
После проведенного опроса программа должна записать результат в файл.*/
public class Main_Questionnaire {

    static Map<String, Map<String, String>> nameAndData = new TreeMap<>();
    static Map<String, String> dataIsQuestionAndAnswer = new TreeMap<>();
    static String pathToFile = "C:\\Users\\OFFART\\IdeaProjects\\hillel_introduction\\src\\com\\hillel\\lesson13\\homework\\task1\\MyTextFileWithDataFromMap";

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter fileWriter = new FileWriter(pathToFile);
        FileReader fileReader = new FileReader(pathToFile);

        // Данная программа должна просить ввести пользователя свое имя:
        System.out.print("Please enter your name: ");
        String name =  sc.nextLine(); // - key for 1st TreeMap;

        // после чего проводить опрос(достаточно 2-3 вопроса):
        String ageQuestion = "How old are you?"; // - key for 2nd TreeMap
        System.out.println(ageQuestion);
        String ageAnswer = sc.nextLine(); // - answer for 2nd TreeMap

        String countryQuestion = "Where are you from?"; // - key for 2nd TreeMap
        System.out.println(countryQuestion);
        String country = sc.nextLine(); // - answer for 2nd TreeMap

        //Введенные данные  сохраняются в виде ключ-значение,  где ключ - это имя пользователя, а значение это данные  в  виде тоже ключ-значение(где ключ - это вопрос, а значение - ответ).
        dataIsQuestionAndAnswer.put(ageQuestion, ageAnswer);
        dataIsQuestionAndAnswer.put(countryQuestion, country);

        nameAndData.put(name, dataIsQuestionAndAnswer);
        System.out.println(nameAndData);
        fileWriter.write("test");
//        readFromFileByScanner(pathToFile);

        fileReader.close();
        sc.close();
    }

    private static void readFromFileByScanner(String pathToFile) throws IOException{
        FileReader fileReader = new FileReader(pathToFile);
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()){
            String fileString = scanner.nextLine();
            System.out.println("Read one string from file: ");
            System.out.println(fileString);
        }
        scanner.close();
        fileReader.close();
    }

}
