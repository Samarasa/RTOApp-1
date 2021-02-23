package se.emilsjolander.stickylistheaders;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.SectionIndexer;
import se.emilsjolander.stickylistheaders.c;
import se.emilsjolander.stickylistheaders.s;

public class q extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public s f15612a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public View f15613b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Long f15614c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Integer f15615d;

    /* renamed from: e  reason: collision with root package name */
    private Integer f15616e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public AbsListView.OnScrollListener f15617f;

    /* renamed from: g  reason: collision with root package name */
    private c f15618g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f15619h;
    /* access modifiers changed from: private */
    public boolean i;
    private boolean j;
    private int k;
    private int l;
    /* access modifiers changed from: private */
    public int m;
    private int n;
    private int o;
    private float p;
    private boolean q;
    private float r;
    /* access modifiers changed from: private */
    public c s;
    private e t;
    private d u;
    private a v;
    private Drawable w;
    private int x;

    private class a extends DataSetObserver {
        private a() {
        }

        /* synthetic */ a(q qVar, n nVar) {
            this();
        }

        public void onChanged() {
            q.this.b();
        }

        public void onInvalidated() {
            q.this.b();
        }
    }

    private class b implements c.a {
        private b() {
        }

        /* synthetic */ b(q qVar, n nVar) {
            this();
        }

        public void a(View view, int i, long j) {
            q.this.s.onHeaderClick(q.this, view, i, j, false);
        }
    }

    public interface c {
        void onHeaderClick(q qVar, View view, int i, long j, boolean z);
    }

    public interface d {
        void a(q qVar, View view, int i, long j);
    }

    public interface e {
        void a(q qVar, View view, int i);
    }

    private class f implements AbsListView.OnScrollListener {
        private f() {
        }

        /* synthetic */ f(q qVar, n nVar) {
            this();
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            if (q.this.f15617f != null) {
                q.this.f15617f.onScroll(absListView, i, i2, i3);
            }
            q qVar = q.this;
            qVar.e(qVar.f15612a.a());
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (q.this.f15617f != null) {
                q.this.f15617f.onScrollStateChanged(absListView, i);
            }
        }
    }

    private class g implements s.a {
        private g() {
        }

        /* synthetic */ g(q qVar, n nVar) {
            this();
        }

        public void a(Canvas canvas) {
            if (Build.VERSION.SDK_INT < 8) {
                q qVar = q.this;
                qVar.e(qVar.f15612a.a());
            }
            if (q.this.f15613b == null) {
                return;
            }
            if (q.this.i) {
                canvas.save();
                canvas.clipRect(0, q.this.m, q.this.getRight(), q.this.getBottom());
                q qVar2 = q.this;
                boolean unused = qVar2.drawChild(canvas, qVar2.f15613b, 0);
                canvas.restore();
                return;
            }
            q qVar3 = q.this;
            boolean unused2 = qVar3.drawChild(canvas, qVar3.f15613b, 0);
        }
    }

    public q(Context context) {
        this(context, (AttributeSet) null);
    }

    public q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j.stickyListHeadersListViewStyle);
    }

    @TargetApi(11)
    public q(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        s sVar;
        this.f15619h = true;
        this.i = true;
        this.j = true;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.r = (float) ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f15612a = new s(context);
        this.w = this.f15612a.getDivider();
        this.x = this.f15612a.getDividerHeight();
        this.f15612a.setDivider((Drawable) null);
        this.f15612a.setDividerHeight(0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, k.StickyListHeadersListView, i2, 0);
            try {
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(k.StickyListHeadersListView_android_padding, 0);
                this.l = obtainStyledAttributes.getDimensionPixelSize(k.StickyListHeadersListView_android_paddingLeft, dimensionPixelSize);
                this.m = obtainStyledAttributes.getDimensionPixelSize(k.StickyListHeadersListView_android_paddingTop, dimensionPixelSize);
                this.n = obtainStyledAttributes.getDimensionPixelSize(k.StickyListHeadersListView_android_paddingRight, dimensionPixelSize);
                this.o = obtainStyledAttributes.getDimensionPixelSize(k.StickyListHeadersListView_android_paddingBottom, dimensionPixelSize);
                setPadding(this.l, this.m, this.n, this.o);
                this.i = obtainStyledAttributes.getBoolean(k.StickyListHeadersListView_android_clipToPadding, true);
                super.setClipToPadding(true);
                this.f15612a.setClipToPadding(this.i);
                int i3 = obtainStyledAttributes.getInt(k.StickyListHeadersListView_android_scrollbars, 512);
                this.f15612a.setVerticalScrollBarEnabled((i3 & 512) != 0);
                this.f15612a.setHorizontalScrollBarEnabled((i3 & 256) != 0);
                if (Build.VERSION.SDK_INT >= 9) {
                    this.f15612a.setOverScrollMode(obtainStyledAttributes.getInt(k.StickyListHeadersListView_android_overScrollMode, 0));
                }
                this.f15612a.setFadingEdgeLength(obtainStyledAttributes.getDimensionPixelSize(k.StickyListHeadersListView_android_fadingEdgeLength, this.f15612a.getVerticalFadingEdgeLength()));
                int i4 = obtainStyledAttributes.getInt(k.StickyListHeadersListView_android_requiresFadingEdge, 0);
                if (i4 == 4096) {
                    this.f15612a.setVerticalFadingEdgeEnabled(false);
                    this.f15612a.setHorizontalFadingEdgeEnabled(true);
                } else {
                    if (i4 == 8192) {
                        this.f15612a.setVerticalFadingEdgeEnabled(true);
                        sVar = this.f15612a;
                    } else {
                        this.f15612a.setVerticalFadingEdgeEnabled(false);
                        sVar = this.f15612a;
                    }
                    sVar.setHorizontalFadingEdgeEnabled(false);
                }
                this.f15612a.setCacheColorHint(obtainStyledAttributes.getColor(k.StickyListHeadersListView_android_cacheColorHint, this.f15612a.getCacheColorHint()));
                if (Build.VERSION.SDK_INT >= 11) {
                    this.f15612a.setChoiceMode(obtainStyledAttributes.getInt(k.StickyListHeadersListView_android_choiceMode, this.f15612a.getChoiceMode()));
                }
                this.f15612a.setDrawSelectorOnTop(obtainStyledAttributes.getBoolean(k.StickyListHeadersListView_android_drawSelectorOnTop, false));
                this.f15612a.setFastScrollEnabled(obtainStyledAttributes.getBoolean(k.StickyListHeadersListView_android_fastScrollEnabled, this.f15612a.isFastScrollEnabled()));
                if (Build.VERSION.SDK_INT >= 11) {
                    this.f15612a.setFastScrollAlwaysVisible(obtainStyledAttributes.getBoolean(k.StickyListHeadersListView_android_fastScrollAlwaysVisible, this.f15612a.isFastScrollAlwaysVisible()));
                }
                this.f15612a.setScrollBarStyle(obtainStyledAttributes.getInt(k.StickyListHeadersListView_android_scrollbarStyle, 0));
                if (obtainStyledAttributes.hasValue(k.StickyListHeadersListView_android_listSelector)) {
                    this.f15612a.setSelector(obtainStyledAttributes.getDrawable(k.StickyListHeadersListView_android_listSelector));
                }
                this.f15612a.setScrollingCacheEnabled(obtainStyledAttributes.getBoolean(k.StickyListHeadersListView_android_scrollingCache, this.f15612a.isScrollingCacheEnabled()));
                if (obtainStyledAttributes.hasValue(k.StickyListHeadersListView_android_divider)) {
                    this.w = obtainStyledAttributes.getDrawable(k.StickyListHeadersListView_android_divider);
                }
                this.f15612a.setStackFromBottom(obtainStyledAttributes.getBoolean(k.StickyListHeadersListView_android_stackFromBottom, false));
                this.x = obtainStyledAttributes.getDimensionPixelSize(k.StickyListHeadersListView_android_dividerHeight, this.x);
                this.f15612a.setTranscriptMode(obtainStyledAttributes.getInt(k.StickyListHeadersListView_android_transcriptMode, 0));
                this.f15619h = obtainStyledAttributes.getBoolean(k.StickyListHeadersListView_hasStickyHeaders, true);
                this.j = obtainStyledAttributes.getBoolean(k.StickyListHeadersListView_isDrawingListUnderStickyHeader, true);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f15612a.a((s.a) new g(this, (n) null));
        this.f15612a.setOnScrollListener(new f(this, (n) null));
        addView(this.f15612a);
    }

    private void a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        } else if (layoutParams.height == -1 || layoutParams.width == -2) {
            layoutParams.height = -2;
            layoutParams.width = -1;
        } else {
            return;
        }
        view.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: private */
    public void b() {
        View view = this.f15613b;
        if (view != null) {
            removeView(view);
            this.f15613b = null;
            this.f15614c = null;
            this.f15615d = null;
            this.f15616e = null;
            this.f15612a.a(0);
            d();
        }
    }

    private void b(View view) {
        if (view != null) {
            measureChild(view, View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - this.l) - this.n, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
    }

    private boolean b(int i2) {
        return i2 == 0 || this.f15618g.getHeaderId(i2) != this.f15618g.getHeaderId(i2 - 1);
    }

    private int c() {
        return this.k + (this.i ? this.m : 0);
    }

    private void c(View view) {
        View view2 = this.f15613b;
        if (view2 != null) {
            removeView(view2);
        }
        this.f15613b = view;
        addView(this.f15613b);
        if (this.s != null) {
            this.f15613b.setOnClickListener(new n(this));
        }
        this.f15613b.setClickable(true);
    }

    private boolean c(int i2) {
        if (Build.VERSION.SDK_INT >= i2) {
            return true;
        }
        Log.e("StickyListHeaders", "Api lvl must be at least " + i2 + " to call this method");
        return false;
    }

    private void d() {
        int c2 = c();
        int childCount = this.f15612a.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f15612a.getChildAt(i2);
            if (childAt instanceof r) {
                r rVar = (r) childAt;
                if (rVar.a()) {
                    View view = rVar.f15627d;
                    if (rVar.getTop() < c2) {
                        if (view.getVisibility() != 4) {
                            view.setVisibility(4);
                        }
                    } else if (view.getVisibility() != 0) {
                        view.setVisibility(0);
                    }
                }
            }
        }
    }

    private void d(int i2) {
        View childAt;
        Integer num = this.f15615d;
        if (num == null || num.intValue() != i2) {
            this.f15615d = Integer.valueOf(i2);
            long headerId = this.f15618g.getHeaderId(i2);
            Long l2 = this.f15614c;
            if (l2 == null || l2.longValue() != headerId) {
                this.f15614c = Long.valueOf(headerId);
                View headerView = this.f15618g.getHeaderView(this.f15615d.intValue(), this.f15613b, this);
                if (this.f15613b != headerView) {
                    if (headerView != null) {
                        c(headerView);
                    } else {
                        throw new NullPointerException("header may not be null");
                    }
                }
                a(this.f15613b);
                b(this.f15613b);
                d dVar = this.u;
                if (dVar != null) {
                    dVar.a(this, this.f15613b, i2, this.f15614c.longValue());
                }
                this.f15616e = null;
            }
        }
        int c2 = c();
        int i3 = 0;
        while (true) {
            if (i3 >= this.f15612a.getChildCount()) {
                break;
            }
            childAt = this.f15612a.getChildAt(i3);
            boolean z = (childAt instanceof r) && ((r) childAt).a();
            boolean a2 = this.f15612a.a(childAt);
            if (childAt.getTop() < c() || (!z && !a2)) {
                i3++;
            }
        }
        c2 = Math.min(childAt.getTop() - this.f15613b.getMeasuredHeight(), c2);
        setHeaderOffet(c2);
        if (!this.j) {
            this.f15612a.a(this.f15613b.getMeasuredHeight() + this.f15616e.intValue());
        }
        d();
    }

    /* access modifiers changed from: private */
    public void e(int i2) {
        c cVar = this.f15618g;
        boolean z = false;
        int count = cVar == null ? 0 : cVar.getCount();
        if (count != 0 && this.f15619h) {
            int headerViewsCount = i2 - this.f15612a.getHeaderViewsCount();
            if (this.f15612a.getChildCount() > 0 && this.f15612a.getChildAt(0).getBottom() < c()) {
                headerViewsCount++;
            }
            boolean z2 = this.f15612a.getChildCount() != 0;
            boolean z3 = z2 && this.f15612a.getFirstVisiblePosition() == 0 && this.f15612a.getChildAt(0).getTop() >= c();
            if (headerViewsCount > count - 1 || headerViewsCount < 0) {
                z = true;
            }
            if (!z2 || z || z3) {
                b();
            } else {
                d(headerViewsCount);
            }
        }
    }

    @SuppressLint({"NewApi"})
    private void setHeaderOffet(int i2) {
        Integer num = this.f15616e;
        if (num == null || num.intValue() != i2) {
            this.f15616e = Integer.valueOf(i2);
            if (Build.VERSION.SDK_INT >= 11) {
                this.f15613b.setTranslationY((float) this.f15616e.intValue());
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f15613b.getLayoutParams();
                marginLayoutParams.topMargin = this.f15616e.intValue();
                this.f15613b.setLayoutParams(marginLayoutParams);
            }
            e eVar = this.t;
            if (eVar != null) {
                eVar.a(this, this.f15613b, -this.f15616e.intValue());
            }
        }
    }

    public int a(int i2) {
        if (b(Math.max(0, i2 - getHeaderViewsCount()))) {
            return 0;
        }
        View headerView = this.f15618g.getHeaderView(i2, (View) null, this.f15612a);
        if (headerView != null) {
            a(headerView);
            b(headerView);
            return headerView.getMeasuredHeight();
        }
        throw new NullPointerException("header may not be null");
    }

    public void a(int i2, int i3) {
        int i4 = 0;
        int a2 = i3 + (this.f15618g == null ? 0 : a(i2));
        if (!this.i) {
            i4 = this.m;
        }
        this.f15612a.setSelectionFromTop(i2, a2 - i4);
    }

    public boolean a() {
        return this.f15619h;
    }

    @TargetApi(14)
    public boolean canScrollVertically(int i2) {
        return this.f15612a.canScrollVertically(i2);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.f15612a.getVisibility() == 0 || this.f15612a.getAnimation() != null) {
            drawChild(canvas, this.f15612a, 0);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getAction() & 255) == 0) {
            this.p = motionEvent.getY();
            View view = this.f15613b;
            this.q = view != null && this.p <= ((float) (view.getHeight() + this.f15616e.intValue()));
        }
        if (!this.q) {
            return this.f15612a.dispatchTouchEvent(motionEvent);
        }
        if (this.f15613b != null && Math.abs(this.p - motionEvent.getY()) <= this.r) {
            return this.f15613b.dispatchTouchEvent(motionEvent);
        }
        if (this.f15613b != null) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setAction(3);
            this.f15613b.dispatchTouchEvent(obtain);
            obtain.recycle();
        }
        MotionEvent obtain2 = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getX(), this.p, motionEvent.getMetaState());
        obtain2.setAction(0);
        boolean dispatchTouchEvent = this.f15612a.dispatchTouchEvent(obtain2);
        obtain2.recycle();
        this.q = false;
        return dispatchTouchEvent;
    }

    public m getAdapter() {
        c cVar = this.f15618g;
        if (cVar == null) {
            return null;
        }
        return cVar.f15590a;
    }

    @Deprecated
    public boolean getAreHeadersSticky() {
        return a();
    }

    @TargetApi(11)
    public int getCheckedItemCount() {
        if (c(11)) {
            return this.f15612a.getCheckedItemCount();
        }
        return 0;
    }

    @TargetApi(8)
    public long[] getCheckedItemIds() {
        if (c(8)) {
            return this.f15612a.getCheckedItemIds();
        }
        return null;
    }

    @TargetApi(11)
    public int getCheckedItemPosition() {
        return this.f15612a.getCheckedItemPosition();
    }

    @TargetApi(11)
    public SparseBooleanArray getCheckedItemPositions() {
        return this.f15612a.getCheckedItemPositions();
    }

    public int getCount() {
        return this.f15612a.getCount();
    }

    public Drawable getDivider() {
        return this.w;
    }

    public int getDividerHeight() {
        return this.x;
    }

    public View getEmptyView() {
        return this.f15612a.getEmptyView();
    }

    public int getFirstVisiblePosition() {
        return this.f15612a.getFirstVisiblePosition();
    }

    public int getFooterViewsCount() {
        return this.f15612a.getFooterViewsCount();
    }

    public int getHeaderViewsCount() {
        return this.f15612a.getHeaderViewsCount();
    }

    public int getLastVisiblePosition() {
        return this.f15612a.getLastVisiblePosition();
    }

    public int getListChildCount() {
        return this.f15612a.getChildCount();
    }

    @TargetApi(9)
    public int getOverScrollMode() {
        if (c(9)) {
            return this.f15612a.getOverScrollMode();
        }
        return 0;
    }

    public int getPaddingBottom() {
        return this.o;
    }

    public int getPaddingLeft() {
        return this.l;
    }

    public int getPaddingRight() {
        return this.n;
    }

    public int getPaddingTop() {
        return this.m;
    }

    public int getScrollBarStyle() {
        return this.f15612a.getScrollBarStyle();
    }

    public int getStickyHeaderTopOffset() {
        return this.k;
    }

    public ListView getWrappedList() {
        return this.f15612a;
    }

    public boolean isHorizontalScrollBarEnabled() {
        return this.f15612a.isHorizontalScrollBarEnabled();
    }

    public boolean isVerticalScrollBarEnabled() {
        return this.f15612a.isVerticalScrollBarEnabled();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        s sVar = this.f15612a;
        sVar.layout(0, 0, sVar.getMeasuredWidth(), getHeight());
        View view = this.f15613b;
        if (view != null) {
            int i6 = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin;
            View view2 = this.f15613b;
            view2.layout(this.l, i6, view2.getMeasuredWidth() + this.l, this.f15613b.getMeasuredHeight() + i6);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        b(this.f15613b);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(View.BaseSavedState.EMPTY_STATE);
        this.f15612a.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        if (super.onSaveInstanceState() == View.BaseSavedState.EMPTY_STATE) {
            return this.f15612a.onSaveInstanceState();
        }
        throw new IllegalStateException("Handling non empty state of parent class is not implemented");
    }

    public void setAdapter(m mVar) {
        s sVar;
        c cVar = null;
        if (mVar == null) {
            c cVar2 = this.f15618g;
            if (cVar2 instanceof l) {
                ((l) cVar2).f15607h = null;
            }
            c cVar3 = this.f15618g;
            if (cVar3 != null) {
                cVar3.f15590a = null;
            }
            sVar = this.f15612a;
        } else {
            c cVar4 = this.f15618g;
            if (cVar4 != null) {
                cVar4.unregisterDataSetObserver(this.v);
            }
            this.f15618g = mVar instanceof SectionIndexer ? new l(getContext(), mVar) : new c(getContext(), mVar);
            this.v = new a(this, (n) null);
            this.f15618g.registerDataSetObserver(this.v);
            if (this.s != null) {
                this.f15618g.a((c.a) new b(this, (n) null));
            } else {
                this.f15618g.a((c.a) null);
            }
            this.f15618g.a(this.w, this.x);
            sVar = this.f15612a;
            cVar = this.f15618g;
        }
        sVar.setAdapter(cVar);
        b();
    }

    public void setAreHeadersSticky(boolean z) {
        this.f15619h = z;
        if (!z) {
            b();
        } else {
            e(this.f15612a.a());
        }
        this.f15612a.invalidate();
    }

    public void setBlockLayoutChildren(boolean z) {
        this.f15612a.a(z);
    }

    @TargetApi(11)
    public void setChoiceMode(int i2) {
        this.f15612a.setChoiceMode(i2);
    }

    public void setClipToPadding(boolean z) {
        s sVar = this.f15612a;
        if (sVar != null) {
            sVar.setClipToPadding(z);
        }
        this.i = z;
    }

    public void setDivider(Drawable drawable) {
        this.w = drawable;
        c cVar = this.f15618g;
        if (cVar != null) {
            cVar.a(this.w, this.x);
        }
    }

    public void setDividerHeight(int i2) {
        this.x = i2;
        c cVar = this.f15618g;
        if (cVar != null) {
            cVar.a(this.w, this.x);
        }
    }

    public void setDrawingListUnderStickyHeader(boolean z) {
        this.j = z;
        this.f15612a.a(0);
    }

    public void setEmptyView(View view) {
        this.f15612a.setEmptyView(view);
    }

    @TargetApi(11)
    public void setFastScrollAlwaysVisible(boolean z) {
        if (c(11)) {
            this.f15612a.setFastScrollAlwaysVisible(z);
        }
    }

    public void setFastScrollEnabled(boolean z) {
        this.f15612a.setFastScrollEnabled(z);
    }

    public void setHorizontalScrollBarEnabled(boolean z) {
        this.f15612a.setHorizontalScrollBarEnabled(z);
    }

    @TargetApi(11)
    public void setMultiChoiceModeListener(AbsListView.MultiChoiceModeListener multiChoiceModeListener) {
        if (c(11)) {
            this.f15612a.setMultiChoiceModeListener(multiChoiceModeListener);
        }
    }

    public void setOnCreateContextMenuListener(View.OnCreateContextMenuListener onCreateContextMenuListener) {
        this.f15612a.setOnCreateContextMenuListener(onCreateContextMenuListener);
    }

    public void setOnHeaderClickListener(c cVar) {
        this.s = cVar;
        c cVar2 = this.f15618g;
        if (cVar2 == null) {
            return;
        }
        if (this.s != null) {
            cVar2.a((c.a) new b(this, (n) null));
            View view = this.f15613b;
            if (view != null) {
                view.setOnClickListener(new o(this));
                return;
            }
            return;
        }
        cVar2.a((c.a) null);
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.f15612a.setOnItemClickListener(onItemClickListener);
    }

    public void setOnItemLongClickListener(AdapterView.OnItemLongClickListener onItemLongClickListener) {
        this.f15612a.setOnItemLongClickListener(onItemLongClickListener);
    }

    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.f15617f = onScrollListener;
    }

    public void setOnStickyHeaderChangedListener(d dVar) {
        this.u = dVar;
    }

    public void setOnStickyHeaderOffsetChangedListener(e eVar) {
        this.t = eVar;
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        if (onTouchListener != null) {
            this.f15612a.setOnTouchListener(new p(this, onTouchListener));
        } else {
            this.f15612a.setOnTouchListener((View.OnTouchListener) null);
        }
    }

    @TargetApi(9)
    public void setOverScrollMode(int i2) {
        s sVar;
        if (c(9) && (sVar = this.f15612a) != null) {
            sVar.setOverScrollMode(i2);
        }
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
        this.l = i2;
        this.m = i3;
        this.n = i4;
        this.o = i5;
        s sVar = this.f15612a;
        if (sVar != null) {
            sVar.setPadding(i2, i3, i4, i5);
        }
        super.setPadding(0, 0, 0, 0);
        requestLayout();
    }

    public void setScrollBarStyle(int i2) {
        this.f15612a.setScrollBarStyle(i2);
    }

    public void setSelection(int i2) {
        a(i2, 0);
    }

    public void setSelector(int i2) {
        this.f15612a.setSelector(i2);
    }

    public void setSelector(Drawable drawable) {
        this.f15612a.setSelector(drawable);
    }

    public void setStackFromBottom(boolean z) {
        this.f15612a.setStackFromBottom(z);
    }

    public void setStickyHeaderTopOffset(int i2) {
        this.k = i2;
        e(this.f15612a.a());
    }

    public void setTranscriptMode(int i2) {
        this.f15612a.setTranscriptMode(i2);
    }

    public void setVerticalScrollBarEnabled(boolean z) {
        this.f15612a.setVerticalScrollBarEnabled(z);
    }

    public boolean showContextMenu() {
        return this.f15612a.showContextMenu();
    }
}
