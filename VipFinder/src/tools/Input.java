package tools;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {
    protected boolean useConfig(){
        Scanner scan = new Scanner(System.in);
        System.out.println("-Config benutzen? (y/n)");
        String input = scan.next();
        if (input.equals("y")){
            System.out.println();
            return true;
        }else System.out.println();return false;
    }

    protected ArrayList setNumbers(){
        Scanner scan = new Scanner(System.in);
        ArrayList numbers = new ArrayList<String>();
        System.out.println("-Telefonnummer eingeben: ");
        for (String line = scan.nextLine(); !line.isEmpty()&&isNumber(line); line = scan.nextLine()) {
            numbers.add(line);
        }
        return numbers;
    }

    protected boolean isNumber (String number){
        if (number.contains("/")){
            number = number.replace("/", "");
        }
        try {
            Integer.parseInt(number);
            return true;
        }catch(NumberFormatException e){
            System.out.println("keine gueltige Nummer!");
            return false;
        }
    }
}
