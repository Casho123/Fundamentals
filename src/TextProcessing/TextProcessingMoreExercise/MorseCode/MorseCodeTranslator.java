package TextProcessing.TextProcessingMoreExercise.MorseCode;

import java.util.Scanner;

public class MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] morseCode = scan.nextLine().split("\\|");



        printMessage(morseCode);


    }

    private static void printMessage(String[] morseCode) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < morseCode.length; i++) {
            String current = morseCode[i];
            switch (current) {
                case ".-":
                    sb.append("a");
                    break;
                case "-...":
                    sb.append("b");
                    break;
                case "-.-.":
                    sb.append("c");
                    break;
                case "-..":
                    sb.append("d");
                    break;
                case ".":
                    sb.append("e");
                    break;
                case "..-.":
                    sb.append("f");
                    break;
                case "--.":
                    sb.append("g");
                    break;
                case "....":
                    sb.append("h");
                    break;
                case "..":
                    sb.append("i");
                    break;
                case ".---":
                    sb.append("j");
                    break;
                //11
                case "-.-":
                    sb.append("k");
                    break;
                case ".-..":
                    sb.append("l");
                    break;
                case "--":
                    sb.append("m");
                    break;
                case "-.":
                    sb.append("n");
                    break;
                case "---":
                    sb.append("o");
                    break;
                case ".--.":
                    sb.append("p");
                    break;
                case "--.-":
                    sb.append("q");
                    break;
                case ".-.":
                    sb.append("r");
                    break;
                case "...":
                    sb.append("s");
                    break;
                case "-":
                    sb.append("t");
                    break;
                case "..-":
                    sb.append("u");
                    break;
                case "...-":
                    sb.append("v");
                    break;
                case ".--":
                    sb.append("w");
                    break;
                case "-..-":
                    sb.append("x");
                    break;
                case "-.--":
                    sb.append("y");
                    break;
                case "--..":
                    sb.append("z");
                    break;
            }

        }
        System.out.println(sb.toString().toUpperCase());
    }
}
