package controller;

import java.util.ArrayList;
import java.util.Scanner;

public class Country {
    private String nome;
    private double tamanho;
    private String capital;
    private ArrayList<Country> lista = new ArrayList<Country>();
    Scanner teclado = new Scanner(System.in);
    public Country(String nome, String capital, double tamanho){
        this.nome = nome;
        this.tamanho = tamanho;
        this.capital = capital;
    }

    public boolean equals(Country outro){
        return this.nome.equalsIgnoreCase(outro.nome) && this.capital.equalsIgnoreCase(outro.capital);
    }
    public boolean adicionaFronteira(Country fronteira){
        for(int i = 0; i < lista.size();i++){
            if(this.lista.get(i).nome.equalsIgnoreCase(fronteira.nome)){
                return false;
            }
        }
        if(fronteira.nome.equalsIgnoreCase(this.nome)){
            return false;
        }else{
            lista.add(fronteira);
            return true;
        }
    }
    public ArrayList<Country> listarFronteira(){
        return this.lista;
    }
    public ArrayList<Country> fronteiras(Country outro){
        ArrayList<Country> listaE = new ArrayList<Country>();
        for(int j = 0; j < lista.size(); j++){
            for (int i = 0; i < outro.lista.size(); i++){
                if(this.lista.get(j) == outro.lista.get(i)){
                    listaE.add(this.lista.get(j));
                }
            }
        }
        return  listaE;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
