package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.eu  reason: case insensitive filesystem */
public class C1616eu {

    /* renamed from: a  reason: collision with root package name */
    private final Context f10337a;

    /* renamed from: b  reason: collision with root package name */
    private final SS f10338b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f10339c;

    /* renamed from: d  reason: collision with root package name */
    private final String f10340d;

    /* renamed from: e  reason: collision with root package name */
    private final NS f10341e;

    /* renamed from: com.google.android.gms.internal.ads.eu$a */
    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public Context f10342a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public SS f10343b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public Bundle f10344c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public String f10345d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public NS f10346e;

        public final a a(Context context) {
            this.f10342a = context;
            return this;
        }

        public final a a(Bundle bundle) {
            this.f10344c = bundle;
            return this;
        }

        public final a a(NS ns) {
            this.f10346e = ns;
            return this;
        }

        public final a a(SS ss) {
            this.f10343b = ss;
            return this;
        }

        public final a a(String str) {
            this.f10345d = str;
            return this;
        }

        public final C1616eu a() {
            return new C1616eu(this);
        }
    }

    private C1616eu(a aVar) {
        this.f10337a = aVar.f10342a;
        this.f10338b = aVar.f10343b;
        this.f10339c = aVar.f10344c;
        this.f10340d = aVar.f10345d;
        this.f10341e = aVar.f10346e;
    }

    /* access modifiers changed from: package-private */
    public final Context a(Context context) {
        return this.f10340d != null ? context : this.f10337a;
    }

    /* access modifiers changed from: package-private */
    public final a a() {
        a aVar = new a();
        aVar.a(this.f10337a);
        aVar.a(this.f10338b);
        aVar.a(this.f10340d);
        aVar.a(this.f10339c);
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public final SS b() {
        return this.f10338b;
    }

    /* access modifiers changed from: package-private */
    public final NS c() {
        return this.f10341e;
    }

    /* access modifiers changed from: package-private */
    public final Bundle d() {
        return this.f10339c;
    }

    /* access modifiers changed from: package-private */
    public final String e() {
        return this.f10340d;
    }
}
