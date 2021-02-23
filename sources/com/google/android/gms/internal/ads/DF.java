package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

final class DF implements AY<OS> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C2975yF f6510a;

    DF(C2975yF yFVar) {
        this.f6510a = yFVar;
    }

    public final /* synthetic */ void a(Object obj) {
        OS os = (OS) obj;
        if (((Boolean) Qqa.e().a(F.ze)).booleanValue()) {
            this.f6510a.f12888f.a(os.f8088b.f7844b.f6550e);
            this.f6510a.f12888f.a(os.f8088b.f7844b.f6551f);
        }
    }

    public final void a(Throwable th) {
        if (((Boolean) Qqa.e().a(F.ze)).booleanValue()) {
            Matcher matcher = C2975yF.f12883a.matcher(th.getMessage());
            if (matcher.matches()) {
                this.f6510a.f12888f.a(Integer.parseInt(matcher.group(1)));
            }
        }
    }
}
