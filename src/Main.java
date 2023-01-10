import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    /* criamos o curso Java, o curso java js(script) e a mentoria
    * sistema de encapsulamento dos atributos
    * os atributos foram criados como privite e
    * para ter acesso ou modifica-los foram criados os getters e setters
    * criação de um novo método
    * trabalhando com o conceito de abstração
    * Pegar um problema/alvo e destrinchar no programa através das classes e
    * estanciando através de objetos */
    public static void main(String[] args) {
    Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricão curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricão curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("descriçao mentoria java");
        mentoria.setData(LocalDate.now());
        //LocalDate significa que quando criar o objeto vai atribuir a data de criação

        /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        */
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRosana = new Dev();
        devRosana.setNome("Rosana");
        devRosana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rosana" + devRosana.getConteudosInscritos());
        devRosana.progredir();
        devRosana.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Rosana" + devRosana.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Rosana" + devRosana.getConteudosConcluidos());
        System.out.println("XP" + devRosana.calcularTotalXp());

        System.out.println("----------");

        Dev devHumberto = new Dev();
        devHumberto.setNome("Humberto");
        devHumberto.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Humberto" + devHumberto.getConteudosInscritos());
        devHumberto.progredir();
        devHumberto.progredir();
        devHumberto.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Humberto" + devHumberto.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Humberto" + devHumberto.getConteudosConcluidos());
        System.out.println("XP" + devHumberto.calcularTotalXp());


    }
}