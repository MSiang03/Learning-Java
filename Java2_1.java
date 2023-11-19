package Java_exercise;

import java.util.Scanner;

public class Java2_1 {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        //int n = reader.nextInt();
        double ans = x;
        for(int i = 1;i<101;i++){
            ans = x / (1 + ans);
        }
        System.out.printf("%.4f\n",ans);
    }

}
