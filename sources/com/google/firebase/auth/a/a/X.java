package com.google.firebase.auth.a.a;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.C0562s;
import com.google.android.gms.common.internal.C0563t;

public final class X extends C3255d implements a.d.c {

    /* renamed from: b  reason: collision with root package name */
    private final String f14295b;

    private X(String str) {
        C0563t.a(str, (Object) "A valid API key must be provided");
        this.f14295b = str;
    }

    /* synthetic */ X(String str, Y y) {
        this(str);
    }

    public final /* synthetic */ Object clone() {
        return new aa(this.f14295b).a();
    }

    public final /* synthetic */ C3255d e() {
        return (X) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        return C0562s.a(this.f14295b, ((X) obj).f14295b);
    }

    public final String f() {
        return this.f14295b;
    }

    public final int hashCode() {
        return C0562s.a(this.f14295b);
    }
}
