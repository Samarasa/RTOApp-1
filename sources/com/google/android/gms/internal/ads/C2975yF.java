package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.yF  reason: case insensitive filesystem */
public final class C2975yF implements _F {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f12883a = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: b  reason: collision with root package name */
    private final UE f12884b;

    /* renamed from: c  reason: collision with root package name */
    private final PY f12885c;

    /* renamed from: d  reason: collision with root package name */
    private final SS f12886d;

    /* renamed from: e  reason: collision with root package name */
    private final ScheduledExecutorService f12887e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final PG f12888f;

    C2975yF(SS ss, UE ue, PY py, ScheduledExecutorService scheduledExecutorService, PG pg) {
        this.f12886d = ss;
        this.f12884b = ue;
        this.f12885c = py;
        this.f12887e = scheduledExecutorService;
        this.f12888f = pg;
    }

    public final LY<OS> a(C2515ri riVar) {
        LY<OS> a2 = DY.a(this.f12884b.a(riVar), new BF(this), (Executor) this.f12885c);
        if (((Boolean) Qqa.e().a(F.Od)).booleanValue()) {
            a2 = DY.a(DY.a(a2, (long) ((Integer) Qqa.e().a(F.Pd)).intValue(), TimeUnit.SECONDS, this.f12887e), TimeoutException.class, AF.f6090a, (Executor) C1252_k.f9704f);
        }
        DY.a(a2, new DF(this), (Executor) C1252_k.f9704f);
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY a(InputStream inputStream) {
        return DY.a(new OS(new JS(this.f12886d), MS.a(new InputStreamReader(inputStream))));
    }
}
