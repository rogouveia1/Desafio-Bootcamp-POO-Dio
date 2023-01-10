package br.com.dio.desafio.dominio;

import java.util.*;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    /*uso do LinkedHashSet porque os conteúdos serão armazenados
    de acordo com a ordem que o Dev vai fazendo os cursos e só permite que
    se inscreva uma única vez.
     */
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
        /*estou pegando tudo que esta dentro do bootcamp.getConteudos e
        adicionando no conteudosInscritos. Quando o DEV se inscreve
        tem acesso a todos os conteudos do Bootcamp
        Depois incluo o Dev (this) no bootcamp matriculado
         */
        }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());

            /*para progredir adiciono o conteúdo concluido pelo Dev
            em conteúdosconcluidos e removo do conteudosInscritos,
            caso a lista de conteúdos esteja  vazia imprimir mensagem abaixo:
             */
        }else {
            System.out.println("Você não esta matriculado em nenhum conteúdo!");
        }
        }
    public double calcularTotalXp(){
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
        /*pegar o conteudoConcluido, localizar, calcular e somar
        aos outros conteúdos.
         */
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
