package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.internal.ads.C1766hB;

public final class Iha extends C1808hia {
    private final Activity i;
    private final View j;

    public Iha(C2869wha wha, String str, String str2, C1766hB.a aVar, int i2, int i3, View view, Activity activity) {
        super(wha, str, str2, aVar, i2, 62);
        this.j = view;
        this.i = activity;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (this.j != null) {
            boolean booleanValue = ((Boolean) Qqa.e().a(F.Hb)).booleanValue();
            Object[] objArr = (Object[]) this.f10711f.invoke((Object) null, new Object[]{this.j, this.i, Boolean.valueOf(booleanValue)});
            synchronized (this.f10710e) {
                this.f10710e.i(((Long) objArr[0]).longValue());
                this.f10710e.j(((Long) objArr[1]).longValue());
                if (booleanValue) {
                    this.f10710e.a((String) objArr[2]);
                }
            }
        }
    }
}
