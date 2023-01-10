package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    //para dizer que mentoria é filha de conteudo extends
    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;

    }
    public Mentoria() {
     //cria este contrutor vazio, já subentendido pela classe, pode passar atributos
    }
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    //para leitura ctrl insert to string
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}

