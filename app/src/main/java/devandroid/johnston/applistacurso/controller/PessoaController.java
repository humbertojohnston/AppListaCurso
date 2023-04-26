package devandroid.johnston.applistacurso.controller;

import android.util.Log;

import androidx.annotation.NonNull;

import devandroid.johnston.applistacurso.model.Pessoa;

public class PessoaController {

    @NonNull
    @Override
    public String toString() {

        Log.d("MVC_Controller","Controller iniciada...");
        return super.toString();
    }

    public void salvar(Pessoa pessoa) {  //aula 38/2023
    Log.d("MVC_Controller","Controller salvo "+pessoa.toString()); //aula 38/2023
    }
}
