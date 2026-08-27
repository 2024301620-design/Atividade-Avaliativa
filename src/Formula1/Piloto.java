package leonardo.avaliacao.formula1;

public class Piloto extends Pessoa {

    private int  vitorias;

    public Piloto(String nome, int idade, String nacionalidade, int vitorias) {
        super.nome = nome;
        super.idade = idade;
        super.nacionalidade = nacionalidade;
        this.vitorias = vitorias;
    }

    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
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

}


