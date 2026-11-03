package com.example.holamundo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

/*
 * Practica B: envio de datos entre pantallas.
 * Autores: SANCHEZ REYES JEAN EMIR / SANLUIS GONZALEZ JAHIR
 * Descripcion: captura un texto, lo coloca dentro de un Intent con
 * putExtra y lo envia a SecondActivity al presionar el boton Mostrar.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencias a los controles definidos en el XML
        EditText txtNombre = findViewById(R.id.txtNombre);
        Button btnMostrar = findViewById(R.id.btnMostrar);

        // Al presionar el boton se empaqueta el texto y se abre la segunda pantalla
        btnMostrar.setOnClickListener(v -> {
            String nombre = txtNombre.getText().toString();
            Intent i = new Intent(MainActivity.this, SecondActivity.class);
            i.putExtra("nombre", nombre);
            startActivity(i);
        });
    }
}
