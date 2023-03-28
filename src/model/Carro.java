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
    private String modelo;
    private int anoFab;
    private int cor;
    private String tpCambio;
    private String combustivel;
    private Pessoa propreitario;//agregacao da classe model Pessoa com carro

    public Carro() {
    }

    public Carro(String marca, String modelo, int anoFab, int cor, String tpCambio, String combustivel, Pessoa propreitario) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFab = anoFab;
        this.cor = cor;
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

    public int getCor() {
        return cor;
    }

    public void setCor(int cor) {
        this.cor = cor;
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
        return "Carro{" + "marca=" + marca + ", modelo=" + modelo + ", anoFab=" + anoFab + ", cor=" + cor + ", tpCambio=" + tpCambio + ", combustivel=" + combustivel + ", propreitario=" + propreitario + '}';
    }

    
}// fim classe carro
