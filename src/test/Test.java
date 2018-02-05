/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.text.DecimalFormat;

public class Test {          
   
    //d2="3.1415926";
    //d2=df.format(d1);
   //ds2=df.format(ds1);       
        
    public static void main(String[] args) {        
         double d1,d1a;
         String t2;                  
         DSa dsa=new DSa();               
         t2="3.1415926";
         d1=dsa.getDs(t2);
         d1=3.87654321;
         t2=dsa.getTs(d1);
         System.out.println("getTS="+t2);       
    }      
}


