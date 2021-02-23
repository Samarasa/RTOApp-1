package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Rc  reason: case insensitive filesystem */
final class C1010Rc implements C1088Uc<C2313on> {
    C1010Rc() {
    }

    public final /* synthetic */ void a(Object obj, Map map) {
        C2313on onVar = (C2313on) obj;
        p.c();
        DisplayMetrics a2 = oa.a((WindowManager) onVar.getContext().getSystemService("window"));
        int i = a2.widthPixels;
        int i2 = a2.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) onVar).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        onVar.a("locationReady", (Map<String, ?>) hashMap);
        C1018Rk.d("GET LOCATION COMPILED");
    }
}
