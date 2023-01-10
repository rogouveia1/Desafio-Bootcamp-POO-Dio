package br.com.dio.desafio.dominio;

//todo curso e mentoria terão conteudo que será uma classe mãe delas.

public abstract class Conteudo {
    /* Constante xp será utilizada pelas classes filhas(curso e mentoria) marcada
    pela palavra reservada final e protect para ser utilizada pelas filhas
    static porque vou poder utiliza-la fora deste conteudo
    para simplificar o código e evitar repetições
     */

    protected static final double XP_PADRAO = 10d;
    private String titulo;
    private String descricao;


    /*método calcular xp significa que as classes que se estenderem, classes
    filhas serão obrigadas a implementar uma logica no método
    a classe também tem que ser abstract, isto é herança
     */
    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
