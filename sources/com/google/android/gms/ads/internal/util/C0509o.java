package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.gms.ads.internal.p;

/* renamed from: com.google.android.gms.ads.internal.util.o  reason: case insensitive filesystem */
final class C0509o implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C0510p f5627a;

    C0509o(C0510p pVar) {
        this.f5627a = pVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        p.c();
        oa.b(this.f5627a.f5636a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
