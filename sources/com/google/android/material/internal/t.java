package com.google.android.material.internal;

import android.graphics.Typeface;
import c.b.b.c.l.h;
import com.google.android.material.internal.u;

class t extends h {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ u f14108a;

    t(u uVar) {
        this.f14108a = uVar;
    }

    public void a(int i) {
        boolean unused = this.f14108a.f14112d = true;
        u.a aVar = (u.a) this.f14108a.f14113e.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void a(Typeface typeface, boolean z) {
        if (!z) {
            boolean unused = this.f14108a.f14112d = true;
            u.a aVar = (u.a) this.f14108a.f14113e.get();
            if (aVar != null) {
                aVar.a();
            }
        }
    }
}
