package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;

/* renamed from: com.google.android.gms.ads.internal.util.j  reason: case insensitive filesystem */
final /* synthetic */ class C0504j implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final C0502h f5599a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5600b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5601c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5602d;

    C0504j(C0502h hVar, int i, int i2, int i3) {
        this.f5599a = hVar;
        this.f5600b = i;
        this.f5601c = i2;
        this.f5602d = i3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f5599a.a(this.f5600b, this.f5601c, this.f5602d, dialogInterface, i);
    }
}
