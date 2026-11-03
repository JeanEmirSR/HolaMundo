package com.example.holamundo;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

/*
 * Practica D: operaciones basicas.
 * Autores: SANCHEZ REYES JEAN EMIR / SANLUIS GONZALEZ JAHIR
 * Descripcion: calculadora basica. Lee dos numeros y, segun el boton
 * presionado, ejecuta la suma, resta, multiplicacion o division,
 * mostrando el resultado en un TextView.
 */
public class MainActivity extends AppCompatActivity {

    EditText txtNum1, txtNum2;
    TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencias a los controles definidos en el XML
        txtNum1 = findViewById(R.id.txtNum1);
        txtNum2 = findViewById(R.id.txtNum2);
        lblResultado = findViewById(R.id.lblResultado);

        Button btnSumar = findViewById(R.id.btnSumar);
        Button btnRestar = findViewById(R.id.btnRestar);
        Button btnMultiplicar = findViewById(R.id.btnMultiplicar);
        Button btnDividir = findViewById(R.id.btnDividir);

        // Cada boton dispara la operacion correspondiente
        btnSumar.setOnClickListener(v -> calcular('+'));
        btnRestar.setOnClickListener(v -> calcular('-'));
        btnMultiplicar.setOnClickListener(v -> calcular('*'));
        btnDividir.setOnClickListener(v -> calcular('/'));
    }

    // Metodo comun que ejecuta la operacion indicada por el parametro op
    private void calcular(char op) {
        try {
            double n1 = Double.parseDouble(txtNum1.getText().toString());
            double n2 = Double.parseDouble(txtNum2.getText().toString());
            double r = 0;
            if (op == '+') r = n1 + n2;
            if (op == '-') r = n1 - n2;
            if (op == '*') r = n1 * n2;
            if (op == '/') {
                if (n2 == 0) {
                    Toast.makeText(this, "No se puede dividir entre cero", Toast.LENGTH_SHORT).show();
                    return;
                }
                r = n1 / n2;
            }
            lblResultado.setText("Resultado: " + r);
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Captura ambos numeros", Toast.LENGTH_SHORT).show();
        }
    }
}
