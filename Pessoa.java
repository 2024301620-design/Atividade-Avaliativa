package leonardo.avaliacao.formula1;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected String nacionalidade;

    // GET
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    // SET
    public void setNome (String nome){
        this.nome = nome;
    }
    public void setIdade (int idade){
        this.idade = idade;
    }
    public void setNacionalidade (String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

}
