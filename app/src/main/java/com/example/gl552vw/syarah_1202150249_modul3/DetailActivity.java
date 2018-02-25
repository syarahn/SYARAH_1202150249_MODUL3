package com.example.gl552vw.syarah_1202150249_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {
    TextView MerkAir, DetailAir, volume;
    ImageView gamberMerk, gambarVolume;
    ImageButton add, remove;
    private int minteger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String merk = intent.getStringExtra("merk");
        Integer gambar = intent.getIntExtra("gambar", 0);
        String detail = intent.getStringExtra("detail");

        MerkAir = (TextView) findViewById(R.id.card_merk);
        DetailAir = (TextView) findViewById(R.id.detail_ket);
        gamberMerk = (ImageView) findViewById(R.id.card_gambar);
        volume = (TextView) findViewById(R.id.tv_liter);
        gambarVolume = (ImageView) findViewById(R.id.gambarVolume);
        add = (ImageButton) findViewById(R.id.ib_plus);
        remove = (ImageButton) findViewById(R.id.ib_minus);


        MerkAir.setText(merk);
        DetailAir.setText(detail);
        gamberMerk.setImageResource(gambar);
    }

    public void btn_plus(View view) {
        minteger = minteger + 1;
        display(minteger);
        if(minteger==4){
            add.setEnabled(false);
        }

        switch (minteger){
            case (1):
                gambarVolume.setImageResource(R.drawable.ic_battery_20_black_24dp);
                Toast.makeText(getApplicationContext(),"Air sedikit!",Toast.LENGTH_SHORT).show();
                break;
            case (2):
                gambarVolume.setImageResource(R.drawable.ic_battery_50_black_24dp);
                break;
            case (3):
                gambarVolume.setImageResource(R.drawable.ic_battery_80_black_24dp);
                break;
            case (4):
                gambarVolume.setImageResource(R.drawable.ic_battery_full_black_24dp);
                Toast.makeText(getApplicationContext(),"Air sudah full!",Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void btn_minus(View view) {
        minteger = minteger - 1;
        display(minteger);
        if(minteger==0){
            remove.setEnabled(false);
        }

        switch (minteger){
            case (1):
                gambarVolume.setImageResource(R.drawable.ic_battery_20_black_24dp);
                Toast.makeText(getApplicationContext(),"Air sedikit!",Toast.LENGTH_SHORT).show();
                break;
            case (2):
                gambarVolume.setImageResource(R.drawable.ic_battery_50_black_24dp);
                break;
            case (3):
                gambarVolume.setImageResource(R.drawable.ic_battery_80_black_24dp);
                break;
            case (4):
                gambarVolume.setImageResource(R.drawable.ic_battery_full_black_24dp);
                Toast.makeText(getApplicationContext(),"Air sudah full!",Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private void display(int number) {
        TextView displayInteger = (TextView) findViewById(R.id.tv_liter);
        displayInteger.setText("" + number +" L");
    }
}

