package tools;

import java.util.ArrayList;

public class Starter {
    public void start(){
        ArrayList<String> numbers;
        Input input = new Input();
        if (input.useConfig()){
            Config config = new Config();
            numbers = config.getNumbers();
        }else{
            numbers = input.setNumbers();
        }
        Finder finder = new Finder();
        System.out.println("Vip Liste: "+finder.findVip(numbers));
    }
}
