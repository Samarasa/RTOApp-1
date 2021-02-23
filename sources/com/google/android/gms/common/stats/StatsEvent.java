package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.a.a;

public abstract class StatsEvent extends a implements ReflectedParcelable {
    public abstract long a();

    public abstract int b();

    public abstract long g();

    public abstract String h();

    public String toString() {
        long a2 = a();
        int b2 = b();
        long g2 = g();
        String h2 = h();
        StringBuilder sb = new StringBuilder(String.valueOf(h2).length() + 53);
        sb.append(a2);
        sb.append("\t");
        sb.append(b2);
        sb.append("\t");
        sb.append(g2);
        sb.append(h2);
        return sb.toString();
    }
}
