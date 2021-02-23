package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.ads.internal.util.z  reason: case insensitive filesystem */
public final class C0519z {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f5667a = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final List<Double> f5668b = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final List<Double> f5669c = new ArrayList();

    public final C0514u a() {
        return new C0514u(this);
    }

    public final C0519z a(String str, double d2, double d3) {
        int i = 0;
        while (i < this.f5667a.size()) {
            double doubleValue = this.f5669c.get(i).doubleValue();
            double doubleValue2 = this.f5668b.get(i).doubleValue();
            if (d2 < doubleValue || (doubleValue == d2 && d3 < doubleValue2)) {
                break;
            }
            i++;
        }
        this.f5667a.add(i, str);
        this.f5669c.add(i, Double.valueOf(d2));
        this.f5668b.add(i, Double.valueOf(d3));
        return this;
    }
}
