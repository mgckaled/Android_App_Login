package com.example.android_app_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.Objects;

public class CadastroActivity extends AppCompatActivity {

    // Atributos da classe
    private EditText editEmailCadastro;
    private EditText editSenhaCadastro;
    private Button btnCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        // Set toolbar title
        this.setTitle("Cadastro");

        // Set arrow back on top toolbar
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        // Referência com os arquivos .xml
        editEmailCadastro = findViewById(R.id.cad_editEmail);
        editSenhaCadastro = findViewById(R.id.cad_editSenha);
        btnCadastrar = findViewById(R.id.cad_button);

        // Definir a ação do botão -> classe anônima
        // Enviar os dados digitados para os campos da Tela de Loguin
        // .putExtra() -> Inserir dados
        btnCadastrar.setOnClickListener(view -> {
            Intent intent = new Intent();
            // enviar as strings digitadas para a Tela de Login -> getText().toString()
            intent.putExtra("email", editEmailCadastro.getText().toString());
            intent.putExtra("senha", editEmailCadastro.getText().toString());

            // RESULT_OK -> constante do Android para retomar o resultado
            setResult(RESULT_OK, intent);
            // Ao clicar no botão é necessário também terminar a Tela de Cadastro -> finish()
            finish();
        });

    }
}