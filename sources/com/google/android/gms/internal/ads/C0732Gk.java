package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.ha;
import com.google.android.gms.common.util.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Gk  reason: case insensitive filesystem */
public final class C0732Gk implements Mna {

    /* renamed from: a  reason: collision with root package name */
    private final Object f7070a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final ha f7071b;

    /* renamed from: c  reason: collision with root package name */
    private final C0706Fk f7072c;

    /* renamed from: d  reason: collision with root package name */
    private final C0654Dk f7073d;

    /* renamed from: e  reason: collision with root package name */
    private final HashSet<C2803vk> f7074e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    private final HashSet<C0680Ek> f7075f = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    private boolean f7076g = false;

    public C0732Gk(String str, ha haVar) {
        this.f7073d = new C0654Dk(str, haVar);
        this.f7071b = haVar;
        this.f7072c = new C0706Fk();
    }

    public final Bundle a(Context context, C0628Ck ck) {
        HashSet hashSet = new HashSet();
        synchronized (this.f7070a) {
            hashSet.addAll(this.f7074e);
            this.f7074e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.f7073d.a(context, this.f7072c.b()));
        Bundle bundle2 = new Bundle();
        Iterator<C0680Ek> it = this.f7075f.iterator();
        if (!it.hasNext()) {
            bundle.putBundle("slots", bundle2);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C2803vk) it2.next()).a());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            ck.a(hashSet);
            return bundle;
        }
        C0680Ek next = it.next();
        throw new NoSuchMethodError();
    }

    public final C2803vk a(e eVar, String str) {
        return new C2803vk(eVar, this, this.f7072c.a(), str);
    }

    public final void a() {
        synchronized (this.f7070a) {
            this.f7073d.a();
        }
    }

    public final void a(C2249nqa nqa, long j) {
        synchronized (this.f7070a) {
            this.f7073d.a(nqa, j);
        }
    }

    public final void a(C2803vk vkVar) {
        synchronized (this.f7070a) {
            this.f7074e.add(vkVar);
        }
    }

    public final void a(HashSet<C2803vk> hashSet) {
        synchronized (this.f7070a) {
            this.f7074e.addAll(hashSet);
        }
    }

    public final void a(boolean z) {
        C0654Dk dk;
        int i;
        long a2 = p.j().a();
        if (z) {
            if (a2 - this.f7071b.j() > ((Long) Qqa.e().a(F.ya)).longValue()) {
                dk = this.f7073d;
                i = -1;
            } else {
                dk = this.f7073d;
                i = this.f7071b.g();
            }
            dk.f6620d = i;
            this.f7076g = true;
            return;
        }
        this.f7071b.a(a2);
        this.f7071b.b(this.f7073d.f6620d);
    }

    public final void b() {
        synchronized (this.f7070a) {
            this.f7073d.b();
        }
    }

    public final boolean c() {
        return this.f7076g;
    }
}
