package com.mooc.ppjoke.ui.publish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mooc.libnavannotation.ActivityDestination;
import com.mooc.ppjoke.R;
@ActivityDestination(pageUrl = "main/tabs/publish", needLogin = true)
public class PublishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publish);
    }
}
