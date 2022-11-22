package desafio_dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    //lista de atributos
    private String nome;
    //conceito de herança, pela classe conteudo
    //conceito de polimorfismo, iniciando pelo Set e instancinado um LinkedHashSet
    //linkedHashSet - armazena na ordem que forem sendo inseridos, não aceita elementos repetidos  
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp (Bootcamp bootcamp){
        //adicionar todos os conteudos do bootcamp
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        //adicionar o dev inscrito no bootcamp
        bootcamp.getDevsInscritos().add(this);
    };

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }else{
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    };

    public double calcularTotalXp() {
        return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();
    };

    //métodos get e set (atributos com acesso privado)
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos(){
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos){
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos(){
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos){
        this.conteudosConcluidos = conteudosConcluidos;
    }


    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos)
                                              && Objects.equals(conteudosConcluidos, dev.conteudosInscritos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }


}
