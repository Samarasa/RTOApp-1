package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.i;
import com.google.android.gms.common.internal.C0563t;
import java.util.ArrayList;

public final class US {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public C2249nqa f8900a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public C2462qqa f8901b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public C2747ura f8902c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public String f8903d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public C1905j f8904e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f8905f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<String> f8906g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<String> f8907h;
    /* access modifiers changed from: private */
    public C1368bb i;
    /* access modifiers changed from: private */
    public C3100zqa j;
    /* access modifiers changed from: private */
    public i k;
    /* access modifiers changed from: private */
    public C2322ora l;
    /* access modifiers changed from: private */
    public int m = 1;
    /* access modifiers changed from: private */
    public C0855Ld n;
    /* access modifiers changed from: private */
    public HS o = new HS();
    /* access modifiers changed from: private */
    public boolean p = false;

    public final US a(int i2) {
        this.m = i2;
        return this;
    }

    public final US a(i iVar) {
        this.k = iVar;
        if (iVar != null) {
            this.f8905f = iVar.g();
            this.l = iVar.h();
        }
        return this;
    }

    public final US a(C0855Ld ld) {
        this.n = ld;
        this.f8904e = new C1905j(false, true, false);
        return this;
    }

    public final US a(SS ss) {
        this.o.a(ss.n);
        this.f8900a = ss.f8618d;
        this.f8901b = ss.f8619e;
        this.f8902c = ss.f8615a;
        this.f8903d = ss.f8620f;
        this.f8904e = ss.f8616b;
        this.f8906g = ss.f8621g;
        this.f8907h = ss.f8622h;
        this.i = ss.i;
        this.j = ss.j;
        a(ss.l);
        this.p = ss.o;
        return this;
    }

    public final US a(C1368bb bbVar) {
        this.i = bbVar;
        return this;
    }

    public final US a(C1905j jVar) {
        this.f8904e = jVar;
        return this;
    }

    public final US a(C2249nqa nqa) {
        this.f8900a = nqa;
        return this;
    }

    public final US a(C2462qqa qqa) {
        this.f8901b = qqa;
        return this;
    }

    public final US a(C2747ura ura) {
        this.f8902c = ura;
        return this;
    }

    public final US a(C3100zqa zqa) {
        this.j = zqa;
        return this;
    }

    public final US a(String str) {
        this.f8903d = str;
        return this;
    }

    public final US a(ArrayList<String> arrayList) {
        this.f8906g = arrayList;
        return this;
    }

    public final US a(boolean z) {
        this.p = z;
        return this;
    }

    public final C2249nqa a() {
        return this.f8900a;
    }

    public final US b(ArrayList<String> arrayList) {
        this.f8907h = arrayList;
        return this;
    }

    public final US b(boolean z) {
        this.f8905f = z;
        return this;
    }

    public final String b() {
        return this.f8903d;
    }

    public final HS c() {
        return this.o;
    }

    public final SS d() {
        C0563t.a(this.f8903d, (Object) "ad unit must not be null");
        C0563t.a(this.f8901b, (Object) "ad size must not be null");
        C0563t.a(this.f8900a, (Object) "ad request must not be null");
        return new SS(this);
    }

    public final boolean e() {
        return this.p;
    }

    public final C2462qqa f() {
        return this.f8901b;
    }
}
