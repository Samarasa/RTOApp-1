package com.google.firebase.remoteconfig;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f14785a;

    /* renamed from: b  reason: collision with root package name */
    private final long f14786b;

    /* renamed from: c  reason: collision with root package name */
    private final long f14787c;

    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public boolean f14788a = false;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public long f14789b = 60;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public long f14790c = com.google.firebase.remoteconfig.internal.l.f14749a;

        public a a(long j) {
            if (j >= 0) {
                this.f14790c = j;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j + " is an invalid argument");
        }

        public l a() {
            return new l(this);
        }
    }

    private l(a aVar) {
        this.f14785a = aVar.f14788a;
        this.f14786b = aVar.f14789b;
        this.f14787c = aVar.f14790c;
    }

    public long a() {
        return this.f14786b;
    }

    public long b() {
        return this.f14787c;
    }

    @Deprecated
    public boolean c() {
        return this.f14785a;
    }
}
