package br.ulbra.trocatelas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button bttelaprincipal, bttela2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarregarTelaPrincipal();
    }

    public void CarregarTelaPrincipal() {
        setContentView(R.layout.activity_main);
        bttela2 = (Button) findViewById(R.id.btnTela2);
        bttela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTela2(); } });
    }
    public void CarregarTela2() {
        setContentView(R.layout.tela2);
        bttelaprincipal = (Button) findViewById (R.id.btnTela1);
        bttelaprincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTelaPrincipal();
            }
        });
    }
}
