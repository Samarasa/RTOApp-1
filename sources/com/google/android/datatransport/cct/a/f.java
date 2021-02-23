package com.google.android.datatransport.cct.a;

import java.util.List;

final class f extends p {

    /* renamed from: a  reason: collision with root package name */
    private final List<w> f5184a;

    f(List<w> list) {
        if (list != null) {
            this.f5184a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    public List<w> a() {
        return this.f5184a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            return this.f5184a.equals(((p) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f5184a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f5184a + "}";
    }
}
