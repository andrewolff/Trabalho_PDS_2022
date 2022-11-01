package com.example.trabalho_pds_2022;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Formulario extends AppCompatActivity {

    Button botao_sair_formulario,botao_salvar_formulario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);


        botao_sair_formulario=findViewById(R.id.botao_sair_formulario);
        botao_salvar_formulario=findViewById(R.id.botao_salvar_formulario);

        botao_sair_formulario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {finish();

            }
        });

        botao_salvar_formulario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), com.example.trabalho_pds_2022.Fileira01.class);
                startActivity(intent);
            }
        });

    }
}