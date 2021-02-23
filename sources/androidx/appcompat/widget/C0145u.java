package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.e;
import b.a.a.a.a;
import b.a.j;

/* renamed from: androidx.appcompat.widget.u  reason: case insensitive filesystem */
public class C0145u {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f708a;

    /* renamed from: b  reason: collision with root package name */
    private ya f709b;

    /* renamed from: c  reason: collision with root package name */
    private ya f710c;

    /* renamed from: d  reason: collision with root package name */
    private ya f711d;

    public C0145u(ImageView imageView) {
        this.f708a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f711d == null) {
            this.f711d = new ya();
        }
        ya yaVar = this.f711d;
        yaVar.a();
        ColorStateList a2 = e.a(this.f708a);
        if (a2 != null) {
            yaVar.f742d = true;
            yaVar.f739a = a2;
        }
        PorterDuff.Mode b2 = e.b(this.f708a);
        if (b2 != null) {
            yaVar.f741c = true;
            yaVar.f740b = b2;
        }
        if (!yaVar.f742d && !yaVar.f741c) {
            return false;
        }
        C0142q.a(drawable, yaVar, this.f708a.getDrawableState());
        return true;
    }

    private boolean e() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f709b != null : i == 21;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Drawable drawable = this.f708a.getDrawable();
        if (drawable != null) {
            T.b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!e() || !a(drawable)) {
            ya yaVar = this.f710c;
            if (yaVar != null) {
                C0142q.a(drawable, yaVar, this.f708a.getDrawableState());
                return;
            }
            ya yaVar2 = this.f709b;
            if (yaVar2 != null) {
                C0142q.a(drawable, yaVar2, this.f708a.getDrawableState());
            }
        }
    }

    public void a(int i) {
        if (i != 0) {
            Drawable b2 = a.b(this.f708a.getContext(), i);
            if (b2 != null) {
                T.b(b2);
            }
            this.f708a.setImageDrawable(b2);
        } else {
            this.f708a.setImageDrawable((Drawable) null);
        }
        a();
    }

    /* access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        if (this.f710c == null) {
            this.f710c = new ya();
        }
        ya yaVar = this.f710c;
        yaVar.f739a = colorStateList;
        yaVar.f742d = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void a(PorterDuff.Mode mode) {
        if (this.f710c == null) {
            this.f710c = new ya();
        }
        ya yaVar = this.f710c;
        yaVar.f740b = mode;
        yaVar.f741c = true;
        a();
    }

    public void a(AttributeSet attributeSet, int i) {
        int g2;
        Aa a2 = Aa.a(this.f708a.getContext(), attributeSet, j.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.f708a.getDrawable();
            if (!(drawable != null || (g2 = a2.g(j.AppCompatImageView_srcCompat, -1)) == -1 || (drawable = a.b(this.f708a.getContext(), g2)) == null)) {
                this.f708a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                T.b(drawable);
            }
            if (a2.g(j.AppCompatImageView_tint)) {
                e.a(this.f708a, a2.a(j.AppCompatImageView_tint));
            }
            if (a2.g(j.AppCompatImageView_tintMode)) {
                e.a(this.f708a, T.a(a2.d(j.AppCompatImageView_tintMode, -1), (PorterDuff.Mode) null));
            }
        } finally {
            a2.a();
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList b() {
        ya yaVar = this.f710c;
        if (yaVar != null) {
            return yaVar.f739a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode c() {
        ya yaVar = this.f710c;
        if (yaVar != null) {
            return yaVar.f740b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return Build.VERSION.SDK_INT < 21 || !(this.f708a.getBackground() instanceof RippleDrawable);
    }
}
