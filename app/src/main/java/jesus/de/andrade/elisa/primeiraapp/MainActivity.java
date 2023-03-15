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
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnEnviar = findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // What can I place here?
                EditText etTexto = findViewById(R.id.etDigiteAqui);
                String tText = etTexto.getText().toString();
                Intent i = new Intent(MainActivity.this, NextActivity.class);
                i.putExtra("text", tText);
                startActivity(i);

            }
        });


    }

}