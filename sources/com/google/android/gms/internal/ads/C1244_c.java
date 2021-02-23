package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.DialogInterface;

/* renamed from: com.google.android.gms.internal.ads._c  reason: case insensitive filesystem */
final /* synthetic */ class C1244_c implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    private final C1192Yc f9670a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9671b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f9672c;

    C1244_c(C1192Yc yc, String str, Context context) {
        this.f9670a = yc;
        this.f9671b = str;
        this.f9672c = context;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f9670a.a(this.f9671b, this.f9672c, dialogInterface);
    }
}
