package leonardo.avaliacao.formula1;

public class Patrocinador {

    String nome;
    double valorPatrocinio;

    public Patrocinador(String nome, double valorPatrocinio) {
        this.nome = nome;
        this.valorPatrocinio = valorPatrocinio;
    }

    public String getNome() {
        return nome;
    }
    public double getValorPatrocinio() {
        return valorPatrocinio;
    }


}