package br.ufjf.dcc196.fabricioguidine.avistamentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AdicionaAvistamento extends AppCompatActivity {
    private Button botaoCriar;

    private EditText plainTextNome;
    private EditText plainTextEspecie;
    private String nome;
    private String especie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adiciona_avistamento);

        botaoCriar = findViewById(R.id.adicionaNovoAvistamento);
        plainTextNome = findViewById(R.id.nomePlainText);
        plainTextEspecie = findViewById(R.id.especiePlainText);
    }

    public void botaoCriarClick(View view){
        nome = plainTextNome.getText().toString();
        especie = plainTextEspecie.getText().toString();

        Intent novaEspecie = new Intent();
        novaEspecie.putExtra("nome", nome);
        novaEspecie.putExtra("especie", especie);
        setResult(1, novaEspecie);
        finish();
    }
}