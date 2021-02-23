package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

public final class WL implements JO<TL> {

    /* renamed from: a  reason: collision with root package name */
    private final PY f9133a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f9134b;

    /* renamed from: c  reason: collision with root package name */
    private final SS f9135c;

    /* renamed from: d  reason: collision with root package name */
    private final View f9136d;

    public WL(PY py, Context context, SS ss, ViewGroup viewGroup) {
        this.f9133a = py;
        this.f9134b = context;
        this.f9135c = ss;
        this.f9136d = viewGroup;
    }

    public final LY<TL> a() {
        return this.f9133a.a(new VL(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ TL b() {
        Context context = this.f9134b;
        C2462qqa qqa = this.f9135c.f8619e;
        ArrayList arrayList = new ArrayList();
        View view = this.f9136d;
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            int i = -1;
            if (parent instanceof ViewGroup) {
                i = ((ViewGroup) parent).indexOfChild(view);
            }
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", i);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new TL(context, qqa, arrayList);
    }
}
