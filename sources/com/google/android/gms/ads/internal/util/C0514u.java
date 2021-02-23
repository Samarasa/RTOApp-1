package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.ads.internal.util.u  reason: case insensitive filesystem */
public final class C0514u {

    /* renamed from: a  reason: collision with root package name */
    private final String[] f5652a;

    /* renamed from: b  reason: collision with root package name */
    private final double[] f5653b;

    /* renamed from: c  reason: collision with root package name */
    private final double[] f5654c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f5655d;

    /* renamed from: e  reason: collision with root package name */
    private int f5656e;

    private C0514u(C0519z zVar) {
        int size = zVar.f5668b.size();
        this.f5652a = (String[]) zVar.f5667a.toArray(new String[size]);
        this.f5653b = a((List<Double>) zVar.f5668b);
        this.f5654c = a((List<Double>) zVar.f5669c);
        this.f5655d = new int[size];
        this.f5656e = 0;
    }

    private static double[] a(List<Double> list) {
        double[] dArr = new double[list.size()];
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = list.get(i).doubleValue();
        }
        return dArr;
    }

    public final List<C0516w> a() {
        ArrayList arrayList = new ArrayList(this.f5652a.length);
        int i = 0;
        while (true) {
            String[] strArr = this.f5652a;
            if (i >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i];
            double d2 = this.f5654c[i];
            double d3 = this.f5653b[i];
            int[] iArr = this.f5655d;
            double d4 = (double) iArr[i];
            double d5 = (double) this.f5656e;
            Double.isNaN(d4);
            Double.isNaN(d5);
            arrayList.add(new C0516w(str, d2, d3, d4 / d5, iArr[i]));
            i++;
        }
    }

    public final void a(double d2) {
        this.f5656e++;
        int i = 0;
        while (true) {
            double[] dArr = this.f5654c;
            if (i < dArr.length) {
                if (dArr[i] <= d2 && d2 < this.f5653b[i]) {
                    int[] iArr = this.f5655d;
                    iArr[i] = iArr[i] + 1;
                }
                if (d2 >= this.f5654c[i]) {
                    i++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
