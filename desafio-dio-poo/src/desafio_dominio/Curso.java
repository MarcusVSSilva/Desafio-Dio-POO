package desafio_dominio;

public class Curso extends Conteudo{
    //lista de atributos
    private int cargaHoraria;

    //construtor sem parametros
    public Curso(){};

    //metodo calcularXp, herdado da classe mãe Conteud
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    //métodos get e set 
    public int getCargaHoraria(){
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    //utlizaremos o getTitulo e getDescricao pois os atribtuos forma declarados como private, na classe Conteudo
    @Override
    public String toString(){
        return "Curso{" +
        "titulo='" + getTitulo() + '\'' +
        ", descricao='" + getDescricao() + '\'' +
        ", cargaHoraria=" + cargaHoraria +
        '}';   
    }

}

