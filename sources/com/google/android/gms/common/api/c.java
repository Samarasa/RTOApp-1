package com.google.android.gms.common.api;

import android.text.TextUtils;
import b.e.b;
import c.b.b.b.b.C0254b;
import com.google.android.gms.common.api.internal.C0522b;
import java.util.ArrayList;

public class c extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final b<C0522b<?>, C0254b> f5769a;

    public c(b<C0522b<?>, C0254b> bVar) {
        this.f5769a = bVar;
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C0522b next : this.f5769a.keySet()) {
            C0254b bVar = this.f5769a.get(next);
            if (bVar.k()) {
                z = false;
            }
            String a2 = next.a();
            String valueOf = String.valueOf(bVar);
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 2 + String.valueOf(valueOf).length());
            sb.append(a2);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
