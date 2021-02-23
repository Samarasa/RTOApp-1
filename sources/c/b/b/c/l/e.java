package c.b.b.c.l;

import android.graphics.Typeface;
import android.text.TextPaint;

class e extends h {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TextPaint f4802a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ h f4803b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ f f4804c;

    e(f fVar, TextPaint textPaint, h hVar) {
        this.f4804c = fVar;
        this.f4802a = textPaint;
        this.f4803b = hVar;
    }

    public void a(int i) {
        this.f4803b.a(i);
    }

    public void a(Typeface typeface, boolean z) {
        this.f4804c.a(this.f4802a, typeface);
        this.f4803b.a(typeface, z);
    }
}
