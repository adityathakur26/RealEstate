
package com.mycompany.amstechconstructionpvtltd;


public class Estimation {
    public static void TotalEstimation(Plot obj){
        
        System.out.println("Type : Plot");
        System.out.println("Length :" + obj.getLength());
        System.out.println("Breadth :" + obj.getbreadth());
        System.out.println("Total Area :" + obj.getPlotArea());
        System.out.println("Plot Rate :" + Rate.plotrate);
        
        double Totalprice = Calculation.getTotalprice(obj.getPlotArea(), 'p');
        double registrycharges = Calculation.getRegistrycharges(Totalprice);
        double greentax = Calculation.getgreentax(Totalprice);
        
        System.out.println("Total Price :"+Totalprice);
        System.out.println("Green Tax :"+greentax);
        System.out.println("Registry Tax :"+registrycharges);
        System.out.println("Society development :"+Rate.societydevelopmentax);
        double grandtotal = Totalprice + registrycharges + greentax + Rate.societydevelopmentax;
        System.out.println("Grand Total  :"+grandtotal);
        
    }
    public static void TotalEstimation(Office office){
         System.out.println("Type : office");
        System.out.println("Length :" + office.getLength());
        System.out.println("Breadth :" + office.getbreadth());
        System.out.println("Total Area :" + office.getOfficeArea());
        System.out.println("office Rate :" + Rate.Officerate);
        double totalPrice = Calculation.getTotalprice(office.getOfficeArea(), 'o');
        double registryCharges = Calculation.getRegistrycharges(totalPrice);
        double greenTax = Calculation.getgreentax(totalPrice);

        System.out.println("Total Price :" + totalPrice);
        System.out.println("Registry Charges :" + registryCharges);
        System.out.println("Green Tax :" + greenTax);
        System.out.println("Society Development Charges :" + Rate.societydevelopmentax);
        double grandTotal = totalPrice + registryCharges + greenTax + Rate.societydevelopmentax;
        System.out.println("Grand Total " + grandTotal);
    }
    public static void TotalEstimation(Flat flat){
        System.out.println("Type : flat");
        System.out.println("Total Area :" + flat.getFlatArea());
        System.out.println("Flat Rate :" + Rate.Flatrate);
        double totalPrice = Calculation.getTotalprice(flat.getFlatArea(), 'f');
        double registryCharges = Calculation.getRegistrycharges(totalPrice);
        double greenTax = Calculation.getgreentax(totalPrice);

        System.out.println("Total Price :" + totalPrice);
        System.out.println("Registry Charges :" + registryCharges);
        System.out.println("Green Tax :" + greenTax);
        System.out.println("Society Development Charges :" + Rate.societydevelopmentax);
        double grandTotal = totalPrice + registryCharges + greenTax + Rate.societydevelopmentax;
        System.out.println("Grand Total " + grandTotal);

        
    }
}
