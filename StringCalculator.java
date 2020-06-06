import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class StringCalculator
{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    class MyException extends Exception {
        public String MyException()    { 
	       return ("Negatives not allowed") ;
    }
}
    public static String getString() throws Exception  {
            String str = br.readLine();
            return str;
    }

     public String removeNegative(String str) throws Exception {
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)=='-')   {
                int cntr = 0;
               while(i+1<str.length() && Character.isDigit(str.charAt(i+1))==true)  {
                   i++;
                   cntr++;
               }
            }
            else
                builder.append(str.charAt(i));
        }
        return builder.toString();
    }

    public int Add(String str) throws Exception    {
        int  sum=0,cntr=0,i=0;
                if(Character.isDigit(str.charAt(i)) != true)  {
                    
                for(i = 1;i<str.length();i++)    {
                        if(Character.isDigit(str.charAt(i)) == true)
                                cntr++;
                        else if((Character.isDigit(str.charAt(i-1)) == true) && ((Character.isDigit(str.charAt(i)) == false))) {
                            if(Integer.parseInt(str.substring(i-cntr,i))<1000)
                            sum+=Integer.parseInt(str.substring(i-cntr,i));
                            cntr = 0;
                        }
                        else if((Character.isDigit(str.charAt(i-1)) != true) && ((Character.isDigit(str.charAt(i)) != false)))
                            cntr++;
                    }
                }
                else    {
                    
                    for(i = 0;i<str.length();i++)    {
                        if(Character.isDigit(str.charAt(i)) == true)
                            cntr++;
                        else if((Character.isDigit(str.charAt(i-1)) == true) && ((Character.isDigit(str.charAt(i)) == false))) {
                            if(Integer.parseInt(str.substring(i-cntr,i))<1000)
                            sum+=Integer.parseInt(str.substring(i-cntr,i));
                            cntr = 0;
                        }
                    }
                }
                        if(cntr!=0) {
                            if(Integer.parseInt(str.substring(i-cntr,i))<1000)
                            sum+=Integer.parseInt(str.substring(i-cntr,i));
                            }
               return sum;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        StringCalculator obj = new StringCalculator();
        String s = getString();
        if(s!=null)	{
	String s1 = obj.removeNegative(s);
        System.out.println(obj.Add(s1));
	}

    }
}
