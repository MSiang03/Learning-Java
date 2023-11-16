/*
    题目：使用Regex判断一个字符串是否整除4
         在字符串中，数字以'['开头，以']'结尾，在开头包含加号或减号；
         数字首位可能包含多个0，应当被忽略，字符串中数字以外的其他文本应该被忽略；
         所有数字都是整数，所有浮点数应当被忽略
*/
import java.util.ArrayList;
import java.util.regex.*;
import java.util.Scanner;
import java.util.List;
public class DivideByFour {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String input = read.nextLine();            //读入字符串
        List<String> List = new ArrayList<String>();
        String pattern = "\\[\\+?(-?\\d*)\\]";     //用正则表达式转换字符串
        Pattern r = Pattern.compile(pattern);      //创建符合题目描述的pattern
        Matcher m = r.matcher(input);              //使用Matcher匹配字符串
        String num = new String();
        if(m.find()){
            num = m.group();                       //若找到符合的则赋值给num
        }
        String k = num.replaceAll("\\[","");       //去掉'['
        String k1 = k.replaceAll("\\]","");        //去掉']'
        int number = Integer.parseInt(k1);         //转换成数字
        System.out.println(number%4==0?"yes":"no");//输出yes or no
    }
}
