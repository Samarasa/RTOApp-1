package com.google.android.gms.internal.ads;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.bX  reason: case insensitive filesystem */
final class C1363bX {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f9906a = Logger.getLogger(C1363bX.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final ZW f9907b = new a();

    /* renamed from: com.google.android.gms.internal.ads.bX$a */
    static final class a {
        private a() {
        }
    }

    private C1363bX() {
    }

    static String a(String str) {
        if (b(str)) {
            return null;
        }
        return str;
    }

    static boolean b(String str) {
        return str == null || str.isEmpty();
    }

    static String c(String str) {
        return str == null ? BuildConfig.FLAVOR : str;
    }
}
