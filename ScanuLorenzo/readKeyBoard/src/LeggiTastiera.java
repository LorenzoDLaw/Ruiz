
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunni
 */
public class LeggiTastiera {    
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        
        String leggiNum; 
        int num;
        
        try {
            leggiNum = tastiera.readLine();
            num = Integer.parseInt(leggiNum);
            System.out.println(num);
            
        } catch (Exception e) {
            System.out.println("\n Per favore inserire un valore valido");
        }
    }
}
