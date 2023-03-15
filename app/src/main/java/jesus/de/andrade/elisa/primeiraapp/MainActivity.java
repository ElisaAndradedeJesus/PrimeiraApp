package jesus.de.andrade.elisa.primeiraapp;

import static android.R.color.black;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

//        APLICAÇÃO  EXERCÍCIO:

//        Pegue o texto desejado de uma tela e faça-o aparecer em outra.

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        CRIANDO VARIÁVEL BOTÃO
        Button btnEnviar = findViewById(R.id.btnEnviar);
//        Fzendo o sistema esperar o click no botão
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
//            QUANDO O BOTÃO FOR PRESSIONADO
            public void onClick(View view) {
                // What can I place here?
                EditText etTexto = findViewById(R.id.etDigiteAqui); // cria a  VARIAVEL que ARMAZENA o elemento editText que possui o texto
                String tText = etTexto.getText().toString(); // pega o TEXTO da variavel anterior e armazena em uma string
                Intent i = new Intent(MainActivity.this, NextActivity.class); // cria uma variavel intent que fará a comunicação entre ambas as telas
                i.putExtra("text", tText); // adiciona o conteúdo que necessita ser enviado
                startActivity(i); // inicializa o intent

            }
        });


    }

}