package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import com.google.android.gms.ads.internal.util.H;

/* renamed from: com.google.android.gms.internal.ads.Xc  reason: case insensitive filesystem */
final /* synthetic */ class C1166Xc implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final C1192Yc f9247a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f9248b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9249c;

    /* renamed from: d  reason: collision with root package name */
    private final H f9250d;

    /* renamed from: e  reason: collision with root package name */
    private final String f9251e;

    /* renamed from: f  reason: collision with root package name */
    private final Resources f9252f;

    C1166Xc(C1192Yc yc, Context context, String str, H h2, String str2, Resources resources) {
        this.f9247a = yc;
        this.f9248b = context;
        this.f9249c = str;
        this.f9250d = h2;
        this.f9251e = str2;
        this.f9252f = resources;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f9247a.a(this.f9248b, this.f9249c, this.f9250d, this.f9251e, this.f9252f, dialogInterface, i);
    }
}
