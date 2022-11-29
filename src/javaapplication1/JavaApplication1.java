
package javaapplication1;

import java.util.Arrays;

public class JavaApplication1 {

    
    public static void main(String[] args) {
             
        
        String c1="read";
        String c2="dear";
        char[] s1=c1.toCharArray();
        char[] s2=c2.toCharArray();
        
        if(c1.length() !=c2.length())
        {
            System.out.println("Not Anagram ");
            System.exit(0);
        }
        Arrays.sort(s1);
        Arrays.sort(s2);
        
        for (int i=0;i<s1.length;i++)
        {
         if(s1[i] != s2[i])
         {
             System.out.println("Not Amnagram");
             System.exit(0);
         }
         
        }   
        System.out.println("yes Is Anagram baby");
    }
    
}
