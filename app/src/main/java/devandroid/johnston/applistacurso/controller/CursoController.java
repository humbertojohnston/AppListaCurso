package devandroid.johnston.applistacurso.controller;

import java.util.ArrayList;
import java.util.List;

import devandroid.johnston.applistacurso.model.Curso;

public class CursoController {

    private List listCursos;

    public List getListaDeCursos() {//MÉTODO PÚBLICO QUE VAI DEVOLVER UMA LISTA AULA 46.2023

        listCursos = new ArrayList<Curso>();
        listCursos.add(new Curso("Java"));
        listCursos.add(new Curso("HTML"));
        listCursos.add(new Curso("C#"));
        listCursos.add(new Curso("Python"));
        listCursos.add(new Curso("PHP"));
        listCursos.add(new Curso("Java EE"));
        listCursos.add(new Curso("Flutter"));
        listCursos.add(new Curso("Dart"));

        return listCursos;

    }

    public ArrayList<String> dadosParaSpinner(){ //aula 48.2023

        ArrayList<String> dados = new ArrayList<>();

        for (int i = 0; i < getListaDeCursos().size(); i++) {

            Curso objeto = (Curso) getListaDeCursos().get(i);
            dados.add(objeto.getNomeDoCursoDesejado());
        }

        return dados;
    }

}
