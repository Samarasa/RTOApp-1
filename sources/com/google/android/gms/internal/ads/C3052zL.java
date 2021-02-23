package com.google.android.gms.internal.ads;

import android.net.Uri;
import c.b.b.b.c.a;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.zL  reason: case insensitive filesystem */
final /* synthetic */ class C3052zL implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final C2626tL f13035a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f13036b;

    /* renamed from: c  reason: collision with root package name */
    private final a f13037c;

    C3052zL(C2626tL tLVar, Uri uri, a aVar) {
        this.f13035a = tLVar;
        this.f13036b = uri;
        this.f13037c = aVar;
    }

    public final Object call() {
        return this.f13035a.a(this.f13036b, this.f13037c);
    }
}
