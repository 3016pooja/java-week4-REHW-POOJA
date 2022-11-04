package java_week4_ReHw;

import java.util.Scanner;

public class Programme9_FibonacciNumber {
    public static void isFibonacci(int count){
        int n1=0,n2=1,n3;
        System.out.println(n1+" "+n2);
        //loop start from 2 beacuse 0 and 1 are already printed
        for(int i=2;i<count;i++){
            n3=n1+n2;
            System.out.println(" "+n3);
            n1=n2;
            n2 = n3;
        }
    }

    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner=new Scanner(System.in);
        System.out.println("Inpput Fibonacci number count:");
        isFibonacci(scanner.nextInt());
        //closing the scanner object;
        scanner.close();
    }
}
