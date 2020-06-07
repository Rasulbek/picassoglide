package uz.tafakkur.picassoglide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.bothLibsBtn).setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), BothLibs.class));
        });

        findViewById(R.id.picassoActivityBtn).setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), PicassoWay.class));
        });
    }
}
