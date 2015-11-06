//Created 5/11/15
package pa.qac.com.qacpa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.lang.Override;

import pa.qac.com.R;

//Main class for splash screen
public class SplashScreen extends Activity {

    //Set Variables
    private boolean mIsBackButtonPressed;
    private static final int SPLASH_DURATION = 3000; // 3 Standard Seconds

    //OnCreate method that adds all the buttons and layouts for the activity.
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.splash_screen);

        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {

            public void run() {

                finish();

                if (!mIsBackButtonPressed){
                    //Start the home screen if the back button wasn't pressed already
                    Intent intent = new Intent(SplashScreen.this, Home.class);
                    SplashScreen.this.startActivity(intent);
                }
            }
        }, SPLASH_DURATION);
    }

    @Override
    public void onBackPressed() {

        mIsBackButtonPressed = true;
        super.onBackPressed();
    }
}
