package com.example.muhammadtalha.dama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;
import com.stfalcon.frescoimageviewer.ImageViewer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FullScreenActivity extends AppCompatActivity {
    Integer value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(FullScreenActivity.this);
        setContentView(R.layout.activity_full_screen);

        // no need for this activity

        Intent intent = getIntent();
        HashMap<String, Integer> hashMap = (HashMap<String, Integer>) intent.getSerializableExtra("hashMap");
//        for (Map.Entry<String,Integer> entry : hashMap.entrySet()) {
//            String key = entry.getKey();
//            value = entry.getValue();
//            Log.d("VVVVVV", value.toString());
//            photoView.setImageResource(value);
//            // do stuff
//        }

        int pos = getIntent().getIntExtra("Position", 0);

        List<Integer> list = new ArrayList<Integer>(hashMap.values());
//        photoView.setImageResource(list.get(pos));
//
//        Log.d("LOLOLO", list.toString());

        SimpleDraweeView draweeView = (SimpleDraweeView) findViewById(R.id.imageview);
        draweeView.setImageResource(list.get(pos));











    }


}
