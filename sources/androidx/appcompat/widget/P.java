package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ToggleButton;

public class P extends ToggleButton {

    /* renamed from: a  reason: collision with root package name */
    private final M f519a;

    public P(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    public P(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f519a = new M(this);
        this.f519a.a(attributeSet, i);
    }
}
