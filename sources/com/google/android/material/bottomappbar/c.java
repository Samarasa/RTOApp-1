package com.google.android.material.bottomappbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

class c extends FloatingActionButton.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f13929a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BottomAppBar f13930b;

    c(BottomAppBar bottomAppBar, int i) {
        this.f13930b = bottomAppBar;
        this.f13929a = i;
    }

    public void a(FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.f13930b.d(this.f13929a));
        floatingActionButton.b((FloatingActionButton.a) new b(this));
    }
}
