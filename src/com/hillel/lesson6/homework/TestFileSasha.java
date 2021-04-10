package com.hillel.lesson6.homework;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestFileSasha {

    static String pathToFile = "C:\\Users\\work\\IdeaProjects\\HillelJavaCourse\\src\\com\\hillel\\lesson6\\homework\\TestFileSashaTask";

    public static void main(String[] args) throws IOException {
        writeText(pathToFile);
    }

    public static void writeText(String pathToFile) throws IOException {
        Scanner enterYourInformation= new Scanner(System.in);
        String moreEnteredInformation = enterYourInformation.nextLine();
        enterYourInformation.close();
        FileWriter userFileWriter= new FileWriter(pathToFile);
        userFileWriter.write(moreEnteredInformation);
        userFileWriter.close();

    }

/*    private static void writeText() throws IOException {
        Scanner enterYourInformation = new Scanner(System.in);
        System.out.println("Enter your text: ");
        String moreEnteredInformation = enterYourInformation.nextLine();
        System.out.println("moreEnteredInformation is: " + moreEnteredInformation);
        FileWriter userFileWriter = new FileWriter(pathToFile);
        userFileWriter.write(moreEnteredInformation);
        userFileWriter.close();
        enterYourInformation.close();
    }*/
}
