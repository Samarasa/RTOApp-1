package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pa  reason: case insensitive filesystem */
public class C2358pa<T> {

    /* renamed from: a  reason: collision with root package name */
    private final String f11729a;

    /* renamed from: b  reason: collision with root package name */
    private final T f11730b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11731c;

    /* JADX WARNING: type inference failed for: r3v0, types: [int, java.lang.Integer] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C2358pa(java.lang.String r1, T r2, java.lang.Integer r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.f11729a = r1
            r0.f11730b = r2
            r0.f11731c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2358pa.<init>(java.lang.String, java.lang.Object, int):void");
    }

    public static C2358pa<Double> a(String str, double d2) {
        return new C2358pa<>(str, Double.valueOf(d2), C2499ra.f11988c);
    }

    public static C2358pa<Long> a(String str, long j) {
        return new C2358pa<>(str, Long.valueOf(j), C2499ra.f11987b);
    }

    public static C2358pa<String> a(String str, String str2) {
        return new C2358pa<>(str, str2, C2499ra.f11989d);
    }

    public static C2358pa<Boolean> a(String str, boolean z) {
        return new C2358pa<>(str, Boolean.valueOf(z), C2499ra.f11986a);
    }

    public T a() {
        C1034Sa a2 = C1008Ra.a();
        if (a2 != null) {
            int i = C2287oa.f11592a[this.f11731c - 1];
            if (i == 1) {
                return a2.a(this.f11729a, ((Boolean) this.f11730b).booleanValue());
            }
            if (i == 2) {
                return a2.getLong(this.f11729a, ((Long) this.f11730b).longValue());
            }
            if (i == 3) {
                return a2.a(this.f11729a, ((Double) this.f11730b).doubleValue());
            }
            if (i == 4) {
                return a2.a(this.f11729a, (String) this.f11730b);
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException("Flag is not initialized.");
    }
}
