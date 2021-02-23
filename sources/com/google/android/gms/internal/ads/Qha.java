package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.c.a;
import com.google.android.gms.internal.ads.C1766hB;
import java.io.IOException;

public final class Qha extends C1808hia {
    public Qha(C2869wha wha, String str, String str2, C1766hB.a aVar, int i, int i2) {
        super(wha, str, str2, aVar, i, 24);
    }

    private final void c() {
        a o = this.f10707b.o();
        if (o != null) {
            try {
                a.C0070a b2 = o.b();
                String a2 = Bha.a(b2.a());
                if (a2 != null) {
                    synchronized (this.f10710e) {
                        this.f10710e.b(a2);
                        this.f10710e.a(b2.b());
                        this.f10710e.a(C1766hB.c.DEVICE_IDENTIFIER_ANDROID_AD_ID);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (this.f10707b.i()) {
            c();
            return;
        }
        synchronized (this.f10710e) {
            this.f10710e.b((String) this.f10711f.invoke((Object) null, new Object[]{this.f10707b.a()}));
        }
    }

    /* renamed from: b */
    public final Void call() {
        if (this.f10707b.b()) {
            return super.call();
        }
        if (!this.f10707b.i()) {
            return null;
        }
        c();
        return null;
    }
}
