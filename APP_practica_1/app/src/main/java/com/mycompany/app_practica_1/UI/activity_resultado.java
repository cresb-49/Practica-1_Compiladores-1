package com.mycompany.app_practica_1.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mycompany.app_practica_1.Lexer.appLexer;
import com.mycompany.app_practica_1.Parser.Sincronizar;
import com.mycompany.app_practica_1.Parser.parser;
import com.mycompany.app_practica_1.R;

import java.io.Serializable;
import java.util.List;

public class activity_resultado extends AppCompatActivity {

    private List<Object> sentencias;
    private List<String> parserErrorList;
    private List<String> lexerErrorList;
    private List<Integer> numerosRecuperados;
    private boolean bandera = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        recibirDatos();

        if(bandera){
            if (lexerErrorList.isEmpty() && parserErrorList.isEmpty()) {
                Sincronizar syn = new Sincronizar();
                System.out.println("----------- RESULTADOS DE LECTURA --------------");
                System.out.println("Numeros Recuperados: " + numerosRecuperados.toString());
                System.out.println("Sentencias Recuperadas: ");
                for (Object arg : syn.asignar(numerosRecuperados, sentencias)) {
                    System.out.println(arg.toString());
                }
            } else {
                System.out.println("----------- SE ENCONTRARON ERRORES --------------");
                System.out.println("----------- ERRORES LEXICOS --------------");
                for (String err : lexerErrorList) {
                    System.out.println(err);
                }
                System.out.println("----------- ERRORES DE SINTAXIS --------------");
                for (String err : parserErrorList) {
                    System.out.println(err);
                }
            }
        }else{
            System.out.println("No se recibieron datos");
        }
    }

    private void recibirDatos(){
        Bundle datos = getIntent().getExtras();
        if(datos != null){
            bandera = true;
            sentencias = (List<Object>) datos.getSerializable("sentancias");
            numerosRecuperados= (List<Integer>) datos.getSerializable("numeros");
            parserErrorList= (List<String>) datos.getSerializable("parserErr");
            lexerErrorList= (List<String>) datos.getSerializable("lexerErr");
        }
    }
}