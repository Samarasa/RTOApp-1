package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<a> f14102a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private a f14103b = null;

    /* renamed from: c  reason: collision with root package name */
    ValueAnimator f14104c = null;

    /* renamed from: d  reason: collision with root package name */
    private final Animator.AnimatorListener f14105d = new r(this);

    static class a {

        /* renamed from: a  reason: collision with root package name */
        final int[] f14106a;

        /* renamed from: b  reason: collision with root package name */
        final ValueAnimator f14107b;

        a(int[] iArr, ValueAnimator valueAnimator) {
            this.f14106a = iArr;
            this.f14107b = valueAnimator;
        }
    }

    private void a(a aVar) {
        this.f14104c = aVar.f14107b;
        this.f14104c.start();
    }

    private void b() {
        ValueAnimator valueAnimator = this.f14104c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f14104c = null;
        }
    }

    public void a() {
        ValueAnimator valueAnimator = this.f14104c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f14104c = null;
        }
    }

    public void a(int[] iArr) {
        a aVar;
        int size = this.f14102a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aVar = null;
                break;
            }
            aVar = this.f14102a.get(i);
            if (StateSet.stateSetMatches(aVar.f14106a, iArr)) {
                break;
            }
            i++;
        }
        a aVar2 = this.f14103b;
        if (aVar != aVar2) {
            if (aVar2 != null) {
                b();
            }
            this.f14103b = aVar;
            if (aVar != null) {
                a(aVar);
            }
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        a aVar = new a(iArr, valueAnimator);
        valueAnimator.addListener(this.f14105d);
        this.f14102a.add(aVar);
    }
}
