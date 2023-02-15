package OOP.InterfacesAndAbstraction.Telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable{


    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }



    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();
        for (String url : this.urls) {
            boolean isValid = true;
            for (int i = 0; i < url.length(); i++) {
                if (Character.isDigit(url.charAt(i))) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                sb.append("Browsing: ").append(url).append("!").append(System.lineSeparator());
            } else {
                sb.append("Invalid URL!");
            }
        }
        return sb.toString();
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        for (String number : this.numbers) {
            boolean isValid = true;
            for (int i = 0; i < number.length(); i++) {
                if (!Character.isDigit(number.charAt(i))) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                sb.append("Calling... ").append(number).append(System.lineSeparator());
            } else {
                sb.append("Invalid number!").append(System.lineSeparator());
            }


        }
        return sb.toString().trim();
    }
}
