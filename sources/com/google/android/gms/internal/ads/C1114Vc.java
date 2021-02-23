package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.a;
import com.google.android.gms.common.util.f;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Vc  reason: case insensitive filesystem */
public final class C1114Vc implements C1088Uc<C2313on> {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Integer> f9054a = f.a((K[]) new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, (V[]) new Integer[]{1, 2, 3, 4, 5, 6, 7});

    /* renamed from: b  reason: collision with root package name */
    private final a f9055b;

    /* renamed from: c  reason: collision with root package name */
    private final C1170Xg f9056c;

    /* renamed from: d  reason: collision with root package name */
    private final C1946jh f9057d;

    public C1114Vc(a aVar, C1170Xg xg, C1946jh jhVar) {
        this.f9055b = aVar;
        this.f9056c = xg;
        this.f9057d = jhVar;
    }

    public final /* synthetic */ void a(Object obj, Map map) {
        a aVar;
        C2313on onVar = (C2313on) obj;
        int intValue = f9054a.get((String) map.get("a")).intValue();
        if (intValue != 5 && intValue != 7 && (aVar = this.f9055b) != null && !aVar.b()) {
            this.f9055b.a((String) null);
        } else if (intValue == 1) {
            this.f9056c.a((Map<String, String>) map);
        } else if (intValue == 3) {
            new C1380bh(onVar, map).a();
        } else if (intValue == 4) {
            new C1144Wg(onVar, map).b();
        } else if (intValue == 5) {
            new C1222Zg(onVar, map).a();
        } else if (intValue == 6) {
            this.f9056c.a(true);
        } else if (intValue != 7) {
            C1018Rk.c("Unknown MRAID command called.");
        } else {
            this.f9057d.a();
        }
    }
}
