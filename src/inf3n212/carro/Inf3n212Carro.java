/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inf3n212.carro;

import controller.CPessoa;
import controller.Ccarro;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 180504052
 */
public class Inf3n212Carro {

    public static CPessoa cadPessoa = new CPessoa();
    public static Ccarro cadCarro = new Ccarro();
    static Scanner leia = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cadPessoa.mockPessoas();
        cadCarro.mockCarros();

        System.out.println(cadPessoa.getPessoas());
        System.out.println("");
        System.out.println(cadCarro.getCarros());

    }// fim metodo main

    public static int leiaNumint() {
        Scanner leiaNum = new Scanner(System.in);
        try {
            return leiaNum.nextInt();
        } catch (InputMismatchException i) {
            System.out.println("Erro:" + i.getMessage() + "\n Tente novamente");
            leiaNumint();

        }
        return 99;
    }

    public static void menu() {
        System.out.println("-- Menu Principal--");
        System.out.println("1 - Ger. Pessoa");
        System.out.println("2- Ger. Carro");
        System.out.println("0 -Sair");
        System.out.print("Digite aqui");
    }//fim menuP

    public static void subMenu(int opm) {
        String subM = null ;
        if (opm == 1) {
            subM = "Pessoa";
        }
        if (opm == 2) {
            subM = "Carro";
        }
        System.out.println("Ger" + subM + "--");
        System.out.println("1 - Cadastrar" + subM);
        System.out.println("2 - Editar" + subM);
        System.out.println("3 - Listar" + subM + "S");
        System.out.println("4 - deletar " + subM);
        System.out.println("0 - voltar");
        System.out.print("Digite aqui");
    }// fim subMenu

}//fim classe
