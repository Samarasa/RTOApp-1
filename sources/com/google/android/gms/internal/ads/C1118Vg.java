package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;

/* renamed from: com.google.android.gms.internal.ads.Vg  reason: case insensitive filesystem */
final class C1118Vg implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1144Wg f9063a;

    C1118Vg(C1144Wg wg) {
        this.f9063a = wg;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent a2 = this.f9063a.a();
        p.c();
        oa.a(this.f9063a.f9157d, a2);
    }
}
