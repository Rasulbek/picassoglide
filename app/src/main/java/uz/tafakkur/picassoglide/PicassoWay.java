package uz.tafakkur.picassoglide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class PicassoWay extends AppCompatActivity {

    ImageView bigHorizontal, bigVertical, imageView3, imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso_way);
        bigHorizontal = findViewById(R.id.bigHorizontal);
        bigVertical = findViewById(R.id.bigVertical);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
    }

    @Override
    protected void onResume() {
        super.onResume();
        String url = PrefUtil.getLastImageUrl(getApplicationContext());
        Picasso.get().load(url).into(bigHorizontal);
        Picasso.get().load(url).into(bigVertical);
        Picasso.get().load(url).into(imageView3);
        Picasso.get().load(url).into(imageView4);
    }
}
