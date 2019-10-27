package com.ismynr.submission_reviewhostingid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.ismynr.submission_reviewhostingid.data.HostingData;
import com.ismynr.submission_reviewhostingid.entity.Hosting;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvHost;
    private ArrayList<Hosting> list = new ArrayList<>();
    ImageView ivTopbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvHost = findViewById(R.id.rv_host);
        rvHost.setHasFixedSize(true);

        ivTopbar = findViewById(R.id.iv_topbar_main);
        ivTopbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(MainActivity.this, About.class);
                startActivity(move);
            }
        });

        list.addAll(HostingData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvHost.setLayoutManager(new LinearLayoutManager(this));
        HostingAdapter hostAdapter = new HostingAdapter(list);
        rvHost.setAdapter(hostAdapter);

        hostAdapter.setOnItemClickCallback(new HostingAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Hosting data) {
                intentSelectHosting(data);
            }
        });
    }

    private void intentSelectHosting(Hosting host) {
        Intent move = new Intent(MainActivity.this, Deskripsi.class);
        move.putExtra("photo", host.getPhoto());
        move.putExtra("nama", host.getNama());
        move.putExtra("deskripsi", host.getDeskripsi());
        move.putExtra("kelebihan", host.getKelebihan());
        move.putExtra("kekurangan", host.getKekurangan());
        startActivity(move);
    }
}
