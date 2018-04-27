package com.example.kaymo.atividadesm1;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ReclamacaoActivity extends AppCompatActivity {

    RadioGroup categoria;
    RadioButton button;
    String resultado;
    int checkedRadioButtonId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reclamacao);
    }

    public void onClickSalvar(View view) {

        categoria = ( RadioGroup ) findViewById(R.id.rgCategoria);
        checkedRadioButtonId = categoria.getCheckedRadioButtonId();
        button = categoria.findViewById(checkedRadioButtonId);
        resultado = (String) button.getText();

        EditText etDescricao = findViewById(R.id.etDescricao);

        if (etDescricao.getText().toString().equals("")) {
            Toast.makeText(this, "Descrição obrigatório", Toast.LENGTH_LONG).show();
            return;
        }

        String descricao = etDescricao.getText().toString();

        Reclamação reclamação = new Reclamação(resultado, descricao);

        ReclamacaoDao.salvar(this, reclamação);

        setResult(Activity.RESULT_OK);
        finish();
    }

}
