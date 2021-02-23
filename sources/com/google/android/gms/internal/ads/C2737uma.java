package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.uma  reason: case insensitive filesystem */
public class C2737uma extends IOException {

    /* renamed from: a  reason: collision with root package name */
    private final int f12410a;

    /* renamed from: b  reason: collision with root package name */
    private final C2241nma f12411b;

    public C2737uma(IOException iOException, C2241nma nma, int i) {
        super(iOException);
        this.f12411b = nma;
        this.f12410a = i;
    }

    public C2737uma(String str, C2241nma nma, int i) {
        super(str);
        this.f12411b = nma;
        this.f12410a = 1;
    }

    public C2737uma(String str, IOException iOException, C2241nma nma, int i) {
        super(str, iOException);
        this.f12411b = nma;
        this.f12410a = 1;
    }
}
