package com.hillel.lesson6.homework;

/* Необходимо записать любое четверостишие в файл и считать.
Условия:
 о Директории, в которую будет запись файла, может изначально не существовать. Необходимо это учесть;
 о Файл соответственно должен создаваться при записи;
 о После записи необходимо проверить все ли записалось и вывести сообщение об успешной записи;
 о В завершение необходимо считать стих из созданного файла и вывести в консоль.*/

/* Ты выбрался из грязи в князи,
   Но, быстро князем становясь,
   Не позабудь, чтобы не сглазить,
   Не вечны князи, вечна грязь*/

import com.sun.xml.internal.bind.v2.TODO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {

    static String fileDirectoryPath = "C:\\Users\\work\\IdeaProjects\\HillelJavaCourse\\src\\com\\hillel\\lesson6\\homework\\TestFileForMyHomework";

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter text: ");

        String textToWrite = new String();
        String inputText = ""; // - поначалу создал String textToWrite через new String, но чтобы не подсвечивало желтым, то попробовал создать inputText просто пустым;

        while (sc.hasNextLine()){
            inputText = sc.nextLine();
            if (inputText.isEmpty()) break;
            textToWrite = textToWrite.concat(inputText + "\n"); // - наверное лучше бы промолчал, но харит, что все равно в текст записывается лишний перенос строки
        }

//        сперва реализовал через do-while, как ты и подсказал, но как-то в конце понял, что вроде можно прописать и через обычный while, который оставил выше
//        в цикле do-while не нравится, что пришлось писать "if (inputText.isEmpty()) break;", но не придумал пока как сделать без нее, чтобы не было лишних переносов строки в конце
        /*do {
            inputText = sc.nextLine();
            if (inputText.isEmpty())break; // - вот эта строка кажется седлом на корове(
            textToWrite = textToWrite.concat(inputText + "\n");
        } while (!inputText.isEmpty());*/

        writeToFile(fileDirectoryPath, textToWrite);
        checkFileIsNotEmpty(fileDirectoryPath);
        readFromFile(fileDirectoryPath);

        sc.close();
    }


    private static void writeToFile(String fileDirectoryPath, String textToWrite) throws IOException{
        FileWriter fileWriter = new FileWriter(fileDirectoryPath);
        fileWriter.write(textToWrite);
        fileWriter.close();
    }


    private static void readFromFile(String fileDirectoryPath) throws IOException {
        FileReader fileReader = new FileReader(fileDirectoryPath);
        Scanner sc = new Scanner(fileReader);
        while (sc.hasNextLine()){
            String textInFile = sc.nextLine();
            System.out.println(textInFile);
        }
        sc.close();
        fileReader.close();
    }


    private static void checkFileIsNotEmpty(String fileDirectoryPath) throws IOException {
        FileReader fileReader = new FileReader(fileDirectoryPath);
        Scanner sc = new Scanner(fileReader);
        String str = sc.nextLine();
        if (str.isEmpty()){
            System.out.println("Something goes wrong, file is empty(");
        } else {
            System.out.println("File write successful\n");
        }
        sc.close();
        fileReader.close();
    }



}