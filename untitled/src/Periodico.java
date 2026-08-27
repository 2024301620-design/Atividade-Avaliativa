public class Periodico {

    private String titulo;
    private int volume;

    public void Periodico (){
        this.titulo = "";
        this.volume = 0;
    }
    public void Periodico (String titulo){
        this.titulo = titulo;
        this.volume = 0;
    }

    public String getTitulo(){
        return titulo;
    }
    public int getVolume(){
        return volume;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setVolume(int volume){
        this.volume = volume;

    }
}
