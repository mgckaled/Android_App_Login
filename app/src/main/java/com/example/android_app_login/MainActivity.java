package com.example.android_app_login;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editEmail;
    private EditText editSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set toolbar title
        this.setTitle("Meu Primeiro Aplicativo");

        editEmail = findViewById(R.id.editEmail);
        editSenha = findViewById(R.id.editSenha);
    }

    public void entrar(View view) {

        // Associar string dos campos de texto a variáveis String
        String email = editEmail.getText().toString();
        String senha = editSenha.getText().toString();

        // Se o campo de email estiver vazio, mostrar msg de alerta
        if (email.isEmpty()){
            editEmail.setError("Campo e-mail obrigatório");
            return;
        }
        // Se o campo de senha estiver vazio, mostrar msg de alerta
        if (senha.isEmpty()) {
            editSenha.setError("Campo senha obrigatório");
            return;
        }

        // .equals --> comparar strings / Validar email e senha / && --> Operador lógico AND
        if(email.equals("admin@email.com") && senha.equals("1234")) {

            // Se email e senha estiver correto, o botão irá exibir a segunda tela.
            Intent intent = new Intent(this, PrincipalActivity.class);
            startActivity(intent);

            // inserir os dados de acesso na Segunda tela
            intent.putExtra("email", email);
            intent.putExtra("senha", senha);

            // Destruir a tela de login ao voltar para a página -> BLOQUEADO
            // finish();

        }else {
            Toast.makeText(this, "E-mail ou Senha inválidos", Toast.LENGTH_LONG).show();
        }
    }

    public void cadastrar(View view) {
        // Toast.makeText(this, "Tela de Cadastro", Toast.LENGTH_LONG).show();

        // Direcionar o Botão Cadastro na Tela de Loguin para a Tela de Cadastro
        // Ao chamar uma próxima tela é esperado um resultado -> startActivityForResult()
        Intent intent_cad = new Intent(this, CadastroActivity.class);
        startActivityForResult(intent_cad, 1);
    }
    // Ao fechar a tela de Cadastro o método onActivityResult irá retornar o resultado
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1 && resultCode == RESULT_OK) {
            String email = data.getStringExtra("email");
            String senha = data.getStringExtra("senha");

            // Alterando o texto das View EditText
            editEmail.setText(email);
            editSenha.setText(senha);

        }
    }
}