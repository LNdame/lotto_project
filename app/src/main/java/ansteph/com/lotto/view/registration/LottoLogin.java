package ansteph.com.lotto.view.registration;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import ansteph.com.lotto.R;

public class LottoLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lotto_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }



    @Override
    public void onBackPressed() {
        //Do nothing...
    }

    public void registerClient (View view)
    {

        Intent intent = new Intent(getApplicationContext(), Registration.class);
        startActivity(intent);
    }


}
