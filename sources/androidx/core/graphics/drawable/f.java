package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

final class f extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    int f943a;

    /* renamed from: b  reason: collision with root package name */
    Drawable.ConstantState f944b;

    /* renamed from: c  reason: collision with root package name */
    ColorStateList f945c = null;

    /* renamed from: d  reason: collision with root package name */
    PorterDuff.Mode f946d = d.f935a;

    f(f fVar) {
        if (fVar != null) {
            this.f943a = fVar.f943a;
            this.f944b = fVar.f944b;
            this.f945c = fVar.f945c;
            this.f946d = fVar.f946d;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return this.f944b != null;
    }

    public int getChangingConfigurations() {
        int i = this.f943a;
        Drawable.ConstantState constantState = this.f944b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    public Drawable newDrawable() {
        return newDrawable((Resources) null);
    }

    public Drawable newDrawable(Resources resources) {
        return Build.VERSION.SDK_INT >= 21 ? new e(this, resources) : new d(this, resources);
    }
}
