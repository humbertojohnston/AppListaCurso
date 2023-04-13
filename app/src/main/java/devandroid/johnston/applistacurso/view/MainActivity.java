package devandroid.johnston.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import devandroid.johnston.applistacurso.R;
import devandroid.johnston.applistacurso.model.Pessoa;


public class MainActivity extends AppCompatActivity {

 //   Pessoa pessoa;
    String dadosPessoa;
    String dadosOutraPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pessoa pessoa = new Pessoa();
        //Atribuir conteúdo, dados, valores para o objeto
        //Conformw o seu MODELO, TEMPLATE
        pessoa.setPrimeiroNome("Humberto");
        pessoa.setSobreNome("Pinheiro");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("91 981895467");

        Pessoa outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Alicia");
        outraPessoa.setSobreNome("Pinheiro");
        outraPessoa.setCursoDesejado("Java");
        outraPessoa.setTelefoneContato("91 981891234");

       //dadosPessoa = "Primeiro nome: ";
       //dadosPessoa += pessoa.getPrimeiroNome();
       //dadosPessoa += " Sobrenome ";
       //dadosPessoa += pessoa.getSobreNome();
       //dadosPessoa += " Curso desejado: ";
       //dadosPessoa += pessoa.getCursoDesejado();
       //dadosPessoa += " Telefone de contato ";
       //dadosPessoa += pessoa.getTelefoneContato();

       dadosPessoa = "Primeiro nome: " + pessoa.getPrimeiroNome();
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
       dadosOutraPessoa += outraPessoa.getTelefoneContato();


    }
}