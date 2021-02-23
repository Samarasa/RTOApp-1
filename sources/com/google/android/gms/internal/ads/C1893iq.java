package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.iq  reason: case insensitive filesystem */
public final class C1893iq implements C2214nY<OS, OS> {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, C1823hq> f10856a;

    public C1893iq(Map<String, C1823hq> map) {
        this.f10856a = map;
    }

    public final /* synthetic */ LY a(Object obj) {
        OS os = (OS) obj;
        for (LS next : os.f8088b.f7845c) {
            if (this.f10856a.containsKey(next.f7674a)) {
                this.f10856a.get(next.f7674a).a(next.f7675b);
            }
        }
        return DY.a(os);
    }
}
