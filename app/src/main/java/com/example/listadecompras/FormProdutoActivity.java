package com.example.listadecompras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FormProdutoActivity extends AppCompatActivity {

    public FormProdutoActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_produto);
    }
     public FormProdutoActivity(int contentLayoutId) {
        super(contentLayoutId);
    }
}