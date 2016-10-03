package ansteph.com.lotto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ansteph.com.lotto.view.registration.LottoLogin;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);





        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(4000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    /**
                     * Call this function whenever you want to check user login
                     * This will redirect user to Login is he is not
                     * logged in
                     * */
                   // sessionManager.checkLogin();
                 Intent intent = new Intent(getApplicationContext(), LottoLogin.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }



    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }


}
