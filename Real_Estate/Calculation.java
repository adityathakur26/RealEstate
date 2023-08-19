
package com.mycompany.amstechconstructionpvtltd;


public class Calculation {
    
    public static double getTotalprice(double area,char type){
        if (type == 'p')
        {
            return area * Rate.plotrate;
        }
        else if (type == 'o')
        {
            return area * Rate.Officerate;
        }
        else if(type == 'f')
        {
            return area * Rate.Flatrate;
        }
        return -1;
    }    
        public static double getRegistrycharges(double Totalprice){
            return ((Totalprice * Rate.Registrycharges)/100);
        }
        public static double getgreentax(double Totalprice)
        {
            return ((Totalprice * Rate.greentax)/100);
        }
        
        
}
       

