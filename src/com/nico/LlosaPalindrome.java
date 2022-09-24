/*
Eduardo Dominico Llosa
CSCC 20 B - OBJECT-ORIENTED PROGRAMMING
*/
package com.nico;
import java.util.Scanner;

public class LlosaPalindrome {
    static Scanner s = new Scanner(System.in);
    public void palindrome(String input) {
        if (input == null || input.length() == 1) {
            System.out.println("Not a palindrome");
            return;
        }
        for (int i = 0, j = input.length() - 1; i <= j; i++, j--) {
            if (input.charAt(i) != input.charAt(j)) {
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println("The word is a palindrome");
    }

    public static void main(String[] args) {
        System.out.println("Enter a word: ");

        String str = s.nextLine();
        GetterSetter getterSetter = new GetterSetter();
        getterSetter.setInput(str);

        LlosaPalindrome p = new LlosaPalindrome();

        p.palindrome(getterSetter.getInput());
    }
}
class GetterSetter {
    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    private String input;
}