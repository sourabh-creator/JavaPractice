package module;

import java.util.Scanner;

public class stringReverse {
    public void strRev(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        for(int i=ch.length-1;i>=0;i--)
        {
            char ch1 = ch[i];
            System.out.print(ch1);
        }
        }

    public static void main(String[] args) {
        stringReverse srev = new stringReverse();
        srev.strRev();


    }

    }
