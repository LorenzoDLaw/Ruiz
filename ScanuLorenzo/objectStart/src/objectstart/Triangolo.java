/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectstart;

/**
 *
 * @author alunni
 */
class Triangolo extends ObjectStart{
    protected double cateto1;
    protected double cateto2;
    protected double ipotenusa;
    
    // costruttori 
    public Triangolo(){    
    }
    
    public Triangolo(double cateto1, double cateto2, double ipotenusa){
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
        this.ipotenusa = ipotenusa;
    }
    
    // set dei valori
    public void setBase(double base){
        this.cateto1 = base;
    }
    public void setAltezza(double altezza){
        this.cateto2 = altezza;
    }
    
    // get valori 
    public double getBase(){
        return this.cateto1;
    }
    public double getAltezza(){
        return this.cateto2;
    }
    
    // metodi per calcolare are e perimetro
   public double calcPerimetro(){
       double perimetro = cateto1 + cateto2 + ipotenusa;
       return perimetro;
   }
   public double calcArea(){
       double area = cateto1 * cateto2;
       return area;
   }
}
