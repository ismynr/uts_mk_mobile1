package com.ismynr.submission_reviewhostingid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

public class Deskripsi extends BaseMenu {

    TextView tvNama, tvDeskripsi, tvKelebihan, tvKekurangan, mActionBarToolbar;
    ImageView ivPhoto, ivTopbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi);

        findViews();
        initListeners();
        comp();
    }

    @Override
    public void findViews() {
        ivPhoto = findViewById(R.id.iv_item_photo);
        tvNama = findViewById(R.id.tv_item_nama);
        tvDeskripsi = findViewById(R.id.tv_item_deskripsi);
        tvKelebihan = findViewById(R.id.tv_item_kelebihan);
        tvKekurangan = findViewById(R.id.tv_item_kekurangan);
        mActionBarToolbar = findViewById(R.id.tv_item_topbar);
        ivTopbar = findViewById(R.id.iv_topbar);
    }

    @Override
    public void comp() {
        mActionBarToolbar.setText("Deskripsi");

        int photo = getIntent().getIntExtra("photo", 0);
        String nama = getIntent().getStringExtra("nama");
        String deskripsi = getIntent().getStringExtra("deskripsi");
        String kelebihan = getIntent().getStringExtra("kelebihan");
        String kekurangan = getIntent().getStringExtra("kekurangan");
        ivPhoto.setImageResource(photo);
        tvNama.setText(nama);
        tvDeskripsi.setText(deskripsi);
        tvKelebihan.setText(kelebihan);
        tvKekurangan.setText(kekurangan);
    }

    @Override
    public void initListeners() {
        ivTopbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    public void onBackPressed(){
        super.onBackPressed();
    }
}
