package com.google.android.gms.internal.ads;

import java.util.Map;

final class Mfa implements Comparable<Mfa>, Map.Entry<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final K f7870a;

    /* renamed from: b  reason: collision with root package name */
    private V f7871b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Hfa f7872c;

    Mfa(Hfa hfa, K k, V v) {
        this.f7872c = hfa;
        this.f7870a = k;
        this.f7871b = v;
    }

    Mfa(Hfa hfa, Map.Entry<K, V> entry) {
        this(hfa, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((Mfa) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return a(this.f7870a, entry.getKey()) && a(this.f7871b, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f7870a;
    }

    public final V getValue() {
        return this.f7871b;
    }

    public final int hashCode() {
        K k = this.f7870a;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.f7871b;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    public final V setValue(V v) {
        this.f7872c.f();
        V v2 = this.f7871b;
        this.f7871b = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f7870a);
        String valueOf2 = String.valueOf(this.f7871b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
