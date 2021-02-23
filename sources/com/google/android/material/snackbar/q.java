package com.google.android.material.snackbar;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;

class q implements View.OnTouchListener {
    q() {
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return true;
    }
}
