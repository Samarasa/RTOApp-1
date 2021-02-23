package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.C1905j;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f5732a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f5733b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f5734c;

    public static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public boolean f5735a = true;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public boolean f5736b = false;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public boolean f5737c = false;

        public final a a(boolean z) {
            this.f5735a = z;
            return this;
        }

        public final w a() {
            return new w(this);
        }
    }

    private w(a aVar) {
        this.f5732a = aVar.f5735a;
        this.f5733b = aVar.f5736b;
        this.f5734c = aVar.f5737c;
    }

    public w(C1905j jVar) {
        this.f5732a = jVar.f10874a;
        this.f5733b = jVar.f10875b;
        this.f5734c = jVar.f10876c;
    }

    public final boolean a() {
        return this.f5734c;
    }

    public final boolean b() {
        return this.f5733b;
    }

    public final boolean c() {
        return this.f5732a;
    }
}
