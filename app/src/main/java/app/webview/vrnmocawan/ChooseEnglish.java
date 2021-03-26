package app.webview.vrnmocawan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ChooseEnglish extends AppCompatActivity {
    Button object,photo,arabiceng,vrit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_english);
                vrit=(Button)findViewById(R.id.virtual);
        object=(Button)findViewById(R.id.object);
        arabiceng=(Button)findViewById(R.id.arabicwriting);
        photo=(Button)findViewById(R.id.photo);

        vrit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ChooseEnglish.this,MainActivity.class);
                i.putExtra("order","https://www.vrawan.com/National_Museum-ar.html");
                startActivity(i);


            }
        });

        object.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ChooseEnglish.this,MainActivity.class);
                i.putExtra("order","https://www.vrawan.com/objects.html");
                startActivity(i);


            }
        });
        photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ChooseEnglish.this,MainActivity.class);
                i.putExtra("order","https://www.vrawan.com/objectsmoc.html");
                startActivity(i);


            }
        });
        arabiceng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ChooseEnglish.this,MainActivity.class);
                i.putExtra("order","https://www.vrawan.com/font-ancinet/writings.html");
                startActivity(i);


            }
        });

    }
    }

