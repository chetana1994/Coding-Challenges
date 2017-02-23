import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        StringBuilder s = new StringBuilder(in.next());
        int i = 0;
        while(i<s.length()-1){
            if(s.charAt(i)==s.charAt(i+1)){
                s.delete(i,i+2);
                i=0;
            }else{
                i++;
            }
        }
        System.out.println(s.toString().equals("")?"Empty String":s.toString());
    
        
    
}
}