package com.google.android.gms.internal.ads;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.To  reason: case insensitive filesystem */
public class C1074To extends C1339b<String> {
    private final Object p = new Object();
    private C2720ue<String> q;

    public C1074To(int i, String str, C2720ue<String> ueVar, C1218Zc zc) {
        super(i, str, zc);
        this.q = ueVar;
    }

    /* access modifiers changed from: protected */
    public final C3073zd<String> a(Ara ara) {
        String str;
        String str2;
        try {
            byte[] bArr = ara.f6212b;
            Map<String, String> map = ara.f6213c;
            String str3 = CharEncoding.ISO_8859_1;
            if (map != null && (str2 = map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(ara.f6212b);
        }
        return C3073zd.a(str, C2594sm.a(ara));
    }

    /* access modifiers changed from: protected */
    public void c(String str) {
        C2720ue<String> ueVar;
        synchronized (this.p) {
            ueVar = this.q;
        }
        if (ueVar != null) {
            ueVar.b(str);
        }
    }
}
