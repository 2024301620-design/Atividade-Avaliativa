package leonardo.avaliacao.formula1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Patrocinador patrocinador1 = new Patrocinador("patrocinador1", 10);
        Patrocinador patrocinador2 = new Patrocinador("patrocinador2", 1000);

        ArrayList<Patrocinador> patList = new ArrayList<Patrocinador>();
        patList.add(patrocinador1);
        patList.add(patrocinador2);

        Equipe equipe1 = new Equipe("Ferrari", 1984, patList);

        Piloto piloto = new Piloto("aaa", 35, "Brasil", 14);

        Engenheiro engenheiro = new Engenheiro("ccc", 45, "Argentina", piloto);

        Carro carro = new Carro(2, 1, equipe1, piloto );

        System.out.println("leonardo.avaliacao.formula1.Carro --------------------");
        System.out.println("Número: " + carro.getNumero());
        System.out.println("Posição: " + carro.getPosicao());
        System.out.println("leonardo.avaliacao.formula1.Equipe: " + carro.getEquipe().getNome());
        System.out.println("leonardo.avaliacao.formula1.Piloto: " + carro.getPiloto().getNome());
        System.out.println("\n");

        System.out.println("leonardo.avaliacao.formula1.Piloto --------------------");
        System.out.println("Nome: " + piloto.getNome());
        System.out.println("Idade: " + piloto.getIdade());
        System.out.println("Nacioalidade: " + piloto.getNacionalidade());
        System.out.println("Vitórias: " + piloto.getVitorias());
        System.out.println("\n");

        System.out.println("leonardo.avaliacao.formula1.Engenheiro --------------------");
        System.out.println("Nome: " + engenheiro.getNome());
        System.out.println("Idade: " + engenheiro.getIdade());
        System.out.println("Nacioalidade: " + engenheiro.getNacionalidade());
        System.out.println("leonardo.avaliacao.formula1.Piloto: " + engenheiro.getPiloto().getNome());
        System.out.println("\n");

        System.out.println("leonardo.avaliacao.formula1.Equipe --------------------");
        System.out.println("Nome: " + equipe1.getNome());
        System.out.println("Ano de Fundação: " + equipe1.getAnoFundacao());
        System.out.println("Patrocinadores:");
        for(Patrocinador p: patList){
            System.out.println("--" + p.getNome());
        }
        System.out.println("\n");

        System.out.println("Patrocinadores --------------------");
        System.out.println("\n");
        System.out.println("Nome: " + patrocinador1.getNome());
        System.out.println("Valor do patrocínio: " + patrocinador1.getValorPatrocinio());
        System.out.println("\n");
        System.out.println("Nome: " + patrocinador2.getNome());
        System.out.println("Valor do patrocínio: " + patrocinador2.getValorPatrocinio());
    }

 }
