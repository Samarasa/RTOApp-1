package com.google.android.material.snackbar;

import android.os.Bundle;
import android.view.View;
import b.h.j.C0195a;
import b.h.j.a.c;

class i extends C0195a {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ BaseTransientBottomBar f14167d;

    i(BaseTransientBottomBar baseTransientBottomBar) {
        this.f14167d = baseTransientBottomBar;
    }

    public void a(View view, c cVar) {
        super.a(view, cVar);
        cVar.a(1048576);
        cVar.e(true);
    }

    public boolean a(View view, int i, Bundle bundle) {
        if (i != 1048576) {
            return super.a(view, i, bundle);
        }
        this.f14167d.c();
        return true;
    }
}
