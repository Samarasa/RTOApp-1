package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads._q  reason: case insensitive filesystem */
public final class C1258_q {

    /* renamed from: a  reason: collision with root package name */
    private final C1627fE f9735a;

    /* renamed from: b  reason: collision with root package name */
    private final OS f9736b;

    public C1258_q(C1627fE fEVar, OS os) {
        this.f9735a = fEVar;
        this.f9736b = os;
    }

    public final void a(long j, int i) {
        C1556eE a2 = this.f9735a.a();
        a2.a(this.f9736b.f8088b.f7844b);
        a2.a("action", "ad_closed");
        a2.a("show_time", String.valueOf(j));
        a2.a("ad_format", "app_open_ad");
        String str = "u";
        switch (C1232Zq.f9593a[i - 1]) {
            case 1:
                str = "bb";
                break;
            case 2:
                str = "h";
                break;
            case 3:
                str = "cc";
                break;
            case 4:
                str = "ac";
                break;
            case 5:
                str = "cb";
                break;
        }
        a2.a("acr", str);
        a2.a();
    }
}
