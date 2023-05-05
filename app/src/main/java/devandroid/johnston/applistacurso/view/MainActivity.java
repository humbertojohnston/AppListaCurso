package devandroid.johnston.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import devandroid.johnston.applistacurso.R;
import devandroid.johnston.applistacurso.controller.CursoController;
import devandroid.johnston.applistacurso.controller.PessoaController;
import devandroid.johnston.applistacurso.model.Curso;
import devandroid.johnston.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    PessoaController controller; //aula 38/2023 CRIAÇÃO DO OBJETO
    CursoController cursoController; //aula 47.2003 CRIAÇÃO DO OBJETO

    Pessoa pessoa;

    List <Curso> listaDeCursos;

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

        controller = new PessoaController(MainActivity.this);
        controller.toString();

        cursoController = new CursoController();
        listaDeCursos = cursoController.getListaDeCursos();

        pessoa = new Pessoa();
        controller.buscar(pessoa);

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
                controller.limpar(); //aula 43/2023

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

                controller.salvar(pessoa); //aula 38/2023

            }
        });

        Log.i("POOAndroid", "Objeto pessoa: " + pessoa.toString());

    }
}