package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.f;
import java.util.ArrayList;
import java.util.List;

public final class XS {
    public static BS a(C2462qqa qqa) {
        return qqa.i ? new BS(-3, 0, true) : new BS(qqa.f11918e, qqa.f11915b, false);
    }

    public static BS a(List<BS> list, BS bs) {
        return list.get(0);
    }

    public static C2462qqa a(Context context, List<BS> list) {
        ArrayList arrayList = new ArrayList();
        for (BS next : list) {
            if (next.f6286c) {
                arrayList.add(f.f5390h);
            } else {
                arrayList.add(new f(next.f6284a, next.f6285b));
            }
        }
        return new C2462qqa(context, (f[]) arrayList.toArray(new f[arrayList.size()]));
    }
}
