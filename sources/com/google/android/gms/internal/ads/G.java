package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.ArrayList;
import java.util.List;

public final class G {
    static List<String> a() {
        ArrayList arrayList = new ArrayList();
        a(arrayList, C2358pa.a("gad:dynamite_module:experiment_id", BuildConfig.FLAVOR));
        a(arrayList, C0592Ba.f6304a);
        a(arrayList, C0592Ba.f6305b);
        a(arrayList, C0592Ba.f6306c);
        a(arrayList, C0592Ba.f6307d);
        a(arrayList, C0592Ba.f6308e);
        a(arrayList, C0592Ba.k);
        a(arrayList, C0592Ba.f6309f);
        a(arrayList, C0592Ba.f6310g);
        a(arrayList, C0592Ba.f6311h);
        a(arrayList, C0592Ba.i);
        a(arrayList, C0592Ba.j);
        return arrayList;
    }

    private static void a(List<String> list, C2358pa<String> paVar) {
        String a2 = paVar.a();
        if (!TextUtils.isEmpty(a2)) {
            list.add(a2);
        }
    }

    static List<String> b() {
        ArrayList arrayList = new ArrayList();
        a(arrayList, C0852La.f7685a);
        return arrayList;
    }
}
