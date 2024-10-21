/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcolatrice;
    
public class Operation {
    double n1;
    double n2;

    public Operation(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public double addizione(){
        return n1+n2;
    }
    
    public double sottrazione(){
        return n1-n2;
    }
    
    public double prodotto(){
        return n1*n2;
    }
    
    public double divisione(){
        return n1/n2;
    }
}
