package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.C1766hB;
import java.util.concurrent.atomic.AtomicReference;

public final class Kha extends C1808hia {
    private static C2020kia<String> i = new C2020kia<>();
    private final Context j;

    public Kha(C2869wha wha, String str, String str2, C1766hB.a aVar, int i2, int i3, Context context) {
        super(wha, str, str2, aVar, i2, 29);
        this.j = context;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.f10710e.f("E");
        AtomicReference<String> a2 = i.a(this.j.getPackageName());
        if (a2.get() == null) {
            synchronized (a2) {
                if (a2.get() == null) {
                    a2.set((String) this.f10711f.invoke((Object) null, new Object[]{this.j}));
                }
            }
        }
        String str = a2.get();
        synchronized (this.f10710e) {
            this.f10710e.f(C2695uJ.a(str.getBytes(), true));
        }
    }
}
