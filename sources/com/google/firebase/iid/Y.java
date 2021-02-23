package com.google.firebase.iid;

import com.google.android.gms.common.internal.C0562s;
import com.google.android.gms.common.internal.C0563t;

final class Y {

    /* renamed from: a  reason: collision with root package name */
    private final String f14548a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final long f14549b;

    Y(String str, long j) {
        C0563t.a(str);
        this.f14548a = str;
        this.f14549b = j;
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        return this.f14548a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y = (Y) obj;
        return this.f14549b == y.f14549b && this.f14548a.equals(y.f14548a);
    }

    public final int hashCode() {
        return C0562s.a(this.f14548a, Long.valueOf(this.f14549b));
    }
}
