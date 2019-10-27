package com.ismynr.submission_reviewhostingid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class About extends BaseMenu {

    TextView mActionBarToolbar;
    ImageView ivTopbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        findViews();
        initListeners();
        comp();
    }

    @Override
    public void findViews(){
        mActionBarToolbar = findViewById(R.id.tv_item_topbar);
        ivTopbar = findViewById(R.id.iv_topbar);
    }

    @Override
    public void comp(){
        mActionBarToolbar.setText("About");
    }

    @Override
    public void initListeners(){
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
