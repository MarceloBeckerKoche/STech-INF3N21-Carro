/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Pessoa;

public class CPessoa {

    ArrayList<Pessoa> pessoas = new ArrayList<>();
    int idPessoa = 1;

    public int geralID() {
        return this.idPessoa++;
    }

    /**
     * Metodo addPessoa adiciona Pessoa no ArrayList pessoas
     *
     * @param p
     */
    public void addPessoa(Pessoa p) {
        this.pessoas.add(p);

    }

    /**
     * Metodo remmovePessoa Pessoa do ArrayList pessoas
     *
     * @param p
     */
    public void removePessoa(Pessoa p) {
        this.removePessoa(p);
    }

    public ArrayList<Pessoa> getPessoas() {
        return this.pessoas;

    }

    /**
     * Metodo getPessoaCpf retorna uma Pessoa caso encontre correspondencia do
     * Cpf do ArrayList pessoas,caso contrario retorna null.
     *
     * @param CPF
     * @return
     */
    public Pessoa getPessoaCPF(String CPF) {
        Pessoa p = null;
        for (Pessoa pes : pessoas) {
            if (pes.getCpf().equals(CPF)) {
                p = pes;
                break;
            }
        }//fim foreach
        return null;
    }

    public void mockPessoas() {
        Pessoa p1 = new Pessoa();
        p1.setIdPessoa(geralID());
        p1.setCpf("30668518006");
        p1.setNome("juvenal das Condongas");
        p1.setEndereco("Rua das Margarids");
        addPessoa(p1);
        Pessoa p2 = new Pessoa();
        p2.setIdPessoa(geralID());
        p2.setCpf("8560619606196077");
        p2.setNome("Madalena Espirito Santos");
        p2.setEndereco("Rua sem saida");
        addPessoa(p2);
    }
}// fim classe controller

