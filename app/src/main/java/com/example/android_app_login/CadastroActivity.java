package com.example.android_app_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.Objects;

public class CadastroActivity extends AppCompatActivity {

    // Atributos da classe
    private EditText editNomeCadastro;
    private EditText editEmailCadastro;
    private EditText editSenhaCadastro;
    private Button btnCadastrar;

    private SharedPreferences preferences; // atributo para gravação de dados

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        // Set toolbar title
        this.setTitle("Cadastro");

        // Set arrow back on top toolbar
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        // Parâmetro 1 -> indicará o nome do arquivo.
        // MODE_PRIVATE ->  indica que o arquivo não é compartilhado com outra aplicação
        preferences = getSharedPreferences("login",MODE_PRIVATE);

        // Referência com os arquivos .xml
        editNomeCadastro = findViewById(R.id.cad_editNome);
        editEmailCadastro = findViewById(R.id.cad_editEmail);
        editSenhaCadastro = findViewById(R.id.cad_editSenha);
        btnCadastrar = findViewById(R.id.cad_button);

        // DEFINIR A AÇÃO DO BOTÃO -> classe anônima
        // Enviar os dados digitados para os campos da Tela de Loguin
        // Gravar os dados do EditText (campos) em arquivo
        btnCadastrar.setOnClickListener(view -> {

            // enviar as strings digitadas para a Tela de Login -> getText()
            // toString() -> necessário porque os valores de imput são do tipo Char
            String nome = editNomeCadastro.getText().toString();
            String email = editEmailCadastro.getText().toString();
            String senha = editSenhaCadastro.getText().toString();

            //Criar objeto de Edição a partir do atributo 'preferences' criado anteriormente
            SharedPreferences.Editor editor = preferences.edit();

            // param 1 -> chave de gravação
            // param 2 -> atributo String
            editor.putString("nome", nome);
            editor.putString("email", email);
            editor.putString("senha", senha);

            //Gravar informações no arquivo
            // editor.commit()
            editor.apply();

            // .putExtra() -> Inserir dados
            Intent intent = new Intent();
            intent.putExtra("email", email);
            intent.putExtra("senha", senha);

            // RESULT_OK -> constante do Android para retomar o resultado
            setResult(RESULT_OK, intent);
            // Ao clicar no botão é necessário também terminar a Tela de Cadastro -> finish()
            finish();
        });

    }
}