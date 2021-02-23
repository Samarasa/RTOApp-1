package c.b.b.c.k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C0150z;
import androidx.core.widget.c;
import c.b.b.c.b;
import c.b.b.c.j;
import c.b.b.c.k;
import com.google.android.material.internal.v;

public class a extends C0150z {

    /* renamed from: d  reason: collision with root package name */
    private static final int f4794d = j.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: e  reason: collision with root package name */
    private static final int[][] f4795e = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: f  reason: collision with root package name */
    private ColorStateList f4796f;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.radioButtonStyle);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(v.a(context, attributeSet, i, f4794d), attributeSet, i);
        TypedArray a2 = v.a(getContext(), attributeSet, k.MaterialRadioButton, i, f4794d, new int[0]);
        boolean z = a2.getBoolean(k.MaterialRadioButton_useMaterialThemeColors, false);
        a2.recycle();
        if (z && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f4796f == null) {
            int a2 = c.b.b.c.f.a.a((View) this, b.colorControlActivated);
            int a3 = c.b.b.c.f.a.a((View) this, b.colorOnSurface);
            int a4 = c.b.b.c.f.a.a((View) this, b.colorSurface);
            int[] iArr = new int[f4795e.length];
            iArr[0] = c.b.b.c.f.a.a(a4, a2, 1.0f);
            iArr[1] = c.b.b.c.f.a.a(a4, a3, 0.54f);
            iArr[2] = c.b.b.c.f.a.a(a4, a3, 0.38f);
            iArr[3] = c.b.b.c.f.a.a(a4, a3, 0.38f);
            this.f4796f = new ColorStateList(f4795e, iArr);
        }
        return this.f4796f;
    }

    public void setUseMaterialThemeColors(boolean z) {
        c.a((CompoundButton) this, z ? getMaterialThemeColorsTintList() : null);
    }
}
