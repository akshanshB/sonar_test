import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Currency;

public class trial {
    public static void main(String[] args){
        System.out.println("Double");
        Scanner sc =new Scanner(System.in);
        // double amnt=sc.nextDouble();
        Double amnt= 999999.00;
        sc.close();
        NumberFormat nf=NumberFormat.getCurrencyInstance();
        
        nf.setCurrency(Currency.getInstance(Locale.US));
        System.out.println("US: "+nf.format(amnt));
        nf.setCurrency(Currency.getInstance(Locale.CHINA));
        System.out.println("CHINA: "+nf.format(amnt));
        nf.setCurrency(Currency.getInstance(Locale.FRANCE));
        System.out.println("FRANCE: "+nf.format(amnt));
        nf.setCurrency(Currency.getInstance(new Locale("en", "IN")));
        System.out.println("INDIA: "+nf.format(amnt));
        // if(amnt<1000)
        //     System.out.println("INDIA: Rs."+amnt);
        // else{
        //     String s=Double.toString(amnt);
        //     StringBuilder str=new StringBuilder();
        //     str.append(s);
        //     str.reverse();
        //     StringBuffer stringBuffer = new StringBuffer(str);
        //     System.out.println(stringBuffer+" "+stringBuffer.length());
        //     if(stringBuffer.length()>6)
        //         stringBuffer.insert(6, ',');
        //     System.out.println(stringBuffer+" "+stringBuffer.length());
        //     if(stringBuffer.length()>9)
        //         stringBuffer.insert(9, ',');
        //     System.out.println(stringBuffer+" "+stringBuffer.length());
        //     if(stringBuffer.length()>12)
        //         stringBuffer.insert(12, ',');
        //     System.out.println(stringBuffer+" "+stringBuffer.length());
        //     StringBuilder st=new StringBuilder();
        //     st.append(stringBuffer);
        //     st.reverse();
        //     System.out.println("INDIA: Rs."+st);
        // }
    }
}