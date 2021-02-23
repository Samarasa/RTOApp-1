package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.C0094a;
import androidx.appcompat.widget.X;

/* renamed from: androidx.appcompat.widget.ha  reason: case insensitive filesystem */
public class C0125ha extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: a  reason: collision with root package name */
    private static final Interpolator f645a = new DecelerateInterpolator();

    /* renamed from: b  reason: collision with root package name */
    Runnable f646b;

    /* renamed from: c  reason: collision with root package name */
    private b f647c;

    /* renamed from: d  reason: collision with root package name */
    X f648d;

    /* renamed from: e  reason: collision with root package name */
    private Spinner f649e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f650f;

    /* renamed from: g  reason: collision with root package name */
    int f651g;

    /* renamed from: h  reason: collision with root package name */
    int f652h;
    private int i;
    private int j;

    /* renamed from: androidx.appcompat.widget.ha$a */
    private class a extends BaseAdapter {
        a() {
        }

        public int getCount() {
            return C0125ha.this.f648d.getChildCount();
        }

        public Object getItem(int i) {
            return ((c) C0125ha.this.f648d.getChildAt(i)).a();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0125ha.this.a((C0094a.c) getItem(i), true);
            }
            ((c) view).a((C0094a.c) getItem(i));
            return view;
        }
    }

    /* renamed from: androidx.appcompat.widget.ha$b */
    private class b implements View.OnClickListener {
        b() {
        }

        public void onClick(View view) {
            ((c) view).a().e();
            int childCount = C0125ha.this.f648d.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C0125ha.this.f648d.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ha$c */
    private class c extends LinearLayout {

        /* renamed from: a  reason: collision with root package name */
        private final int[] f655a = {16842964};

        /* renamed from: b  reason: collision with root package name */
        private C0094a.c f656b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f657c;

        /* renamed from: d  reason: collision with root package name */
        private ImageView f658d;

        /* renamed from: e  reason: collision with root package name */
        private View f659e;

        public c(Context context, C0094a.c cVar, boolean z) {
            super(context, (AttributeSet) null, b.a.a.actionBarTabStyle);
            this.f656b = cVar;
            Aa a2 = Aa.a(context, (AttributeSet) null, this.f655a, b.a.a.actionBarTabStyle, 0);
            if (a2.g(0)) {
                setBackgroundDrawable(a2.b(0));
            }
            a2.a();
            if (z) {
                setGravity(8388627);
            }
            b();
        }

        public C0094a.c a() {
            return this.f656b;
        }

        public void a(C0094a.c cVar) {
            this.f656b = cVar;
            b();
        }

        public void b() {
            C0094a.c cVar = this.f656b;
            View b2 = cVar.b();
            CharSequence charSequence = null;
            if (b2 != null) {
                ViewParent parent = b2.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b2);
                    }
                    addView(b2);
                }
                this.f659e = b2;
                TextView textView = this.f657c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f658d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f658d.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            View view = this.f659e;
            if (view != null) {
                removeView(view);
                this.f659e = null;
            }
            Drawable c2 = cVar.c();
            CharSequence d2 = cVar.d();
            if (c2 != null) {
                if (this.f658d == null) {
                    C0146v vVar = new C0146v(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    vVar.setLayoutParams(layoutParams);
                    addView(vVar, 0);
                    this.f658d = vVar;
                }
                this.f658d.setImageDrawable(c2);
                this.f658d.setVisibility(0);
            } else {
                ImageView imageView2 = this.f658d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f658d.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(d2);
            if (z) {
                if (this.f657c == null) {
                    N n = new N(getContext(), (AttributeSet) null, b.a.a.actionBarTabTextStyle);
                    n.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    n.setLayoutParams(layoutParams2);
                    addView(n);
                    this.f657c = n;
                }
                this.f657c.setText(d2);
                this.f657c.setVisibility(0);
            } else {
                TextView textView2 = this.f657c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f657c.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f658d;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            if (!z) {
                charSequence = cVar.a();
            }
            Ia.a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int i, int i2) {
            int i3;
            super.onMeasure(i, i2);
            if (C0125ha.this.f651g > 0 && getMeasuredWidth() > (i3 = C0125ha.this.f651g)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    private Spinner a() {
        F f2 = new F(getContext(), (AttributeSet) null, b.a.a.actionDropDownStyle);
        f2.setLayoutParams(new X.a(-2, -1));
        f2.setOnItemSelectedListener(this);
        return f2;
    }

    private boolean b() {
        Spinner spinner = this.f649e;
        return spinner != null && spinner.getParent() == this;
    }

    private void c() {
        if (!b()) {
            if (this.f649e == null) {
                this.f649e = a();
            }
            removeView(this.f648d);
            addView(this.f649e, new ViewGroup.LayoutParams(-2, -1));
            if (this.f649e.getAdapter() == null) {
                this.f649e.setAdapter(new a());
            }
            Runnable runnable = this.f646b;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f646b = null;
            }
            this.f649e.setSelection(this.j);
        }
    }

    private boolean d() {
        if (!b()) {
            return false;
        }
        removeView(this.f649e);
        addView(this.f648d, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f649e.getSelectedItemPosition());
        return false;
    }

    /* access modifiers changed from: package-private */
    public c a(C0094a.c cVar, boolean z) {
        c cVar2 = new c(getContext(), cVar, z);
        if (z) {
            cVar2.setBackgroundDrawable((Drawable) null);
            cVar2.setLayoutParams(new AbsListView.LayoutParams(-1, this.i));
        } else {
            cVar2.setFocusable(true);
            if (this.f647c == null) {
                this.f647c = new b();
            }
            cVar2.setOnClickListener(this.f647c);
        }
        return cVar2;
    }

    public void a(int i2) {
        View childAt = this.f648d.getChildAt(i2);
        Runnable runnable = this.f646b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.f646b = new C0123ga(this, childAt);
        post(this.f646b);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f646b;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b.a.d.a a2 = b.a.d.a.a(getContext());
        setContentHeight(a2.e());
        this.f652h = a2.d();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f646b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        ((c) view).a().e();
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int mode = View.MeasureSpec.getMode(i2);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f648d.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i4 = -1;
        } else {
            if (childCount > 2) {
                this.f651g = (int) (((float) View.MeasureSpec.getSize(i2)) * 0.4f);
            } else {
                this.f651g = View.MeasureSpec.getSize(i2) / 2;
            }
            i4 = Math.min(this.f651g, this.f652h);
        }
        this.f651g = i4;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.i, 1073741824);
        if (z2 || !this.f650f) {
            z = false;
        }
        if (z) {
            this.f648d.measure(0, makeMeasureSpec);
            if (this.f648d.getMeasuredWidth() > View.MeasureSpec.getSize(i2)) {
                c();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i2, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z2 && measuredWidth != measuredWidth2) {
                    setTabSelected(this.j);
                    return;
                }
            }
        }
        d();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i2, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z2) {
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f650f = z;
    }

    public void setContentHeight(int i2) {
        this.i = i2;
        requestLayout();
    }

    public void setTabSelected(int i2) {
        this.j = i2;
        int childCount = this.f648d.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = this.f648d.getChildAt(i3);
            boolean z = i3 == i2;
            childAt.setSelected(z);
            if (z) {
                a(i2);
            }
            i3++;
        }
        Spinner spinner = this.f649e;
        if (spinner != null && i2 >= 0) {
            spinner.setSelection(i2);
        }
    }
}
