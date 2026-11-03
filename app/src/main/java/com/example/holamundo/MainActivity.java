package com.example.holamundo;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

/*
 * Proyecto: HolaMundo
 * Autores: SANCHEZ REYES JEAN EMIR / SANLUIS GONZALEZ JAHIR
 * Descripcion: actividad principal de la aplicacion. Su funcion es
 * cargar y mostrar la vista definida en activity_main.xml, donde se
 * presentan los integrantes del equipo y el boton Mostrar.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Se enlaza esta clase con su vista XML correspondiente
        setContentView(R.layout.activity_main);
    }
}
