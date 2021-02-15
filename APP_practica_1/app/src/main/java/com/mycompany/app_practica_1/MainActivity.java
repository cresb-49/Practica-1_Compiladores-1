package com.mycompany.app_practica_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mycompany.app_practica_1.Parser.*;
import com.mycompany.app_practica_1.Lexer.*;
import com.mycompany.app_practica_1.UI.activity_resultado;

public class MainActivity extends AppCompatActivity {

    private EditText textoEntrada;
    private TextView logText;
    private Button graficar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Recepcion de datos
        logText = findViewById(R.id.logText);
        textoEntrada = findViewById(R.id.textoEntrada);
        graficar = findViewById(R.id.buttonCompilar);
        //Parametros de logText

        //Receto de informacion del log
        logText.setText("");
        //Evento de boton graficar
        graficar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    String dataIn = textoEntrada.getText().toString();
                    StringReader reader = new StringReader(dataIn);
                    appLexer lex = new appLexer(reader);
                    parser parser = new parser(lex);

                    parser.parse();


                    presentarLog(lex,parser);

                } catch (Exception ex) { //error en parser
                    System.out.println("Error irrecuperable");
                    Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE, null, ex);
                    ex.printStackTrace();
                }

            }
        });
    }

    private void presentarResultados(appLexer lex,parser parser){
        Intent nuevaVentana = new Intent(this, activity_resultado.class);
        Bundle bundle = new Bundle();
        //Sentencias agregadas

        bundle.putSerializable("sentancias", (Serializable) parser.getSentencias());
        bundle.putSerializable("numeros", (Serializable) parser.respuesta().getNums());
        bundle.putSerializable("parserErr", (Serializable) parser.getErrorsList());
        bundle.putSerializable("lexerErr", (Serializable) lex.getErrorsList());
        bundle.putSerializable("ReportLex", lex.getReporte());


        nuevaVentana.putExtras(bundle);
        startActivity(nuevaVentana);
    }
    private void presentarLog(appLexer lex,parser parser){
        if(lex.getErrorsList().isEmpty()&&parser.getErrorsList().isEmpty()){
            presentarResultados(lex,parser);
        }else{
            String log = "";
            log = "---- ERRORES LEXICOS ----\n";
            for(String str: lex.getErrorsList()){
                log = log +str+"\n";
            }

            log = log + "---- ERRORES SINTACTICOS ----\n";
            for(String str: parser.getErrorsList()){
                log = log +str+"\n";
            }
            logText.setText(log);
            System.out.println(log);
        }
    }
}