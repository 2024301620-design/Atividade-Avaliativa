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
  /* public void insereNotas(){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
        System.out.println("Insira a " + i+1 + "° nota: ");
        double notas[i] = scanner.nextDouble;
        }
    }*/
}