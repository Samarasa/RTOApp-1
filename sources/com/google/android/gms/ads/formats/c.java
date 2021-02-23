package com.google.android.gms.ads.formats;

import com.google.android.gms.ads.w;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f5405a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5406b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5407c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f5408d;

    /* renamed from: e  reason: collision with root package name */
    private final int f5409e;

    /* renamed from: f  reason: collision with root package name */
    private final w f5410f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f5411g;

    public static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public boolean f5412a = false;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f5413b = -1;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f5414c = 0;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public boolean f5415d = false;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public w f5416e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int f5417f = 1;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public boolean f5418g = false;

        public final a a(int i) {
            this.f5417f = i;
            return this;
        }

        public final a a(w wVar) {
            this.f5416e = wVar;
            return this;
        }

        public final a a(boolean z) {
            this.f5415d = z;
            return this;
        }

        public final c a() {
            return new c(this);
        }

        @Deprecated
        public final a b(int i) {
            this.f5413b = i;
            return this;
        }

        public final a b(boolean z) {
            this.f5412a = z;
            return this;
        }
    }

    private c(a aVar) {
        this.f5405a = aVar.f5412a;
        this.f5406b = aVar.f5413b;
        this.f5407c = aVar.f5414c;
        this.f5408d = aVar.f5415d;
        this.f5409e = aVar.f5417f;
        this.f5410f = aVar.f5416e;
        this.f5411g = aVar.f5418g;
    }

    public final int a() {
        return this.f5409e;
    }

    @Deprecated
    public final int b() {
        return this.f5406b;
    }

    public final int c() {
        return this.f5407c;
    }

    public final w d() {
        return this.f5410f;
    }

    public final boolean e() {
        return this.f5408d;
    }

    public final boolean f() {
        return this.f5405a;
    }

    public final boolean g() {
        return this.f5411g;
    }
}
