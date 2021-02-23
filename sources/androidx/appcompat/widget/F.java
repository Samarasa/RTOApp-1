package androidx.appcompat.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.C0107n;
import b.h.j.t;
import b.h.j.y;

public class F extends Spinner implements t {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f438a = {16843505};

    /* renamed from: b  reason: collision with root package name */
    private final C0130k f439b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f440c;

    /* renamed from: d  reason: collision with root package name */
    private W f441d;

    /* renamed from: e  reason: collision with root package name */
    private SpinnerAdapter f442e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f443f;

    /* renamed from: g  reason: collision with root package name */
    private e f444g;

    /* renamed from: h  reason: collision with root package name */
    int f445h;
    final Rect i;

    class a implements e, DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        C0107n f446a;

        /* renamed from: b  reason: collision with root package name */
        private ListAdapter f447b;

        /* renamed from: c  reason: collision with root package name */
        private CharSequence f448c;

        a() {
        }

        public int a() {
            return 0;
        }

        public void a(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        public void a(int i, int i2) {
            if (this.f447b != null) {
                C0107n.a aVar = new C0107n.a(F.this.getPopupContext());
                CharSequence charSequence = this.f448c;
                if (charSequence != null) {
                    aVar.b(charSequence);
                }
                aVar.a(this.f447b, F.this.getSelectedItemPosition(), this);
                this.f446a = aVar.a();
                ListView b2 = this.f446a.b();
                if (Build.VERSION.SDK_INT >= 17) {
                    b2.setTextDirection(i);
                    b2.setTextAlignment(i2);
                }
                this.f446a.show();
            }
        }

        public void a(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        public void a(ListAdapter listAdapter) {
            this.f447b = listAdapter;
        }

        public void a(CharSequence charSequence) {
            this.f448c = charSequence;
        }

        public CharSequence b() {
            return this.f448c;
        }

        public void b(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        public Drawable c() {
            return null;
        }

        public int d() {
            return 0;
        }

        public void dismiss() {
            C0107n nVar = this.f446a;
            if (nVar != null) {
                nVar.dismiss();
                this.f446a = null;
            }
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            F.this.setSelection(i);
            if (F.this.getOnItemClickListener() != null) {
                F.this.performItemClick((View) null, i, this.f447b.getItemId(i));
            }
            dismiss();
        }

        public boolean v() {
            C0107n nVar = this.f446a;
            if (nVar != null) {
                return nVar.isShowing();
            }
            return false;
        }
    }

    private static class b implements ListAdapter, SpinnerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private SpinnerAdapter f450a;

        /* renamed from: b  reason: collision with root package name */
        private ListAdapter f451b;

        public b(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f450a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f451b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof wa) {
                wa waVar = (wa) spinnerAdapter;
                if (waVar.getDropDownViewTheme() == null) {
                    waVar.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f451b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f450a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f450a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f450a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f450a;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f450a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f451b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f450a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f450a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    private class c extends C0111aa implements e {
        private CharSequence K;
        ListAdapter L;
        private final Rect M = new Rect();

        public c(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            a((View) F.this);
            a(true);
            g(0);
            a((AdapterView.OnItemClickListener) new G(this, F.this));
        }

        public void a(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean v = v();
            j();
            f(2);
            super.u();
            ListView w = w();
            w.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                w.setTextDirection(i);
                w.setTextAlignment(i2);
            }
            h(F.this.getSelectedItemPosition());
            if (!v && (viewTreeObserver = F.this.getViewTreeObserver()) != null) {
                H h2 = new H(this);
                viewTreeObserver.addOnGlobalLayoutListener(h2);
                a((PopupWindow.OnDismissListener) new I(this, h2));
            }
        }

        public void a(ListAdapter listAdapter) {
            super.a(listAdapter);
            this.L = listAdapter;
        }

        public void a(CharSequence charSequence) {
            this.K = charSequence;
        }

        public CharSequence b() {
            return this.K;
        }

        /* access modifiers changed from: package-private */
        public boolean b(View view) {
            return y.z(view) && view.getGlobalVisibleRect(this.M);
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0095  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void j() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.c()
                r1 = 0
                if (r0 == 0) goto L_0x0026
                androidx.appcompat.widget.F r1 = androidx.appcompat.widget.F.this
                android.graphics.Rect r1 = r1.i
                r0.getPadding(r1)
                androidx.appcompat.widget.F r0 = androidx.appcompat.widget.F.this
                boolean r0 = androidx.appcompat.widget.Oa.a(r0)
                if (r0 == 0) goto L_0x001d
                androidx.appcompat.widget.F r0 = androidx.appcompat.widget.F.this
                android.graphics.Rect r0 = r0.i
                int r0 = r0.right
                goto L_0x0024
            L_0x001d:
                androidx.appcompat.widget.F r0 = androidx.appcompat.widget.F.this
                android.graphics.Rect r0 = r0.i
                int r0 = r0.left
                int r0 = -r0
            L_0x0024:
                r1 = r0
                goto L_0x002e
            L_0x0026:
                androidx.appcompat.widget.F r0 = androidx.appcompat.widget.F.this
                android.graphics.Rect r0 = r0.i
                r0.right = r1
                r0.left = r1
            L_0x002e:
                androidx.appcompat.widget.F r0 = androidx.appcompat.widget.F.this
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.F r2 = androidx.appcompat.widget.F.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.F r3 = androidx.appcompat.widget.F.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.F r4 = androidx.appcompat.widget.F.this
                int r5 = r4.f445h
                r6 = -2
                if (r5 != r6) goto L_0x0078
                android.widget.ListAdapter r5 = r8.L
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.c()
                int r4 = r4.a(r5, r6)
                androidx.appcompat.widget.F r5 = androidx.appcompat.widget.F.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.F r6 = androidx.appcompat.widget.F.this
                android.graphics.Rect r6 = r6.i
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L_0x0070
                r4 = r5
            L_0x0070:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L_0x007e
            L_0x0078:
                r4 = -1
                if (r5 != r4) goto L_0x0082
                int r4 = r3 - r0
                int r4 = r4 - r2
            L_0x007e:
                r8.d(r4)
                goto L_0x0085
            L_0x0082:
                r8.d(r5)
            L_0x0085:
                androidx.appcompat.widget.F r4 = androidx.appcompat.widget.F.this
                boolean r4 = androidx.appcompat.widget.Oa.a(r4)
                if (r4 == 0) goto L_0x0095
                int r3 = r3 - r2
                int r0 = r8.g()
                int r3 = r3 - r0
                int r1 = r1 + r3
                goto L_0x0096
            L_0x0095:
                int r1 = r1 + r0
            L_0x0096:
                r8.a((int) r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.F.c.j():void");
        }
    }

    static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new J();

        /* renamed from: a  reason: collision with root package name */
        boolean f452a;

        d(Parcel parcel) {
            super(parcel);
            this.f452a = parcel.readByte() != 0;
        }

        d(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f452a ? (byte) 1 : 0);
        }
    }

    interface e {
        int a();

        void a(int i);

        void a(int i, int i2);

        void a(Drawable drawable);

        void a(ListAdapter listAdapter);

        void a(CharSequence charSequence);

        CharSequence b();

        void b(int i);

        Drawable c();

        int d();

        void dismiss();

        boolean v();
    }

    public F(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a.a.spinnerStyle);
    }

    public F(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, -1);
    }

    public F(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, attributeSet, i2, i3, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r11 != null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        r11.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
        if (r11 != null) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0036 A[SYNTHETIC, Splitter:B:10:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public F(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.i = r0
            int[] r0 = b.a.j.Spinner
            r1 = 0
            androidx.appcompat.widget.Aa r0 = androidx.appcompat.widget.Aa.a(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.k r2 = new androidx.appcompat.widget.k
            r2.<init>(r6)
            r6.f439b = r2
            if (r11 == 0) goto L_0x0022
            b.a.d.d r2 = new b.a.d.d
            r2.<init>((android.content.Context) r7, (android.content.res.Resources.Theme) r11)
        L_0x001f:
            r6.f440c = r2
            goto L_0x0032
        L_0x0022:
            int r11 = b.a.j.Spinner_popupTheme
            int r11 = r0.g(r11, r1)
            if (r11 == 0) goto L_0x0030
            b.a.d.d r2 = new b.a.d.d
            r2.<init>((android.content.Context) r7, (int) r11)
            goto L_0x001f
        L_0x0030:
            r6.f440c = r7
        L_0x0032:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L_0x0064
            int[] r11 = f438a     // Catch:{ Exception -> 0x0051, all -> 0x004e }
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch:{ Exception -> 0x0051, all -> 0x004e }
            boolean r3 = r11.hasValue(r1)     // Catch:{ Exception -> 0x004c }
            if (r3 == 0) goto L_0x0046
            int r10 = r11.getInt(r1, r1)     // Catch:{ Exception -> 0x004c }
        L_0x0046:
            if (r11 == 0) goto L_0x0064
        L_0x0048:
            r11.recycle()
            goto L_0x0064
        L_0x004c:
            r3 = move-exception
            goto L_0x0053
        L_0x004e:
            r7 = move-exception
            r11 = r2
            goto L_0x005e
        L_0x0051:
            r3 = move-exception
            r11 = r2
        L_0x0053:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch:{ all -> 0x005d }
            if (r11 == 0) goto L_0x0064
            goto L_0x0048
        L_0x005d:
            r7 = move-exception
        L_0x005e:
            if (r11 == 0) goto L_0x0063
            r11.recycle()
        L_0x0063:
            throw r7
        L_0x0064:
            r11 = 1
            if (r10 == 0) goto L_0x00a1
            if (r10 == r11) goto L_0x006a
            goto L_0x00b3
        L_0x006a:
            androidx.appcompat.widget.F$c r10 = new androidx.appcompat.widget.F$c
            android.content.Context r3 = r6.f440c
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f440c
            int[] r4 = b.a.j.Spinner
            androidx.appcompat.widget.Aa r1 = androidx.appcompat.widget.Aa.a(r3, r8, r4, r9, r1)
            int r3 = b.a.j.Spinner_android_dropDownWidth
            r4 = -2
            int r3 = r1.f(r3, r4)
            r6.f445h = r3
            int r3 = b.a.j.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r3 = r1.b(r3)
            r10.a((android.graphics.drawable.Drawable) r3)
            int r3 = b.a.j.Spinner_android_prompt
            java.lang.String r3 = r0.d(r3)
            r10.a((java.lang.CharSequence) r3)
            r1.a()
            r6.f444g = r10
            androidx.appcompat.widget.D r1 = new androidx.appcompat.widget.D
            r1.<init>(r6, r6, r10)
            r6.f441d = r1
            goto L_0x00b3
        L_0x00a1:
            androidx.appcompat.widget.F$a r10 = new androidx.appcompat.widget.F$a
            r10.<init>()
            r6.f444g = r10
            androidx.appcompat.widget.F$e r10 = r6.f444g
            int r1 = b.a.j.Spinner_android_prompt
            java.lang.String r1 = r0.d(r1)
            r10.a((java.lang.CharSequence) r1)
        L_0x00b3:
            int r10 = b.a.j.Spinner_android_entries
            java.lang.CharSequence[] r10 = r0.f(r10)
            if (r10 == 0) goto L_0x00cb
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = b.a.g.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r7)
            r6.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00cb:
            r0.a()
            r6.f443f = r11
            android.widget.SpinnerAdapter r7 = r6.f442e
            if (r7 == 0) goto L_0x00d9
            r6.setAdapter((android.widget.SpinnerAdapter) r7)
            r6.f442e = r2
        L_0x00d9:
            androidx.appcompat.widget.k r7 = r6.f439b
            r7.a(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.F.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* access modifiers changed from: package-private */
    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i3;
        }
        drawable.getPadding(this.i);
        Rect rect = this.i;
        return i3 + rect.left + rect.right;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f444g.a(getTextDirection(), getTextAlignment());
        } else {
            this.f444g.a(-1, -1);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0130k kVar = this.f439b;
        if (kVar != null) {
            kVar.a();
        }
    }

    public int getDropDownHorizontalOffset() {
        e eVar = this.f444g;
        if (eVar != null) {
            return eVar.a();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        e eVar = this.f444g;
        if (eVar != null) {
            return eVar.d();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.f444g != null) {
            return this.f445h;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final e getInternalPopup() {
        return this.f444g;
    }

    public Drawable getPopupBackground() {
        e eVar = this.f444g;
        if (eVar != null) {
            return eVar.c();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        return this.f440c;
    }

    public CharSequence getPrompt() {
        e eVar = this.f444g;
        return eVar != null ? eVar.b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0130k kVar = this.f439b;
        if (kVar != null) {
            return kVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0130k kVar = this.f439b;
        if (kVar != null) {
            return kVar.c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e eVar = this.f444g;
        if (eVar != null && eVar.v()) {
            this.f444g.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f444g != null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        if (dVar.f452a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new E(this));
        }
    }

    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        e eVar = this.f444g;
        dVar.f452a = eVar != null && eVar.v();
        return dVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        W w = this.f441d;
        if (w == null || !w.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        e eVar = this.f444g;
        if (eVar == null) {
            return super.performClick();
        }
        if (eVar.v()) {
            return true;
        }
        a();
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f443f) {
            this.f442e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f444g != null) {
            Context context = this.f440c;
            if (context == null) {
                context = getContext();
            }
            this.f444g.a((ListAdapter) new b(spinnerAdapter, context.getTheme()));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0130k kVar = this.f439b;
        if (kVar != null) {
            kVar.a(drawable);
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0130k kVar = this.f439b;
        if (kVar != null) {
            kVar.a(i2);
        }
    }

    public void setDropDownHorizontalOffset(int i2) {
        e eVar = this.f444g;
        if (eVar != null) {
            eVar.a(i2);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i2);
        }
    }

    public void setDropDownVerticalOffset(int i2) {
        e eVar = this.f444g;
        if (eVar != null) {
            eVar.b(i2);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i2);
        }
    }

    public void setDropDownWidth(int i2) {
        if (this.f444g != null) {
            this.f445h = i2;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i2);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        e eVar = this.f444g;
        if (eVar != null) {
            eVar.a(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(b.a.a.a.a.b(getPopupContext(), i2));
    }

    public void setPrompt(CharSequence charSequence) {
        e eVar = this.f444g;
        if (eVar != null) {
            eVar.a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0130k kVar = this.f439b;
        if (kVar != null) {
            kVar.b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0130k kVar = this.f439b;
        if (kVar != null) {
            kVar.a(mode);
        }
    }
}
