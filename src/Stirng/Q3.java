package Stirng;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String :-");
        String s = sc.nextLine();
        System.out.println("Enter A Character :-");
        char a = sc.nextLine().charAt(0);
        System.out.println("New String Is :- " + s.replace(a, '*'));
    }
}
