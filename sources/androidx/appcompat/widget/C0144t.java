package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.core.widget.m;
import b.a.a;
import b.h.j.t;

/* renamed from: androidx.appcompat.widget.t  reason: case insensitive filesystem */
public class C0144t extends ImageButton implements t, m {

    /* renamed from: a  reason: collision with root package name */
    private final C0130k f705a;

    /* renamed from: b  reason: collision with root package name */
    private final C0145u f706b;

    public C0144t(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0144t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.imageButtonStyle);
    }

    public C0144t(Context context, AttributeSet attributeSet, int i) {
        super(xa.a(context), attributeSet, i);
        this.f705a = new C0130k(this);
        this.f705a.a(attributeSet, i);
        this.f706b = new C0145u(this);
        this.f706b.a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0130k kVar = this.f705a;
        if (kVar != null) {
            kVar.a();
        }
        C0145u uVar = this.f706b;
        if (uVar != null) {
            uVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0130k kVar = this.f705a;
        if (kVar != null) {
            return kVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0130k kVar = this.f705a;
        if (kVar != null) {
            return kVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0145u uVar = this.f706b;
        if (uVar != null) {
            return uVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0145u uVar = this.f706b;
        if (uVar != null) {
            return uVar.c();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f706b.d() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0130k kVar = this.f705a;
        if (kVar != null) {
            kVar.a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0130k kVar = this.f705a;
        if (kVar != null) {
            kVar.a(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0145u uVar = this.f706b;
        if (uVar != null) {
            uVar.a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0145u uVar = this.f706b;
        if (uVar != null) {
            uVar.a();
        }
    }

    public void setImageResource(int i) {
        this.f706b.a(i);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0145u uVar = this.f706b;
        if (uVar != null) {
            uVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0130k kVar = this.f705a;
        if (kVar != null) {
            kVar.b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0130k kVar = this.f705a;
        if (kVar != null) {
            kVar.a(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0145u uVar = this.f706b;
        if (uVar != null) {
            uVar.a(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0145u uVar = this.f706b;
        if (uVar != null) {
            uVar.a(mode);
        }
    }
}
