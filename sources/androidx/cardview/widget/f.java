package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;

class f implements h {

    /* renamed from: a  reason: collision with root package name */
    final RectF f761a = new RectF();

    f() {
    }

    private j a(Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        return new j(context.getResources(), colorStateList, f2, f3, f4);
    }

    private j j(g gVar) {
        return (j) gVar.c();
    }

    public float a(g gVar) {
        return j(gVar).f();
    }

    public void a() {
        j.f771b = new e(this);
    }

    public void a(g gVar, float f2) {
        j(gVar).a(f2);
        i(gVar);
    }

    public void a(g gVar, Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        j a2 = a(context, colorStateList, f2, f3, f4);
        a2.a(gVar.a());
        gVar.a(a2);
        i(gVar);
    }

    public void a(g gVar, ColorStateList colorStateList) {
        j(gVar).a(colorStateList);
    }

    public float b(g gVar) {
        return j(gVar).b();
    }

    public void b(g gVar, float f2) {
        j(gVar).c(f2);
    }

    public void c(g gVar) {
    }

    public void c(g gVar, float f2) {
        j(gVar).b(f2);
        i(gVar);
    }

    public float d(g gVar) {
        return j(gVar).c();
    }

    public ColorStateList e(g gVar) {
        return j(gVar).a();
    }

    public float f(g gVar) {
        return j(gVar).d();
    }

    public float g(g gVar) {
        return j(gVar).e();
    }

    public void h(g gVar) {
        j(gVar).a(gVar.a());
        i(gVar);
    }

    public void i(g gVar) {
        Rect rect = new Rect();
        j(gVar).a(rect);
        gVar.a((int) Math.ceil((double) g(gVar)), (int) Math.ceil((double) f(gVar)));
        gVar.a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
