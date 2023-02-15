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
        return "Browsing: ";
    }

    @Override
    public String call() {
        return "Calling... ";
    }
}
