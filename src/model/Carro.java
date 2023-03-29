/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author 180504052
 */
public class Carro {

    private String marca;
    private String placa;
    private String modelo;
    private int anoFab;
    private int anoModelo;
    private String tpCambio;
    private String combustivel;
    private Pessoa propreitario;//agregacao da classe model Pessoa com carro

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    

    public Carro() {
    }

    public Carro(String marca, String placa, String modelo, int anoFab, int cor, String tpCambio, String combustivel, Pessoa propreitario) {
        this.marca = marca;
        this.placa = placa;
        this.modelo = modelo;
        this.anoFab = anoFab;
        this.anoModelo = cor;
        this.tpCambio = tpCambio;
        this.combustivel = combustivel;
        this.propreitario = propreitario;
    }

   
       public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }

    public int getanoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getTpCambio() {
        return tpCambio;
    }

    public void setTpCambio(String tpCambio) {
        this.tpCambio = tpCambio;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public Pessoa getPropreitario() {
        return propreitario;
    }

    public void setPropreitario(Pessoa propreitario) {
        this.propreitario = propreitario;
    }

    @Override
    public String toString() {
        return "Carro{" + "placa=" + placa+ "marca=" + marca + ", modelo=" + modelo + ", anoFab=" + anoFab + ", anoModelo=" + anoModelo + ", tpCambio=" + tpCambio + ", combustivel=" + combustivel + ", propreitario=" + propreitario + '}';
    }

    
}// fim classe carro
