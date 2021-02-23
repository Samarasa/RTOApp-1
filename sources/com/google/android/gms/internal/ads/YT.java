package com.google.android.gms.internal.ads;

public final class YT implements WT {

    /* renamed from: a  reason: collision with root package name */
    private final String f9357a;

    public YT(String str) {
        this.f9357a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof YT)) {
            return false;
        }
        return this.f9357a.equals(((YT) obj).f9357a);
    }

    public final int hashCode() {
        return this.f9357a.hashCode();
    }

    public final String toString() {
        return this.f9357a;
    }
}
