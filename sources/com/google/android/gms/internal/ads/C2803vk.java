package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.util.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.internal.ads.vk  reason: case insensitive filesystem */
public final class C2803vk {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final e f12547a;

    /* renamed from: b  reason: collision with root package name */
    private final C0732Gk f12548b;

    /* renamed from: c  reason: collision with root package name */
    private final LinkedList<C2732uk> f12549c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f12550d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final String f12551e;

    /* renamed from: f  reason: collision with root package name */
    private final String f12552f;

    /* renamed from: g  reason: collision with root package name */
    private long f12553g = -1;

    /* renamed from: h  reason: collision with root package name */
    private long f12554h = -1;
    private boolean i = false;
    private long j = -1;
    private long k = 0;
    private long l = -1;
    private long m = -1;

    C2803vk(e eVar, C0732Gk gk, String str, String str2) {
        this.f12547a = eVar;
        this.f12548b = gk;
        this.f12551e = str;
        this.f12552f = str2;
        this.f12549c = new LinkedList<>();
    }

    public final Bundle a() {
        Bundle bundle;
        synchronized (this.f12550d) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.f12551e);
            bundle.putString("slotid", this.f12552f);
            bundle.putBoolean("ismediation", false);
            bundle.putLong("treq", this.l);
            bundle.putLong("tresponse", this.m);
            bundle.putLong("timp", this.f12554h);
            bundle.putLong("tload", this.j);
            bundle.putLong("pcc", this.k);
            bundle.putLong("tfetch", this.f12553g);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f12549c.iterator();
            while (it.hasNext()) {
                arrayList.add(((C2732uk) it.next()).a());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    public final void a(long j2) {
        synchronized (this.f12550d) {
            this.m = j2;
            if (this.m != -1) {
                this.f12548b.a(this);
            }
        }
    }

    public final void a(C2249nqa nqa) {
        synchronized (this.f12550d) {
            this.l = this.f12547a.b();
            this.f12548b.a(nqa, this.l);
        }
    }

    public final void a(boolean z) {
        synchronized (this.f12550d) {
            if (this.m != -1) {
                this.j = this.f12547a.b();
            }
        }
    }

    public final void b() {
        synchronized (this.f12550d) {
            if (this.m != -1 && this.f12554h == -1) {
                this.f12554h = this.f12547a.b();
                this.f12548b.a(this);
            }
            this.f12548b.a();
        }
    }

    public final void c() {
        synchronized (this.f12550d) {
            if (this.m != -1) {
                C2732uk ukVar = new C2732uk(this);
                ukVar.d();
                this.f12549c.add(ukVar);
                this.k++;
                this.f12548b.b();
                this.f12548b.a(this);
            }
        }
    }

    public final void d() {
        synchronized (this.f12550d) {
            if (this.m != -1 && !this.f12549c.isEmpty()) {
                C2732uk last = this.f12549c.getLast();
                if (last.b() == -1) {
                    last.c();
                    this.f12548b.a(this);
                }
            }
        }
    }

    public final String e() {
        return this.f12551e;
    }
}
