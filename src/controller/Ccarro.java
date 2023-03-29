/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import static inf3n212.carro.Inf3n212Carro.cadPessoa;
import java.util.ArrayList;
import model.Carro;

/**
 *
 * @author 180504052
 */
public class Ccarro {
    ArrayList <Carro> carros = new ArrayList();
    
    public void addCarro(Carro c){
        this.carros.add(c);   
    }
    public void removeCarro(Carro c){
        this.carros.remove(c);
    }
    public ArrayList<Carro>getCarros(){
        return this.carros;
    }
    public Carro getCarroPlaca(String placa){
        Carro c= null;
        for (Carro carro: carros){
            if (carro.getPlaca().equals(placa)){
                c =carro;
                break;
            }
                    
                  }       
        return c;
    }
    public void mockCarros(){
        Carro c1 =new Carro();
        c1.setPlaca("abc1f34");
        c1.setAnoFab(2023);
        c1.setMarca("Fiat");
        c1.setModelo("palio");
        c1.setTpCambio("manual");
        c1.setCombustivel("flex");
        c1.setAnoModelo(2023);
        c1.setPropreitario(cadPessoa.getPessoaCPF ("30668518006"));
        addCarro(c1);
        
        Carro c2 =new Carro();
        c2.setPlaca("abc1f35");
        c2.setAnoFab(2023);
        c2.setMarca("Fiat");
        c2.setModelo("palio");
        c2.setTpCambio("manual");
        c2.setCombustivel("flex");
        c2.setAnoModelo(2021);
        c2.setPropreitario(cadPessoa.getPessoaCPF ("30668518006"));
        addCarro(c2);
        
        
        
        
        
        
        
        
        
        
        
        
    }
}// fim Classe CCarro
