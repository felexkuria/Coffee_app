package com.multitouchenterprisekenya.coffee_app;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

import static java.text.NumberFormat.getCurrencyInstance;

public class MainActivity<tag> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

//         int ghn=52+20;
//
//        TextView txtView =findViewById( R.id.textView );
//        txtView.setText( ghn +"" );



        /* Variab;les */
      /* int age=20;
       long ram =250625853238385355l;
       boolean kind= true;
       String name="Felex";
               char Letera='a';
       float price  =1.5f;*/
    //stsck  memmory variable storde there and heap memorystore address of an object and ti hold the address which is faster
    }
    int noOfCoffees;
    String priceMessage="Free";

//    private  void displayMessage(String message){
//        TextView messageText=(TextView)findViewById( R.id.messageTextView );
//        messageText.setText( message );
//    }

    public void submitOrder(View view) {
        displayQuantty(noOfCoffees);
        displayPrice(5*noOfCoffees);

    }

    private void displayPrice(int price) {
        TextView priceTextview=(TextView) findViewById( R.id.priceTextView );
       if(price<0){
           priceTextview.setText( "No Negative Number of Coffee Try Again" );
       }
       else if(price>0){
           priceTextview.setText( "Total"+" "+ getCurrencyInstance().format( price ) );
       }else{ priceTextview.setText(  getCurrencyInstance().format( price ));}
    }

    private void displayQuantty(int i) {
        TextView quantityTextView= (TextView)findViewById( R.id.quantityTextView);

        if(i<0){
            quantityTextView.setText( "No Negative Number of coffee" );
        }else if(i>0) {quantityTextView.setText( "" +i );}else {quantityTextView.setText( "" +i );}
    }

    public void decrement(View view) {
        displayQuantty( noOfCoffees-- );

    }

    public void increment(View view) {
       displayQuantty( noOfCoffees++ );
    }
    //prmitive datatypes
    /*1.byte
    * 2.char
    * 3.short
    * 4int cna hold 32 values*/

}

