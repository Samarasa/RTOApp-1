package com.google.android.gms.internal.ads;

import java.util.Iterator;

final /* synthetic */ class QQ implements C2214nY {

    /* renamed from: a  reason: collision with root package name */
    private final NQ f8335a;

    /* renamed from: b  reason: collision with root package name */
    private final TT f8336b;

    /* renamed from: c  reason: collision with root package name */
    private final C1156Ws f8337c;

    QQ(NQ nq, TT tt, C1156Ws ws) {
        this.f8335a = nq;
        this.f8336b = tt;
        this.f8337c = ws;
    }

    public final LY a(Object obj) {
        TT tt = this.f8336b;
        C1156Ws ws = this.f8337c;
        OS os = (OS) obj;
        tt.f8780b = os;
        Iterator<C2988yS> it = os.f8088b.f7843a.iterator();
        boolean z = false;
        boolean z2 = false;
        loop0:
        while (true) {
            if (!it.hasNext()) {
                z = z2;
                break;
            }
            Iterator<String> it2 = it.next().f12914a.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!it2.next().contains("FirstPartyRenderer")) {
                        break loop0;
                    }
                    z2 = true;
                }
            }
        }
        return !z ? DY.a(null) : ws.a((LY<OS>) DY.a(os));
    }
}
