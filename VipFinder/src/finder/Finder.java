package finder;

import java.util.ArrayList;
import java.util.HashMap;

public class Finder {
    ArrayList<String> Vip = new ArrayList<>();
    protected ArrayList findVip(ArrayList<String> numbers){
        for (int i = 0; i<numbers.size(); i++){
            String cN = numbers.get(i).replace("/","");//cN= currentNumber
            if (findConsecutive(cN)&&findRecurrent(cN)){
                Vip.add (numbers.get(i));
            }
        }
        return Vip;
    }

    protected boolean findConsecutive(String number){
        for (int i = 2; i<number.length(); i++){
            if (number.charAt(i-2)>number.charAt(i-1)&&number.charAt(i-1)>number.charAt(i)){
                return true;
            }
            if (number.charAt(i-2)<number.charAt(i-1)&&number.charAt(i-1)<number.charAt(i)){
                return true;
            }
        }
        return false;
    }
    protected boolean findRecurrent(String number){
        HashMap<Integer,Integer> check = new HashMap();
        for (int i = 0; i<number.length(); i++){
            int ziffer = number.charAt(i);
            if (!check.containsKey(ziffer)){
                check.put(ziffer,i);
            }else{
                if (check.get(ziffer) == i-1){
                    return true;
                }
            }
        }
        return false;
    }
}
