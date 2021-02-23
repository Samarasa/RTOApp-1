package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import b.a.d;
import b.a.f;
import b.a.g;
import b.a.i;

class Ma {

    /* renamed from: a  reason: collision with root package name */
    private final Context f497a;

    /* renamed from: b  reason: collision with root package name */
    private final View f498b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f499c;

    /* renamed from: d  reason: collision with root package name */
    private final WindowManager.LayoutParams f500d = new WindowManager.LayoutParams();

    /* renamed from: e  reason: collision with root package name */
    private final Rect f501e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private final int[] f502f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    private final int[] f503g = new int[2];

    Ma(Context context) {
        this.f497a = context;
        this.f498b = LayoutInflater.from(this.f497a).inflate(g.abc_tooltip, (ViewGroup) null);
        this.f499c = (TextView) this.f498b.findViewById(f.message);
        this.f500d.setTitle(Ma.class.getSimpleName());
        this.f500d.packageName = this.f497a.getPackageName();
        WindowManager.LayoutParams layoutParams = this.f500d;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    private static View a(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    private void a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int i3;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f497a.getResources().getDimensionPixelOffset(d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f497a.getResources().getDimensionPixelOffset(d.tooltip_precise_anchor_extra_offset);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f497a.getResources().getDimensionPixelOffset(z ? d.tooltip_y_offset_touch : d.tooltip_y_offset_non_touch);
        View a2 = a(view);
        if (a2 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        a2.getWindowVisibleDisplayFrame(this.f501e);
        Rect rect = this.f501e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f497a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f501e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        a2.getLocationOnScreen(this.f503g);
        view.getLocationOnScreen(this.f502f);
        int[] iArr = this.f502f;
        int i5 = iArr[0];
        int[] iArr2 = this.f503g;
        iArr[0] = i5 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i) - (a2.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f498b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f498b.getMeasuredHeight();
        int[] iArr3 = this.f502f;
        int i6 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i7 = iArr3[1] + i4 + dimensionPixelOffset3;
        if (!z ? measuredHeight + i7 > this.f501e.height() : i6 >= 0) {
            layoutParams.y = i6;
        } else {
            layoutParams.y = i7;
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (b()) {
            ((WindowManager) this.f497a.getSystemService("window")).removeView(this.f498b);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (b()) {
            a();
        }
        this.f499c.setText(charSequence);
        a(view, i, i2, z, this.f500d);
        ((WindowManager) this.f497a.getSystemService("window")).addView(this.f498b, this.f500d);
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        return this.f498b.getParent() != null;
    }
}
