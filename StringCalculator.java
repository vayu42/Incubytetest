/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class StringCalculator
{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public Boolean checkNumber(String str) throws Exception     {
         for (int i = 0; i < str.length(); i++)
                if (Character.isDigit(str.charAt(i)) == false)
                         return false;
        return true;
    }
        public static String getString() throws Exception  {
                String str = br.readLine();
                return str;
        }
        
    public int Add(String str) throws Exception    {
        int  sum=0;
            String[] strarr = str.split("[\\s|.|*|#|@|]");
                for(int i = 0;i<strarr.length;i++)    {
                        if(checkNumber(strarr[i]))
                                sum+=Integer.parseInt(strarr[i]);
                        else
                                break;
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
