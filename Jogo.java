public class Jogo {
    public Jogo(){

    }
    public Jogo(String nome, String descricao, String criador) {
     super();
     this.nome= nome;
     this.descricao = descricao;
     this.criador= criador;

}
    private String nome;
    private String descricao;
    private String criador;
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getDescricao(){
        return  descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setCriador(String criador){
        this.criador = criador;
    }
    public String getCriador(){
        return criador;
    }
    public String toString(){
        return "Jogo [nome=" +nome + " , descricao=" + descricao + " , criador=" + criador +"]";
    }

}