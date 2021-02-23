package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.widget.j;
import b.a.a;
import b.h.j.t;

public class r extends EditText implements t {

    /* renamed from: a  reason: collision with root package name */
    private final C0130k f701a;

    /* renamed from: b  reason: collision with root package name */
    private final M f702b;

    /* renamed from: c  reason: collision with root package name */
    private final K f703c;

    public r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.editTextStyle);
    }

    public r(Context context, AttributeSet attributeSet, int i) {
        super(xa.a(context), attributeSet, i);
        this.f701a = new C0130k(this);
        this.f701a.a(attributeSet, i);
        this.f702b = new M(this);
        this.f702b.a(attributeSet, i);
        this.f702b.a();
        this.f703c = new K(this);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0130k kVar = this.f701a;
        if (kVar != null) {
            kVar.a();
        }
        M m = this.f702b;
        if (m != null) {
            m.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0130k kVar = this.f701a;
        if (kVar != null) {
            return kVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0130k kVar = this.f701a;
        if (kVar != null) {
            return kVar.c();
        }
        return null;
    }

    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f703c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0010
            androidx.appcompat.widget.K r0 = r2.f703c
            if (r0 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            android.view.textclassifier.TextClassifier r0 = r0.a()
            return r0
        L_0x0010:
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.r.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0143s.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0130k kVar = this.f701a;
        if (kVar != null) {
            kVar.a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0130k kVar = this.f701a;
        if (kVar != null) {
            kVar.a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(j.a((TextView) this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0130k kVar = this.f701a;
        if (kVar != null) {
            kVar.b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0130k kVar = this.f701a;
        if (kVar != null) {
            kVar.a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        M m = this.f702b;
        if (m != null) {
            m.a(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        K k;
        if (Build.VERSION.SDK_INT >= 28 || (k = this.f703c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            k.a(textClassifier);
        }
    }
}
