package com.google.android.material.bottomappbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.b.b.c.d;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

class g implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BottomAppBar.Behavior f13938a;

    g(BottomAppBar.Behavior behavior) {
        this.f13938a = behavior;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        BottomAppBar bottomAppBar = (BottomAppBar) this.f13938a.f13923f.get();
        if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
            view.removeOnLayoutChangeListener(this);
            return;
        }
        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
        floatingActionButton.b(this.f13938a.f13922e);
        if (bottomAppBar.b(this.f13938a.f13922e.height())) {
            CoordinatorLayout.e eVar = (CoordinatorLayout.e) view.getLayoutParams();
            if (eVar.bottomMargin == 0) {
                eVar.bottomMargin = Math.max(0, bottomAppBar.getResources().getDimensionPixelOffset(d.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - this.f13938a.f13922e.height()) / 2));
            }
        }
    }
}
