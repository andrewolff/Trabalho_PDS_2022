package com.example.trabalho_pds_2022;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Fileira04 extends AppCompatActivity {

    Button botao_salvar_formulario_fileira04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fileira04);

        botao_salvar_formulario_fileira04=findViewById(R.id.botao_salvar_formulario_fileira04);
        botao_salvar_formulario_fileira04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), com.example.trabalho_pds_2022.MainActivity.class);
                startActivity(intent);
            }
        });
    }
}