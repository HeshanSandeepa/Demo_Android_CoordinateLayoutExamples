package heshansandeepa.demo_coordinateexamples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button buttonSimple, buttonDetail, buttonProfile, buttonFlexible, buttonSwipe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    //init
    private void init() {
        buttonSimple = (Button) findViewById(R.id.button_simple);
        buttonSimple.setOnClickListener(this);
        buttonDetail = (Button) findViewById(R.id.button_detail);
        buttonDetail.setOnClickListener(this);
        buttonProfile = (Button) findViewById(R.id.button_profile);
        buttonProfile.setOnClickListener(this);
        buttonFlexible = (Button) findViewById(R.id.button_flexible);
        buttonFlexible.setOnClickListener(this);
        buttonSwipe = (Button) findViewById(R.id.button_swipe);
        buttonSwipe.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_simple:
                startActivity(new Intent(this, SimpleCoordinate.class));
                break;

            case R.id.button_detail:
                startActivity(new Intent(this, DetailCoordinate.class));
                break;

            case R.id.button_profile:
                startActivity(new Intent(this, Profile.class));
                break;

            case R.id.button_flexible:
                startActivity(new Intent(this, FlaxibleLayout.class));
                break;

            case R.id.button_swipe:
                startActivity(new Intent(this, Swipe.class));
                break;
        }
    }
}
