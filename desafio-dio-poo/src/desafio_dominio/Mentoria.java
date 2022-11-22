package desafio_dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    //lista de atributos
    private LocalDate data;

    //construtor sem parametros
    public Mentoria(){};

    //metodo calcularXp, herdado da classe mãe Conteudo
    @Override
    public double calcularXp(){
        return XP_PADRAO + 20d;
    }


    //métodos get e set  
    public LocalDate getData(){
        return data;
    }

    public void setData(LocalDate data){
        this.data = data;
    }
    

    //utlizaremos o getTitulo e getDescricao pois os atributos forma declarados como private, na classe Conteudo
    @Override
    public String toString(){
        return "Mentoria{" +
        "titulo='" + getTitulo() + '\'' +
        ", descricao='" + getDescricao() + '\'' +
        ", data=" + data +
        '}';   
    }



}
