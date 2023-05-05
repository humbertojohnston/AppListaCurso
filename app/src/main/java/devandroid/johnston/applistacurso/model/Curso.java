package devandroid.johnston.applistacurso.model;

public class Curso {

    private String nomeDoCursoDesejado; //AULA 46.2023

    public Curso(String nomeDoCursoDesejado) {
        this.nomeDoCursoDesejado = nomeDoCursoDesejado;
    }

    public String getNomeDoCursoDesejado() {
        return nomeDoCursoDesejado;
    }

    public void setNomeDoCursoDesejado(String nomeDoCursoDesejado) {
        this.nomeDoCursoDesejado = nomeDoCursoDesejado;
    }
}
