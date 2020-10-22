package com.example.listadecompras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import static com.example.listadecompras.constantes.CODIGO_SOLICITA_SALVAR_PRODUTO;


public class MainActivity extends AppCompatActivity {


    private static final int CODIGO_SOLICITA_SALVA_PRODUTO = 1;
    private FloatingActionButton formNovoProduto;
    private String CODIGO_SOLICITA_CHAVE_SALVA_GASTO;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cliqueBotao();

        List<Produto> listaDeProduto = new ArrayList<>();
        listaDeProduto.add(new Produto("feijao", "gama lopes"));
        listaDeProduto.add(new Produto("feijao", "gama lopes"));
        listaDeProduto.add(new Produto("feijao", "gama lopes"));
    }


    private void cliqueBotao() {
        formNovoProduto = findViewById(R.id.fabNovoProduto);

        formNovoProduto.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FormProdutoActivity.class);
                startActivityForResult(intent, CODIGO_SOLICITA_SALVA_PRODUTO);
                cliqueBotao();
            }
        });
    }
}
