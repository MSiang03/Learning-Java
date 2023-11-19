package Java_exercise;

import java.util.Scanner;
import java.math.BigInteger;
public class Java2_4 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        long a1 = read.nextInt();
        long b1 = read.nextInt();
        long p = read.nextInt();
        long a = a1;
        long b = b1;
        long ans = 1;
        while(b!=0){
            if((b&1)==0){
                b>>=1;
                a*=a;
                a%=p;
            }
            else{
                b>>=1;
                ans*=a;
                ans%=p;
                a*=a;
                a%=p;
            }
        }
        System.out.println(a1+"^"+b1+" mod "+p+"="+ans);
    }
}