package br.com.dio.desafio.dominio;

public class Curso {

    private String tutulo;
    private String descricao;
    private int cargaHoraria;

    public Curso() {    }

    public String getTutulo() {
        return tutulo;
    }

    public void setTutulo(String tutulo) {
        this.tutulo = tutulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "tutulo='" + tutulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
