package com.example.ruben.appsubmint;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends Activity {

    final public static String NOM_USUARI = "com.example.ruben.appsubmint.LaMevaKey"; // es bueno definir el nombre de la variable para poder diferenciara entre otras app
    //DEFINIMOS la key para la entrada en mi diccionario, con el final hacemos que el valor no se pueda modificar en ningun sitio y es publica para todos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



    //iniciamos la funcion del boton

    public void EnviarTEXT (View myText){

        EditText nom = (EditText) findViewById(R.id.text);   //nom es el nombre de la variable que recive los datos del EditText, busca en funcion del id dentro de su bbdd el id.text
        // el (editText) hace que reconozca la view como un view de texto

        String myName = nom.getText().toString(); // en la variable myName tenemos lo que ha introducido el usuario y lo trasformamos a un string

        Intent newView = new Intent(this, MainActivity2.class); //preparamos la view que queremos lanzar

        newView.putExtra(NOM_USUARI,myName ); //creamos el diccionario en la view con un "id" definida anteriormente  + con el contenido del el string de la variable

        startActivity(newView); //abrimos la nueva view, mirar mainactivity2.java funcion onCreate

    }
}
