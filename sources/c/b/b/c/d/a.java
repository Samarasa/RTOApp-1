package c.b.b.c.d;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C0134m;
import androidx.core.widget.c;
import c.b.b.c.b;
import c.b.b.c.j;
import c.b.b.c.k;
import com.google.android.material.internal.v;

public class a extends C0134m {

    /* renamed from: d  reason: collision with root package name */
    private static final int f4774d = j.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: e  reason: collision with root package name */
    private static final int[][] f4775e = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: f  reason: collision with root package name */
    private ColorStateList f4776f;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.checkboxStyle);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(v.a(context, attributeSet, i, f4774d), attributeSet, i);
        TypedArray a2 = v.a(getContext(), attributeSet, k.MaterialCheckBox, i, f4774d, new int[0]);
        boolean z = a2.getBoolean(k.MaterialCheckBox_useMaterialThemeColors, false);
        a2.recycle();
        if (z && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f4776f == null) {
            int[] iArr = new int[f4775e.length];
            int a2 = c.b.b.c.f.a.a((View) this, b.colorControlActivated);
            int a3 = c.b.b.c.f.a.a((View) this, b.colorSurface);
            int a4 = c.b.b.c.f.a.a((View) this, b.colorOnSurface);
            iArr[0] = c.b.b.c.f.a.a(a3, a2, 1.0f);
            iArr[1] = c.b.b.c.f.a.a(a3, a4, 0.54f);
            iArr[2] = c.b.b.c.f.a.a(a3, a4, 0.38f);
            iArr[3] = c.b.b.c.f.a.a(a3, a4, 0.38f);
            this.f4776f = new ColorStateList(f4775e, iArr);
        }
        return this.f4776f;
    }

    public void setUseMaterialThemeColors(boolean z) {
        c.a((CompoundButton) this, z ? getMaterialThemeColorsTintList() : null);
    }
}
