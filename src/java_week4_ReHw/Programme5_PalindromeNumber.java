package java_week4_ReHw;

import java.util.Scanner;

public class Programme5_PalindromeNumber {
    public static boolean  isPalindrome(int number) {
        //converts negative number to postive number
        if (number < 0) {
        number=-number;
    }
        int lastDigit,reverse=0,temp;
        temp=number;
        while(number>0){
            //stores thr  last digit
            lastDigit =number%10;
            reverse=reverse * 10+ lastDigit;
            number=number/10;
        }
        return reverse==temp;
    }
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number:");
        int a=scanner.nextInt();
        boolean check=isPalindrome(a);
        //checks numberis Palindrome or not
        if(check)
            System.out.println("Number is Palidrome");
        else
            System.out.println("Number is not Palidrome");
        //closing the scanner object
        scanner.close();
    }
}
