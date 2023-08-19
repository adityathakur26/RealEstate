
package com.mycompany.amstechconstructionpvtltd;


public class Flat{
 
    private final double rate = 3500;
    private double area_in_sqfeet;
    private double society_devlopmentax;
      
    public Flat( double a )
    {
        area_in_sqfeet = a;        
    }
     public double getFlatArea(){
        
        return area_in_sqfeet ;
    }
    public double getFlatRate()
    {
        return area_in_sqfeet * rate;   
    }
    public double getFlatnnf()
    {
        return getFlatRate() * 10/100; 
    }
    public double getFlatregistry()
    {
        return getFlatRate() * 10/100;
    }
     public double getTotalCharge()
    {
        return getFlatnnf()+getFlatregistry()+getFlatRate()+society_devlopmentax;
    }
}
