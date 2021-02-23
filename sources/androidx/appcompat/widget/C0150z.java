package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.core.widget.k;
import b.a.a;
import b.h.j.t;

/* renamed from: androidx.appcompat.widget.z  reason: case insensitive filesystem */
public class C0150z extends RadioButton implements k, t {

    /* renamed from: a  reason: collision with root package name */
    private final C0138o f743a;

    /* renamed from: b  reason: collision with root package name */
    private final C0130k f744b;

    /* renamed from: c  reason: collision with root package name */
    private final M f745c;

    public C0150z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.radioButtonStyle);
    }

    public C0150z(Context context, AttributeSet attributeSet, int i) {
        super(xa.a(context), attributeSet, i);
        this.f743a = new C0138o(this);
        this.f743a.a(attributeSet, i);
        this.f744b = new C0130k(this);
        this.f744b.a(attributeSet, i);
        this.f745c = new M(this);
        this.f745c.a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0130k kVar = this.f744b;
        if (kVar != null) {
            kVar.a();
        }
        M m = this.f745c;
        if (m != null) {
            m.a();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0138o oVar = this.f743a;
        return oVar != null ? oVar.a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0130k kVar = this.f744b;
        if (kVar != null) {
            return kVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0130k kVar = this.f744b;
        if (kVar != null) {
            return kVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0138o oVar = this.f743a;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0138o oVar = this.f743a;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0130k kVar = this.f744b;
        if (kVar != null) {
            kVar.a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0130k kVar = this.f744b;
        if (kVar != null) {
            kVar.a(i);
        }
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(b.a.a.a.a.b(getContext(), i));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0138o oVar = this.f743a;
        if (oVar != null) {
            oVar.d();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0130k kVar = this.f744b;
        if (kVar != null) {
            kVar.b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0130k kVar = this.f744b;
        if (kVar != null) {
            kVar.a(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0138o oVar = this.f743a;
        if (oVar != null) {
            oVar.a(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0138o oVar = this.f743a;
        if (oVar != null) {
            oVar.a(mode);
        }
    }
}
