public class Periodico extends Obra{

    private int volume;

    public void Periodico (){
        this.titulo = "";
        this.volume = 0;
    }
    public void Periodico (String titulo){
        this.titulo = titulo;
        this.volume = 0;
    }

    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        this.volume = volume;

    }
}
