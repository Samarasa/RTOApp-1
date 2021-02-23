package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import c.b.b.a.d;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.e;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class h {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private c.b.b.a.a.e.a f5300a;

        /* renamed from: b  reason: collision with root package name */
        private Map<d, b> f5301b = new HashMap();

        public a a(c.b.b.a.a.e.a aVar) {
            this.f5300a = aVar;
            return this;
        }

        public a a(d dVar, b bVar) {
            this.f5301b.put(dVar, bVar);
            return this;
        }

        public h a() {
            if (this.f5300a == null) {
                throw new NullPointerException("missing required property: clock");
            } else if (this.f5301b.keySet().size() >= d.values().length) {
                Map<d, b> map = this.f5301b;
                this.f5301b = new HashMap();
                return h.a(this.f5300a, map);
            } else {
                throw new IllegalStateException("Not all priorities have been configured");
            }
        }
    }

    public static abstract class b {

        public static abstract class a {
            public abstract a a(long j);

            public abstract a a(Set<c> set);

            public abstract b a();

            public abstract a b(long j);
        }

        public static a a() {
            e.a aVar = new e.a();
            aVar.a((Set<c>) Collections.emptySet());
            return aVar;
        }

        /* access modifiers changed from: package-private */
        public abstract long b();

        /* access modifiers changed from: package-private */
        public abstract Set<c> c();

        /* access modifiers changed from: package-private */
        public abstract long d();
    }

    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public static a a() {
        return new a();
    }

    public static h a(c.b.b.a.a.e.a aVar) {
        a a2 = a();
        d dVar = d.DEFAULT;
        b.a a3 = b.a();
        a3.a(30000);
        a3.b(86400000);
        a2.a(dVar, a3.a());
        d dVar2 = d.HIGHEST;
        b.a a4 = b.a();
        a4.a(1000);
        a4.b(86400000);
        a2.a(dVar2, a4.a());
        d dVar3 = d.VERY_LOW;
        b.a a5 = b.a();
        a5.a(86400000);
        a5.b(86400000);
        a5.a((Set<c>) a((T[]) new c[]{c.NETWORK_UNMETERED, c.DEVICE_IDLE}));
        a2.a(dVar3, a5.a());
        a2.a(aVar);
        return a2.a();
    }

    static h a(c.b.b.a.a.e.a aVar, Map<d, b> map) {
        return new c(aVar, map);
    }

    private static <T> Set<T> a(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    private void a(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public long a(d dVar, long j, int i) {
        long a2 = j - b().a();
        b bVar = c().get(dVar);
        return Math.min(Math.max(((long) Math.pow(2.0d, (double) (i - 1))) * bVar.b(), a2), bVar.d());
    }

    public JobInfo.Builder a(JobInfo.Builder builder, d dVar, long j, int i) {
        builder.setMinimumLatency(a(dVar, j, i));
        a(builder, c().get(dVar).c());
        return builder;
    }

    /* access modifiers changed from: package-private */
    public abstract c.b.b.a.a.e.a b();

    /* access modifiers changed from: package-private */
    public abstract Map<d, b> c();
}
