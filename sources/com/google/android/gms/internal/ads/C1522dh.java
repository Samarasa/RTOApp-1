package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* renamed from: com.google.android.gms.internal.ads.dh  reason: case insensitive filesystem */
final class C1522dh implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1380bh f10167a;

    C1522dh(C1380bh bhVar) {
        this.f10167a = bhVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f10167a.a("User canceled the download.");
    }
}
