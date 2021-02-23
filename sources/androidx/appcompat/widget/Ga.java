package androidx.appcompat.widget;

import android.view.View;
import b.h.j.G;

class Ga extends G {

    /* renamed from: a  reason: collision with root package name */
    private boolean f459a = false;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f460b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Ha f461c;

    Ga(Ha ha, int i) {
        this.f461c = ha;
        this.f460b = i;
    }

    public void a(View view) {
        this.f459a = true;
    }

    public void b(View view) {
        if (!this.f459a) {
            this.f461c.f463a.setVisibility(this.f460b);
        }
    }

    public void c(View view) {
        this.f461c.f463a.setVisibility(0);
    }
}
