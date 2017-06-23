package app.example.android.justjava;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int quantity=0;
    public void submitOrder(View view){


        String displayMessg="\nThank You!!";
        displayMessg=displayMessg+" yay";
        displayPrice("$"+(quantity * 5 )+ displayMessg);

    }
    public void increment(View view){
        quantity=quantity +1;
        display(quantity);


    }
    public void decrement(View view){
        quantity= quantity - 1;
        display(quantity);

    }
    private void display(int number){
        TextView quantityTextView=(TextView) findViewById(R.id.no);
        quantityTextView.setText("" + number);
    }


    private void displayPrice(String number){
        TextView priceTextView=(TextView)findViewById(R.id.price_textView);
        priceTextView.setText(number);
    }

    }
