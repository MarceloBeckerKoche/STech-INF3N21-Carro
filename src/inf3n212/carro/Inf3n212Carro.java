/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inf3n212.carro;

import controller.CPessoa;
import controller.Ccarro;


/**
 *
 * @author 180504052
 */
public class Inf3n212Carro {
    public static CPessoa cadPessoa = new CPessoa();
    public static Ccarro cadCarro = new Ccarro();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cadPessoa.mockPessoas();
        cadCarro.mockCarros();
        
        System.out.println(cadPessoa.getPessoas());
        System.out.println ("");
        System.out.println(cadCarro.getCarros());
        
    }
    
}