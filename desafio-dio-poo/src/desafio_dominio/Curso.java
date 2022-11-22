package desafio_dominio;

public class Curso {
    //lista de atributos
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    //construtor sem parametros
    public Curso(){};

    //métodos get e set 

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

    public int getCargaHoraria(){
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString(){
        return "Curso{" +
        "titulo='" + titulo + '\'' +
        ", descricao='" + descricao + '\'' +
        ", cargaHoraria=" + cargaHoraria +
        '}';   
    }
}

