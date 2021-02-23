package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* renamed from: com.google.android.gms.internal.ads.Yg  reason: case insensitive filesystem */
final class C1196Yg implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1144Wg f9433a;

    C1196Yg(C1144Wg wg) {
        this.f9433a = wg;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f9433a.a("Operation denied by user.");
    }
}
