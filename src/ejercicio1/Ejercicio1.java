/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float area,base,altura;       
        
        System.out.println("Base:");
        Scanner dato=new Scanner(System.in);
        base=dato.nextFloat();
        
        System.out.println("Altura:");
        altura=dato.nextFloat();
        area=base*altura/2;
        
        System.out.println("Area:"+area);
        
        
    
    
    }
    
    
    
}
