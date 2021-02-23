package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.p;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.Bi  reason: case insensitive filesystem */
final class C0600Bi implements Callable<C2870wi> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Context f6339a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C3012yi f6340b;

    C0600Bi(C3012yi yiVar, Context context) {
        this.f6340b = yiVar;
        this.f6339a = context;
    }

    public final /* synthetic */ Object call() {
        C2870wi wiVar;
        C0574Ai ai = (C0574Ai) this.f6340b.f12952a.get(this.f6339a);
        if (ai != null) {
            if (!(ai.f6161a + C2783va.f12507a.a().longValue() < p.j().a())) {
                wiVar = new C3083zi(this.f6339a, ai.f6162b).a();
                this.f6340b.f12952a.put(this.f6339a, new C0574Ai(this.f6340b, wiVar));
                return wiVar;
            }
        }
        wiVar = new C3083zi(this.f6339a).a();
        this.f6340b.f12952a.put(this.f6339a, new C0574Ai(this.f6340b, wiVar));
        return wiVar;
    }
}
