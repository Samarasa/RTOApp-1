package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.m;
import b.h.j.t;

/* renamed from: androidx.appcompat.widget.v  reason: case insensitive filesystem */
public class C0146v extends ImageView implements t, m {

    /* renamed from: a  reason: collision with root package name */
    private final C0130k f717a;

    /* renamed from: b  reason: collision with root package name */
    private final C0145u f718b;

    public C0146v(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0146v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0146v(Context context, AttributeSet attributeSet, int i) {
        super(xa.a(context), attributeSet, i);
        this.f717a = new C0130k(this);
        this.f717a.a(attributeSet, i);
        this.f718b = new C0145u(this);
        this.f718b.a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0130k kVar = this.f717a;
        if (kVar != null) {
            kVar.a();
        }
        C0145u uVar = this.f718b;
        if (uVar != null) {
            uVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0130k kVar = this.f717a;
        if (kVar != null) {
            return kVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0130k kVar = this.f717a;
        if (kVar != null) {
            return kVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0145u uVar = this.f718b;
        if (uVar != null) {
            return uVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0145u uVar = this.f718b;
        if (uVar != null) {
            return uVar.c();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f718b.d() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0130k kVar = this.f717a;
        if (kVar != null) {
            kVar.a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0130k kVar = this.f717a;
        if (kVar != null) {
            kVar.a(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0145u uVar = this.f718b;
        if (uVar != null) {
            uVar.a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0145u uVar = this.f718b;
        if (uVar != null) {
            uVar.a();
        }
    }

    public void setImageResource(int i) {
        C0145u uVar = this.f718b;
        if (uVar != null) {
            uVar.a(i);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0145u uVar = this.f718b;
        if (uVar != null) {
            uVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0130k kVar = this.f717a;
        if (kVar != null) {
            kVar.b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0130k kVar = this.f717a;
        if (kVar != null) {
            kVar.a(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0145u uVar = this.f718b;
        if (uVar != null) {
            uVar.a(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0145u uVar = this.f718b;
        if (uVar != null) {
            uVar.a(mode);
        }
    }
}
