package com.example.holamundo;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

/*
 * Practica C: suma de dos numeros.
 * Autores: SANCHEZ REYES JEAN EMIR / SANLUIS GONZALEZ JAHIR
 * Descripcion: lee dos numeros capturados por el usuario, los suma
 * y muestra el resultado en un TextView de la misma pantalla.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencias a los controles definidos en el XML
        EditText txtNum1 = findViewById(R.id.txtNum1);
        EditText txtNum2 = findViewById(R.id.txtNum2);
        Button btnSumar = findViewById(R.id.btnSumar);
        TextView lblResultado = findViewById(R.id.lblResultado);

        // Al presionar el boton se convierte el texto a numero y se suma
        btnSumar.setOnClickListener(v -> {
            try {
                double n1 = Double.parseDouble(txtNum1.getText().toString());
                double n2 = Double.parseDouble(txtNum2.getText().toString());
                double suma = n1 + n2;
                lblResultado.setText("Resultado: " + suma);
            } catch (NumberFormatException e) {
                Toast.makeText(MainActivity.this, "Captura ambos numeros", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
