package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import androidx.core.widget.j;
import b.a.a;
import b.h.j.t;

/* renamed from: androidx.appcompat.widget.j  reason: case insensitive filesystem */
public class C0128j extends AutoCompleteTextView implements t {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f662a = {16843126};

    /* renamed from: b  reason: collision with root package name */
    private final C0130k f663b;

    /* renamed from: c  reason: collision with root package name */
    private final M f664c;

    public C0128j(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0128j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.autoCompleteTextViewStyle);
    }

    public C0128j(Context context, AttributeSet attributeSet, int i) {
        super(xa.a(context), attributeSet, i);
        Aa a2 = Aa.a(getContext(), attributeSet, f662a, i, 0);
        if (a2.g(0)) {
            setDropDownBackgroundDrawable(a2.b(0));
        }
        a2.a();
        this.f663b = new C0130k(this);
        this.f663b.a(attributeSet, i);
        this.f664c = new M(this);
        this.f664c.a(attributeSet, i);
        this.f664c.a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0130k kVar = this.f663b;
        if (kVar != null) {
            kVar.a();
        }
        M m = this.f664c;
        if (m != null) {
            m.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0130k kVar = this.f663b;
        if (kVar != null) {
            return kVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0130k kVar = this.f663b;
        if (kVar != null) {
            return kVar.c();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0143s.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0130k kVar = this.f663b;
        if (kVar != null) {
            kVar.a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0130k kVar = this.f663b;
        if (kVar != null) {
            kVar.a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(j.a((TextView) this, callback));
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(b.a.a.a.a.b(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0130k kVar = this.f663b;
        if (kVar != null) {
            kVar.b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0130k kVar = this.f663b;
        if (kVar != null) {
            kVar.a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        M m = this.f664c;
        if (m != null) {
            m.a(context, i);
        }
    }
}
