package app.webview.vrnmocawan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Choose extends AppCompatActivity {
    Button english,arabic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        english=(Button)findViewById(R.id.eng);
        arabic=(Button)findViewById(R.id.arb);
        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Choose.this,ChooseEnglish.class);

                startActivity(i);
            }
        });
        arabic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Choose.this,ChooseArabic.class);

                startActivity(i);
            }
        });

    }
}
