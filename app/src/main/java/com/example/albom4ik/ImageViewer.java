package com.example.albom4ik;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageViewer extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Bundle bundle = this.getIntent().getExtras();

        String s=bundle.getString("imagepath");
        Bitmap Imagefrompath = BitmapFactory.decodeFile(s);
        ImageView img=(ImageView) findViewById(R.id.imageView1);
        img.setImageBitmap(Imagefrompath );


    }

}