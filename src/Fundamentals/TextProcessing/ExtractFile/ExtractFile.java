package Fundamentals.TextProcessing.ExtractFile;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        int fileBeginning = input.lastIndexOf("\\") + 1;
        int fileEnd = input.indexOf(".");

        System.out.println("File name: " + input.substring(fileBeginning, fileEnd));
        System.out.println("File extension: " + input.substring(fileEnd+1));

    }
}
