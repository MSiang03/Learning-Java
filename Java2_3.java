package Java_exercise;

import java.util.Scanner;
import java.lang.Math;

public class Java2_3 {
    public static long cubicsqrt(long x){
        int sign = x > 0 ? 1 : -1;
        x = Math.abs(x);
        long result =(long)Math.cbrt(x);
        return (x/result/result<result?result-1:result)*sign;
    }
    //牛顿迭代法
    public static long cuberoot(long num){
        //判断输入是否为0，为0直接返回
        if(num==0){
            return 0;
        }
        double x0 = num;
        //根据迭代公式可得x1：
        double x1 = (2*x0 + num / (x0*x0))/3;
        //迭代不满足x^3-a>0.0001,既接近0，也可以表示为x1-x0>0.0001,误差小于0.0001(基本相同)
        while(x1 - x0 >1){
            x0 = x1;
            x1 = (2*x0 + num/(x0*x0))/3;
        }
        return (long) ((num/x1/x1<x1)?x1-1:x1);
    }

    //二分法
    public static long Dichotomy(long num){
        long right,left,mid = 0;
        //要注意边界条件，输入的num可能是负数，使用min(-1,),max(1,)扩大一点点范围来计算
        right = Math.max(1,num);
        left = Math.min(-1,num);
        //当right和left基本相等，返回左右都可以
        while(right - left > 1){
            mid = (left+right)/2;
            //如果乘积大于num，说明立方根在mid的左侧
            if(mid * mid * mid > num){
                right = mid;
            }
            //如果乘积小于num，说明立方根在mid的右侧
            else if(mid * mid * mid < num){
                left = mid;
            }
            else{
                //如果左右相等，直接结束循环
                return mid;
            }
        }
        return right;
    }
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        long x = reader.nextLong();
        System.out.println(cubicsqrt(x));
        reader.close();
    }
}
