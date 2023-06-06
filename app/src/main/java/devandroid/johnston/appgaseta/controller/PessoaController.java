package devandroid.johnston.appgaseta.controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import devandroid.johnston.appgaseta.model.Pessoa;
import devandroid.johnston.appgaseta.view.MainActivity;

public class PessoaController {

    SharedPreferences preferences; //aula 43.2023
    SharedPreferences.Editor listaVip; //aula 43.2023

    public static final String NOME_PREFERENCES = "pref_listavip"; //aula 43.2023

    public PessoaController(MainActivity mainActivity) { //aula 43.2023 CONSTRUTOR
        preferences = mainActivity.getSharedPreferences(NOME_PREFERENCES, 0); //aula 43.2023
        listaVip = preferences.edit(); //aula 43.2023 CRIA A LISTA
    }

    @NonNull
    @Override
    public String toString() {
        Log.d("MVC_Controller", "Controller iniciada...");
        return super.toString();
    }

    public void salvar(Pessoa pessoa) {  //aula 38/2023
        Log.d("MVC_Controller", "Controller salvo " + pessoa.toString()); //aula 38/2023

        listaVip.putString("primeiroNome", pessoa.getPrimeiroNome()); //aula 43.2023
        listaVip.putString("sobrenome", pessoa.getSobreNome()); //aula 43.2023
        listaVip.putString("nomeCurso", pessoa.getCursoDesejado()); //aula 43.2023
        listaVip.putString("telefoneContato", pessoa.getTelefoneContato()); //aula 43.2023
        listaVip.apply(); //aula 43.2023 esta linha salva os dados no arquivo

    }

    public Pessoa buscar(Pessoa pessoa) { //aula 43.2023

        pessoa.setPrimeiroNome(preferences.getString("primeiroNome", "NA")); //aula 43.23
        pessoa.setSobreNome(preferences.getString("sobrenome", "NA")); //aula 43.23
        pessoa.setCursoDesejado(preferences.getString("nomeCurso", "NA")); //aula 43.23
        pessoa.setTelefoneContato(preferences.getString("telefoneContato", "NA")); //aula 43.23

        return pessoa;
    }

    public void limpar() { //aula 43.2023

        listaVip.clear(); //aula 43.2023
        listaVip.apply(); //aula 43.2023
    }
}
