package src;

public class Aprovados {

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
}