package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import java.util.Arrays;

@TargetApi(21)
/* renamed from: com.google.android.gms.internal.ads.cja  reason: case insensitive filesystem */
public final class C1456cja {

    /* renamed from: a  reason: collision with root package name */
    private static final C1456cja f10071a = new C1456cja(new int[]{2}, 2);

    /* renamed from: b  reason: collision with root package name */
    private final int[] f10072b;

    /* renamed from: c  reason: collision with root package name */
    private final int f10073c = 2;

    private C1456cja(int[] iArr, int i) {
        this.f10072b = Arrays.copyOf(iArr, iArr.length);
        Arrays.sort(this.f10072b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1456cja)) {
            return false;
        }
        C1456cja cja = (C1456cja) obj;
        return Arrays.equals(this.f10072b, cja.f10072b) && this.f10073c == cja.f10073c;
    }

    public final int hashCode() {
        return this.f10073c + (Arrays.hashCode(this.f10072b) * 31);
    }

    public final String toString() {
        int i = this.f10073c;
        String arrays = Arrays.toString(this.f10072b);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 67);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", supportedEncodings=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
