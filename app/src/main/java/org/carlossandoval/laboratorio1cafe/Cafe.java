package org.carlossandoval.laboratorio1cafe;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Cafe extends AppCompatActivity {
    Button btnPedido;
    EditText txtTazas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe);
        txtTazas = (EditText) findViewById(R.id.txtTazas);
        btnPedido = (Button) findViewById(R.id.btnPedido);
        btnPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cafe.this,DetallePedido.class);
                intent.putExtra("Pedido",txtTazas.getText().toString());
                startActivity(intent);
            }
        });
    }
}