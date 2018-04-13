package mx.cecyt9.ipn.examen_primerparcial_gonzalezhuitronkarla;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String Usuario = "Michelle";
    String Password = "1234";
    String UsuarioObtenido = "";
    String PasswordObtenida = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void validar(View v){
        EditText tv = findViewById(R.id.usuario);
        EditText tv2 = findViewById(R.id.password);
        UsuarioObtenido = tv.getText().toString();
        PasswordObtenida = tv2.getText().toString();
        if(Usuario.equals(UsuarioObtenido)&&Password.equals(PasswordObtenida)){
            //Mandar llamar actividad correcta
            Toast.makeText(getApplicationContext(),"Usuario Correcto", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this,Reserva1.class);
            startActivity(intent);
        }
        else{
            //Mandar llamar actividad error
            Toast.makeText(getApplicationContext(),"Usuario Incorrecto", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this,Error.class);
            startActivity(intent);
        }
    }
}
