package com.google.android.material.picker;

import android.widget.BaseAdapter;
import java.util.Calendar;

class d extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    static final int f14134a = Calendar.getInstance().getMaximum(4);

    /* renamed from: b  reason: collision with root package name */
    private final c f14135b;

    /* renamed from: c  reason: collision with root package name */
    final a<?> f14136c;

    /* access modifiers changed from: package-private */
    public int a() {
        return this.f14135b.a();
    }

    /* access modifiers changed from: package-private */
    public int a(int i) {
        return (i - this.f14135b.a()) + 1;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return (this.f14135b.a() + this.f14135b.f14133g) - 1;
    }

    public int getCount() {
        return this.f14135b.f14132f * f14134a;
    }

    public Calendar getItem(int i) {
        if (i < this.f14135b.a() || i > b()) {
            return null;
        }
        return this.f14135b.a(a(i));
    }

    public long getItemId(int i) {
        return (long) (i / this.f14135b.f14132f);
    }

    /* JADX WARNING: type inference failed for: r4v10, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.TextView getView(int r3, android.view.View r4, android.view.ViewGroup r5) {
        /*
            r2 = this;
            r0 = r4
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r4 != 0) goto L_0x0017
            android.content.Context r4 = r5.getContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            int r0 = c.b.b.c.h.mtrl_calendar_day
            android.view.View r4 = r4.inflate(r0, r5, r1)
            r0 = r4
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0017:
            int r4 = r2.a()
            int r4 = r3 - r4
            if (r4 < 0) goto L_0x0038
            com.google.android.material.picker.c r5 = r2.f14135b
            int r5 = r5.f14133g
            if (r4 < r5) goto L_0x0026
            goto L_0x0038
        L_0x0026:
            int r4 = r4 + 1
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r0.setText(r4)
            com.google.android.material.picker.c r4 = r2.f14135b
            r0.setTag(r4)
            r0.setVisibility(r1)
            goto L_0x003c
        L_0x0038:
            r4 = 4
            r0.setVisibility(r4)
        L_0x003c:
            java.util.Calendar r3 = r2.getItem((int) r3)
            if (r3 == 0) goto L_0x0047
            com.google.android.material.picker.a<?> r4 = r2.f14136c
            r4.a((android.widget.TextView) r0, (java.util.Calendar) r3)
        L_0x0047:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.picker.d.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }
}
