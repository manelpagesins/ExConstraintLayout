package cat.dam.andy.exconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button boto1;
    Button boto2;
    Button boto3;
    Button boto4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boto1 = (Button) findViewById(R.id.Ex1);
        boto2 = (Button) findViewById(R.id.Ex2);
        boto3 = (Button) findViewById(R.id.Ex3);
        boto4 = (Button) findViewById(R.id.Ex4);


        boto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Ex1.class));
            }
        });

        boto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Ex2.class));
            }
        });

        boto3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Ex3.class));
            }
        });

        boto4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Ex4.class));
            }
        });


    }
}