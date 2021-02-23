package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

public final class Ela implements C3090zla {

    /* renamed from: a  reason: collision with root package name */
    private final C3090zla[] f6743a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<C3090zla> f6744b;

    /* renamed from: c  reason: collision with root package name */
    private final C1314aja f6745c = new C1314aja();

    /* renamed from: d  reason: collision with root package name */
    private Cla f6746d;

    /* renamed from: e  reason: collision with root package name */
    private Via f6747e;

    /* renamed from: f  reason: collision with root package name */
    private Object f6748f;

    /* renamed from: g  reason: collision with root package name */
    private int f6749g = -1;

    /* renamed from: h  reason: collision with root package name */
    private Gla f6750h;

    public Ela(C3090zla... zlaArr) {
        this.f6743a = zlaArr;
        this.f6744b = new ArrayList<>(Arrays.asList(zlaArr));
    }

    /* access modifiers changed from: private */
    public final void a(int i, Via via, Object obj) {
        Gla gla;
        if (this.f6750h == null) {
            int b2 = via.b();
            for (int i2 = 0; i2 < b2; i2++) {
                via.a(i2, this.f6745c, false);
            }
            if (this.f6749g == -1) {
                this.f6749g = via.c();
            } else if (via.c() != this.f6749g) {
                gla = new Gla(1);
                this.f6750h = gla;
            }
            gla = null;
            this.f6750h = gla;
        }
        if (this.f6750h == null) {
            this.f6744b.remove(this.f6743a[i]);
            if (i == 0) {
                this.f6747e = via;
                this.f6748f = obj;
            }
            if (this.f6744b.isEmpty()) {
                this.f6746d.a(this.f6747e, this.f6748f);
            }
        }
    }

    public final C2877wla a(int i, C2028kma kma) {
        C2877wla[] wlaArr = new C2877wla[this.f6743a.length];
        for (int i2 = 0; i2 < wlaArr.length; i2++) {
            wlaArr[i2] = this.f6743a[i2].a(i, kma);
        }
        return new Bla(wlaArr);
    }

    public final void a() {
        Gla gla = this.f6750h;
        if (gla == null) {
            for (C3090zla a2 : this.f6743a) {
                a2.a();
            }
            return;
        }
        throw gla;
    }

    public final void a(C2877wla wla) {
        Bla bla = (Bla) wla;
        int i = 0;
        while (true) {
            C3090zla[] zlaArr = this.f6743a;
            if (i < zlaArr.length) {
                zlaArr[i].a(bla.f6357a[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public final void a(C3084zia zia, boolean z, Cla cla) {
        this.f6746d = cla;
        int i = 0;
        while (true) {
            C3090zla[] zlaArr = this.f6743a;
            if (i < zlaArr.length) {
                zlaArr[i].a(zia, false, new Dla(this, i));
                i++;
            } else {
                return;
            }
        }
    }

    public final void b() {
        for (C3090zla b2 : this.f6743a) {
            b2.b();
        }
    }
}
