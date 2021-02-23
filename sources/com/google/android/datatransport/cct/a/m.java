package com.google.android.datatransport.cct.a;

final class m extends y {

    /* renamed from: a  reason: collision with root package name */
    private final long f5217a;

    m(long j) {
        this.f5217a = j;
    }

    public long a() {
        return this.f5217a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof y) && this.f5217a == ((y) obj).a();
    }

    public int hashCode() {
        long j = this.f5217a;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f5217a + "}";
    }
}
