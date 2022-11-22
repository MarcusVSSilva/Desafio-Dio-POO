import desafio_dominio.Mentoria;

import java.time.LocalDate;

import desafio_dominio.Bootcamp;
import desafio_dominio.Curso;
import desafio_dominio.Dev;

public class Main {
    public static void main(String[] args) {
        //instanciando objetos da classe Curso 
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        //instanciando objetos da classe Mentoria 
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        //instanciando um bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        //instanciando um dev
        Dev devMarcus = new Dev();
        devMarcus.setNome("Marcus");
        devMarcus.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Marcus: " + devMarcus.getConteudosInscritos());

        devMarcus.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Marcus: " + devMarcus.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Marcus: " + devMarcus.getConteudosConcluidos());
        System.out.println("XP: " + devMarcus.calcularTotalXp());

    }
}
