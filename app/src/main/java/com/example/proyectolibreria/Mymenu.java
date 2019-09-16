package com.example.proyectolibreria;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Mymenu extends AppCompatActivity{
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id=item.getItemId();

        if(id == R.id.item_menu1){
            //Toast.makeText(this,"Opcion 0", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, Donacion.class);
            startActivityForResult(i, 0);

        }else if(id == R.id.item_menu2){
            Intent i = new Intent(this, Intercambio.class);
            startActivityForResult(i, 0);
        }else if(id == R.id.item_menu3){
            Intent i = new Intent(this, Reserva.class);
            startActivityForResult(i, 0);
        }else if(id == R.id.item_menu4){
            Intent i = new Intent(this, Prestamo.class);
            startActivityForResult(i, 0);
        }else if(id == R.id.item_menu5){
            Intent i = new Intent(this, Devolucion.class);
            startActivityForResult(i, 0);
        }


        return super.onOptionsItemSelected(item);
    }

}
