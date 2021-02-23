package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import c.b.b.b.b.f;
import com.google.android.gms.common.api.a;

/* renamed from: com.google.android.gms.common.internal.l  reason: case insensitive filesystem */
public class C0556l {

    /* renamed from: a  reason: collision with root package name */
    private final SparseIntArray f5985a = new SparseIntArray();

    /* renamed from: b  reason: collision with root package name */
    private f f5986b;

    public C0556l(f fVar) {
        C0563t.a(fVar);
        this.f5986b = fVar;
    }

    public int a(Context context, a.f fVar) {
        C0563t.a(context);
        C0563t.a(fVar);
        if (!fVar.f()) {
            return 0;
        }
        int g2 = fVar.g();
        int i = this.f5985a.get(g2, -1);
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        while (true) {
            if (i2 < this.f5985a.size()) {
                int keyAt = this.f5985a.keyAt(i2);
                if (keyAt > g2 && this.f5985a.get(keyAt) == 0) {
                    i = 0;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        if (i == -1) {
            i = this.f5986b.a(context, g2);
        }
        this.f5985a.put(g2, i);
        return i;
    }

    public void a() {
        this.f5985a.clear();
    }
}
