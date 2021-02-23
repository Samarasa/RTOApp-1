package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.vF  reason: case insensitive filesystem */
public final class C2762vF extends C2620tF {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f12468b = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: c  reason: collision with root package name */
    private final UE f12469c;

    /* renamed from: d  reason: collision with root package name */
    private final PY f12470d;

    /* renamed from: e  reason: collision with root package name */
    private final SS f12471e;

    /* renamed from: f  reason: collision with root package name */
    private final ScheduledExecutorService f12472f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final PG f12473g;

    C2762vF(C0769Hv hv, SS ss, UE ue, PY py, ScheduledExecutorService scheduledExecutorService, PG pg) {
        super(hv);
        this.f12471e = ss;
        this.f12469c = ue;
        this.f12470d = py;
        this.f12472f = scheduledExecutorService;
        this.f12473g = pg;
    }

    public final LY<OS> a(C2515ri riVar) {
        LY<OS> a2 = DY.a(this.f12469c.a(riVar), new C2691uF(this), (Executor) this.f12470d);
        if (((Boolean) Qqa.e().a(F.Od)).booleanValue()) {
            a2 = DY.a(DY.a(a2, (long) ((Integer) Qqa.e().a(F.Pd)).intValue(), TimeUnit.SECONDS, this.f12472f), TimeoutException.class, C2904xF.f12734a, (Executor) C1252_k.f9704f);
        }
        DY.a(a2, new C2833wF(this), (Executor) C1252_k.f9704f);
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY a(InputStream inputStream) {
        return DY.a(new OS(new JS(this.f12471e), MS.a(new InputStreamReader(inputStream))));
    }
}
