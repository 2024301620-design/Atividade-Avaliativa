public class Livro {
    private String titulo;
    private Boolean isDisponivel;

    public void Livro (){
        this.titulo = "";
        this.isDisponivel = true;
    }
    public void Livro (String titulo){
        this.titulo = titulo;
        this.isDisponivel = true;
    }

   public String getTitulo(){
        return titulo;
    }
    public Boolean getIsDisponivel(){
        return isDisponivel;
    }

    public void setTitulo(String titulo){
       this.titulo = titulo;
    }
    public void setSituacao(Boolean isDisponivel){
        this.isDisponivel = isDisponivel;
    }
}
