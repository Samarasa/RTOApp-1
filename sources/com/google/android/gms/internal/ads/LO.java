package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.fa;

final /* synthetic */ class LO implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final JO f7669a;

    /* renamed from: b  reason: collision with root package name */
    private final long f7670b;

    LO(JO jo, long j) {
        this.f7669a = jo;
        this.f7670b = j;
    }

    public final void run() {
        JO jo = this.f7669a;
        long j = this.f7670b;
        String canonicalName = jo.getClass().getCanonicalName();
        long b2 = p.j().b() - j;
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 40);
        sb.append("Signal runtime : ");
        sb.append(canonicalName);
        sb.append(" = ");
        sb.append(b2);
        fa.f(sb.toString());
    }
}
