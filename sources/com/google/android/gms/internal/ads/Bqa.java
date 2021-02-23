package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.s;

public final class Bqa {

    /* renamed from: a  reason: collision with root package name */
    private final f[] f6373a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6374b;

    public Bqa(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, s.AdsAttrs);
        String string = obtainAttributes.getString(s.AdsAttrs_adSize);
        String string2 = obtainAttributes.getString(s.AdsAttrs_adSizes);
        boolean z = !TextUtils.isEmpty(string);
        boolean z2 = !TextUtils.isEmpty(string2);
        if (z && !z2) {
            this.f6373a = a(string);
        } else if (!z && z2) {
            this.f6373a = a(string2);
        } else if (z) {
            throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
        } else {
            throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
        }
        this.f6374b = obtainAttributes.getString(s.AdsAttrs_adUnitId);
        if (TextUtils.isEmpty(this.f6374b)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    private static f[] a(String str) {
        String[] split = str.split("\\s*,\\s*");
        f[] fVarArr = new f[split.length];
        for (int i = 0; i < split.length; i++) {
            String trim = split[i].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    fVarArr[i] = new f("FULL_WIDTH".equals(split2[0]) ? -1 : Integer.parseInt(split2[0]), "AUTO_HEIGHT".equals(split2[1]) ? -2 : Integer.parseInt(split2[1]));
                } catch (NumberFormatException unused) {
                    String valueOf = String.valueOf(trim);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(valueOf) : new String("Could not parse XML attribute \"adSize\": "));
                }
            } else if ("BANNER".equals(trim)) {
                fVarArr[i] = f.f5383a;
            } else if ("LARGE_BANNER".equals(trim)) {
                fVarArr[i] = f.f5385c;
            } else if ("FULL_BANNER".equals(trim)) {
                fVarArr[i] = f.f5384b;
            } else if ("LEADERBOARD".equals(trim)) {
                fVarArr[i] = f.f5386d;
            } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                fVarArr[i] = f.f5387e;
            } else if ("SMART_BANNER".equals(trim)) {
                fVarArr[i] = f.f5389g;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                fVarArr[i] = f.f5388f;
            } else if ("FLUID".equals(trim)) {
                fVarArr[i] = f.f5390h;
            } else if ("ICON".equals(trim)) {
                fVarArr[i] = f.j;
            } else {
                String valueOf2 = String.valueOf(trim);
                throw new IllegalArgumentException(valueOf2.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(valueOf2) : new String("Could not parse XML attribute \"adSize\": "));
            }
        }
        if (fVarArr.length != 0) {
            return fVarArr;
        }
        String valueOf3 = String.valueOf(str);
        throw new IllegalArgumentException(valueOf3.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(valueOf3) : new String("Could not parse XML attribute \"adSize\": "));
    }

    public final String a() {
        return this.f6374b;
    }

    public final f[] a(boolean z) {
        if (z || this.f6373a.length == 1) {
            return this.f6373a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
}
