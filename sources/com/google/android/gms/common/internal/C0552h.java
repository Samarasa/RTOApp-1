package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import c.b.b.b.b.e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.C0524d;
import com.google.android.gms.common.api.internal.C0530j;
import com.google.android.gms.common.internal.C0547c;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.h  reason: case insensitive filesystem */
public abstract class C0552h<T extends IInterface> extends C0547c<T> implements a.f, C0553i {
    private final C0548d E;
    private final Set<Scope> F;
    private final Account G;

    @Deprecated
    protected C0552h(Context context, Looper looper, int i, C0548d dVar, f.a aVar, f.b bVar) {
        this(context, looper, i, dVar, (C0524d) aVar, (C0530j) bVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C0552h(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.C0548d r13, com.google.android.gms.common.api.internal.C0524d r14, com.google.android.gms.common.api.internal.C0530j r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.j r3 = com.google.android.gms.common.internal.C0554j.a(r10)
            c.b.b.b.b.e r4 = c.b.b.b.b.e.a()
            com.google.android.gms.common.internal.C0563t.a(r14)
            r7 = r14
            com.google.android.gms.common.api.internal.d r7 = (com.google.android.gms.common.api.internal.C0524d) r7
            com.google.android.gms.common.internal.C0563t.a(r15)
            r8 = r15
            com.google.android.gms.common.api.internal.j r8 = (com.google.android.gms.common.api.internal.C0530j) r8
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C0552h.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.d, com.google.android.gms.common.api.internal.d, com.google.android.gms.common.api.internal.j):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C0552h(Context context, Looper looper, C0554j jVar, e eVar, int i, C0548d dVar, C0524d dVar2, C0530j jVar2) {
        super(context, looper, jVar, eVar, i, a(dVar2), a(jVar2), dVar.e());
        this.E = dVar;
        this.G = dVar.a();
        Set<Scope> c2 = dVar.c();
        b(c2);
        this.F = c2;
    }

    private static C0547c.a a(C0524d dVar) {
        if (dVar == null) {
            return null;
        }
        return new z(dVar);
    }

    private static C0547c.b a(C0530j jVar) {
        if (jVar == null) {
            return null;
        }
        return new A(jVar);
    }

    private final Set<Scope> b(Set<Scope> set) {
        a(set);
        for (Scope contains : set) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return set;
    }

    /* access modifiers changed from: protected */
    public Set<Scope> a(Set<Scope> set) {
        return set;
    }

    public Set<Scope> b() {
        return i() ? this.F : Collections.emptySet();
    }

    public int g() {
        return super.g();
    }

    public final Account m() {
        return this.G;
    }

    /* access modifiers changed from: protected */
    public final Set<Scope> s() {
        return this.F;
    }
}
