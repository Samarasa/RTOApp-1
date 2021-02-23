package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1766hB;
import java.util.List;

public final class Yha extends C1808hia {
    private List<Long> i = null;

    public Yha(C2869wha wha, String str, String str2, C1766hB.a aVar, int i2, int i3) {
        super(wha, str, str2, aVar, i2, 31);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.f10710e.x(-1);
        this.f10710e.y(-1);
        if (this.i == null) {
            this.i = (List) this.f10711f.invoke((Object) null, new Object[]{this.f10707b.a()});
        }
        List<Long> list = this.i;
        if (list != null && list.size() == 2) {
            synchronized (this.f10710e) {
                this.f10710e.x(this.i.get(0).longValue());
                this.f10710e.y(this.i.get(1).longValue());
            }
        }
    }
}
