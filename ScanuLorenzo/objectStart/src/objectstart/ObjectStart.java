/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objectstart;

/**
 *
 * @author alunni
 */
public class ObjectStart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Triangolo
        Triangolo triangolo = new Triangolo(5, 6, 10);
        double perimetroTri = triangolo.calcPerimetro();
        double areaTri = triangolo.calcArea();
        System.out.println("il triangolo ha perimetro "+ perimetroTri + ", ed area " + areaTri);
        
        //Cerchio
        
        Cerchio cerchio = new Cerchio(5.1);
        double perimetroCerc = Math.round(cerchio.calcPerimetro());
        double areaCerch = Math.round(cerchio.calcArea());
        System.out.println("Il cerchio ha area "+ areaCerch + "e perimetro " + perimetroCerc);
    }
    
}


