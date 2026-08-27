public class Livro extends Obra {
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

    public Boolean getIsDisponivel(){
        return isDisponivel;
    }

    public void setSituacao(Boolean isDisponivel){
        this.isDisponivel = isDisponivel;
    }
}
