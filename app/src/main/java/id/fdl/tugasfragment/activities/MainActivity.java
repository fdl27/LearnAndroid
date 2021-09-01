package id.fdl.tugasfragment.activities;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import id.fdl.tugasfragment.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startActivityWithFragment(View view){
        Intent intent = new Intent(MainActivity.this, FragmentActivity.class);
        startActivity(intent);
    }

}