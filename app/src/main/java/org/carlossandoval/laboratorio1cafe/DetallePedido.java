package org.carlossandoval.laboratorio1cafe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetallePedido extends AppCompatActivity {
    TextView txtNumero;
    TextView txtTotal;
    Button btnAtras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_pedido);
        txtNumero = (TextView) findViewById(R.id.txtNumero);
        txtTotal = (TextView) findViewById(R.id.txtTotal);
        Bundle bundle= getIntent().getExtras();
        txtNumero.setText(bundle.getString("Pedido"));
        Double total= Double.parseDouble(bundle.getString("Pedido"))*7.5;
        txtTotal.setText(total.toString());
        btnAtras = (Button) findViewById(R.id.btnRegresar);
        btnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DetallePedido.this,Cafe.class));
            }
        });

    }
}