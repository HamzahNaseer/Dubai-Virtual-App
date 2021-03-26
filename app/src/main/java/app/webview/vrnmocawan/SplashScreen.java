package app.webview.vrnmocawan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class SplashScreen extends AppCompatActivity {
    Thread splashTread;
    ImageView imageView;
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
//        imageView=(ImageView)findViewById(R.id.img);
//        linearLayout=(LinearLayout)findViewById(R.id.l1);
//        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.anim);
//        imageView.startAnimation(myanim);
        //imageView = (ImageView)findViewById(R.id.splash);
//        Vibrator v = (Vibrator) this.getSystemService(Context.VIBRATOR_SERVICE);
//        v.vibrate(4000);

        splashTread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    // Splash screen pause time
                    while (waited < 1500) {
                        sleep(100);
                        waited += 150;
                    }


                    Intent intent = new Intent(SplashScreen.this,
                            Choose.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);

                    SplashScreen.this.finish();
                } catch (InterruptedException e) {
                    // do nothing
                } finally {
                    SplashScreen.this.finish();
                }

            }
        };

        splashTread.start();
    }



}



