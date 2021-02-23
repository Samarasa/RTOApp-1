package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* renamed from: com.google.android.gms.internal.ads.wF  reason: case insensitive filesystem */
final class C2833wF implements AY<OS> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C2762vF f12610a;

    C2833wF(C2762vF vFVar) {
        this.f12610a = vFVar;
    }

    public final /* synthetic */ void a(Object obj) {
        OS os = (OS) obj;
        if (((Boolean) Qqa.e().a(F.ze)).booleanValue()) {
            this.f12610a.f12473g.a(os.f8088b.f7844b.f6550e);
            this.f12610a.f12473g.a(os.f8088b.f7844b.f6551f);
        }
    }

    public final void a(Throwable th) {
        if (((Boolean) Qqa.e().a(F.ze)).booleanValue()) {
            Matcher matcher = C2762vF.f12468b.matcher(th.getMessage());
            if (matcher.matches()) {
                this.f12610a.f12473g.a(Integer.parseInt(matcher.group(1)));
            }
        }
    }
}
