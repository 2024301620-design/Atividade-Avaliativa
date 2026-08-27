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
            System.out.println("Insira a " + (i+1) + "° nota: ");
            notas[i] = scanner.nextDouble();
        }
    }
    // funcao calcular media
    public double calculaMedia(){
        double soma = 0;
        for(int i = 0; i < 5; i++){
            soma += notas[i];
        }
        return soma / notas.length;
    }
    // funcao calcular media ponderada
    public double calculaMedia(int[] pesos){
        double somaPonderada = 0;
        int somaPesos = 0;

        for(int i = 0; i < notas.length; i++){
            somaPonderada += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }
        somaPonderada = somaPonderada / somaPesos;
        return somaPonderada;
    }
    // funcao calcular menor nota
    public double calculaMenorNota(){
        double menor = notas[0];
        for(int i = 1; i < notas.length; i++){
            if(notas[i] < menor){
                menor = notas[i];
            }
        }
        return menor;
    }

    public static Estudante[] getAprovados(Estudante[] estudantes){
        int quantAprovados = 0;

        for(int i = 0; i < estudantes.length; i++){
            if(estudantes[i].calculaMedia() >= 6){
                quantAprovados++;
            }
        }

        if(quantAprovados == 0){
            return null;
        }

        Estudante[] aprovados = new Estudante[quantAprovados];
        int indice = 0;
        for(int i = 0; i < estudantes.length; i++){
            if(estudantes[i].calculaMedia() >= 6){
                aprovados[indice] = estudantes[i];
                indice++;
            }
        }

        return aprovados;
    }

    //Getters
    public String getNome (){
        return nome;
    }
    public double[] getNotas (){
        return notas;
    }

    //Setters
    public void setNome(String nome){
        this.nome = nome;
    }
}