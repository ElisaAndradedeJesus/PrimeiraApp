package jesus.de.andrade.elisa.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);


        Intent i = this.getIntent(); // cria uma variavel intent para receber o intent da outra tela
        String finaltext = i.getStringExtra("text"); //pega o conteúo desejado do intent
        TextView tvText = findViewById(R.id.tvTexto); // encontra e armazena o elemento que será modificado
        tvText.setText(finaltext); //muda o texto da variável tcText

    }
}