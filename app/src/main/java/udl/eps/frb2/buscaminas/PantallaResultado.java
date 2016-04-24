package udl.eps.frb2.buscaminas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by yatan on 4/18/16.
 */
public class PantallaResultado extends AppCompatActivity{

    TextView textviu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado);
        textviu = (TextView) findViewById(R.id.textView_Resultado);
        Intent inten = getIntent();
        String colum = inten.getStringExtra("columnas");
        String alias = inten.getStringExtra("alias");
        textviu.append("Alias: " + alias);
        textviu.append("Columnas elegidas: " + colum);

    }

    public void volverPrincipal(View clickedButton) {
        Intent in = new Intent(this, PantallaPrincipal.class);
        in.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(in);
        finish();
    }

    public void enviarLOG(View clickedButton) {
        Toast.makeText(this, "Enviando mail de log", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(Intent.ACTION_SEND); // it's not ACTION_SEND
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, "a@b.com");
        startActivity(intent);
        finish();
    }
}