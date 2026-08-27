package leonardo.avaliacao.formula1;

public class Engenheiro extends Pessoa {
    private Piloto piloto;

    public Engenheiro (String nome, int idade, String nacionalidade, Piloto piloto){
        super.nome = nome;
        super.idade = idade;
        super.nacionalidade = nacionalidade;
        this.piloto = piloto;
    }

    public String getNome(){
        return super.getNome();
    }
    public int getIdade(){
        return super.getIdade();
    }
    public String getNacionalidade(){
        return super.getNacionalidade();
    }
    public Piloto getPiloto(){
        return piloto;
    }
}