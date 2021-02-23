package b.q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import b.h.j.y;
import b.q.E;

/* renamed from: b.q.o  reason: case insensitive filesystem */
public class C0218o extends ha {

    /* renamed from: b.q.o$a */
    private static class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private final View f2784a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f2785b = false;

        a(View view) {
            this.f2784a = view;
        }

        public void onAnimationEnd(Animator animator) {
            ba.a(this.f2784a, 1.0f);
            if (this.f2785b) {
                this.f2784a.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (y.w(this.f2784a) && this.f2784a.getLayerType() == 0) {
                this.f2785b = true;
                this.f2784a.setLayerType(2, (Paint) null);
            }
        }
    }

    public C0218o(int i) {
        a(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = (java.lang.Float) r1.f2704a.get("android:fade:transitionAlpha");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float a(b.q.M r1, float r2) {
        /*
            if (r1 == 0) goto L_0x0012
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f2704a
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0012
            float r2 = r1.floatValue()
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.q.C0218o.a(b.q.M, float):float");
    }

    private Animator a(View view, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        ba.a(view, f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, ba.f2729d, new float[]{f3});
        ofFloat.addListener(new a(view));
        a((E.c) new C0217n(this, view));
        return ofFloat;
    }

    public Animator a(ViewGroup viewGroup, View view, M m, M m2) {
        float f2 = 0.0f;
        float a2 = a(m, 0.0f);
        if (a2 != 1.0f) {
            f2 = a2;
        }
        return a(view, f2, 1.0f);
    }

    public Animator b(ViewGroup viewGroup, View view, M m, M m2) {
        ba.e(view);
        return a(view, a(m, 1.0f), 0.0f);
    }

    public void c(M m) {
        super.c(m);
        m.f2704a.put("android:fade:transitionAlpha", Float.valueOf(ba.c(m.f2705b)));
    }
}
