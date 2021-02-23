package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import b.a.d.b;
import b.a.j;

/* renamed from: androidx.appcompat.app.a  reason: case insensitive filesystem */
public abstract class C0094a {

    /* renamed from: androidx.appcompat.app.a$a  reason: collision with other inner class name */
    public static class C0008a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f186a;

        public C0008a(int i, int i2) {
            super(i, i2);
            this.f186a = 0;
            this.f186a = 8388627;
        }

        public C0008a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f186a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ActionBarLayout);
            this.f186a = obtainStyledAttributes.getInt(j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0008a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f186a = 0;
        }

        public C0008a(C0008a aVar) {
            super(aVar);
            this.f186a = 0;
            this.f186a = aVar.f186a;
        }
    }

    /* renamed from: androidx.appcompat.app.a$b */
    public interface b {
        void onMenuVisibilityChanged(boolean z);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.a$c */
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public b.a.d.b a(b.a aVar) {
        return null;
    }

    public void a(int i) {
    }

    public void a(Configuration configuration) {
    }

    public void a(Drawable drawable) {
    }

    public void a(CharSequence charSequence) {
    }

    public boolean a(int i, KeyEvent keyEvent) {
        return false;
    }

    public boolean a(KeyEvent keyEvent) {
        return false;
    }

    public void b(boolean z) {
    }

    public void c(boolean z) {
    }

    public abstract void d(boolean z);

    public void e(boolean z) {
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public abstract int g();

    public Context h() {
        return null;
    }

    public boolean i() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void j() {
    }

    public boolean k() {
        return false;
    }
}
