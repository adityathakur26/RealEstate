
package com.mycompany.amstechconstructionpvtltd;


public class Office{
    private double length;
    private double breadth;
    private final double rate = 7500;
    private double society_devlopmentax;

    
    public Office(double l ,double b)
    {
        length = l;
        breadth = b;          
    }
    public double getLength(){
        return length;
    }
    public double getbreadth(){
        return breadth;
    }
    public double getOfficeArea(){
        
        return length * breadth;
    }
    public double getOfficeRate()
    {
        return length * breadth * rate;   
    }
    public double getOfficennf()
    {
        return getOfficeRate() * 1/100; 
    }
    public double getOfficeregistry()
    {
        return getOfficeRate() * 10/100;
    }
    public double getTotalCharge()
    {
        return getOfficennf()+getOfficeregistry()+getOfficeRate()+society_devlopmentax;
    }
            
    
}
