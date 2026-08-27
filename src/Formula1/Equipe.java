package leonardo.avaliacao.formula1;

import java.util.ArrayList;

public class Equipe {


   private  String nome;
   private int anoFundacao;
   private ArrayList<Patrocinador> pat;

    public Equipe(String nome, int anoFundacao,ArrayList<Patrocinador> pat) {
        this.nome = nome;
        this.anoFundacao = anoFundacao;
        this.pat = pat;
    }

    public String getNome() {
        return nome;
    }
    public int getAnoFundacao() {
        return anoFundacao;
    }
    public ArrayList<Patrocinador> getPat() {
        return pat;
    }
}