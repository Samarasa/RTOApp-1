package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.fa;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Xe  reason: case insensitive filesystem */
public final class C1168Xe implements C1516de, C1064Te {

    /* renamed from: a  reason: collision with root package name */
    private final C1090Ue f9259a;

    /* renamed from: b  reason: collision with root package name */
    private final HashSet<AbstractMap.SimpleEntry<String, C1088Uc<? super C1090Ue>>> f9260b = new HashSet<>();

    public C1168Xe(C1090Ue ue) {
        this.f9259a = ue;
    }

    public final void Q() {
        Iterator<AbstractMap.SimpleEntry<String, C1088Uc<? super C1090Ue>>> it = this.f9260b.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry next = it.next();
            String valueOf = String.valueOf(((C1088Uc) next.getValue()).toString());
            fa.f(valueOf.length() != 0 ? "Unregistering eventhandler: ".concat(valueOf) : new String("Unregistering eventhandler: "));
            this.f9259a.a((String) next.getKey(), (C1088Uc) next.getValue());
        }
        this.f9260b.clear();
    }

    public final void a(String str) {
        this.f9259a.a(str);
    }

    public final void a(String str, C1088Uc<? super C1090Ue> uc) {
        this.f9259a.a(str, uc);
        this.f9260b.remove(new AbstractMap.SimpleEntry(str, uc));
    }

    public final void a(String str, String str2) {
        C1445ce.a((C1516de) this, str, str2);
    }

    public final void a(String str, Map map) {
        C1445ce.a((C1516de) this, str, map);
    }

    public final void a(String str, JSONObject jSONObject) {
        C1445ce.b(this, str, jSONObject);
    }

    public final void b(String str, C1088Uc<? super C1090Ue> uc) {
        this.f9259a.b(str, uc);
        this.f9260b.add(new AbstractMap.SimpleEntry(str, uc));
    }

    public final void b(String str, JSONObject jSONObject) {
        C1445ce.a((C1516de) this, str, jSONObject);
    }
}
