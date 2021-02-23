package com.google.android.gms.internal.ads;

import android.util.Log;

public final class Lga extends Oga {

    /* renamed from: a  reason: collision with root package name */
    private String f7703a;

    public Lga(String str) {
        this.f7703a = str;
    }

    public final void a(String str) {
        String str2 = this.f7703a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
