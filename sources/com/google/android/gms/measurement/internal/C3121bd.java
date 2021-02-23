package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* renamed from: com.google.android.gms.measurement.internal.bd  reason: case insensitive filesystem */
final class C3121bd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f13512a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Uri f13513b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f13514c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f13515d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C3127cd f13516e;

    C3121bd(C3127cd cdVar, boolean z, Uri uri, String str, String str2) {
        this.f13516e = cdVar;
        this.f13512a = z;
        this.f13513b = uri;
        this.f13514c = str;
        this.f13515d = str2;
    }

    public final void run() {
        this.f13516e.a(this.f13512a, this.f13513b, this.f13514c, this.f13515d);
    }
}
