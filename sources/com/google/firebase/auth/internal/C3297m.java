package com.google.firebase.auth.internal;

import android.text.TextUtils;
import c.b.b.b.d.d.C0286w;
import c.b.b.b.d.d.ta;
import com.google.firebase.auth.F;
import com.google.firebase.auth.W;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.firebase.auth.internal.m  reason: case insensitive filesystem */
public final class C3297m {
    public static W a(ta taVar) {
        if (taVar != null && !TextUtils.isEmpty(taVar.a())) {
            return new F(taVar.b(), taVar.g(), taVar.h(), taVar.a());
        }
        return null;
    }

    public static List<W> a(List<ta> list) {
        if (list == null || list.isEmpty()) {
            return C0286w.a();
        }
        ArrayList arrayList = new ArrayList();
        for (ta a2 : list) {
            W a3 = a(a2);
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        return arrayList;
    }
}
