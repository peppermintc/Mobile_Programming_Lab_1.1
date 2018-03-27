package org.androidtown.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    ImageView imageView2;

    int imageIndex =0;  // to change color infinitly

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
    }
    // reference activity_main xml and image views to use them.

    public void onButtonClicked(View v) {
        changeImage();
    }
    // Execute changeImage method

    private void changeImage(){
        if(imageIndex == 0){
            imageView.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);

            imageIndex = 1;
        }

        else if(imageIndex ==1){
            imageView.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);

            imageIndex =0;
        }
    }
    // Changes image view visibility.
}
