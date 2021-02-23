package com.google.android.material.snackbar;

import android.os.Handler;
import com.google.android.material.snackbar.u;

class j implements u.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BaseTransientBottomBar f14168a;

    j(BaseTransientBottomBar baseTransientBottomBar) {
        this.f14168a = baseTransientBottomBar;
    }

    public void a(int i) {
        Handler handler = BaseTransientBottomBar.f14137a;
        handler.sendMessage(handler.obtainMessage(1, i, 0, this.f14168a));
    }

    public void u() {
        Handler handler = BaseTransientBottomBar.f14137a;
        handler.sendMessage(handler.obtainMessage(0, this.f14168a));
    }
}
