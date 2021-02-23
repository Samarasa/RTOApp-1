package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.b;
import androidx.core.widget.j;
import b.a.a;
import b.h.j.t;

/* renamed from: androidx.appcompat.widget.l  reason: case insensitive filesystem */
public class C0132l extends Button implements t, b {

    /* renamed from: a  reason: collision with root package name */
    private final C0130k f673a;

    /* renamed from: b  reason: collision with root package name */
    private final M f674b;

    public C0132l(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0132l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.buttonStyle);
    }

    public C0132l(Context context, AttributeSet attributeSet, int i) {
        super(xa.a(context), attributeSet, i);
        this.f673a = new C0130k(this);
        this.f673a.a(attributeSet, i);
        this.f674b = new M(this);
        this.f674b.a(attributeSet, i);
        this.f674b.a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0130k kVar = this.f673a;
        if (kVar != null) {
            kVar.a();
        }
        M m = this.f674b;
        if (m != null) {
            m.a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.f973a) {
            return super.getAutoSizeMaxTextSize();
        }
        M m = this.f674b;
        if (m != null) {
            return m.c();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.f973a) {
            return super.getAutoSizeMinTextSize();
        }
        M m = this.f674b;
        if (m != null) {
            return m.d();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.f973a) {
            return super.getAutoSizeStepGranularity();
        }
        M m = this.f674b;
        if (m != null) {
            return m.e();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.f973a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        M m = this.f674b;
        return m != null ? m.f() : new int[0];
    }

    public int getAutoSizeTextType() {
        if (b.f973a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        M m = this.f674b;
        if (m != null) {
            return m.g();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0130k kVar = this.f673a;
        if (kVar != null) {
            return kVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0130k kVar = this.f673a;
        if (kVar != null) {
            return kVar.c();
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        M m = this.f674b;
        if (m != null) {
            m.a(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        M m = this.f674b;
        if (m != null && !b.f973a && m.j()) {
            this.f674b.b();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (b.f973a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        M m = this.f674b;
        if (m != null) {
            m.a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (b.f973a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        M m = this.f674b;
        if (m != null) {
            m.a(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (b.f973a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        M m = this.f674b;
        if (m != null) {
            m.a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0130k kVar = this.f673a;
        if (kVar != null) {
            kVar.a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0130k kVar = this.f673a;
        if (kVar != null) {
            kVar.a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(j.a((TextView) this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        M m = this.f674b;
        if (m != null) {
            m.a(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0130k kVar = this.f673a;
        if (kVar != null) {
            kVar.b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0130k kVar = this.f673a;
        if (kVar != null) {
            kVar.a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        M m = this.f674b;
        if (m != null) {
            m.a(context, i);
        }
    }

    public void setTextSize(int i, float f2) {
        if (b.f973a) {
            super.setTextSize(i, f2);
            return;
        }
        M m = this.f674b;
        if (m != null) {
            m.a(i, f2);
        }
    }
}
