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
        int opM = 99;
        int opSM = 99;

        do {
            System.out.println("--Sistema de cadastro --");
            menuP();
            opM = leiaNumint();
            switch (opM) {
                case 1:
                case 2:
                    do {
                        subMenu(opM);
                        opSM = leiaNumint();
                        switch (opSM) {
                            case 1:
                                System.out.println("--Cadastrar-- ");
                                if (opM == 1) {
                                    cadastrarPessoa();
                                } else {
                                    cadastrarCarro();
                                }
                                break;
                            case 2:
                                System.out.println(" --Editar-- ");
                                if (opM == 1) {
                                    editarPessoa();
                                } else {
                                    editarCarro();
                                }
                                break;
                            case 3:
                                System.out.println(" --Listar-- ");
                                if (opM == 1) {
                                    listarPessoa();
                                } else {
                                    listarCarro();
                                }

                                break;
                            case 4:
                                System.out.println(" --Deletar-- ");
                                if (opM == 1) {
                                    deletarPessoa();
                                } else {
                                    deletarCarro();
                                }
                                break;
                            case 0:

                                break;
                            default:

                                System.out.println("opção inválida, tente novamente!");
                        }
                    } while (opSM != 0);
                    break;
                case 0:
            }
            System.out.println("Aplicação encerrada pelo usuário");
            break;
        } while (opM != 0);

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

    public static void menuP() {
        System.out.println("-- Menu Principal--");
        System.out.println("1 - Ger. Pessoa");
        System.out.println("2- Ger. Carro");
        System.out.println("0 -Sair");
        System.out.print("Digite aqui..");

    }//fim menuP

    public static void subMenu(int opm) {
        String subM = null;
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

    private static void cadastrarPessoa() {
        System.out.println("Pessoa");

    }

    private static void cadastrarCarro() {

        System.out.println("Carro");
    }

    private static void deletarCarro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void deletarPessoa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void listarPessoa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void listarCarro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void editarCarro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void editarPessoa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}//fim classe
