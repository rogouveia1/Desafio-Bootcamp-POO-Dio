import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}