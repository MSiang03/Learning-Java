import java.util.ArrayList;
import java.util.regex.*;
import java.util.Scanner;
import java.util.List;
public class DivideByFour {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String input = read.nextLine();
        List<String> List = new ArrayList<String>();
        String pattern = "\\[\\+?(-?\\d*)\\]";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(input);
        String num = new String();
        if(m.find()){
            num = m.group();
        }
        String k = num.replaceAll("\\[","");
        String k1 = k.replaceAll("\\]","");
        String k2 = k1.replaceAll("\\+","");
        int number = Integer.parseInt(k2);
        System.out.println(number%4==0?"yes":"no");
    }
}
