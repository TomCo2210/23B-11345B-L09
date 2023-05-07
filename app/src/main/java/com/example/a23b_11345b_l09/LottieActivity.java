package com.example.a23b_11345b_l09;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class LottieActivity extends AppCompatActivity {
    private LottieAnimationView lottie_ANIM_lottie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottie);
        findViews();
        lottie_ANIM_lottie.resumeAnimation();
        lottie_ANIM_lottie.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(@NonNull Animator animation) {

            }

            @Override
            public void onAnimationEnd(@NonNull Animator animation) {

            }

            @Override
            public void onAnimationCancel(@NonNull Animator animation) {

            }

            @Override
            public void onAnimationRepeat(@NonNull Animator animation) {

            }
        });
    }

    private void findViews() {
        lottie_ANIM_lottie = findViewById(R.id.lottie_ANIM_lottie);
    }
}