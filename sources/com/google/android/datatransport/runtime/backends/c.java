package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.h;

final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    private final h.a f5258a;

    /* renamed from: b  reason: collision with root package name */
    private final long f5259b;

    c(h.a aVar, long j) {
        if (aVar != null) {
            this.f5258a = aVar;
            this.f5259b = j;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public long b() {
        return this.f5259b;
    }

    public h.a c() {
        return this.f5258a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f5258a.equals(hVar.c()) && this.f5259b == hVar.b();
    }

    public int hashCode() {
        long j = this.f5259b;
        return ((this.f5258a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f5258a + ", nextRequestWaitMillis=" + this.f5259b + "}";
    }
}
