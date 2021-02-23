package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.e;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.jE  reason: case insensitive filesystem */
public final class C1910jE implements C1290aV {

    /* renamed from: a  reason: collision with root package name */
    private final Map<SU, Long> f10886a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final C1486dE f10887b;

    /* renamed from: c  reason: collision with root package name */
    private final e f10888c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<SU, C1840iE> f10889d = new HashMap();

    public C1910jE(C1486dE dEVar, Set<C1840iE> set, e eVar) {
        this.f10887b = dEVar;
        for (C1840iE next : set) {
            this.f10889d.put(next.f10780c, next);
        }
        this.f10888c = eVar;
    }

    private final void a(SU su, boolean z) {
        SU b2 = this.f10889d.get(su).f10779b;
        String str = z ? "s." : "f.";
        if (this.f10886a.containsKey(b2)) {
            long b3 = this.f10888c.b() - this.f10886a.get(b2).longValue();
            Map<String, String> a2 = this.f10887b.a();
            String valueOf = String.valueOf(this.f10889d.get(su).f10778a);
            String concat = valueOf.length() != 0 ? "label.".concat(valueOf) : new String("label.");
            String valueOf2 = String.valueOf(Long.toString(b3));
            a2.put(concat, valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str));
        }
    }

    public final void a(SU su, String str) {
    }

    public final void a(SU su, String str, Throwable th) {
        if (this.f10886a.containsKey(su)) {
            long b2 = this.f10888c.b() - this.f10886a.get(su).longValue();
            Map<String, String> a2 = this.f10887b.a();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(b2));
            a2.put(concat, valueOf2.length() != 0 ? "f.".concat(valueOf2) : new String("f."));
        }
        if (this.f10889d.containsKey(su)) {
            a(su, false);
        }
    }

    public final void b(SU su, String str) {
        this.f10886a.put(su, Long.valueOf(this.f10888c.b()));
    }

    public final void c(SU su, String str) {
        if (this.f10886a.containsKey(su)) {
            long b2 = this.f10888c.b() - this.f10886a.get(su).longValue();
            Map<String, String> a2 = this.f10887b.a();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(b2));
            a2.put(concat, valueOf2.length() != 0 ? "s.".concat(valueOf2) : new String("s."));
        }
        if (this.f10889d.containsKey(su)) {
            a(su, true);
        }
    }
}
