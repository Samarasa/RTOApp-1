package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1389bla;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Yja {

    /* renamed from: a  reason: collision with root package name */
    private static final C1955jla f9452a = new C1316aka();

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f9453b = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: c  reason: collision with root package name */
    public int f9454c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f9455d = -1;

    private final boolean a(String str, String str2) {
        if (!"iTunSMPB".equals(str)) {
            return false;
        }
        Matcher matcher = f9453b.matcher(str2);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt(matcher.group(1), 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f9454c = parseInt;
                    this.f9455d = parseInt2;
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    public final boolean a() {
        return (this.f9454c == -1 || this.f9455d == -1) ? false : true;
    }

    public final boolean a(C1389bla bla) {
        for (int i = 0; i < bla.a(); i++) {
            C1389bla.a a2 = bla.a(i);
            if (a2 instanceof C1814hla) {
                C1814hla hla = (C1814hla) a2;
                if (a(hla.f10720c, hla.f10721d)) {
                    return true;
                }
            }
        }
        return false;
    }
}
