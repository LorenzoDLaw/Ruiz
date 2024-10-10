/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectstart;
/**
 *
 * @author alunni
 */
public class Cerchio extends ObjectStart{
    protected double raggio;
    
    
    // costruttorri 
    public Cerchio(){
    }
    
    public Cerchio(double raggio){
        this.raggio = raggio;
    }
    
    // creo il setRaggio 
    public void setRaggio(double r){
        raggio = r;
    }
    // creo il getRaggio
    public double getRaggio(){
        return raggio;
    }
    
    //metodi per l'area e primetro 
    public double calcArea(){
        double area = (raggio*raggio)*Math.PI;
        return area;
    }
    public double calcPerimetro(){
        double perimetro = raggio * Math.PI;
        return perimetro;
    }
    
}
