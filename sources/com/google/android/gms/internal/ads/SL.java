package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.InputStream;
import java.io.InputStreamReader;

final /* synthetic */ class SL implements C2214nY {

    /* renamed from: a  reason: collision with root package name */
    private final C2515ri f8602a;

    SL(C2515ri riVar) {
        this.f8602a = riVar;
    }

    public final LY a(Object obj) {
        C2515ri riVar = this.f8602a;
        UL ul = new UL(new JsonReader(new InputStreamReader((InputStream) obj)));
        ul.a(riVar.f12015a);
        return DY.a(ul);
    }
}
