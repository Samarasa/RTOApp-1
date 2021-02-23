package com.google.android.gms.internal.ads;

final class NW extends OW {

    /* renamed from: a  reason: collision with root package name */
    private final char f7976a = ';';

    NW(char c2) {
    }

    public final boolean b(char c2) {
        return c2 == this.f7976a;
    }

    public final String toString() {
        String c2 = LW.d(this.f7976a);
        StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(c2);
        sb.append("')");
        return sb.toString();
    }
}
