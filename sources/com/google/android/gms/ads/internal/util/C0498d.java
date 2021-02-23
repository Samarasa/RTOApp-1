package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.internal.ads.Rpa;

@TargetApi(26)
/* renamed from: com.google.android.gms.ads.internal.util.d  reason: case insensitive filesystem */
public class C0498d extends Ba {
    public final Rpa a(Context context, TelephonyManager telephonyManager) {
        p.c();
        return oa.a(context, "android.permission.ACCESS_NETWORK_STATE") ? telephonyManager.isDataEnabled() ? Rpa.ENUM_TRUE : Rpa.ENUM_FALSE : Rpa.ENUM_FALSE;
    }
}
