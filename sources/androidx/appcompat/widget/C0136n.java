package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;
import androidx.core.widget.j;
import b.a.a.a.a;

/* renamed from: androidx.appcompat.widget.n  reason: case insensitive filesystem */
public class C0136n extends CheckedTextView {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f680a = {16843016};

    /* renamed from: b  reason: collision with root package name */
    private final M f681b;

    public C0136n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public C0136n(Context context, AttributeSet attributeSet, int i) {
        super(xa.a(context), attributeSet, i);
        this.f681b = new M(this);
        this.f681b.a(attributeSet, i);
        this.f681b.a();
        Aa a2 = Aa.a(getContext(), attributeSet, f680a, i, 0);
        setCheckMarkDrawable(a2.b(0));
        a2.a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        M m = this.f681b;
        if (m != null) {
            m.a();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0143s.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(a.b(getContext(), i));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(j.a((TextView) this, callback));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        M m = this.f681b;
        if (m != null) {
            m.a(context, i);
        }
    }
}
