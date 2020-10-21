package com.example.listadecompras;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class MainActivity extends AppCompatActivity {

    private String entrar;
    private String cadastro;
    private String cliqueBotao;
    private FloatingActionButton formNovoGasto;
    private String CODIGO_SOLICITA_CHAVE_SALVA_GASTO;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public MainActivity() {
        super();
    }

    private void CliqueBotao(){
     formNovoGasto = findViewById(R.id.formNovoGasto);

     formNovoGasto.setOnClickListener(new View.OnClickListener() {

         @Override
         public void onClick(View v) {
          //   Class<?> formNovoGastoApp;
             Intent intent = new Intent(getApplicationContext(), formNovoGastoApp.class);
             startActivityForResult(intent, Integer.parseInt(CODIGO_SOLICITA_CHAVE_SALVA_GASTO));
             cliqueBotao();
         }

         private void cliqueBotao() {
         }
     });
        protected void onActivityResult(int requestCode,int resultCode, @Nullable Intent data) {
            super.onActivityResult(requestCode, resultCode, data);



}
}