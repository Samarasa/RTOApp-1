package com.google.android.gms.internal.ads;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.Arrays;

public final class YW {

    /* renamed from: a  reason: collision with root package name */
    private final String f9361a;

    /* renamed from: b  reason: collision with root package name */
    private final XW f9362b;

    /* renamed from: c  reason: collision with root package name */
    private XW f9363c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f9364d;

    private YW(String str) {
        this.f9362b = new XW();
        this.f9363c = this.f9362b;
        this.f9364d = false;
        C1434cX.a(str);
        this.f9361a = str;
    }

    public final YW a(Object obj) {
        XW xw = new XW();
        this.f9363c.f9244b = xw;
        this.f9363c = xw;
        xw.f9243a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f9361a);
        sb.append('{');
        XW xw = this.f9362b.f9244b;
        String str = BuildConfig.FLAVOR;
        while (xw != null) {
            Object obj = xw.f9243a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append(deepToString, 1, deepToString.length() - 1);
            }
            xw = xw.f9244b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
