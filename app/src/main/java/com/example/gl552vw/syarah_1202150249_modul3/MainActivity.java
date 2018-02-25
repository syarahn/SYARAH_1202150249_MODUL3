package com.example.gl552vw.syarah_1202150249_modul3;

import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuAdapter;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //variable LinkedList
    private final LinkedList<String> merk = new LinkedList<>();
    private final LinkedList<String> deskripsi = new LinkedList<>();
    private final LinkedList<Integer> gambar = new LinkedList<>();
    private final LinkedList<String> detail = new LinkedList<>();
    private RecyclerView mRecyclerView;
    private com.example.gl552vw.syarah_1202150249_modul3.MenuAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data();

        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new com.example.gl552vw.syarah_1202150249_modul3.MenuAdapter(this, merk, deskripsi, gambar, detail);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        if(this.getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){
            mRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        }else {
            mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        }

    }

    private void data() {
        merk.add("Ades");
        merk.add("Amidis");
        merk.add("Aqua");
        merk.add("Cleo");
        merk.add("Club");
        merk.add("Equil");
        merk.add("Evian");
        merk.add("Le Minerale");
        merk.add("Nestle");
        merk.add("Vit");

        deskripsi.add("Ini air mineral merk Ades");
        deskripsi.add("Ini adalah air mineral merk Amidis");
        deskripsi.add("Ini adalah air mineral merk Aqua");
        deskripsi.add("Ini adalah air mineral merk Cleo");
        deskripsi.add("Ini adalah air mineral merk Club");
        deskripsi.add("Ini adalah air mineral merk Equil");
        deskripsi.add("Ini adalah air mineral merk Evian");
        deskripsi.add("Ini adalah air mineral merk Le Minerale");
        deskripsi.add("Ini adalah air mineral merk Nestle");
        deskripsi.add("Ini adalah air mineral merk Vit");

        gambar.add(R.drawable.ades);
        gambar.add(R.drawable.amidis);
        gambar.add(R.drawable.aqua);
        gambar.add(R.drawable.cleo);
        gambar.add(R.drawable.club);
        gambar.add(R.drawable.equil);
        gambar.add(R.drawable.evian);
        gambar.add(R.drawable.leminerale);
        gambar.add(R.drawable.nestle);
        gambar.add(R.drawable.vit);

        detail.add("Ades (sebelumnya pernah disebut AdeS) adalah merek air mineral atau air minum dalam kemasan (AMDK) yang diproduksi oleh PT. Coca-Cola Bottling Indonesia, Bekasi.");
        detail.add("AMIDIS adalah air minum kesehatan yang diproses melalui sistem distilasi atau penyulingan atau penguapan,melalui proses pemanasan hingga 180 derajat celcius sehingga menghasilkan air minum yang murni (NON-MINERAL) tanpa kandungan polutan, mineral anorganik maupun bahan kontaminasi lain seperti bahan kimia maupun bahan pestisida.");
        detail.add("Aqua adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Aqua Golden Mississippi Tbk di Indonesia sejak tahun 1973.");
        detail.add("Air Murni Cleo diambil dari mata air pegunungan dan diproses melalui hyper membrane filter 0,0001 mikron sehingga tidak mengandung mikroorganisme dan mineral anorganik, misalnya chlorine dan natrium fluoride.");
        detail.add("Club adalah merek air minum dalam kemasan atau air mineral di Indonesia. Merek ini berasal dari Surabaya dan Pandaan, Pasuruan, Jawa Timur. ");
        detail.add("Equil merupakan air mineral yang memiliki kemasan elegan dan saat ini satu botolnya ditawarkan dengan harga mulai Rp16.500.");
        detail.add("Evian bersumber dari es murni dari pegunungan Alpen yang benar2 murni dimana kandungan mineralnya gak di ragukan dan kemurniannya bener2 yang belum terjamah sama manusia");
        detail.add("Le Minerale adalah air mineral baru dari Mayora, berupa air mineral pegunungan yang mengandung mineral alami yang dibutuhkan tubuh sehari-hari. Le Minerale, diolah dari sumber mata air pegunungan terpilih, sehingga memiliki kesegaran khas yang ditandai dengan sedikit rasa manis");
        detail.add("Tidak semua air bersih layak minum, tetapi air layak minum biasanya berasal dari air bersih. Air bersih perlu diolah dahulu agar layak minum dan menjadi air minum sehat. Menjawab kebutuhan tersebut, Nestle Pure Life, sebagai air minum nomor satu di dunia -berdasar data Zenith Internasional 2009");
        detail.add("VIT adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Tirta Investama di Indonesia. Mulai diproduksi sejak tanggal 16 November 1982 dan awalnya dimiliki oleh PT Varia Industri Tirta.");
    }
}


