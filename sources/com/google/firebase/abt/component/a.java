package com.google.firebase.abt.component;

import android.content.Context;
import c.b.d.a.c;
import java.util.HashMap;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, c> f14218a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Context f14219b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.firebase.analytics.a.a f14220c;

    protected a(Context context, com.google.firebase.analytics.a.a aVar) {
        this.f14219b = context;
        this.f14220c = aVar;
    }

    /* access modifiers changed from: protected */
    public c a(String str) {
        return new c(this.f14219b, this.f14220c, str);
    }

    public synchronized c b(String str) {
        if (!this.f14218a.containsKey(str)) {
            this.f14218a.put(str, a(str));
        }
        return this.f14218a.get(str);
    }
}
