package Fundamentals.Lists.MoreExercises.TakeSkipRope;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TakeSkipRope {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String codedWord = scan.nextLine();
        List<String> nonNumbersList = addAllLetters(codedWord);
        List<Integer> numbersList = addAllNumbers(codedWord);
        List<Integer> evenIndexNumbers = new ArrayList<>();
        List<Integer> oddIndexNumbers = new ArrayList<>();
        for (int i = 0; i < numbersList.size(); i++) {
            if (i % 2 == 0) {
                evenIndexNumbers.add(numbersList.get(i));
            } else {
                oddIndexNumbers.add(numbersList.get(i));
            }
        }

        List<String> decodeMessage = new ArrayList<>();
        while(!nonNumbersList.isEmpty()){

            decodeMessage = addELementsWithEvenLength(decodeMessage, nonNumbersList, evenIndexNumbers.get(0));


            nonNumbersList = removeTakeAndSkipElements(nonNumbersList, evenIndexNumbers, oddIndexNumbers);
            evenIndexNumbers.remove(0);
            oddIndexNumbers.remove(0);
            if(evenIndexNumbers.isEmpty()){
                break;
            }

        }
        if(!decodeMessage.isEmpty()){
            if(decodeMessage.get(decodeMessage.size()-1).equals(" ")){
                decodeMessage.remove(decodeMessage.size()-1);
            }
        }



        System.out.println(String.join("", decodeMessage));
    }



    static List<String> addAllLetters(String codedWord) {
        List<String> listOfLetters = new ArrayList<>();
        for (int i = 0; i < codedWord.length(); i++) {
            if (codedWord.charAt(i) >= 48 && codedWord.charAt(i) <= 57) {
                continue;
            } else {
                listOfLetters.add(String.valueOf(codedWord.charAt(i)));
            }
        }
        return listOfLetters;

    }


    static List<Integer> addAllNumbers(String codedWord) {
        List<Integer> listOfNumbers = new ArrayList<>();
        for (int i = 0; i < codedWord.length(); i++) {
            if (codedWord.charAt(i) >= 48 && codedWord.charAt(i) <= 57) {
                listOfNumbers.add(Character.getNumericValue(codedWord.charAt(i)));
            }
        }
        return listOfNumbers;
    }

    static List<String> removeTakeAndSkipElements(List<String> nonNumbersList, List<Integer> evenIndexNumbers, List<Integer> oddIndexNumbers) {

        for (int i = 0; i < evenIndexNumbers.get(0); i++) {
            if(!nonNumbersList.isEmpty()){
                nonNumbersList.remove(0);
            }

        }
        for (int i = 0; i < oddIndexNumbers.get(0); i++) {
            if(!nonNumbersList.isEmpty()){
                nonNumbersList.remove(0);
            }

        }

        return nonNumbersList;
    }

    static List<String> addELementsWithEvenLength(List<String> decodeMessage, List<String> nonNumbersList, Integer numLength) {
        int index = 0;
        for (int i = 1; i <= numLength; i++) {
            if(!nonNumbersList.isEmpty()&&i<=nonNumbersList.size()){
                decodeMessage.add(nonNumbersList.get(index++));

            }

        }
        return decodeMessage;
    }
}
