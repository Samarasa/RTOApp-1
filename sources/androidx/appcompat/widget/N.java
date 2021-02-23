package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.widget.b;
import androidx.core.widget.j;
import androidx.core.widget.l;
import b.a.a.a.a;
import b.h.h.c;
import b.h.j.t;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class N extends TextView implements t, l, b {

    /* renamed from: a  reason: collision with root package name */
    private final C0130k f504a;

    /* renamed from: b  reason: collision with root package name */
    private final M f505b;

    /* renamed from: c  reason: collision with root package name */
    private final K f506c;

    /* renamed from: d  reason: collision with root package name */
    private Future<c> f507d;

    public N(Context context) {
        this(context, (AttributeSet) null);
    }

    public N(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public N(Context context, AttributeSet attributeSet, int i) {
        super(xa.a(context), attributeSet, i);
        this.f504a = new C0130k(this);
        this.f504a.a(attributeSet, i);
        this.f505b = new M(this);
        this.f505b.a(attributeSet, i);
        this.f505b.a();
        this.f506c = new K(this);
    }

    private void m() {
        Future<c> future = this.f507d;
        if (future != null) {
            try {
                this.f507d = null;
                j.a((TextView) this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0130k kVar = this.f504a;
        if (kVar != null) {
            kVar.a();
        }
        M m = this.f505b;
        if (m != null) {
            m.a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.f973a) {
            return super.getAutoSizeMaxTextSize();
        }
        M m = this.f505b;
        if (m != null) {
            return m.c();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.f973a) {
            return super.getAutoSizeMinTextSize();
        }
        M m = this.f505b;
        if (m != null) {
            return m.d();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.f973a) {
            return super.getAutoSizeStepGranularity();
        }
        M m = this.f505b;
        if (m != null) {
            return m.e();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.f973a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        M m = this.f505b;
        return m != null ? m.f() : new int[0];
    }

    public int getAutoSizeTextType() {
        if (b.f973a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        M m = this.f505b;
        if (m != null) {
            return m.g();
        }
        return 0;
    }

    public int getFirstBaselineToTopHeight() {
        return j.a((TextView) this);
    }

    public int getLastBaselineToBottomHeight() {
        return j.b(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0130k kVar = this.f504a;
        if (kVar != null) {
            return kVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0130k kVar = this.f504a;
        if (kVar != null) {
            return kVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f505b.h();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f505b.i();
    }

    public CharSequence getText() {
        m();
        return super.getText();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f506c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0010
            androidx.appcompat.widget.K r0 = r2.f506c
            if (r0 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            android.view.textclassifier.TextClassifier r0 = r0.a()
            return r0
        L_0x0010:
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.N.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    public c.a getTextMetricsParamsCompat() {
        return j.c(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0143s.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        M m = this.f505b;
        if (m != null) {
            m.a(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        m();
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        M m = this.f505b;
        if (m != null && !b.f973a && m.j()) {
            this.f505b.b();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (b.f973a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        M m = this.f505b;
        if (m != null) {
            m.a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (b.f973a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        M m = this.f505b;
        if (m != null) {
            m.a(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (b.f973a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        M m = this.f505b;
        if (m != null) {
            m.a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0130k kVar = this.f504a;
        if (kVar != null) {
            kVar.a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0130k kVar = this.f504a;
        if (kVar != null) {
            kVar.a(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        M m = this.f505b;
        if (m != null) {
            m.k();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        M m = this.f505b;
        if (m != null) {
            m.k();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b2 = i != 0 ? a.b(context, i) : null;
        Drawable b3 = i2 != 0 ? a.b(context, i2) : null;
        Drawable b4 = i3 != 0 ? a.b(context, i3) : null;
        if (i4 != 0) {
            drawable = a.b(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(b2, b3, b4, drawable);
        M m = this.f505b;
        if (m != null) {
            m.k();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        M m = this.f505b;
        if (m != null) {
            m.k();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b2 = i != 0 ? a.b(context, i) : null;
        Drawable b3 = i2 != 0 ? a.b(context, i2) : null;
        Drawable b4 = i3 != 0 ? a.b(context, i3) : null;
        if (i4 != 0) {
            drawable = a.b(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(b2, b3, b4, drawable);
        M m = this.f505b;
        if (m != null) {
            m.k();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        M m = this.f505b;
        if (m != null) {
            m.k();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(j.a((TextView) this, callback));
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            j.a((TextView) this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            j.b(this, i);
        }
    }

    public void setLineHeight(int i) {
        j.c(this, i);
    }

    public void setPrecomputedText(c cVar) {
        j.a((TextView) this, cVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0130k kVar = this.f504a;
        if (kVar != null) {
            kVar.b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0130k kVar = this.f504a;
        if (kVar != null) {
            kVar.a(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f505b.a(colorStateList);
        this.f505b.a();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f505b.a(mode);
        this.f505b.a();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        M m = this.f505b;
        if (m != null) {
            m.a(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        K k;
        if (Build.VERSION.SDK_INT >= 28 || (k = this.f506c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            k.a(textClassifier);
        }
    }

    public void setTextFuture(Future<c> future) {
        this.f507d = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(c.a aVar) {
        j.a((TextView) this, aVar);
    }

    public void setTextSize(int i, float f2) {
        if (b.f973a) {
            super.setTextSize(i, f2);
            return;
        }
        M m = this.f505b;
        if (m != null) {
            m.a(i, f2);
        }
    }

    public void setTypeface(Typeface typeface, int i) {
        Typeface a2 = (typeface == null || i <= 0) ? null : b.h.b.c.a(getContext(), typeface, i);
        if (a2 != null) {
            typeface = a2;
        }
        super.setTypeface(typeface, i);
    }
}
