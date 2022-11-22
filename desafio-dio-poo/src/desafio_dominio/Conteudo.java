package desafio_dominio;

//abstract indica que nenhum objeto poderá ser instanciado a partir da classe conteudo
//conteudo funcionara como uma classe mãe no contexto de herança.

public abstract class Conteudo {
    //lista de atributos

    //constante
    protected static final double XP_PADRAO = 10d; 

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

}
