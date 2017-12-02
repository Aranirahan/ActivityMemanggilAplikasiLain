package com.ngoding.aran.activitymemanggilaplikasilain;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnPanggil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPanggil = findViewById(R.id.btn_panggil);
        btnPanggil.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String nomorTelepon = "081312055494";
        Intent intentPanggilNomor = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+nomorTelepon));
        startActivity(intentPanggilNomor);
    }
}
