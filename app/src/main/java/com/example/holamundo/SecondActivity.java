package com.example.holamundo;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

/*
 * Proyecto: HolaMundo
 * Autores: SANCHEZ REYES JEAN EMIR / SANLUIS GONZALEZ JAHIR
 * Descripcion: actividad secundaria de la aplicacion. Carga y muestra
 * la vista definida en activity_second.xml, que funciona como segunda
 * pantalla del proyecto.
 */
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Se enlaza esta clase con su vista XML correspondiente
        setContentView(R.layout.activity_second);
    }
}
