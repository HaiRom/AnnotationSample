package com.example.hairom.handler_asynctask_sample;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;


import org.androidannotations.annotations.*;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {
   // private Handler mHandler;
    @ViewById(R.id.btnSubmit)
     Button mBtnSubmit;
    @ViewById(R.id.textView)
     TextView textView;
    @Click
    void btnSubmitClicked(){
        textView.setText("ahjcascasc");
    }
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//nmn
//
//
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }

}
