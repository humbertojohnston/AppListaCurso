package devandroid.johnston.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import devandroid.johnston.applistacurso.R;
import devandroid.johnston.applistacurso.model.Pessoa;


public class MainActivity extends AppCompatActivity {

 //   Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pessoa pessoa = new Pessoa();

    }
}