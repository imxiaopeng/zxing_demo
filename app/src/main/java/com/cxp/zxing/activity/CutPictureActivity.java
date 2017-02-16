package com.cxp.zxing.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.cxp.zxing.R;
import com.cxp.zxing.view.ClipImageLayout;


public class CutPictureActivity extends AppCompatActivity implements View.OnClickListener {

    RelativeLayout cutpickBackButton;
    ClipImageLayout idClipImageLayout;
    Button cutpicSureButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cut_picture);
        cutpickBackButton= (RelativeLayout) findViewById(R.id.cutpick_back_button);
        idClipImageLayout= (ClipImageLayout) findViewById(R.id.id_clipImageLayout);
        cutpicSureButton= (Button) findViewById(R.id.cutpic_sure_button);
        Intent intent = getIntent();
        String iamgePath = intent.getStringExtra("bitmap");
        idClipImageLayout.setBitmapPath(iamgePath);
        initView();
        initEvent();


    }

    private void initEvent() {
        cutpickBackButton.setOnClickListener(this);
        cutpicSureButton.setOnClickListener(this);
    }


    private void initView() {
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cutpick_back_button:
                finish();
                break;
            case R.id.cutpic_sure_button:
                Bitmap bmp = idClipImageLayout.clip();
//                PersonalInformationResultBean personalInformationResultBean = new PersonalInformationResultBean();
//                personalInformationResultBean.setBitmap(bmp);
                finish();
                break;
        }
    }
}
