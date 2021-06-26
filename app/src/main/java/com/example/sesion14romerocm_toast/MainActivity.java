package com.example.sesion14romerocm_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {//inicia clase

    Button btnPrimero, btnSegundo, btnTercero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {//inicia metodo oncreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       btnPrimero=findViewById(R.id.btnPrimero);
       btnSegundo=findViewById(R.id.btnSegundo);
       btnTercero = findViewById(R.id.btnTercero);

    }//termina metodo oncreate


    public void primeroToast(View view){ //inicia metodo
        Context context = getApplicationContext();
        CharSequence mesnaje="Primer mensaje TOAST \nRomero Joab  \n CM";
        int duration= Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context,mesnaje,duration);

        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.show();

        //Toaste integrado

        Toast.makeText(this,"Ventana Emergente 2",Toast.LENGTH_LONG).show();

    }//termina metodo

    public void segundoToast(View view){ //inicia metodo
        Context context = getApplicationContext();
        CharSequence mesnaje="Segundo mensaje TOAST \nRomero Joab  \n CM";
        int duration= Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context,mesnaje,duration);

        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.show();

        //Toaste integrado

        Toast.makeText(this,"Ventana Emergente 2",Toast.LENGTH_LONG).show();

    }//termina metodo

    public void terceroToast(View view){ //inicia metodo
        Context context = getApplicationContext();
        CharSequence mesnaje="Tercer mensaje TOAST \nRomero Joab  \n CM";
        int duration= Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context,mesnaje,duration);

        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.show();

        //Toaste integrado

        Toast.makeText(this,"Ventana Emergente 2",Toast.LENGTH_LONG).show();

    }//termina metodo

    //Toast personalizado con XML
     public void toastPersonalizadoXML1(View view){

        //Inflater => ejecucion, visualizacion, desplegado de una vista
         LayoutInflater inflater =getLayoutInflater();
         View layout =inflater.inflate(R.layout.toast2, null);

         Toast toastXML =new Toast(getApplicationContext());
         toastXML.setGravity(Gravity.CENTER_VERTICAL,0,0);
         toastXML.setDuration(Toast.LENGTH_LONG);
         //Integracion de los elementos

         toastXML.setView(layout);
         toastXML.show();

     } //Termina metodo


}//Termina clase