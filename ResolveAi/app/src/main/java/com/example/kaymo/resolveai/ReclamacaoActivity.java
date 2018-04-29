package com.example.kaymo.resolveai;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ReclamacaoActivity extends AppCompatActivity {

    RadioGroup categoriaGroup;
    RadioButton button;
    String categoria;
    String imagemCategoria;
    Button salvar;
    int checkedRadioButtonId;
    private ReclamacaoDAO bd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reclamacao);

        salvar = findViewById(R.id.btSalvar);
        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bd = new ReclamacaoDAO(getBaseContext());
                categoriaGroup = ( RadioGroup ) findViewById(R.id.rgCategoria);
                checkedRadioButtonId = categoriaGroup.getCheckedRadioButtonId();
                button = categoriaGroup.findViewById(checkedRadioButtonId);
                EditText etDescricao = findViewById(R.id.etDescricao);

                categoria = (String) button.getText();
                if (etDescricao.getText().toString().equals("")) {
                    Toast.makeText(getBaseContext(), "Descrição obrigatório", Toast.LENGTH_LONG).show();
                    return;
                }
                final String descricao = etDescricao.getText().toString();

                if (button.getText().toString().equals("Infraestrutura")) {
                    imagemCategoria = "infraestrutura";
                }else if (button.getText().toString().equals("Trânsito")) {
                    imagemCategoria = "transito";
                } else if (button.getText().toString().equals("Segurança")) {
                    imagemCategoria = "seguranca";
                } else {
                    imagemCategoria = "outro";
                }

                Reclamacao reclamacao = new Reclamacao();
                reclamacao.setCategoria(categoria);
                reclamacao.setDescricao(descricao);
                bd.addReclamacao(reclamacao);

//                Toast.makeText(getBaseContext(), "Reclamção salvo com sucesso", Toast.LENGTH_SHORT).show();

                sair();
            }
        });

    }

    public void sair() {
        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);
    }
}
