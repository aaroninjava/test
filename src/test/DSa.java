
package test;

import java.text.DecimalFormat;

public class DSa {
    
    String ts;
    double ds;
    DecimalFormat df = new DecimalFormat("##.000");

    DSa(){}
    
    DSa(String ts)
         { this.ts=ts;}
    
    DSa(Double ds)
        {   this.ds=ds;    }
    
    DSa(String ts,Double ds)
    {
        this.ts=ts;
        this.ds=ds;
        System.out.println("測試");
    }

    public String getTs( double ds) {
        this.ds=ds;
        String ts1;
        //ts1=String.valueOf( Double.parseDouble(df.format(ts)) );
        ts1=String.valueOf( df.format(ds)  );
        return ts1;        
    }
    
    public double getDs(String ts) {                        
        double ds1,ds2;
//        String tt;
//        ds1=Double.parseDouble(ts);        
//        tt=df.format(Double.parseDouble(ts));        
        //System.out.println("字串轉成 Double"+tt  ); 
        ds2=Double.parseDouble(df.format(Double.parseDouble(ts)));        
        return ds2;           
    }    
    
    
}

