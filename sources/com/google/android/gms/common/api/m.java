package com.google.android.gms.common.api;

import c.b.b.b.b.d;

public final class m extends UnsupportedOperationException {

    /* renamed from: a  reason: collision with root package name */
    private final d f5896a;

    public m(d dVar) {
        this.f5896a = dVar;
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.f5896a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
