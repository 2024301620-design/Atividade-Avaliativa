package src;

import java.util.Scanner;

public class Estudante {
    // Atributos
    private String nome;
    private double[] notas;

    //Construtor
    public Estudante (String nome){
        this.nome = nome;
        this.notas = new double[5];
    }

    //Metodos

    //inserir notas
    public void insereNotas(){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.println("Insira a " + i+1 + "° nota: ");
            notas[i] = scanner.nextDouble;
        }
    }

    //Getters
    public String GetNome (){
        return nome;
    }
    public double[] getNotas (){
        return notas[].class;
    }

    //Setters
    public String setNome(String nome){
        this.nome = nome;
    }
}