package devandroid.johnston.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.johnston.applistacurso.R;
import devandroid.johnston.applistacurso.controller.PessoaController;
import devandroid.johnston.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    SharedPreferences preferences; //aula 38/2023
    SharedPreferences.Editor listaVip; //aula 40.2023
    public static final String NOME_PREFERENCES = "pref_listavip"; //aula 38/2023

    PessoaController controller; //aula 38/2023
    Pessoa pessoa;

    //Pessoa outraPessoa;
    EditText editPrimeiroNome;
    EditText editSobrenomeAluno;
    EditText editNomeCurso;
    EditText editTelefone;

    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences = getSharedPreferences(NOME_PREFERENCES, 0); //aula 38/2023

        listaVip = preferences.edit(); //aula 38.2023

        controller = new PessoaController();
        controller.toString();

        pessoa = new Pessoa();
        pessoa.setPrimeiroNome(preferences.getString("primeiroNome","NA")); //aula 39.23
        pessoa.setSobreNome(preferences.getString("sobrenome","")); //aula 39.23
        pessoa.setCursoDesejado(preferences.getString("nomeCurso","")); //aula 39.23
        pessoa.setTelefoneContato(preferences.getString("telefoneContato","")); //aula 39.23

        editPrimeiroNome = findViewById(R.id.editPrimeiroNome); //Busca a classe nativa AppCompatActivity AULA 33.2023
        editSobrenomeAluno = findViewById(R.id.editSobrenomeAluno); //Busca a classe nativa AppCompatActivity AULA 33.2023
        editNomeCurso = findViewById(R.id.editNomeCurso); //Busca a classe nativa AppCompatActivity AULA 33.2023
        editTelefone = findViewById(R.id.editTelefone); //Busca a classe nativa AppCompatActivity AULA 33.2023

        editPrimeiroNome.setText(pessoa.getPrimeiroNome());
        editSobrenomeAluno.setText(pessoa.getSobreNome());
        editNomeCurso.setText(pessoa.getCursoDesejado());
        editTelefone.setText(pessoa.getTelefoneContato());

        btnLimpar = findViewById(R.id.btnLimpar); //Busca a classe nativa AppCompatActivity AULA 33.2023
        btnSalvar = findViewById(R.id.btnSalvar); //Busca a classe nativa AppCompatActivity AULA 33.2023
        btnFinalizar = findViewById(R.id.btnFinalizar); //Busca a classe nativa AppCompatActivity AULA 33.2023

        btnLimpar.setOnClickListener(new View.OnClickListener() { //aula 34.2023
            @Override
            public void onClick(View view) {
                editPrimeiroNome.setText("");
                editSobrenomeAluno.setText("");
                editNomeCurso.setText("");
                editTelefone.setText("");
                listaVip.clear(); //aula 40.2023
                listaVip.apply(); //aula 40.2023
            }

        });

        btnFinalizar.setOnClickListener(new View.OnClickListener() { //aula 34.2023
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Volte Sempre!", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pessoa.setPrimeiroNome(editPrimeiroNome.getText().toString());
                pessoa.setSobreNome(editSobrenomeAluno.getText().toString());
                pessoa.setCursoDesejado(editNomeCurso.getText().toString());
                pessoa.setTelefoneContato(editTelefone.getText().toString());
                Toast.makeText(MainActivity.this, "Salvo!" + pessoa.toString(), Toast.LENGTH_LONG).show();

                listaVip.putString("primeiroNome", pessoa.getPrimeiroNome()); //aula 38.2023
                listaVip.putString("sobrenome", pessoa.getSobreNome()); //aula 38.2023
                listaVip.putString("nomeCurso", pessoa.getCursoDesejado()); //aula 38.2023
                listaVip.putString("telefoneContato", pessoa.getTelefoneContato()); //aula 38.2023
                listaVip.apply(); //aula 38.2023 esta linha salva os dados no arquivo

                controller.salvar(pessoa); //aula 38/2023

            }
        });

        Log.i("POOAndroid", "Objeto pessoa: " + pessoa.toString());

    }
}