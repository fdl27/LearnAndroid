package id.fdl.tugasfragment.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import id.fdl.tugasfragment.R;

public class FragmentActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, HelloFragment.newInstance())
                    .commitNow();
        }
    }

    public void backToMain(View view){
        Intent intent = new Intent(FragmentActivity.this, MainActivity.class);
        startActivity(intent);
    }

}
