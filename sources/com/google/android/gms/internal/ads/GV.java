package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.ads.c.a;
import com.google.android.gms.internal.ads.C1766hB;
import java.nio.ByteBuffer;
import java.util.UUID;

final class GV implements JV {

    /* renamed from: a  reason: collision with root package name */
    private static final C1766hB f7033a = C1766hB.w();

    GV() {
    }

    public final C1766hB a() {
        return f7033a;
    }

    public final C1766hB a(Context context) {
        C1766hB.a v = C1766hB.v();
        a aVar = new a(context);
        aVar.c();
        a.C0070a b2 = aVar.b();
        String a2 = b2.a();
        if (a2 != null && a2.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(a2);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            a2 = Base64.encodeToString(bArr, 11);
        }
        if (a2 != null) {
            v.b(a2);
            v.a(b2.b());
            v.a(C1766hB.c.DEVICE_IDENTIFIER_ANDROID_AD_ID);
        }
        return (C1766hB) v.k();
    }
}
