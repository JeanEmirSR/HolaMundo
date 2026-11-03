package com.example.holamundo;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

/*
 * Practica B: recepcion del dato enviado.
 * Autores: SANCHEZ REYES JEAN EMIR / SANLUIS GONZALEZ JAHIR
 * Descripcion: recupera el texto que MainActivity coloco en el Intent
 * con la clave "nombre" y lo escribe en el TextView de esta pantalla.
 */
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Se extrae el dato que viaja dentro del Intent
        String nombre = getIntent().getStringExtra("nombre");

        // Se muestra el dato recibido en pantalla
        TextView txtNombreRecibido = findViewById(R.id.txtNombreRecibido);
        txtNombreRecibido.setText(nombre);
    }
}
