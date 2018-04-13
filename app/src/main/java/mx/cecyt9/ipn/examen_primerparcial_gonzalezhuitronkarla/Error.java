package mx.cecyt9.ipn.examen_primerparcial_gonzalezhuitronkarla;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Error extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.error);
    }

    public void volver(View v){
        Intent intento = new Intent(this,MainActivity.class);
        startActivity(intento);
    }
}
