package com.example.a23b_11345b_l09;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.AccelerateInterpolator;

import com.google.android.material.imageview.ShapeableImageView;

public class SplashActivity extends AppCompatActivity {

    private static final long ANIM_DURATION = 3000;
    private ShapeableImageView splash_IMG_logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        findViews();
        splash_IMG_logo.setVisibility(View.INVISIBLE);
        showAnimation(splash_IMG_logo);
    }

    private void showAnimation(final View v) {
        v.setVisibility(View.VISIBLE);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

        int height = displayMetrics.heightPixels;
        v.setY(-height / 2);
        v.setScaleX(0.2f);
        v.setScaleY(0.2f);
        v.animate()
                .scaleX(1.0f)
                .scaleY(1.0f)
                .translationY(0)
                .setDuration(ANIM_DURATION)
                .setInterpolator(new AccelerateInterpolator())
                .setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(@NonNull Animator animation) {

                    }

                    @Override
                    public void onAnimationEnd(@NonNull Animator animation) {
                        goToMainActivity();
                    }

                    @Override
                    public void onAnimationCancel(@NonNull Animator animation) {

                    }

                    @Override
                    public void onAnimationRepeat(@NonNull Animator animation) {

                    }
                });
    }

    private void goToMainActivity() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    private void findViews() {
        splash_IMG_logo = findViewById(R.id.splash_IMG_logo);

    }
}