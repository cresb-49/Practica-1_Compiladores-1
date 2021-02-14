package com.mycompany.app_practica_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mycompany.app_practica_1.Parser.*;
import com.mycompany.app_practica_1.Lexer.*;

public class MainActivity extends AppCompatActivity {

    private EditText textoEntrada;
    private Button graficar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Recepcion de datos

        textoEntrada = findViewById(R.id.textoEntrada);
        graficar = findViewById(R.id.buttonCompilar);

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

                    if (lex.getErrorsList().isEmpty() && parser.getErrorsList().isEmpty()) {
                        Sincronizar syn = new Sincronizar();
                        System.out.println("----------- RESULTADOS DE LECTURA --------------");
                        System.out.println("Numeros Recuperados: " + parser.respuesta().getNums().toString());
                        System.out.println("Sentencias Recuperadas: ");
                        for (Object arg : syn.asignar(parser.respuesta().getNums(), parser.getSentencias())) {
                            System.out.println(arg.toString());
                        }
                        //syn.asignar(appParser.respuesta().getNums(), appParser.getSentencias());

                    } else {
                        System.out.println("----------- SE ENCONTRARON ERRORES --------------");
                        System.out.println("----------- ERRORES LEXICOS --------------");
                        for (String err : lex.getErrorsList()) {
                            System.out.println(err);
                        }
                        System.out.println("----------- ERRORES DE SINTAXIS --------------");
                        for (String err : parser.getErrorsList()) {
                            System.out.println(err);
                        }
                    }

                } catch (Exception ex) { //error en parser
                    System.out.println("Error irrecuperable");
                    Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE, null, ex);
                    ex.printStackTrace();
                }

            }
        });
    }
}