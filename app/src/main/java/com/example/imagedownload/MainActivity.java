package com.example.imagedownload;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.example.imagedownload.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        GlideApp.with(this)
                .load("http://placehold.jp/ff0000/200x200.png?text=普通")
                .into(mBinding.image1);

        GlideApp.with(this)
                .load("http://placehold.jp/ff0000/200x200.png?text=CenterCrop")
                .centerCrop()
                .into(mBinding.image2);

        GlideApp.with(this)
                .load("http://placehold.jp/ff0000/200x200.png?text=CircleCrop")
                .circleCrop()
                .into(mBinding.image3);

GlideApp.with(this)
        .load("http://placehold.jp/ff0000/200x200.png?text=CircleCrop")
        .circleCrop()
        .into(mBinding.image3);

GlideApp.with(this)
        .load(R.drawable.okame008)
        .into(mBinding.image4);
    }
}
