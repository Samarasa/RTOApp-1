package c.b.b.c.l;

import android.graphics.Typeface;

public final class a extends h {

    /* renamed from: a  reason: collision with root package name */
    private final Typeface f4797a;

    /* renamed from: b  reason: collision with root package name */
    private final C0065a f4798b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4799c;

    /* renamed from: c.b.b.c.l.a$a  reason: collision with other inner class name */
    public interface C0065a {
        void a(Typeface typeface);
    }

    public a(C0065a aVar, Typeface typeface) {
        this.f4797a = typeface;
        this.f4798b = aVar;
    }

    private void a(Typeface typeface) {
        if (!this.f4799c) {
            this.f4798b.a(typeface);
        }
    }

    public void a() {
        this.f4799c = true;
    }

    public void a(int i) {
        a(this.f4797a);
    }

    public void a(Typeface typeface, boolean z) {
        a(typeface);
    }
}
