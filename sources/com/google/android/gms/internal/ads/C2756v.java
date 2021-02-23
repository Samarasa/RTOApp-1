package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.v  reason: case insensitive filesystem */
public final class C2756v {

    /* renamed from: a  reason: collision with root package name */
    private final Collection<C2331p<?>> f12457a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final Collection<C2331p<String>> f12458b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final Collection<C2331p<String>> f12459c = new ArrayList();

    public final List<String> a() {
        ArrayList arrayList = new ArrayList();
        for (C2331p<String> a2 : this.f12458b) {
            String str = (String) Qqa.e().a(a2);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(G.a());
        return arrayList;
    }

    public final void a(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (C2331p next : this.f12457a) {
            if (next.b() == 1) {
                next.a(editor, next.a(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            C1018Rk.b("Flag Json is null.");
        }
    }

    public final void a(C2331p pVar) {
        this.f12457a.add(pVar);
    }

    public final List<String> b() {
        List<String> a2 = a();
        for (C2331p<String> a3 : this.f12459c) {
            String str = (String) Qqa.e().a(a3);
            if (!TextUtils.isEmpty(str)) {
                a2.add(str);
            }
        }
        a2.addAll(G.b());
        return a2;
    }

    public final void b(C2331p<String> pVar) {
        this.f12458b.add(pVar);
    }

    public final void c(C2331p<String> pVar) {
        this.f12459c.add(pVar);
    }
}
