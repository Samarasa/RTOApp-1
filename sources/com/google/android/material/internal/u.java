package com.google.android.material.internal;

import android.content.Context;
import android.text.TextPaint;
import c.b.b.c.l.f;
import c.b.b.c.l.h;
import java.lang.ref.WeakReference;

public class u {

    /* renamed from: a  reason: collision with root package name */
    private final TextPaint f14109a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    private final h f14110b = new t(this);

    /* renamed from: c  reason: collision with root package name */
    private float f14111c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f14112d = true;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public WeakReference<a> f14113e = new WeakReference<>((Object) null);

    /* renamed from: f  reason: collision with root package name */
    private f f14114f;

    public interface a {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public u(a aVar) {
        a(aVar);
    }

    private float a(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f14109a.measureText(charSequence, 0, charSequence.length());
    }

    public float a(String str) {
        if (!this.f14112d) {
            return this.f14111c;
        }
        this.f14111c = a((CharSequence) str);
        this.f14112d = false;
        return this.f14111c;
    }

    public f a() {
        return this.f14114f;
    }

    public void a(Context context) {
        this.f14114f.b(context, this.f14109a, this.f14110b);
    }

    public void a(f fVar, Context context) {
        if (this.f14114f != fVar) {
            this.f14114f = fVar;
            if (fVar != null) {
                fVar.c(context, this.f14109a, this.f14110b);
                a aVar = (a) this.f14113e.get();
                if (aVar != null) {
                    this.f14109a.drawableState = aVar.getState();
                }
                fVar.b(context, this.f14109a, this.f14110b);
                this.f14112d = true;
            }
            a aVar2 = (a) this.f14113e.get();
            if (aVar2 != null) {
                aVar2.a();
                aVar2.onStateChange(aVar2.getState());
            }
        }
    }

    public void a(a aVar) {
        this.f14113e = new WeakReference<>(aVar);
    }

    public void a(boolean z) {
        this.f14112d = z;
    }

    public TextPaint b() {
        return this.f14109a;
    }
}
