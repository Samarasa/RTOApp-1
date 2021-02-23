package com.google.android.gms.internal.ads;

import android.os.Build;
import com.google.android.gms.ads.internal.util.ea;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.aQ  reason: case insensitive filesystem */
final /* synthetic */ class C1285aQ implements Callable {

    /* renamed from: a  reason: collision with root package name */
    static final Callable f9781a = new C1285aQ();

    private C1285aQ() {
    }

    public final Object call() {
        HashMap hashMap = new HashMap();
        String str = (String) Qqa.e().a(F.D);
        if (str != null && !str.isEmpty()) {
            if (Build.VERSION.SDK_INT >= ((Integer) Qqa.e().a(F.E)).intValue()) {
                for (String str2 : str.split(",", -1)) {
                    hashMap.put(str2, ea.a(str2));
                }
            }
        }
        return new ZP(hashMap);
    }
}
