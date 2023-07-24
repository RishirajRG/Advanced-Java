import java.io.*;
import java.util.Scanner;
import java.util.*;
public class isPalindrome {
    static int find(int input1) {
        int i;
        String l = String.valueOf(input1);
        int s = l.length();
        int s1 = s - 1;
        double j=0;
        for (i = 1; i<=s;i++){
            int m = input1 % 10;
            input1 = Math.floorDiv(input1, 10);
            j = j+ m * Math.pow(10,s1);
            s1 = s1 - 1;
            System.out.println(j);
        }
        return (int)j;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the palindrome number:");
        int input1=sc.nextInt();
        int ans=find(input1);
        if (ans == input1){
            System.out.println(input1+ " is a palindrome.");
        }
    }

}
