package com.mycompany.app_practica_1.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mycompany.app_practica_1.Lexer.appLexer;
import com.mycompany.app_practica_1.Lexer.reportLexer;
import com.mycompany.app_practica_1.Parser.Sincronizar;
import com.mycompany.app_practica_1.Parser.parser;
import com.mycompany.app_practica_1.R;

import java.io.Serializable;
import java.util.List;

public class activity_resultado extends AppCompatActivity {

    private List<Object> sentencias;
    private List<Double> numerosRecuperados;
    private String reportLex;
    private boolean bandera = false;
    private Button reportes;

    private ConstraintLayout drawArea;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        reportes = findViewById(R.id.buttonReportes);
        drawArea = findViewById(R.id.drawArea);

        recibirDatos();

        if(bandera){
            Sincronizar syn = new Sincronizar();
            System.out.println("----------- RESULTADOS DE LECTURA --------------");
            System.out.println("Numeros Recuperados: " + numerosRecuperados.toString());
            System.out.println("Sentencias Recuperadas: ");
            for (Object arg : syn.asignar(numerosRecuperados, sentencias)) {
                System.out.println(arg.toString());
            }
            System.out.println("----------- REPORTES DE EJECUCION --------------");
            System.out.println(reportLex.toString());

            lienzo fondo = new lienzo(this,sentencias);
            drawArea.addView(fondo);

            reportes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    vistaReportes();
                }
            });

        }else{
            System.out.println("No se recibieron datos");
        }
    }

    private void recibirDatos(){
        Bundle datos = getIntent().getExtras();
        if(datos != null){
            bandera = true;
            sentencias = (List<Object>) datos.getSerializable("sentancias");
            numerosRecuperados= (List<Double>) datos.getSerializable("numeros");
            reportLex = (String) datos.getSerializable("ReportLex");
        }
    }

    private void vistaReportes(){
        Intent nuevaVentana = new Intent(this, reportes_resultados.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("ReportLex",reportLex);

        nuevaVentana.putExtras(bundle);
        startActivity(nuevaVentana);
    }
}