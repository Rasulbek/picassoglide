package uz.tafakkur.picassoglide;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class BothLibs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_both_libs);


        ImageView picassoView = findViewById(R.id.picassoView);
        ImageView glideView = findViewById(R.id.glideView);
        EditText urlTextView = findViewById(R.id.urlEditText);
        Button updateBtn = findViewById(R.id.updateBtn);

        urlTextView.setText(PrefUtil.getLastImageUrl(this));

        updateBtn.setOnClickListener(view -> {
            Uri url = Uri.parse(urlTextView.getText().toString());
            Glide.with(this).load(url).into(glideView);
            Picasso.get().load(url).into(picassoView);
            PrefUtil.storeLastImageUrl(this, url.toString());
        });
    }
}
