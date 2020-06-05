/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class StringCalculator
{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
    public static String getString() throws Exception  {
            String str = br.readLine();
            return str;
    }
        
    public int Add(String str) throws Exception    {
        int  sum=0,cntr=0,i=0;
                for(i = 1;i<str.length();i++)    {
                        if(Character.isDigit(str.charAt(i)) == true)  
                                cntr++;
                        else if((Character.isDigit(str.charAt(i-1)) == true) && ((Character.isDigit(str.charAt(i)) == false))) {
                            String strarr = str.substring(i-cntr,i);
                            sum+=Integer.parseInt(strarr);
                            cntr = 0;
                        }
			else if((Character.isDigit(str.charAt(i-1)) != true) && ((Character.isDigit(str.charAt(i)) != false))) 
                            cntr++;
                }
                        if(cntr!=0) {
                            String strarr = str.substring(i-cntr,i);
                            sum+=Integer.parseInt(strarr);
                            }
               return sum;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        StringCalculator obj = new StringCalculator();
        String s = getString();
        if(s!=null)
        System.out.println(obj.Add(s));
    }
}
