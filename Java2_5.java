package Java_exercise;

import java.util.Scanner;
public class Java2_5 {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int k3 = (n-1)/3 ;
        int k5 = (n-1)/5 ;
        int k15 = (n-1)/15;
        System.out.println((long)(3*k3*(1+k3)+5*k5*(1+k5)-15*k15*(1+k15))/2);
        reader.close();
    }
}
