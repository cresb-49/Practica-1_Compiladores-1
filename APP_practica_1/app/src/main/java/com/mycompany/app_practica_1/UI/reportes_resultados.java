package com.mycompany.app_practica_1.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.mycompany.app_practica_1.Lexer.reportLexer;
import com.mycompany.app_practica_1.R;

public class reportes_resultados extends AppCompatActivity {
    private String reportLex;
    private TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportes_resultados);

        recivirDatos();
        texto = findViewById(R.id.textoResultado);
        texto.setText(reportLex);

    }

    private void recivirDatos(){
        Bundle datos = getIntent().getExtras();
        if(datos!=null){
            reportLex = (String) datos.getSerializable("ReportLex");
        }else{
            System.out.println("No se recibieron datos");
        }
    }
}