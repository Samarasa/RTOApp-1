package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.b;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.hC  reason: case insensitive filesystem */
public final class C1767hC implements Callable<VB> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final b f10640a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C2951xn f10641b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Context f10642c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C1627fE f10643d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C1701gH f10644e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final Executor f10645f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final Qba f10646g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final C1200Yk f10647h;
    /* access modifiers changed from: private */
    public final C1644fV i;

    public C1767hC(Context context, Executor executor, Qba qba, C1200Yk yk, b bVar, C2951xn xnVar, C1701gH gHVar, C1644fV fVVar, C1627fE fEVar) {
        this.f10642c = context;
        this.f10645f = executor;
        this.f10646g = qba;
        this.f10647h = yk;
        this.f10640a = bVar;
        this.f10641b = xnVar;
        this.f10644e = gHVar;
        this.i = fVVar;
        this.f10643d = fEVar;
    }

    public final /* synthetic */ Object call() {
        VB vb = new VB(this);
        vb.b();
        return vb;
    }
}
