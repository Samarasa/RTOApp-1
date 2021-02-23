package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.hf  reason: case insensitive filesystem */
public final class C1801hf<I, O> implements C1220Ze<I, O> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C1305af<O> f10694a;

    /* renamed from: b  reason: collision with root package name */
    private final C1246_e<I> f10695b;

    /* renamed from: c  reason: collision with root package name */
    private final C2862we f10696c;

    /* renamed from: d  reason: collision with root package name */
    private final String f10697d;

    C1801hf(C2862we weVar, String str, C1246_e<I> _eVar, C1305af<O> afVar) {
        this.f10696c = weVar;
        this.f10697d = str;
        this.f10695b = _eVar;
        this.f10694a = afVar;
    }

    /* access modifiers changed from: private */
    public final void a(C0804Je je, C1090Ue ue, I i, C1742gl<O> glVar) {
        try {
            p.c();
            String a2 = oa.a();
            C0594Bc.p.a(a2, (C1726gd) new C2155mf(this, je, glVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", a2);
            jSONObject.put("args", this.f10695b.a(i));
            ue.b(this.f10697d, jSONObject);
        } catch (Exception e2) {
            glVar.a((Throwable) e2);
            C1018Rk.b("Unable to invokeJavascript", e2);
            je.c();
        } catch (Throwable th) {
            je.c();
            throw th;
        }
    }

    public final LY<O> a(I i) {
        return b(i);
    }

    public final LY<O> b(I i) {
        C1742gl glVar = new C1742gl();
        C0804Je b2 = this.f10696c.b((Qba) null);
        b2.a(new C2013kf(this, b2, i, glVar), new C1942jf(this, glVar, b2));
        return glVar;
    }
}
