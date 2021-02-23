package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import c.b.b.a.a.e.a;
import c.b.b.a.d;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.h;
import java.util.Map;

final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    private final a f5287a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<d, h.b> f5288b;

    c(a aVar, Map<d, h.b> map) {
        if (aVar != null) {
            this.f5287a = aVar;
            if (map != null) {
                this.f5288b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    /* access modifiers changed from: package-private */
    public a b() {
        return this.f5287a;
    }

    /* access modifiers changed from: package-private */
    public Map<d, h.b> c() {
        return this.f5288b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f5287a.equals(hVar.b()) && this.f5288b.equals(hVar.c());
    }

    public int hashCode() {
        return ((this.f5287a.hashCode() ^ 1000003) * 1000003) ^ this.f5288b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f5287a + ", values=" + this.f5288b + "}";
    }
}
