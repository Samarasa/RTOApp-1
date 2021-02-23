package com.google.firebase.components;

import c.b.d.c.a;
import c.b.d.c.b;
import java.util.Map;

final /* synthetic */ class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Map.Entry f14473a;

    /* renamed from: b  reason: collision with root package name */
    private final a f14474b;

    private t(Map.Entry entry, a aVar) {
        this.f14473a = entry;
        this.f14474b = aVar;
    }

    public static Runnable a(Map.Entry entry, a aVar) {
        return new t(entry, aVar);
    }

    public void run() {
        ((b) this.f14473a.getKey()).a(this.f14474b);
    }
}
