package PalindromeChecker;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input text: ");
        String input=sc.nextLine();
        boolean isPalindrome = true;
        int n= input.length()-1;
        for(int i=0; i<=n; i++) {
            if (input.charAt(i) != input.charAt(n)){
                isPalindrome=false;
                break;
            }
            n--;
        }
            System.out.println("It is a Palindrome ? : "+isPalindrome);
    }
}
