package com.google.firebase.remoteconfig.internal;

import c.b.b.b.g.C0468a;
import c.b.b.b.g.i;
import com.google.firebase.remoteconfig.internal.l;
import java.util.Date;

final /* synthetic */ class j implements C0468a {

    /* renamed from: a  reason: collision with root package name */
    private final l f14746a;

    /* renamed from: b  reason: collision with root package name */
    private final Date f14747b;

    private j(l lVar, Date date) {
        this.f14746a = lVar;
        this.f14747b = date;
    }

    public static C0468a a(l lVar, Date date) {
        return new j(lVar, date);
    }

    public Object a(i iVar) {
        i unused = this.f14746a.a((i<l.a>) iVar, this.f14747b);
        return iVar;
    }
}
