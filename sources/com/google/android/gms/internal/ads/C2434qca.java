package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.C1766hB;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.qca  reason: case insensitive filesystem */
public final class C2434qca extends IX {
    private C2434qca(Context context, String str, boolean z, int i) {
        super(context, str, z, i);
    }

    public static C2434qca a(String str, Context context, boolean z) {
        return b(str, context, false, VJ.f9025a);
    }

    public static C2434qca b(String str, Context context, boolean z, int i) {
        IX.a(context, z);
        IX.a(str, context, z, i);
        return new C2434qca(context, str, z, i);
    }

    /* access modifiers changed from: protected */
    public final List<Callable<Void>> a(C2869wha wha, Context context, C1766hB.a aVar, C0615Bx bx) {
        if (wha.e() == null || !this.B) {
            return super.a(wha, context, aVar, bx);
        }
        int c2 = wha.c();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.a(wha, context, aVar, bx));
        arrayList.add(new Qha(wha, "nzsGgLmkYoH07JBds4475Hi1VD4Q7uBNBbOuNVMIAgaPK31s5yXBWpEE3pcrsbq6", "YtmG0d5ZvAZhPKacOdj22mtx44uyqECBIblkm9VYJ9w=", aVar, c2, 24));
        return arrayList;
    }
}
