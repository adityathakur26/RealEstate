
package com.mycompany.amstechconstructionpvtltd;


public class Plot{
    private double length;
    private double breadth;
    private double rate =2800;
   
    private double society_devlopmentax;
  
    public Plot(double l ,double b  )
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
    public double getPlotArea(){
        
        return length * breadth;
    }
    public double getPlotRate()
    {
        return length * breadth * rate ;   
    }
    public double getPlotnnf()
    {
        return getPlotRate() * 1/100; 
    }
    public double getPlotregistry()
    {
        return getPlotRate() * 10/100;
    }
    public double getTotalCharge()
    {
        return getPlotnnf()+getPlotregistry()+getPlotRate()+society_devlopmentax;
    }
            
}
