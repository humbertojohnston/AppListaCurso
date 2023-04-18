package devandroid.johnston.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.johnston.applistacurso.R;
import devandroid.johnston.applistacurso.model.Pessoa;


public class MainActivity extends AppCompatActivity {

 //   Pessoa pessoa;
    String dadosPessoa;
    String dadosOutraPessoa;
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

        Pessoa pessoa = new Pessoa();
    /*    //Atribuir conteúdo, dados, valores para o objeto
        //Conformw o seu MODELO, TEMPLATE
        pessoa.setPrimeiroNome("Humberto");
        pessoa.setSobreNome("Pinheiro");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("91 981895467");
*/
        Pessoa outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Alicia");
        outraPessoa.setSobreNome("Pinheiro");
        outraPessoa.setCursoDesejado("Java");
        outraPessoa.setTelefoneContato("91 981891234");

        editPrimeiroNome = findViewById(R.id.editPrimeiroNome); //Busca a classe nativa AppCompatActivity AULA 33.2023
        editSobrenomeAluno = findViewById(R.id.editSobrenomeAluno); //Busca a classe nativa AppCompatActivity AULA 33.2023
        editNomeCurso = findViewById(R.id.editNomeCurso); //Busca a classe nativa AppCompatActivity AULA 33.2023
        editTelefone = findViewById(R.id.editTelefone); //Busca a classe nativa AppCompatActivity AULA 33.2023

        btnLimpar = findViewById(R.id.btnLimpar); //Busca a classe nativa AppCompatActivity AULA 33.2023
        btnSalvar = findViewById(R.id.btnSalvar); //Busca a classe nativa AppCompatActivity AULA 33.2023
        btnFinalizar = findViewById(R.id.btnFinalizar); //Busca a classe nativa AppCompatActivity AULA 33.2023

        editPrimeiroNome.setText(outraPessoa.getPrimeiroNome());
        editSobrenomeAluno.setText(outraPessoa.getSobreNome());
        editNomeCurso.setText(outraPessoa.getCursoDesejado());
        editTelefone.setText(outraPessoa.getTelefoneContato());

        btnLimpar.setOnClickListener(new View.OnClickListener() { //aula 34.2023
            @Override
            public void onClick(View view) {
                editPrimeiroNome.setText("");
                editSobrenomeAluno.setText("");
                editNomeCurso.setText("");
                editTelefone.setText("");
            }

        });

        btnFinalizar.setOnClickListener(new View.OnClickListener() { //aula 34.2023
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Volte Sempre!",Toast.LENGTH_LONG).show();
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
                Toast.makeText(MainActivity.this, "Salvo!"+pessoa.toString(),Toast.LENGTH_LONG).show();

            }
        });


 /*    dadosPessoa = "Primeiro nome: ";
       dadosPessoa += pessoa.getPrimeiroNome();
       dadosPessoa += " Sobrenome ";
       dadosPessoa += pessoa.getSobreNome();
       dadosPessoa += " Curso desejado: ";
       dadosPessoa += pessoa.getCursoDesejado();
       dadosPessoa += " Telefone de contato ";
       dadosPessoa += pessoa.getTelefoneContato();

 *      dadosPessoa = "Primeiro nome: " + pessoa.getPrimeiroNome();
       dadosPessoa = " Sobrenome " + pessoa.getSobreNome();
       dadosPessoa = " Curso desejado: " + pessoa.getCursoDesejado();
       dadosPessoa = " Telefone de contato " + pessoa.getTelefoneContato();

       dadosOutraPessoa = "Primeiro nome: ";
       dadosOutraPessoa += outraPessoa.getPrimeiroNome();
       dadosOutraPessoa += " Sobrenome ";
       dadosOutraPessoa += outraPessoa.getSobreNome();
       dadosOutraPessoa += " Curso desejado: ";
       dadosOutraPessoa += outraPessoa.getCursoDesejado();
       dadosOutraPessoa += " Telefone de contato ";
       dadosOutraPessoa += outraPessoa.getTelefoneContato(); */

       Log.i("POOAndroid", "Objeto pessoa: "+pessoa.toString());
       Log.i("POOAndroid","Objeto outra pessoa: "+outraPessoa.toString());

    }
}