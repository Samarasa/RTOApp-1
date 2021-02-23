package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.M;
import androidx.recyclerview.widget.N;
import androidx.recyclerview.widget.p;
import b.h.j.C0195a;
import b.h.j.C0203i;
import b.h.j.a.c;
import b.h.j.y;
import b.h.j.z;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecyclerView extends ViewGroup implements b.h.j.s, C0203i, b.h.j.j {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f1312a = {16843830};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f1313b = {16842987};

    /* renamed from: c  reason: collision with root package name */
    static final boolean f1314c;

    /* renamed from: d  reason: collision with root package name */
    static final boolean f1315d = (Build.VERSION.SDK_INT >= 23);

    /* renamed from: e  reason: collision with root package name */
    static final boolean f1316e = (Build.VERSION.SDK_INT >= 16);

    /* renamed from: f  reason: collision with root package name */
    static final boolean f1317f = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: g  reason: collision with root package name */
    private static final boolean f1318g = (Build.VERSION.SDK_INT <= 15);

    /* renamed from: h  reason: collision with root package name */
    private static final boolean f1319h = (Build.VERSION.SDK_INT <= 15);
    private static final Class<?>[] i;
    static final Interpolator j = new z();
    private m A;
    private final int[] Aa;
    boolean B;
    private b.h.j.l Ba;
    boolean C;
    private final int[] Ca;
    boolean D;
    private final int[] Da;
    boolean E;
    final int[] Ea;
    private int F;
    final List<x> Fa;
    boolean G;
    private Runnable Ga;
    boolean H;
    private final N.b Ha;
    private boolean I;
    private int J;
    boolean K;
    private final AccessibilityManager L;
    private List<k> M;
    boolean N;
    boolean O;
    private int P;
    private int Q;
    private e R;
    private EdgeEffect S;
    private EdgeEffect T;
    private EdgeEffect U;
    private EdgeEffect V;
    f W;
    private int aa;
    private int ba;
    private VelocityTracker ca;
    private int da;
    private int ea;
    private int fa;
    private int ga;
    private int ha;
    private l ia;
    private final int ja;
    private final r k;
    private final int ka;
    final p l;
    private float la;
    private s m;
    private float ma;
    C0175a n;
    private boolean na;
    C0176b o;
    final w oa;
    final N p;
    p pa;
    boolean q;
    p.a qa;
    final Runnable r;
    final u ra;
    final Rect s;
    private n sa;
    private final Rect t;
    private List<n> ta;
    final RectF u;
    boolean ua;
    a v;
    boolean va;
    i w;
    private f.b wa;
    q x;
    boolean xa;
    final ArrayList<h> y;
    G ya;
    private final ArrayList<m> z;
    private d za;

    public static abstract class a<VH extends x> {
        private boolean mHasStableIds = false;
        private final b mObservable = new b();

        public final void bindViewHolder(VH vh, int i) {
            vh.mPosition = i;
            if (hasStableIds()) {
                vh.mItemId = getItemId(i);
            }
            vh.setFlags(1, 519);
            b.h.f.a.a("RV OnBindView");
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            vh.clearPayload();
            ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
            if (layoutParams instanceof j) {
                ((j) layoutParams).f1345c = true;
            }
            b.h.f.a.a();
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i) {
            try {
                b.h.f.a.a("RV CreateView");
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i;
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                b.h.f.a.a();
            }
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.b(i, 1);
        }

        public final void notifyItemChanged(int i, Object obj) {
            this.mObservable.a(i, 1, obj);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.c(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.a(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.b(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2, Object obj) {
            this.mObservable.a(i, i2, obj);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.c(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.d(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.d(i, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh, int i);

        public void onBindViewHolder(VH vh, int i, List<Object> list) {
            onBindViewHolder(vh, i);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public void registerAdapterDataObserver(c cVar) {
            this.mObservable.registerObserver(cVar);
        }

        public void setHasStableIds(boolean z) {
            if (!hasObservers()) {
                this.mHasStableIds = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void unregisterAdapterDataObserver(c cVar) {
            this.mObservable.unregisterObserver(cVar);
        }
    }

    static class b extends Observable<c> {
        b() {
        }

        public void a(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((c) this.mObservers.get(size)).a(i, i2, 1);
            }
        }

        public void a(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((c) this.mObservers.get(size)).a(i, i2, obj);
            }
        }

        public boolean a() {
            return !this.mObservers.isEmpty();
        }

        public void b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((c) this.mObservers.get(size)).a();
            }
        }

        public void b(int i, int i2) {
            a(i, i2, (Object) null);
        }

        public void c(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((c) this.mObservers.get(size)).b(i, i2);
            }
        }

        public void d(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((c) this.mObservers.get(size)).c(i, i2);
            }
        }
    }

    public static abstract class c {
        public void a() {
        }

        public void a(int i, int i2) {
        }

        public void a(int i, int i2, int i3) {
        }

        public void a(int i, int i2, Object obj) {
            a(i, i2);
        }

        public void b(int i, int i2) {
        }

        public void c(int i, int i2) {
        }
    }

    public interface d {
        int a(int i, int i2);
    }

    public static class e {
        /* access modifiers changed from: protected */
        public EdgeEffect a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        private b f1320a = null;

        /* renamed from: b  reason: collision with root package name */
        private ArrayList<a> f1321b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        private long f1322c = 120;

        /* renamed from: d  reason: collision with root package name */
        private long f1323d = 120;

        /* renamed from: e  reason: collision with root package name */
        private long f1324e = 250;

        /* renamed from: f  reason: collision with root package name */
        private long f1325f = 250;

        public interface a {
            void a();
        }

        interface b {
            void a(x xVar);
        }

        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f1326a;

            /* renamed from: b  reason: collision with root package name */
            public int f1327b;

            /* renamed from: c  reason: collision with root package name */
            public int f1328c;

            /* renamed from: d  reason: collision with root package name */
            public int f1329d;

            public c a(x xVar) {
                a(xVar, 0);
                return this;
            }

            public c a(x xVar, int i) {
                View view = xVar.itemView;
                this.f1326a = view.getLeft();
                this.f1327b = view.getTop();
                this.f1328c = view.getRight();
                this.f1329d = view.getBottom();
                return this;
            }
        }

        static int a(x xVar) {
            int i = xVar.mFlags & 14;
            if (xVar.isInvalid()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int oldPosition = xVar.getOldPosition();
            int adapterPosition = xVar.getAdapterPosition();
            return (oldPosition == -1 || adapterPosition == -1 || oldPosition == adapterPosition) ? i : i | 2048;
        }

        public c a(u uVar, x xVar) {
            c h2 = h();
            h2.a(xVar);
            return h2;
        }

        public c a(u uVar, x xVar, int i, List<Object> list) {
            c h2 = h();
            h2.a(xVar);
            return h2;
        }

        public final void a() {
            int size = this.f1321b.size();
            for (int i = 0; i < size; i++) {
                this.f1321b.get(i).a();
            }
            this.f1321b.clear();
        }

        /* access modifiers changed from: package-private */
        public void a(b bVar) {
            this.f1320a = bVar;
        }

        public abstract boolean a(x xVar, c cVar, c cVar2);

        public abstract boolean a(x xVar, x xVar2, c cVar, c cVar2);

        public boolean a(x xVar, List<Object> list) {
            return b(xVar);
        }

        public abstract void b();

        public abstract boolean b(x xVar);

        public abstract boolean b(x xVar, c cVar, c cVar2);

        public long c() {
            return this.f1322c;
        }

        public final void c(x xVar) {
            e(xVar);
            b bVar = this.f1320a;
            if (bVar != null) {
                bVar.a(xVar);
            }
        }

        public abstract boolean c(x xVar, c cVar, c cVar2);

        public long d() {
            return this.f1325f;
        }

        public abstract void d(x xVar);

        public long e() {
            return this.f1324e;
        }

        public void e(x xVar) {
        }

        public long f() {
            return this.f1323d;
        }

        public abstract boolean g();

        public c h() {
            return new c();
        }

        public abstract void i();
    }

    private class g implements f.b {
        g() {
        }

        public void a(x xVar) {
            xVar.setIsRecyclable(true);
            if (xVar.mShadowedHolder != null && xVar.mShadowingHolder == null) {
                xVar.mShadowedHolder = null;
            }
            xVar.mShadowingHolder = null;
            if (!xVar.shouldBeKeptAsChild() && !RecyclerView.this.k(xVar.itemView) && xVar.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(xVar.itemView, false);
            }
        }
    }

    public static abstract class h {
        @Deprecated
        public void a(Canvas canvas, RecyclerView recyclerView) {
        }

        public void a(Canvas canvas, RecyclerView recyclerView, u uVar) {
            a(canvas, recyclerView);
        }

        @Deprecated
        public void a(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void a(Rect rect, View view, RecyclerView recyclerView, u uVar) {
            a(rect, ((j) view.getLayoutParams()).a(), recyclerView);
        }

        @Deprecated
        public void b(Canvas canvas, RecyclerView recyclerView) {
        }

        public void b(Canvas canvas, RecyclerView recyclerView, u uVar) {
            b(canvas, recyclerView);
        }
    }

    public static abstract class i {

        /* renamed from: a  reason: collision with root package name */
        C0176b f1331a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView f1332b;

        /* renamed from: c  reason: collision with root package name */
        private final M.b f1333c = new D(this);

        /* renamed from: d  reason: collision with root package name */
        private final M.b f1334d = new E(this);

        /* renamed from: e  reason: collision with root package name */
        M f1335e = new M(this.f1333c);

        /* renamed from: f  reason: collision with root package name */
        M f1336f = new M(this.f1334d);

        /* renamed from: g  reason: collision with root package name */
        t f1337g;

        /* renamed from: h  reason: collision with root package name */
        boolean f1338h = false;
        boolean i = false;
        boolean j = false;
        private boolean k = true;
        private boolean l = true;
        int m;
        boolean n;
        private int o;
        private int p;
        private int q;
        private int r;

        public interface a {
            void a(int i, int i2);
        }

        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public int f1339a;

            /* renamed from: b  reason: collision with root package name */
            public int f1340b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f1341c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f1342d;
        }

        public static int a(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i3, i4) : size : Math.min(size, Math.max(i3, i4));
        }

        public static int a(int i2, int i3, int i4, int i5, boolean z) {
            int i6;
            int i7 = i2 - i4;
            int i8 = 0;
            int max = Math.max(0, i7);
            if (z) {
                if (i5 < 0) {
                    if (i5 == -1) {
                        if (i3 == Integer.MIN_VALUE || (i3 != 0 && i3 == 1073741824)) {
                            i6 = max;
                        } else {
                            i3 = 0;
                            i6 = 0;
                        }
                        i8 = i3;
                        max = i6;
                        return View.MeasureSpec.makeMeasureSpec(max, i8);
                    }
                    max = 0;
                    return View.MeasureSpec.makeMeasureSpec(max, i8);
                }
            } else if (i5 < 0) {
                if (i5 == -1) {
                    i8 = i3;
                } else {
                    if (i5 == -2) {
                        if (i3 == Integer.MIN_VALUE || i3 == 1073741824) {
                            i8 = Integer.MIN_VALUE;
                        }
                    }
                    max = 0;
                }
                return View.MeasureSpec.makeMeasureSpec(max, i8);
            }
            max = i5;
            i8 = 1073741824;
            return View.MeasureSpec.makeMeasureSpec(max, i8);
        }

        public static b a(Context context, AttributeSet attributeSet, int i2, int i3) {
            b bVar = new b();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.o.b.RecyclerView, i2, i3);
            bVar.f1339a = obtainStyledAttributes.getInt(b.o.b.RecyclerView_android_orientation, 1);
            bVar.f1340b = obtainStyledAttributes.getInt(b.o.b.RecyclerView_spanCount, 1);
            bVar.f1341c = obtainStyledAttributes.getBoolean(b.o.b.RecyclerView_reverseLayout, false);
            bVar.f1342d = obtainStyledAttributes.getBoolean(b.o.b.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return bVar;
        }

        private void a(int i2, View view) {
            this.f1331a.a(i2);
        }

        private void a(View view, int i2, boolean z) {
            x g2 = RecyclerView.g(view);
            if (z || g2.isRemoved()) {
                this.f1332b.p.a(g2);
            } else {
                this.f1332b.p.g(g2);
            }
            j jVar = (j) view.getLayoutParams();
            if (g2.wasReturnedFromScrap() || g2.isScrap()) {
                if (g2.isScrap()) {
                    g2.unScrap();
                } else {
                    g2.clearReturnedFromScrapFlag();
                }
                this.f1331a.a(view, i2, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f1332b) {
                int b2 = this.f1331a.b(view);
                if (i2 == -1) {
                    i2 = this.f1331a.a();
                }
                if (b2 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f1332b.indexOfChild(view) + this.f1332b.i());
                } else if (b2 != i2) {
                    this.f1332b.w.a(b2, i2);
                }
            } else {
                this.f1331a.a(view, i2, false);
                jVar.f1345c = true;
                t tVar = this.f1337g;
                if (tVar != null && tVar.c()) {
                    this.f1337g.a(view);
                }
            }
            if (jVar.f1346d) {
                g2.itemView.invalidate();
                jVar.f1346d = false;
            }
        }

        private void a(p pVar, int i2, View view) {
            x g2 = RecyclerView.g(view);
            if (!g2.shouldIgnore()) {
                if (!g2.isInvalid() || g2.isRemoved() || this.f1332b.v.hasStableIds()) {
                    a(i2);
                    pVar.c(view);
                    this.f1332b.p.d(g2);
                    return;
                }
                g(i2);
                pVar.b(g2);
            }
        }

        private static boolean b(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (i4 > 0 && i2 != i4) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i2;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i2;
            }
            return true;
        }

        private int[] c(View view, Rect rect) {
            int[] iArr = new int[2];
            int n2 = n();
            int p2 = p();
            int q2 = q() - o();
            int h2 = h() - m();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i2 = left - n2;
            int min = Math.min(0, i2);
            int i3 = top - p2;
            int min2 = Math.min(0, i3);
            int i4 = width - q2;
            int max = Math.max(0, i4);
            int max2 = Math.max(0, height - h2);
            if (j() != 1) {
                if (min == 0) {
                    min = Math.min(i2, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i4);
            }
            if (min2 == 0) {
                min2 = Math.min(i3, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        private boolean d(RecyclerView recyclerView, int i2, int i3) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int n2 = n();
            int p2 = p();
            int q2 = q() - o();
            int h2 = h() - m();
            Rect rect = this.f1332b.s;
            b(focusedChild, rect);
            return rect.left - i2 < q2 && rect.right - i2 > n2 && rect.top - i3 < h2 && rect.bottom - i3 > p2;
        }

        /* access modifiers changed from: package-private */
        public boolean A() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public void B() {
            t tVar = this.f1337g;
            if (tVar != null) {
                tVar.d();
            }
        }

        public boolean C() {
            return false;
        }

        public int a(int i2, p pVar, u uVar) {
            return 0;
        }

        public int a(p pVar, u uVar) {
            RecyclerView recyclerView = this.f1332b;
            if (recyclerView == null || recyclerView.v == null || !a()) {
                return 1;
            }
            return this.f1332b.v.getItemCount();
        }

        public int a(u uVar) {
            return 0;
        }

        public View a(View view, int i2, p pVar, u uVar) {
            return null;
        }

        public j a(Context context, AttributeSet attributeSet) {
            return new j(context, attributeSet);
        }

        public j a(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof j ? new j((j) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new j((ViewGroup.MarginLayoutParams) layoutParams) : new j(layoutParams);
        }

        public void a(int i2) {
            a(i2, c(i2));
        }

        public void a(int i2, int i3) {
            View c2 = c(i2);
            if (c2 != null) {
                a(i2);
                c(c2, i3);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i2 + this.f1332b.toString());
        }

        public void a(int i2, int i3, u uVar, a aVar) {
        }

        public void a(int i2, a aVar) {
        }

        public void a(int i2, p pVar) {
            View c2 = c(i2);
            g(i2);
            pVar.b(c2);
        }

        public void a(Rect rect, int i2, int i3) {
            c(a(i2, rect.width() + n() + o(), l()), a(i3, rect.height() + p() + m(), k()));
        }

        public void a(Parcelable parcelable) {
        }

        public void a(View view) {
            a(view, -1);
        }

        public void a(View view, int i2) {
            a(view, i2, true);
        }

        public void a(View view, int i2, int i3) {
            j jVar = (j) view.getLayoutParams();
            Rect h2 = this.f1332b.h(view);
            int i4 = i2 + h2.left + h2.right;
            int i5 = i3 + h2.top + h2.bottom;
            int a2 = a(q(), r(), n() + o() + jVar.leftMargin + jVar.rightMargin + i4, jVar.width, a());
            int a3 = a(h(), i(), p() + m() + jVar.topMargin + jVar.bottomMargin + i5, jVar.height, b());
            if (a(view, a2, a3, jVar)) {
                view.measure(a2, a3);
            }
        }

        public void a(View view, int i2, int i3, int i4, int i5) {
            j jVar = (j) view.getLayoutParams();
            Rect rect = jVar.f1344b;
            view.layout(i2 + rect.left + jVar.leftMargin, i3 + rect.top + jVar.topMargin, (i4 - rect.right) - jVar.rightMargin, (i5 - rect.bottom) - jVar.bottomMargin);
        }

        public void a(View view, int i2, j jVar) {
            x g2 = RecyclerView.g(view);
            if (g2.isRemoved()) {
                this.f1332b.p.a(g2);
            } else {
                this.f1332b.p.g(g2);
            }
            this.f1331a.a(view, i2, jVar, g2.isRemoved());
        }

        public void a(View view, Rect rect) {
            RecyclerView recyclerView = this.f1332b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.h(view));
            }
        }

        public void a(View view, p pVar) {
            o(view);
            pVar.b(view);
        }

        /* access modifiers changed from: package-private */
        public void a(View view, b.h.j.a.c cVar) {
            x g2 = RecyclerView.g(view);
            if (g2 != null && !g2.isRemoved() && !this.f1331a.c(g2.itemView)) {
                RecyclerView recyclerView = this.f1332b;
                a(recyclerView.l, recyclerView.ra, view, cVar);
            }
        }

        public void a(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((j) view.getLayoutParams()).f1344b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f1332b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f1332b.u;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void a(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f1332b;
            a(recyclerView.l, recyclerView.ra, accessibilityEvent);
        }

        public void a(a aVar, a aVar2) {
        }

        public void a(p pVar) {
            for (int e2 = e() - 1; e2 >= 0; e2--) {
                a(pVar, e2, c(e2));
            }
        }

        public void a(p pVar, u uVar, int i2, int i3) {
            this.f1332b.c(i2, i3);
        }

        public void a(p pVar, u uVar, View view, b.h.j.a.c cVar) {
            cVar.b((Object) c.C0035c.a(b() ? l(view) : 0, 1, a() ? l(view) : 0, 1, false, false));
        }

        public void a(p pVar, u uVar, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f1332b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f1332b.canScrollVertically(-1) && !this.f1332b.canScrollHorizontally(-1) && !this.f1332b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                a aVar = this.f1332b.v;
                if (aVar != null) {
                    accessibilityEvent.setItemCount(aVar.getItemCount());
                }
            }
        }

        public void a(p pVar, u uVar, b.h.j.a.c cVar) {
            if (this.f1332b.canScrollVertically(-1) || this.f1332b.canScrollHorizontally(-1)) {
                cVar.a(8192);
                cVar.l(true);
            }
            if (this.f1332b.canScrollVertically(1) || this.f1332b.canScrollHorizontally(1)) {
                cVar.a(4096);
                cVar.l(true);
            }
            cVar.a((Object) c.b.a(b(pVar, uVar), a(pVar, uVar), d(pVar, uVar), c(pVar, uVar)));
        }

        /* access modifiers changed from: package-private */
        public void a(RecyclerView recyclerView) {
            this.i = true;
            b(recyclerView);
        }

        public void a(RecyclerView recyclerView, int i2, int i3) {
        }

        public void a(RecyclerView recyclerView, int i2, int i3, int i4) {
        }

        public void a(RecyclerView recyclerView, int i2, int i3, Object obj) {
            c(recyclerView, i2, i3);
        }

        /* access modifiers changed from: package-private */
        public void a(RecyclerView recyclerView, p pVar) {
            this.i = false;
            b(recyclerView, pVar);
        }

        /* access modifiers changed from: package-private */
        public void a(b.h.j.a.c cVar) {
            RecyclerView recyclerView = this.f1332b;
            a(recyclerView.l, recyclerView.ra, cVar);
        }

        public void a(String str) {
            RecyclerView recyclerView = this.f1332b;
            if (recyclerView != null) {
                recyclerView.a(str);
            }
        }

        public boolean a() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i2, Bundle bundle) {
            RecyclerView recyclerView = this.f1332b;
            return a(recyclerView.l, recyclerView.ra, i2, bundle);
        }

        /* access modifiers changed from: package-private */
        public boolean a(View view, int i2, int i3, j jVar) {
            return view.isLayoutRequested() || !this.k || !b(view.getWidth(), i2, jVar.width) || !b(view.getHeight(), i3, jVar.height);
        }

        /* access modifiers changed from: package-private */
        public boolean a(View view, int i2, Bundle bundle) {
            RecyclerView recyclerView = this.f1332b;
            return a(recyclerView.l, recyclerView.ra, view, i2, bundle);
        }

        public boolean a(View view, boolean z, boolean z2) {
            boolean z3 = this.f1335e.a(view, 24579) && this.f1336f.a(view, 24579);
            return z ? z3 : !z3;
        }

        public boolean a(j jVar) {
            return jVar != null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0070 A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(androidx.recyclerview.widget.RecyclerView.p r2, androidx.recyclerview.widget.RecyclerView.u r3, int r4, android.os.Bundle r5) {
            /*
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r2 = r1.f1332b
                r3 = 0
                if (r2 != 0) goto L_0x0006
                return r3
            L_0x0006:
                r5 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r4 == r5) goto L_0x0042
                r5 = 8192(0x2000, float:1.14794E-41)
                if (r4 == r5) goto L_0x0012
                r2 = 0
            L_0x0010:
                r4 = 0
                goto L_0x006e
            L_0x0012:
                r4 = -1
                boolean r2 = r2.canScrollVertically(r4)
                if (r2 == 0) goto L_0x0029
                int r2 = r1.h()
                int r5 = r1.p()
                int r2 = r2 - r5
                int r5 = r1.m()
                int r2 = r2 - r5
                int r2 = -r2
                goto L_0x002a
            L_0x0029:
                r2 = 0
            L_0x002a:
                androidx.recyclerview.widget.RecyclerView r5 = r1.f1332b
                boolean r4 = r5.canScrollHorizontally(r4)
                if (r4 == 0) goto L_0x0010
                int r4 = r1.q()
                int r5 = r1.n()
                int r4 = r4 - r5
                int r5 = r1.o()
                int r4 = r4 - r5
                int r4 = -r4
                goto L_0x006e
            L_0x0042:
                boolean r2 = r2.canScrollVertically(r0)
                if (r2 == 0) goto L_0x0057
                int r2 = r1.h()
                int r4 = r1.p()
                int r2 = r2 - r4
                int r4 = r1.m()
                int r2 = r2 - r4
                goto L_0x0058
            L_0x0057:
                r2 = 0
            L_0x0058:
                androidx.recyclerview.widget.RecyclerView r4 = r1.f1332b
                boolean r4 = r4.canScrollHorizontally(r0)
                if (r4 == 0) goto L_0x0010
                int r4 = r1.q()
                int r5 = r1.n()
                int r4 = r4 - r5
                int r5 = r1.o()
                int r4 = r4 - r5
            L_0x006e:
                if (r2 != 0) goto L_0x0073
                if (r4 != 0) goto L_0x0073
                return r3
            L_0x0073:
                androidx.recyclerview.widget.RecyclerView r3 = r1.f1332b
                r3.i(r4, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.i.a(androidx.recyclerview.widget.RecyclerView$p, androidx.recyclerview.widget.RecyclerView$u, int, android.os.Bundle):boolean");
        }

        public boolean a(p pVar, u uVar, View view, int i2, Bundle bundle) {
            return false;
        }

        public boolean a(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return a(recyclerView, view, rect, z, false);
        }

        public boolean a(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] c2 = c(view, rect);
            int i2 = c2[0];
            int i3 = c2[1];
            if ((z2 && !d(recyclerView, i2, i3)) || (i2 == 0 && i3 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i2, i3);
            } else {
                recyclerView.i(i2, i3);
            }
            return true;
        }

        @Deprecated
        public boolean a(RecyclerView recyclerView, View view, View view2) {
            return w() || recyclerView.n();
        }

        public boolean a(RecyclerView recyclerView, u uVar, View view, View view2) {
            return a(recyclerView, view, view2);
        }

        public boolean a(RecyclerView recyclerView, ArrayList<View> arrayList, int i2, int i3) {
            return false;
        }

        public boolean a(Runnable runnable) {
            RecyclerView recyclerView = this.f1332b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public int b(int i2, p pVar, u uVar) {
            return 0;
        }

        public int b(p pVar, u uVar) {
            RecyclerView recyclerView = this.f1332b;
            if (recyclerView == null || recyclerView.v == null || !b()) {
                return 1;
            }
            return this.f1332b.v.getItemCount();
        }

        public int b(u uVar) {
            return 0;
        }

        public View b(int i2) {
            int e2 = e();
            for (int i3 = 0; i3 < e2; i3++) {
                View c2 = c(i3);
                x g2 = RecyclerView.g(c2);
                if (g2 != null && g2.getLayoutPosition() == i2 && !g2.shouldIgnore() && (this.f1332b.ra.d() || !g2.isRemoved())) {
                    return c2;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void b(int i2, int i3) {
            this.q = View.MeasureSpec.getSize(i2);
            this.o = View.MeasureSpec.getMode(i2);
            if (this.o == 0 && !RecyclerView.f1315d) {
                this.q = 0;
            }
            this.r = View.MeasureSpec.getSize(i3);
            this.p = View.MeasureSpec.getMode(i3);
            if (this.p == 0 && !RecyclerView.f1315d) {
                this.r = 0;
            }
        }

        public void b(View view) {
            b(view, -1);
        }

        public void b(View view, int i2) {
            a(view, i2, false);
        }

        public void b(View view, Rect rect) {
            RecyclerView.a(view, rect);
        }

        public void b(p pVar) {
            for (int e2 = e() - 1; e2 >= 0; e2--) {
                if (!RecyclerView.g(c(e2)).shouldIgnore()) {
                    a(e2, pVar);
                }
            }
        }

        public void b(RecyclerView recyclerView) {
        }

        public void b(RecyclerView recyclerView, int i2, int i3) {
        }

        public void b(RecyclerView recyclerView, p pVar) {
            c(recyclerView);
        }

        public boolean b() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean b(View view, int i2, int i3, j jVar) {
            return !this.k || !b(view.getMeasuredWidth(), i2, jVar.width) || !b(view.getMeasuredHeight(), i3, jVar.height);
        }

        public int c(p pVar, u uVar) {
            return 0;
        }

        public int c(u uVar) {
            return 0;
        }

        public View c(int i2) {
            C0176b bVar = this.f1331a;
            if (bVar != null) {
                return bVar.c(i2);
            }
            return null;
        }

        public View c(View view) {
            View c2;
            RecyclerView recyclerView = this.f1332b;
            if (recyclerView == null || (c2 = recyclerView.c(view)) == null || this.f1331a.c(c2)) {
                return null;
            }
            return c2;
        }

        public abstract j c();

        public void c(int i2, int i3) {
            this.f1332b.setMeasuredDimension(i2, i3);
        }

        public void c(View view, int i2) {
            a(view, i2, (j) view.getLayoutParams());
        }

        /* access modifiers changed from: package-private */
        public void c(p pVar) {
            int e2 = pVar.e();
            for (int i2 = e2 - 1; i2 >= 0; i2--) {
                View c2 = pVar.c(i2);
                x g2 = RecyclerView.g(c2);
                if (!g2.shouldIgnore()) {
                    g2.setIsRecyclable(false);
                    if (g2.isTmpDetached()) {
                        this.f1332b.removeDetachedView(c2, false);
                    }
                    f fVar = this.f1332b.W;
                    if (fVar != null) {
                        fVar.d(g2);
                    }
                    g2.setIsRecyclable(true);
                    pVar.a(c2);
                }
            }
            pVar.c();
            if (e2 > 0) {
                this.f1332b.invalidate();
            }
        }

        @Deprecated
        public void c(RecyclerView recyclerView) {
        }

        public void c(RecyclerView recyclerView, int i2, int i3) {
        }

        public int d() {
            return -1;
        }

        public int d(View view) {
            return ((j) view.getLayoutParams()).f1344b.bottom;
        }

        public int d(u uVar) {
            return 0;
        }

        public View d(View view, int i2) {
            return null;
        }

        public void d(int i2) {
            RecyclerView recyclerView = this.f1332b;
            if (recyclerView != null) {
                recyclerView.c(i2);
            }
        }

        /* access modifiers changed from: package-private */
        public void d(int i2, int i3) {
            int e2 = e();
            if (e2 == 0) {
                this.f1332b.c(i2, i3);
                return;
            }
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MIN_VALUE;
            int i7 = Integer.MIN_VALUE;
            for (int i8 = 0; i8 < e2; i8++) {
                View c2 = c(i8);
                Rect rect = this.f1332b.s;
                b(c2, rect);
                int i9 = rect.left;
                if (i9 < i4) {
                    i4 = i9;
                }
                int i10 = rect.right;
                if (i10 > i6) {
                    i6 = i10;
                }
                int i11 = rect.top;
                if (i11 < i5) {
                    i5 = i11;
                }
                int i12 = rect.bottom;
                if (i12 > i7) {
                    i7 = i12;
                }
            }
            this.f1332b.s.set(i4, i5, i6, i7);
            a(this.f1332b.s, i2, i3);
        }

        public void d(RecyclerView recyclerView) {
        }

        public boolean d(p pVar, u uVar) {
            return false;
        }

        public int e() {
            C0176b bVar = this.f1331a;
            if (bVar != null) {
                return bVar.a();
            }
            return 0;
        }

        public int e(View view) {
            return view.getBottom() + d(view);
        }

        public int e(u uVar) {
            return 0;
        }

        public void e(int i2) {
            RecyclerView recyclerView = this.f1332b;
            if (recyclerView != null) {
                recyclerView.d(i2);
            }
        }

        public void e(p pVar, u uVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* access modifiers changed from: package-private */
        public void e(RecyclerView recyclerView) {
            b(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public int f(View view) {
            return view.getLeft() - k(view);
        }

        public int f(u uVar) {
            return 0;
        }

        public void f(int i2) {
        }

        /* access modifiers changed from: package-private */
        public void f(RecyclerView recyclerView) {
            int i2;
            if (recyclerView == null) {
                this.f1332b = null;
                this.f1331a = null;
                i2 = 0;
                this.q = 0;
            } else {
                this.f1332b = recyclerView;
                this.f1331a = recyclerView.o;
                this.q = recyclerView.getWidth();
                i2 = recyclerView.getHeight();
            }
            this.r = i2;
            this.o = 1073741824;
            this.p = 1073741824;
        }

        public boolean f() {
            RecyclerView recyclerView = this.f1332b;
            return recyclerView != null && recyclerView.q;
        }

        public int g(View view) {
            Rect rect = ((j) view.getLayoutParams()).f1344b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public View g() {
            View focusedChild;
            RecyclerView recyclerView = this.f1332b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f1331a.c(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void g(int i2) {
            if (c(i2) != null) {
                this.f1331a.e(i2);
            }
        }

        public void g(u uVar) {
        }

        public int h() {
            return this.r;
        }

        public int h(View view) {
            Rect rect = ((j) view.getLayoutParams()).f1344b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int i() {
            return this.p;
        }

        public int i(View view) {
            return view.getRight() + m(view);
        }

        public int j() {
            return y.m(this.f1332b);
        }

        public int j(View view) {
            return view.getTop() - n(view);
        }

        public int k() {
            return y.n(this.f1332b);
        }

        public int k(View view) {
            return ((j) view.getLayoutParams()).f1344b.left;
        }

        public int l() {
            return y.o(this.f1332b);
        }

        public int l(View view) {
            return ((j) view.getLayoutParams()).a();
        }

        public int m() {
            RecyclerView recyclerView = this.f1332b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int m(View view) {
            return ((j) view.getLayoutParams()).f1344b.right;
        }

        public int n() {
            RecyclerView recyclerView = this.f1332b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int n(View view) {
            return ((j) view.getLayoutParams()).f1344b.top;
        }

        public int o() {
            RecyclerView recyclerView = this.f1332b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public void o(View view) {
            this.f1331a.d(view);
        }

        public int p() {
            RecyclerView recyclerView = this.f1332b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int q() {
            return this.q;
        }

        public int r() {
            return this.o;
        }

        /* access modifiers changed from: package-private */
        public boolean s() {
            int e2 = e();
            for (int i2 = 0; i2 < e2; i2++) {
                ViewGroup.LayoutParams layoutParams = c(i2).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean t() {
            return this.i;
        }

        public boolean u() {
            return this.j;
        }

        public final boolean v() {
            return this.l;
        }

        public boolean w() {
            t tVar = this.f1337g;
            return tVar != null && tVar.c();
        }

        public Parcelable x() {
            return null;
        }

        public void y() {
            RecyclerView recyclerView = this.f1332b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void z() {
            this.f1338h = true;
        }
    }

    public static class j extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        x f1343a;

        /* renamed from: b  reason: collision with root package name */
        final Rect f1344b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        boolean f1345c = true;

        /* renamed from: d  reason: collision with root package name */
        boolean f1346d = false;

        public j(int i, int i2) {
            super(i, i2);
        }

        public j(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public j(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public j(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public j(j jVar) {
            super(jVar);
        }

        public int a() {
            return this.f1343a.getLayoutPosition();
        }

        public boolean b() {
            return this.f1343a.isUpdated();
        }

        public boolean c() {
            return this.f1343a.isRemoved();
        }

        public boolean d() {
            return this.f1343a.isInvalid();
        }
    }

    public interface k {
        void a(View view);

        void b(View view);
    }

    public static abstract class l {
        public abstract boolean a(int i, int i2);
    }

    public interface m {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        void a(boolean z);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    public static abstract class n {
        public void a(RecyclerView recyclerView, int i) {
        }

        public void a(RecyclerView recyclerView, int i, int i2) {
        }
    }

    public static class o {

        /* renamed from: a  reason: collision with root package name */
        SparseArray<a> f1347a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        private int f1348b = 0;

        static class a {

            /* renamed from: a  reason: collision with root package name */
            final ArrayList<x> f1349a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            int f1350b = 5;

            /* renamed from: c  reason: collision with root package name */
            long f1351c = 0;

            /* renamed from: d  reason: collision with root package name */
            long f1352d = 0;

            a() {
            }
        }

        private a b(int i) {
            a aVar = this.f1347a.get(i);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f1347a.put(i, aVar2);
            return aVar2;
        }

        /* access modifiers changed from: package-private */
        public long a(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        public x a(int i) {
            a aVar = this.f1347a.get(i);
            if (aVar == null || aVar.f1349a.isEmpty()) {
                return null;
            }
            ArrayList<x> arrayList = aVar.f1349a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f1348b++;
        }

        /* access modifiers changed from: package-private */
        public void a(int i, long j) {
            a b2 = b(i);
            b2.f1352d = a(b2.f1352d, j);
        }

        /* access modifiers changed from: package-private */
        public void a(a aVar, a aVar2, boolean z) {
            if (aVar != null) {
                c();
            }
            if (!z && this.f1348b == 0) {
                b();
            }
            if (aVar2 != null) {
                a();
            }
        }

        public void a(x xVar) {
            int itemViewType = xVar.getItemViewType();
            ArrayList<x> arrayList = b(itemViewType).f1349a;
            if (this.f1347a.get(itemViewType).f1350b > arrayList.size()) {
                xVar.resetInternal();
                arrayList.add(xVar);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i, long j, long j2) {
            long j3 = b(i).f1352d;
            return j3 == 0 || j + j3 < j2;
        }

        public void b() {
            for (int i = 0; i < this.f1347a.size(); i++) {
                this.f1347a.valueAt(i).f1349a.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public void b(int i, long j) {
            a b2 = b(i);
            b2.f1351c = a(b2.f1351c, j);
        }

        /* access modifiers changed from: package-private */
        public boolean b(int i, long j, long j2) {
            long j3 = b(i).f1351c;
            return j3 == 0 || j + j3 < j2;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f1348b--;
        }
    }

    public final class p {

        /* renamed from: a  reason: collision with root package name */
        final ArrayList<x> f1353a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        ArrayList<x> f1354b = null;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList<x> f1355c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        private final List<x> f1356d = Collections.unmodifiableList(this.f1353a);

        /* renamed from: e  reason: collision with root package name */
        private int f1357e = 2;

        /* renamed from: f  reason: collision with root package name */
        int f1358f = 2;

        /* renamed from: g  reason: collision with root package name */
        o f1359g;

        /* renamed from: h  reason: collision with root package name */
        private v f1360h;

        public p() {
        }

        private void a(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    a((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        private boolean a(x xVar, int i2, int i3, long j) {
            xVar.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = xVar.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.f1359g.a(itemViewType, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.v.bindViewHolder(xVar, i2);
            this.f1359g.a(xVar.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            e(xVar);
            if (!RecyclerView.this.ra.d()) {
                return true;
            }
            xVar.mPreLayoutPosition = i3;
            return true;
        }

        private void e(x xVar) {
            if (RecyclerView.this.m()) {
                View view = xVar.itemView;
                if (y.k(view) == 0) {
                    y.e(view, 1);
                }
                C0195a b2 = y.b(view);
                if (b2 == null || b2.getClass().equals(C0195a.class)) {
                    xVar.addFlags(16384);
                    y.a(view, RecyclerView.this.ya.b());
                }
            }
        }

        private void f(x xVar) {
            View view = xVar.itemView;
            if (view instanceof ViewGroup) {
                a((ViewGroup) view, false);
            }
        }

        public int a(int i2) {
            if (i2 >= 0 && i2 < RecyclerView.this.ra.a()) {
                return !RecyclerView.this.ra.d() ? i2 : RecyclerView.this.n.b(i2);
            }
            throw new IndexOutOfBoundsException("invalid position " + i2 + ". State item count is " + RecyclerView.this.ra.a() + RecyclerView.this.i());
        }

        /* access modifiers changed from: package-private */
        public x a(int i2, boolean z) {
            View b2;
            int size = this.f1353a.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                x xVar = this.f1353a.get(i4);
                if (xVar.wasReturnedFromScrap() || xVar.getLayoutPosition() != i2 || xVar.isInvalid() || (!RecyclerView.this.ra.f1370h && xVar.isRemoved())) {
                    i4++;
                } else {
                    xVar.addFlags(32);
                    return xVar;
                }
            }
            if (z || (b2 = RecyclerView.this.o.b(i2)) == null) {
                int size2 = this.f1355c.size();
                while (i3 < size2) {
                    x xVar2 = this.f1355c.get(i3);
                    if (xVar2.isInvalid() || xVar2.getLayoutPosition() != i2 || xVar2.isAttachedToTransitionOverlay()) {
                        i3++;
                    } else {
                        if (!z) {
                            this.f1355c.remove(i3);
                        }
                        return xVar2;
                    }
                }
                return null;
            }
            x g2 = RecyclerView.g(b2);
            RecyclerView.this.o.f(b2);
            int b3 = RecyclerView.this.o.b(b2);
            if (b3 != -1) {
                RecyclerView.this.o.a(b3);
                c(b2);
                g2.addFlags(8224);
                return g2;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + g2 + RecyclerView.this.i());
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x01a1  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x01ca  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x01cd  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x01fd  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x020b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.x a(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L_0x0227
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$u r1 = r1.ra
                int r1 = r1.a()
                if (r3 >= r1) goto L_0x0227
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$u r1 = r1.ra
                boolean r1 = r1.d()
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0027
                androidx.recyclerview.widget.RecyclerView$x r1 = r16.b((int) r17)
                if (r1 == 0) goto L_0x0028
                r4 = 1
                goto L_0x0029
            L_0x0027:
                r1 = r2
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r1 != 0) goto L_0x005d
                androidx.recyclerview.widget.RecyclerView$x r1 = r16.a((int) r17, (boolean) r18)
                if (r1 == 0) goto L_0x005d
                boolean r5 = r6.d((androidx.recyclerview.widget.RecyclerView.x) r1)
                if (r5 != 0) goto L_0x005c
                if (r0 != 0) goto L_0x005a
                r5 = 4
                r1.addFlags(r5)
                boolean r5 = r1.isScrap()
                if (r5 == 0) goto L_0x004e
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r1.itemView
                r5.removeDetachedView(r9, r8)
                r1.unScrap()
                goto L_0x0057
            L_0x004e:
                boolean r5 = r1.wasReturnedFromScrap()
                if (r5 == 0) goto L_0x0057
                r1.clearReturnedFromScrapFlag()
            L_0x0057:
                r6.b((androidx.recyclerview.widget.RecyclerView.x) r1)
            L_0x005a:
                r1 = r2
                goto L_0x005d
            L_0x005c:
                r4 = 1
            L_0x005d:
                if (r1 != 0) goto L_0x0180
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r5 = r5.n
                int r5 = r5.b((int) r3)
                if (r5 < 0) goto L_0x0148
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a r9 = r9.v
                int r9 = r9.getItemCount()
                if (r5 >= r9) goto L_0x0148
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a r9 = r9.v
                int r9 = r9.getItemViewType(r5)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a r10 = r10.v
                boolean r10 = r10.hasStableIds()
                if (r10 == 0) goto L_0x0096
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a r1 = r1.v
                long r10 = r1.getItemId(r5)
                androidx.recyclerview.widget.RecyclerView$x r1 = r6.a((long) r10, (int) r9, (boolean) r0)
                if (r1 == 0) goto L_0x0096
                r1.mPosition = r5
                r4 = 1
            L_0x0096:
                if (r1 != 0) goto L_0x00eb
                androidx.recyclerview.widget.RecyclerView$v r0 = r6.f1360h
                if (r0 == 0) goto L_0x00eb
                android.view.View r0 = r0.a(r6, r3, r9)
                if (r0 == 0) goto L_0x00eb
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r1 = r1.f((android.view.View) r0)
                if (r1 == 0) goto L_0x00ce
                boolean r0 = r1.shouldIgnore()
                if (r0 != 0) goto L_0x00b1
                goto L_0x00eb
            L_0x00b1:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view."
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.i()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00ce:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view which does not have a ViewHolder"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.i()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00eb:
                if (r1 != 0) goto L_0x0101
                androidx.recyclerview.widget.RecyclerView$o r0 = r16.d()
                androidx.recyclerview.widget.RecyclerView$x r1 = r0.a((int) r9)
                if (r1 == 0) goto L_0x0101
                r1.resetInternal()
                boolean r0 = androidx.recyclerview.widget.RecyclerView.f1314c
                if (r0 == 0) goto L_0x0101
                r6.f((androidx.recyclerview.widget.RecyclerView.x) r1)
            L_0x0101:
                if (r1 != 0) goto L_0x0180
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x011f
                androidx.recyclerview.widget.RecyclerView$o r10 = r6.f1359g
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.b(r11, r12, r14)
                if (r5 != 0) goto L_0x011f
                return r2
            L_0x011f:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a r5 = r2.v
                androidx.recyclerview.widget.RecyclerView$x r2 = r5.createViewHolder(r2, r9)
                boolean r5 = androidx.recyclerview.widget.RecyclerView.f1317f
                if (r5 == 0) goto L_0x013a
                android.view.View r5 = r2.itemView
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.e((android.view.View) r5)
                if (r5 == 0) goto L_0x013a
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.mNestedRecyclerView = r10
            L_0x013a:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                long r10 = r5.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$o r5 = r6.f1359g
                long r10 = r10 - r0
                r5.b(r9, r10)
                r10 = r2
                goto L_0x0181
            L_0x0148:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ").state:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$u r2 = r2.ra
                int r2 = r2.a()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.i()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0180:
                r10 = r1
            L_0x0181:
                r9 = r4
                if (r9 == 0) goto L_0x01ba
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$u r0 = r0.ra
                boolean r0 = r0.d()
                if (r0 != 0) goto L_0x01ba
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r10.hasAnyOfTheFlags(r0)
                if (r1 == 0) goto L_0x01ba
                r10.setFlags(r8, r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$u r0 = r0.ra
                boolean r0 = r0.k
                if (r0 == 0) goto L_0x01ba
                int r0 = androidx.recyclerview.widget.RecyclerView.f.a((androidx.recyclerview.widget.RecyclerView.x) r10)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$f r2 = r1.W
                androidx.recyclerview.widget.RecyclerView$u r1 = r1.ra
                java.util.List r4 = r10.getUnmodifiedPayloads()
                androidx.recyclerview.widget.RecyclerView$f$c r0 = r2.a((androidx.recyclerview.widget.RecyclerView.u) r1, (androidx.recyclerview.widget.RecyclerView.x) r10, (int) r0, (java.util.List<java.lang.Object>) r4)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.a((androidx.recyclerview.widget.RecyclerView.x) r10, (androidx.recyclerview.widget.RecyclerView.f.c) r0)
            L_0x01ba:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$u r0 = r0.ra
                boolean r0 = r0.d()
                if (r0 == 0) goto L_0x01cd
                boolean r0 = r10.isBound()
                if (r0 == 0) goto L_0x01cd
                r10.mPreLayoutPosition = r3
                goto L_0x01e0
            L_0x01cd:
                boolean r0 = r10.isBound()
                if (r0 == 0) goto L_0x01e2
                boolean r0 = r10.needsUpdate()
                if (r0 != 0) goto L_0x01e2
                boolean r0 = r10.isInvalid()
                if (r0 == 0) goto L_0x01e0
                goto L_0x01e2
            L_0x01e0:
                r0 = 0
                goto L_0x01f5
            L_0x01e2:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.n
                int r2 = r0.b((int) r3)
                r0 = r16
                r1 = r10
                r3 = r17
                r4 = r19
                boolean r0 = r0.a(r1, r2, r3, r4)
            L_0x01f5:
                android.view.View r1 = r10.itemView
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x020b
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
            L_0x0203:
                androidx.recyclerview.widget.RecyclerView$j r1 = (androidx.recyclerview.widget.RecyclerView.j) r1
                android.view.View r2 = r10.itemView
                r2.setLayoutParams(r1)
                goto L_0x021c
            L_0x020b:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x021a
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
                goto L_0x0203
            L_0x021a:
                androidx.recyclerview.widget.RecyclerView$j r1 = (androidx.recyclerview.widget.RecyclerView.j) r1
            L_0x021c:
                r1.f1343a = r10
                if (r9 == 0) goto L_0x0223
                if (r0 == 0) goto L_0x0223
                goto L_0x0224
            L_0x0223:
                r7 = 0
            L_0x0224:
                r1.f1346d = r7
                return r10
            L_0x0227:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$u r2 = r2.ra
                int r2 = r2.a()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.i()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                goto L_0x0260
            L_0x025f:
                throw r0
            L_0x0260:
                goto L_0x025f
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p.a(int, boolean, long):androidx.recyclerview.widget.RecyclerView$x");
        }

        /* access modifiers changed from: package-private */
        public x a(long j, int i2, boolean z) {
            for (int size = this.f1353a.size() - 1; size >= 0; size--) {
                x xVar = this.f1353a.get(size);
                if (xVar.getItemId() == j && !xVar.wasReturnedFromScrap()) {
                    if (i2 == xVar.getItemViewType()) {
                        xVar.addFlags(32);
                        if (xVar.isRemoved() && !RecyclerView.this.ra.d()) {
                            xVar.setFlags(2, 14);
                        }
                        return xVar;
                    } else if (!z) {
                        this.f1353a.remove(size);
                        RecyclerView.this.removeDetachedView(xVar.itemView, false);
                        a(xVar.itemView);
                    }
                }
            }
            int size2 = this.f1355c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                x xVar2 = this.f1355c.get(size2);
                if (xVar2.getItemId() == j && !xVar2.isAttachedToTransitionOverlay()) {
                    if (i2 == xVar2.getItemViewType()) {
                        if (!z) {
                            this.f1355c.remove(size2);
                        }
                        return xVar2;
                    } else if (!z) {
                        e(size2);
                        return null;
                    }
                }
            }
        }

        public void a() {
            this.f1353a.clear();
            i();
        }

        /* access modifiers changed from: package-private */
        public void a(int i2, int i3) {
            int size = this.f1355c.size();
            for (int i4 = 0; i4 < size; i4++) {
                x xVar = this.f1355c.get(i4);
                if (xVar != null && xVar.mPosition >= i2) {
                    xVar.offsetPosition(i3, true);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int i2, int i3, boolean z) {
            int i4 = i2 + i3;
            for (int size = this.f1355c.size() - 1; size >= 0; size--) {
                x xVar = this.f1355c.get(size);
                if (xVar != null) {
                    int i5 = xVar.mPosition;
                    if (i5 >= i4) {
                        xVar.offsetPosition(-i3, z);
                    } else if (i5 >= i2) {
                        xVar.addFlags(8);
                        e(size);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(View view) {
            x g2 = RecyclerView.g(view);
            g2.mScrapContainer = null;
            g2.mInChangeScrap = false;
            g2.clearReturnedFromScrapFlag();
            b(g2);
        }

        /* access modifiers changed from: package-private */
        public void a(a aVar, a aVar2, boolean z) {
            a();
            d().a(aVar, aVar2, z);
        }

        /* access modifiers changed from: package-private */
        public void a(o oVar) {
            o oVar2 = this.f1359g;
            if (oVar2 != null) {
                oVar2.c();
            }
            this.f1359g = oVar;
            if (this.f1359g != null && RecyclerView.this.getAdapter() != null) {
                this.f1359g.a();
            }
        }

        /* access modifiers changed from: package-private */
        public void a(v vVar) {
            this.f1360h = vVar;
        }

        /* access modifiers changed from: package-private */
        public void a(x xVar) {
            q qVar = RecyclerView.this.x;
            if (qVar != null) {
                qVar.a(xVar);
            }
            a aVar = RecyclerView.this.v;
            if (aVar != null) {
                aVar.onViewRecycled(xVar);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.ra != null) {
                recyclerView.p.h(xVar);
            }
        }

        /* access modifiers changed from: package-private */
        public void a(x xVar, boolean z) {
            RecyclerView.b(xVar);
            if (xVar.hasAnyOfTheFlags(16384)) {
                xVar.setFlags(0, 16384);
                y.a(xVar.itemView, (C0195a) null);
            }
            if (z) {
                a(xVar);
            }
            xVar.mOwnerRecyclerView = null;
            d().a(xVar);
        }

        /* access modifiers changed from: package-private */
        public View b(int i2, boolean z) {
            return a(i2, z, Long.MAX_VALUE).itemView;
        }

        /* access modifiers changed from: package-private */
        public x b(int i2) {
            int size;
            int b2;
            ArrayList<x> arrayList = this.f1354b;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                int i3 = 0;
                int i4 = 0;
                while (i4 < size) {
                    x xVar = this.f1354b.get(i4);
                    if (xVar.wasReturnedFromScrap() || xVar.getLayoutPosition() != i2) {
                        i4++;
                    } else {
                        xVar.addFlags(32);
                        return xVar;
                    }
                }
                if (RecyclerView.this.v.hasStableIds() && (b2 = RecyclerView.this.n.b(i2)) > 0 && b2 < RecyclerView.this.v.getItemCount()) {
                    long itemId = RecyclerView.this.v.getItemId(b2);
                    while (i3 < size) {
                        x xVar2 = this.f1354b.get(i3);
                        if (xVar2.wasReturnedFromScrap() || xVar2.getItemId() != itemId) {
                            i3++;
                        } else {
                            xVar2.addFlags(32);
                            return xVar2;
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            int size = this.f1355c.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f1355c.get(i2).clearOldPosition();
            }
            int size2 = this.f1353a.size();
            for (int i3 = 0; i3 < size2; i3++) {
                this.f1353a.get(i3).clearOldPosition();
            }
            ArrayList<x> arrayList = this.f1354b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    this.f1354b.get(i4).clearOldPosition();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b(int i2, int i3) {
            int i4;
            int i5;
            int i6;
            int i7;
            if (i2 < i3) {
                i6 = i2;
                i5 = i3;
                i4 = -1;
            } else {
                i5 = i2;
                i6 = i3;
                i4 = 1;
            }
            int size = this.f1355c.size();
            for (int i8 = 0; i8 < size; i8++) {
                x xVar = this.f1355c.get(i8);
                if (xVar != null && (i7 = xVar.mPosition) >= i6 && i7 <= i5) {
                    if (i7 == i2) {
                        xVar.offsetPosition(i3 - i2, false);
                    } else {
                        xVar.offsetPosition(i4, false);
                    }
                }
            }
        }

        public void b(View view) {
            x g2 = RecyclerView.g(view);
            if (g2.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (g2.isScrap()) {
                g2.unScrap();
            } else if (g2.wasReturnedFromScrap()) {
                g2.clearReturnedFromScrapFlag();
            }
            b(g2);
            if (RecyclerView.this.W != null && !g2.isRecyclable()) {
                RecyclerView.this.W.d(g2);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(x xVar) {
            boolean z;
            boolean z2 = false;
            if (xVar.isScrap() || xVar.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(xVar.isScrap());
                sb.append(" isAttached:");
                if (xVar.itemView.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(RecyclerView.this.i());
                throw new IllegalArgumentException(sb.toString());
            } else if (xVar.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + xVar + RecyclerView.this.i());
            } else if (!xVar.shouldIgnore()) {
                boolean doesTransientStatePreventRecycling = xVar.doesTransientStatePreventRecycling();
                a aVar = RecyclerView.this.v;
                if ((aVar != null && doesTransientStatePreventRecycling && aVar.onFailedToRecycleView(xVar)) || xVar.isRecyclable()) {
                    if (this.f1358f <= 0 || xVar.hasAnyOfTheFlags(526)) {
                        z = false;
                    } else {
                        int size = this.f1355c.size();
                        if (size >= this.f1358f && size > 0) {
                            e(0);
                            size--;
                        }
                        if (RecyclerView.f1317f && size > 0 && !RecyclerView.this.qa.a(xVar.mPosition)) {
                            int i2 = size - 1;
                            while (i2 >= 0) {
                                if (!RecyclerView.this.qa.a(this.f1355c.get(i2).mPosition)) {
                                    break;
                                }
                                i2--;
                            }
                            size = i2 + 1;
                        }
                        this.f1355c.add(size, xVar);
                        z = true;
                    }
                    if (!z) {
                        a(xVar, true);
                        z2 = true;
                    }
                } else {
                    z = false;
                }
                RecyclerView.this.p.h(xVar);
                if (!z && !z2 && doesTransientStatePreventRecycling) {
                    xVar.mOwnerRecyclerView = null;
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.i());
            }
        }

        /* access modifiers changed from: package-private */
        public View c(int i2) {
            return this.f1353a.get(i2).itemView;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f1353a.clear();
            ArrayList<x> arrayList = this.f1354b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public void c(int i2, int i3) {
            int i4;
            int i5 = i3 + i2;
            for (int size = this.f1355c.size() - 1; size >= 0; size--) {
                x xVar = this.f1355c.get(size);
                if (xVar != null && (i4 = xVar.mPosition) >= i2 && i4 < i5) {
                    xVar.addFlags(2);
                    e(size);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c(View view) {
            ArrayList<x> arrayList;
            x g2 = RecyclerView.g(view);
            if (!g2.hasAnyOfTheFlags(12) && g2.isUpdated() && !RecyclerView.this.a(g2)) {
                if (this.f1354b == null) {
                    this.f1354b = new ArrayList<>();
                }
                g2.setScrapContainer(this, true);
                arrayList = this.f1354b;
            } else if (!g2.isInvalid() || g2.isRemoved() || RecyclerView.this.v.hasStableIds()) {
                g2.setScrapContainer(this, false);
                arrayList = this.f1353a;
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.i());
            }
            arrayList.add(g2);
        }

        /* access modifiers changed from: package-private */
        public void c(x xVar) {
            (xVar.mInChangeScrap ? this.f1354b : this.f1353a).remove(xVar);
            xVar.mScrapContainer = null;
            xVar.mInChangeScrap = false;
            xVar.clearReturnedFromScrapFlag();
        }

        public View d(int i2) {
            return b(i2, false);
        }

        /* access modifiers changed from: package-private */
        public o d() {
            if (this.f1359g == null) {
                this.f1359g = new o();
            }
            return this.f1359g;
        }

        /* access modifiers changed from: package-private */
        public boolean d(x xVar) {
            if (xVar.isRemoved()) {
                return RecyclerView.this.ra.d();
            }
            int i2 = xVar.mPosition;
            if (i2 < 0 || i2 >= RecyclerView.this.v.getItemCount()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + xVar + RecyclerView.this.i());
            } else if (RecyclerView.this.ra.d() || RecyclerView.this.v.getItemViewType(xVar.mPosition) == xVar.getItemViewType()) {
                return !RecyclerView.this.v.hasStableIds() || xVar.getItemId() == RecyclerView.this.v.getItemId(xVar.mPosition);
            } else {
                return false;
            }
        }

        /* access modifiers changed from: package-private */
        public int e() {
            return this.f1353a.size();
        }

        /* access modifiers changed from: package-private */
        public void e(int i2) {
            a(this.f1355c.get(i2), true);
            this.f1355c.remove(i2);
        }

        public List<x> f() {
            return this.f1356d;
        }

        public void f(int i2) {
            this.f1357e = i2;
            j();
        }

        /* access modifiers changed from: package-private */
        public void g() {
            int size = this.f1355c.size();
            for (int i2 = 0; i2 < size; i2++) {
                j jVar = (j) this.f1355c.get(i2).itemView.getLayoutParams();
                if (jVar != null) {
                    jVar.f1345c = true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void h() {
            int size = this.f1355c.size();
            for (int i2 = 0; i2 < size; i2++) {
                x xVar = this.f1355c.get(i2);
                if (xVar != null) {
                    xVar.addFlags(6);
                    xVar.addChangePayload((Object) null);
                }
            }
            a aVar = RecyclerView.this.v;
            if (aVar == null || !aVar.hasStableIds()) {
                i();
            }
        }

        /* access modifiers changed from: package-private */
        public void i() {
            for (int size = this.f1355c.size() - 1; size >= 0; size--) {
                e(size);
            }
            this.f1355c.clear();
            if (RecyclerView.f1317f) {
                RecyclerView.this.qa.a();
            }
        }

        /* access modifiers changed from: package-private */
        public void j() {
            i iVar = RecyclerView.this.w;
            this.f1358f = this.f1357e + (iVar != null ? iVar.m : 0);
            for (int size = this.f1355c.size() - 1; size >= 0 && this.f1355c.size() > this.f1358f; size--) {
                e(size);
            }
        }
    }

    public interface q {
        void a(x xVar);
    }

    private class r extends c {
        r() {
        }

        public void a() {
            RecyclerView.this.a((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.ra.f1369g = true;
            recyclerView.b(true);
            if (!RecyclerView.this.n.c()) {
                RecyclerView.this.requestLayout();
            }
        }

        public void a(int i, int i2, int i3) {
            RecyclerView.this.a((String) null);
            if (RecyclerView.this.n.a(i, i2, i3)) {
                b();
            }
        }

        public void a(int i, int i2, Object obj) {
            RecyclerView.this.a((String) null);
            if (RecyclerView.this.n.a(i, i2, obj)) {
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (RecyclerView.f1316e) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.C && recyclerView.B) {
                    y.a((View) recyclerView, recyclerView.r);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.K = true;
            recyclerView2.requestLayout();
        }

        public void b(int i, int i2) {
            RecyclerView.this.a((String) null);
            if (RecyclerView.this.n.b(i, i2)) {
                b();
            }
        }

        public void c(int i, int i2) {
            RecyclerView.this.a((String) null);
            if (RecyclerView.this.n.c(i, i2)) {
                b();
            }
        }
    }

    public static class s extends b.j.a.c {
        public static final Parcelable.Creator<s> CREATOR = new F();

        /* renamed from: c  reason: collision with root package name */
        Parcelable f1362c;

        s(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1362c = parcel.readParcelable(classLoader == null ? i.class.getClassLoader() : classLoader);
        }

        s(Parcelable parcelable) {
            super(parcelable);
        }

        /* access modifiers changed from: package-private */
        public void a(s sVar) {
            this.f1362c = sVar.f1362c;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f1362c, 0);
        }
    }

    public static abstract class t {

        public interface a {
        }

        public abstract int a();

        public abstract void a(int i);

        /* access modifiers changed from: package-private */
        public abstract void a(int i, int i2);

        /* access modifiers changed from: protected */
        public abstract void a(View view);

        public abstract boolean b();

        public abstract boolean c();

        /* access modifiers changed from: protected */
        public final void d() {
            throw null;
        }
    }

    public static class u {

        /* renamed from: a  reason: collision with root package name */
        int f1363a = -1;

        /* renamed from: b  reason: collision with root package name */
        private SparseArray<Object> f1364b;

        /* renamed from: c  reason: collision with root package name */
        int f1365c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f1366d = 0;

        /* renamed from: e  reason: collision with root package name */
        int f1367e = 1;

        /* renamed from: f  reason: collision with root package name */
        int f1368f = 0;

        /* renamed from: g  reason: collision with root package name */
        boolean f1369g = false;

        /* renamed from: h  reason: collision with root package name */
        boolean f1370h = false;
        boolean i = false;
        boolean j = false;
        boolean k = false;
        boolean l = false;
        int m;
        long n;
        int o;
        int p;
        int q;

        public int a() {
            return this.f1370h ? this.f1365c - this.f1366d : this.f1368f;
        }

        /* access modifiers changed from: package-private */
        public void a(int i2) {
            if ((this.f1367e & i2) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i2) + " but it is " + Integer.toBinaryString(this.f1367e));
            }
        }

        /* access modifiers changed from: package-private */
        public void a(a aVar) {
            this.f1367e = 1;
            this.f1368f = aVar.getItemCount();
            this.f1370h = false;
            this.i = false;
            this.j = false;
        }

        public int b() {
            return this.f1363a;
        }

        public boolean c() {
            return this.f1363a != -1;
        }

        public boolean d() {
            return this.f1370h;
        }

        public boolean e() {
            return this.l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f1363a + ", mData=" + this.f1364b + ", mItemCount=" + this.f1368f + ", mIsMeasuring=" + this.j + ", mPreviousLayoutItemCount=" + this.f1365c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f1366d + ", mStructureChanged=" + this.f1369g + ", mInPreLayout=" + this.f1370h + ", mRunSimpleAnimations=" + this.k + ", mRunPredictiveAnimations=" + this.l + '}';
        }
    }

    public static abstract class v {
        public abstract View a(p pVar, int i, int i2);
    }

    class w implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private int f1371a;

        /* renamed from: b  reason: collision with root package name */
        private int f1372b;

        /* renamed from: c  reason: collision with root package name */
        OverScroller f1373c;

        /* renamed from: d  reason: collision with root package name */
        Interpolator f1374d = RecyclerView.j;

        /* renamed from: e  reason: collision with root package name */
        private boolean f1375e = false;

        /* renamed from: f  reason: collision with root package name */
        private boolean f1376f = false;

        w() {
            this.f1373c = new OverScroller(RecyclerView.this.getContext(), RecyclerView.j);
        }

        private float a(float f2) {
            return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
        }

        private int a(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            int width = z ? RecyclerView.this.getWidth() : RecyclerView.this.getHeight();
            int i6 = width / 2;
            float f2 = (float) width;
            float f3 = (float) i6;
            float a2 = f3 + (a(Math.min(1.0f, (((float) sqrt2) * 1.0f) / f2)) * f3);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(a2 / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((((float) abs) / f2) + 1.0f) * 300.0f);
            }
            return Math.min(i5, 2000);
        }

        private void c() {
            RecyclerView.this.removeCallbacks(this);
            y.a((View) RecyclerView.this, (Runnable) this);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (this.f1375e) {
                this.f1376f = true;
            } else {
                c();
            }
        }

        public void a(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f1372b = 0;
            this.f1371a = 0;
            Interpolator interpolator = this.f1374d;
            Interpolator interpolator2 = RecyclerView.j;
            if (interpolator != interpolator2) {
                this.f1374d = interpolator2;
                this.f1373c = new OverScroller(RecyclerView.this.getContext(), RecyclerView.j);
            }
            this.f1373c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            a();
        }

        public void a(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = a(i, i2, 0, 0);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.j;
            }
            if (this.f1374d != interpolator) {
                this.f1374d = interpolator;
                this.f1373c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f1372b = 0;
            this.f1371a = 0;
            RecyclerView.this.setScrollState(2);
            this.f1373c.startScroll(0, 0, i, i2, i4);
            if (Build.VERSION.SDK_INT < 23) {
                this.f1373c.computeScrollOffset();
            }
            a();
        }

        public void b() {
            RecyclerView.this.removeCallbacks(this);
            this.f1373c.abortAnimation();
        }

        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.w == null) {
                b();
                return;
            }
            this.f1376f = false;
            this.f1375e = true;
            recyclerView.b();
            OverScroller overScroller = this.f1373c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f1371a;
                int i4 = currY - this.f1372b;
                this.f1371a = currX;
                this.f1372b = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.Ea;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.a(i3, i4, iArr, (int[]) null, 1)) {
                    int[] iArr2 = RecyclerView.this.Ea;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.b(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.v != null) {
                    int[] iArr3 = recyclerView3.Ea;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.a(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.Ea;
                    i = iArr4[0];
                    i2 = iArr4[1];
                    i3 -= i;
                    i4 -= i2;
                    t tVar = recyclerView4.w.f1337g;
                    if (tVar != null && !tVar.b() && tVar.c()) {
                        int a2 = RecyclerView.this.ra.a();
                        if (a2 == 0) {
                            tVar.d();
                        } else {
                            if (tVar.a() >= a2) {
                                tVar.a(a2 - 1);
                            }
                            tVar.a(i, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.y.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.Ea;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.a(i, i2, i3, i4, (int[]) null, 1, iArr5);
                int[] iArr6 = RecyclerView.this.Ea;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (!(i == 0 && i2 == 0)) {
                    RecyclerView.this.d(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                t tVar2 = RecyclerView.this.w.f1337g;
                if ((tVar2 != null && tVar2.b()) || !z) {
                    a();
                    RecyclerView recyclerView6 = RecyclerView.this;
                    p pVar = recyclerView6.pa;
                    if (pVar != null) {
                        pVar.a(recyclerView6, i5, i6);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.a(i7, currVelocity);
                    }
                    if (RecyclerView.f1317f) {
                        RecyclerView.this.qa.a();
                    }
                }
            }
            t tVar3 = RecyclerView.this.w.f1337g;
            if (tVar3 != null && tVar3.b()) {
                tVar3.a(0, 0);
            }
            this.f1375e = false;
            if (this.f1376f) {
                c();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.f(1);
        }
    }

    public static abstract class x {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_SET_A11Y_ITEM_DELEGATE = 16384;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        int mFlags;
        boolean mInChangeScrap = false;
        private int mIsRecyclableCount = 0;
        long mItemId = -1;
        int mItemViewType = -1;
        WeakReference<RecyclerView> mNestedRecyclerView;
        int mOldPosition = -1;
        RecyclerView mOwnerRecyclerView;
        List<Object> mPayloads = null;
        int mPendingAccessibilityState = -1;
        int mPosition = -1;
        int mPreLayoutPosition = -1;
        p mScrapContainer = null;
        x mShadowedHolder = null;
        x mShadowingHolder = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        public x(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                this.mPayloads = new ArrayList();
                this.mUnmodifiedPayloads = Collections.unmodifiableList(this.mPayloads);
            }
        }

        /* access modifiers changed from: package-private */
        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(FLAG_ADAPTER_FULLUPDATE);
            } else if ((FLAG_ADAPTER_FULLUPDATE & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        /* access modifiers changed from: package-private */
        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        /* access modifiers changed from: package-private */
        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        /* access modifiers changed from: package-private */
        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        /* access modifiers changed from: package-private */
        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        /* access modifiers changed from: package-private */
        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        /* access modifiers changed from: package-private */
        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && y.x(this.itemView);
        }

        /* access modifiers changed from: package-private */
        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        public final int getAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.c(this);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        /* access modifiers changed from: package-private */
        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & FLAG_ADAPTER_FULLUPDATE) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        /* access modifiers changed from: package-private */
        public boolean hasAnyOfTheFlags(int i) {
            return (i & this.mFlags) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & FLAG_ADAPTER_POSITION_UNKNOWN) != 0 || isInvalid();
        }

        /* access modifiers changed from: package-private */
        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        /* access modifiers changed from: package-private */
        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !y.x(this.itemView);
        }

        /* access modifiers changed from: package-private */
        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        /* access modifiers changed from: package-private */
        public boolean isTmpDetached() {
            return (this.mFlags & FLAG_TMP_DETACHED) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((j) this.itemView.getLayoutParams()).f1345c = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i == -1) {
                i = y.k(this.itemView);
            }
            this.mWasImportantForAccessibilityBeforeHidden = i;
            recyclerView.a(this, 4);
        }

        /* access modifiers changed from: package-private */
        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.a(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        /* access modifiers changed from: package-private */
        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.b(this);
        }

        /* access modifiers changed from: package-private */
        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        /* access modifiers changed from: package-private */
        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (i2 ^ -1));
        }

        public final void setIsRecyclable(boolean z) {
            int i;
            this.mIsRecyclableCount = z ? this.mIsRecyclableCount - 1 : this.mIsRecyclableCount + 1;
            int i2 = this.mIsRecyclableCount;
            if (i2 < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i2 == 1) {
                i = this.mFlags | 16;
            } else if (z && this.mIsRecyclableCount == 0) {
                i = this.mFlags & -17;
            } else {
                return;
            }
            this.mFlags = i;
        }

        /* access modifiers changed from: package-private */
        public void setScrapContainer(p pVar, boolean z) {
            this.mScrapContainer = pVar;
            this.mInChangeScrap = z;
        }

        /* access modifiers changed from: package-private */
        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean shouldIgnore() {
            return (this.mFlags & FLAG_IGNORE) != 0;
        }

        /* access modifiers changed from: package-private */
        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        public void unScrap() {
            this.mScrapContainer.c(this);
        }

        /* access modifiers changed from: package-private */
        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 16843830(0x1010436, float:2.369658E-38)
            r1[r2] = r3
            f1312a = r1
            int[] r1 = new int[r0]
            r3 = 16842987(0x10100eb, float:2.3694217E-38)
            r1[r2] = r3
            f1313b = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 18
            if (r1 == r3) goto L_0x0025
            r3 = 19
            if (r1 == r3) goto L_0x0025
            r3 = 20
            if (r1 != r3) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r1 = 0
            goto L_0x0026
        L_0x0025:
            r1 = 1
        L_0x0026:
            f1314c = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r1 < r3) goto L_0x0030
            r1 = 1
            goto L_0x0031
        L_0x0030:
            r1 = 0
        L_0x0031:
            f1315d = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 16
            if (r1 < r3) goto L_0x003b
            r1 = 1
            goto L_0x003c
        L_0x003b:
            r1 = 0
        L_0x003c:
            f1316e = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r1 < r3) goto L_0x0046
            r1 = 1
            goto L_0x0047
        L_0x0046:
            r1 = 0
        L_0x0047:
            f1317f = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 15
            if (r1 > r3) goto L_0x0051
            r1 = 1
            goto L_0x0052
        L_0x0051:
            r1 = 0
        L_0x0052:
            f1318g = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 > r3) goto L_0x005a
            r1 = 1
            goto L_0x005b
        L_0x005a:
            r1 = 0
        L_0x005b:
            f1319h = r1
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r1[r2] = r3
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            r0 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r0] = r2
            r0 = 3
            r1[r0] = r2
            i = r1
            androidx.recyclerview.widget.z r0 = new androidx.recyclerview.widget.z
            r0.<init>()
            j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.k = new r();
        this.l = new p();
        this.p = new N();
        this.r = new x(this);
        this.s = new Rect();
        this.t = new Rect();
        this.u = new RectF();
        this.y = new ArrayList<>();
        this.z = new ArrayList<>();
        this.F = 0;
        this.N = false;
        this.O = false;
        this.P = 0;
        this.Q = 0;
        this.R = new e();
        this.W = new C0185k();
        this.aa = 0;
        this.ba = -1;
        this.la = Float.MIN_VALUE;
        this.ma = Float.MIN_VALUE;
        boolean z2 = true;
        this.na = true;
        this.oa = new w();
        this.qa = f1317f ? new p.a() : null;
        this.ra = new u();
        this.ua = false;
        this.va = false;
        this.wa = new g();
        this.xa = false;
        this.Aa = new int[2];
        this.Ca = new int[2];
        this.Da = new int[2];
        this.Ea = new int[2];
        this.Fa = new ArrayList();
        this.Ga = new y(this);
        this.Ha = new A(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1313b, i2, 0);
            this.q = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.q = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.ha = viewConfiguration.getScaledTouchSlop();
        this.la = z.a(viewConfiguration, context);
        this.ma = z.b(viewConfiguration, context);
        this.ja = viewConfiguration.getScaledMinimumFlingVelocity();
        this.ka = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.W.a(this.wa);
        k();
        G();
        F();
        if (y.k(this) == 0) {
            y.e(this, 1);
        }
        this.L = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new G(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, b.o.b.RecyclerView, i2, 0);
            String string = obtainStyledAttributes2.getString(b.o.b.RecyclerView_layoutManager);
            if (obtainStyledAttributes2.getInt(b.o.b.RecyclerView_android_descendantFocusability, -1) == -1) {
                setDescendantFocusability(262144);
            }
            this.D = obtainStyledAttributes2.getBoolean(b.o.b.RecyclerView_fastScrollEnabled, false);
            if (this.D) {
                a((StateListDrawable) obtainStyledAttributes2.getDrawable(b.o.b.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes2.getDrawable(b.o.b.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes2.getDrawable(b.o.b.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes2.getDrawable(b.o.b.RecyclerView_fastScrollHorizontalTrackDrawable));
            }
            obtainStyledAttributes2.recycle();
            a(context, string, attributeSet, i2, 0);
            if (Build.VERSION.SDK_INT >= 21) {
                TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f1312a, i2, 0);
                boolean z3 = obtainStyledAttributes3.getBoolean(0, true);
                obtainStyledAttributes3.recycle();
                z2 = z3;
            }
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z2);
    }

    private void A() {
        boolean z2 = true;
        this.ra.a(1);
        a(this.ra);
        this.ra.j = false;
        w();
        this.p.a();
        q();
        I();
        N();
        u uVar = this.ra;
        if (!uVar.k || !this.va) {
            z2 = false;
        }
        uVar.i = z2;
        this.va = false;
        this.ua = false;
        u uVar2 = this.ra;
        uVar2.f1370h = uVar2.l;
        uVar2.f1368f = this.v.getItemCount();
        a(this.Aa);
        if (this.ra.k) {
            int a2 = this.o.a();
            for (int i2 = 0; i2 < a2; i2++) {
                x g2 = g(this.o.c(i2));
                if (!g2.shouldIgnore() && (!g2.isInvalid() || this.v.hasStableIds())) {
                    this.p.c(g2, this.W.a(this.ra, g2, f.a(g2), g2.getUnmodifiedPayloads()));
                    if (this.ra.i && g2.isUpdated() && !g2.isRemoved() && !g2.shouldIgnore() && !g2.isInvalid()) {
                        this.p.a(d(g2), g2);
                    }
                }
            }
        }
        if (this.ra.l) {
            v();
            u uVar3 = this.ra;
            boolean z3 = uVar3.f1369g;
            uVar3.f1369g = false;
            this.w.e(this.l, uVar3);
            this.ra.f1369g = z3;
            for (int i3 = 0; i3 < this.o.a(); i3++) {
                x g3 = g(this.o.c(i3));
                if (!g3.shouldIgnore() && !this.p.c(g3)) {
                    int a3 = f.a(g3);
                    boolean hasAnyOfTheFlags = g3.hasAnyOfTheFlags(8192);
                    if (!hasAnyOfTheFlags) {
                        a3 |= 4096;
                    }
                    f.c a4 = this.W.a(this.ra, g3, a3, g3.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        a(g3, a4);
                    } else {
                        this.p.a(g3, a4);
                    }
                }
            }
        }
        a();
        r();
        c(false);
        this.ra.f1367e = 2;
    }

    private void B() {
        w();
        q();
        this.ra.a(6);
        this.n.b();
        this.ra.f1368f = this.v.getItemCount();
        u uVar = this.ra;
        uVar.f1366d = 0;
        uVar.f1370h = false;
        this.w.e(this.l, uVar);
        u uVar2 = this.ra;
        uVar2.f1369g = false;
        this.m = null;
        uVar2.k = uVar2.k && this.W != null;
        this.ra.f1367e = 4;
        r();
        c(false);
    }

    private void C() {
        this.ra.a(4);
        w();
        q();
        u uVar = this.ra;
        uVar.f1367e = 1;
        if (uVar.k) {
            for (int a2 = this.o.a() - 1; a2 >= 0; a2--) {
                x g2 = g(this.o.c(a2));
                if (!g2.shouldIgnore()) {
                    long d2 = d(g2);
                    f.c a3 = this.W.a(this.ra, g2);
                    x a4 = this.p.a(d2);
                    if (a4 != null && !a4.shouldIgnore()) {
                        boolean b2 = this.p.b(a4);
                        boolean b3 = this.p.b(g2);
                        if (!b2 || a4 != g2) {
                            f.c f2 = this.p.f(a4);
                            this.p.b(g2, a3);
                            f.c e2 = this.p.e(g2);
                            if (f2 == null) {
                                a(d2, g2, a4);
                            } else {
                                a(a4, g2, f2, e2, b2, b3);
                            }
                        }
                    }
                    this.p.b(g2, a3);
                }
            }
            this.p.a(this.Ha);
        }
        this.w.c(this.l);
        u uVar2 = this.ra;
        uVar2.f1365c = uVar2.f1368f;
        this.N = false;
        this.O = false;
        uVar2.k = false;
        uVar2.l = false;
        this.w.f1338h = false;
        ArrayList<x> arrayList = this.l.f1354b;
        if (arrayList != null) {
            arrayList.clear();
        }
        i iVar = this.w;
        if (iVar.n) {
            iVar.m = 0;
            iVar.n = false;
            this.l.j();
        }
        this.w.g(this.ra);
        r();
        c(false);
        this.p.a();
        int[] iArr = this.Aa;
        if (k(iArr[0], iArr[1])) {
            d(0, 0);
        }
        J();
        L();
    }

    private View D() {
        x b2;
        int i2 = this.ra.m;
        if (i2 == -1) {
            i2 = 0;
        }
        int a2 = this.ra.a();
        int i3 = i2;
        while (i3 < a2) {
            x b3 = b(i3);
            if (b3 == null) {
                break;
            } else if (b3.itemView.hasFocusable()) {
                return b3.itemView;
            } else {
                i3++;
            }
        }
        int min = Math.min(a2, i2);
        while (true) {
            min--;
            if (min < 0 || (b2 = b(min)) == null) {
                return null;
            }
            if (b2.itemView.hasFocusable()) {
                return b2.itemView;
            }
        }
    }

    private boolean E() {
        int a2 = this.o.a();
        for (int i2 = 0; i2 < a2; i2++) {
            x g2 = g(this.o.c(i2));
            if (g2 != null && !g2.shouldIgnore() && g2.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void F() {
        if (y.l(this) == 0) {
            y.f(this, 8);
        }
    }

    private void G() {
        this.o = new C0176b(new B(this));
    }

    private boolean H() {
        return this.W != null && this.w.C();
    }

    private void I() {
        if (this.N) {
            this.n.f();
            if (this.O) {
                this.w.d(this);
            }
        }
        if (H()) {
            this.n.e();
        } else {
            this.n.b();
        }
        boolean z2 = false;
        boolean z3 = this.ua || this.va;
        this.ra.k = this.E && this.W != null && (this.N || z3 || this.w.f1338h) && (!this.N || this.v.hasStableIds());
        u uVar = this.ra;
        if (uVar.k && z3 && !this.N && H()) {
            z2 = true;
        }
        uVar.l = z2;
    }

    private void J() {
        View view;
        if (this.na && this.v != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!f1319h || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.o.c(focusedChild)) {
                            return;
                        }
                    } else if (this.o.a() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view2 = null;
                x a2 = (this.ra.n == -1 || !this.v.hasStableIds()) ? null : a(this.ra.n);
                if (a2 != null && !this.o.c(a2.itemView) && a2.itemView.hasFocusable()) {
                    view2 = a2.itemView;
                } else if (this.o.a() > 0) {
                    view2 = D();
                }
                if (view2 != null) {
                    int i2 = this.ra.o;
                    if (((long) i2) == -1 || (view = view2.findViewById(i2)) == null || !view.isFocusable()) {
                        view = view2;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    private void K() {
        boolean z2;
        EdgeEffect edgeEffect = this.S;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.S.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.T;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.T.isFinished();
        }
        EdgeEffect edgeEffect3 = this.U;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.U.isFinished();
        }
        EdgeEffect edgeEffect4 = this.V;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.V.isFinished();
        }
        if (z2) {
            y.E(this);
        }
    }

    private void L() {
        u uVar = this.ra;
        uVar.n = -1;
        uVar.m = -1;
        uVar.o = -1;
    }

    private void M() {
        VelocityTracker velocityTracker = this.ca;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        f(0);
        K();
    }

    private void N() {
        x xVar = null;
        View focusedChild = (!this.na || !hasFocus() || this.v == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            xVar = d(focusedChild);
        }
        if (xVar == null) {
            L();
            return;
        }
        this.ra.n = this.v.hasStableIds() ? xVar.getItemId() : -1;
        this.ra.m = this.N ? -1 : xVar.isRemoved() ? xVar.mOldPosition : xVar.getAdapterPosition();
        this.ra.o = l(xVar.itemView);
    }

    private void O() {
        this.oa.b();
        i iVar = this.w;
        if (iVar != null) {
            iVar.B();
        }
    }

    private String a(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0021
            r6.f()
            android.widget.EdgeEffect r3 = r6.S
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
        L_0x001c:
            androidx.core.widget.d.a(r3, r4, r9)
            r9 = 1
            goto L_0x0039
        L_0x0021:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0038
            r6.g()
            android.widget.EdgeEffect r3 = r6.U
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            goto L_0x001c
        L_0x0038:
            r9 = 0
        L_0x0039:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0053
            r6.h()
            android.widget.EdgeEffect r9 = r6.T
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.d.a(r9, r0, r7)
            goto L_0x006f
        L_0x0053:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x006e
            r6.e()
            android.widget.EdgeEffect r9 = r6.V
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.d.a(r9, r3, r0)
            goto L_0x006f
        L_0x006e:
            r1 = r9
        L_0x006f:
            if (r1 != 0) goto L_0x0079
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x0079
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x007c
        L_0x0079:
            b.h.j.y.E(r6)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.a(float, float, float, float):void");
    }

    private void a(long j2, x xVar, x xVar2) {
        int a2 = this.o.a();
        for (int i2 = 0; i2 < a2; i2++) {
            x g2 = g(this.o.c(i2));
            if (g2 != xVar && d(g2) == j2) {
                a aVar = this.v;
                if (aVar == null || !aVar.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + g2 + " \n View Holder 2:" + xVar + i());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + g2 + " \n View Holder 2:" + xVar + i());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + xVar2 + " cannot be found but it is necessary for " + xVar + i());
    }

    private void a(Context context, String str, AttributeSet attributeSet, int i2, int i3) {
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String a2 = a(context, trim);
                try {
                    Class<? extends U> asSubclass = Class.forName(a2, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(i.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(i);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
                    } catch (NoSuchMethodException e2) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((i) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e3) {
                    e3.initCause(e2);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + a2, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + a2, e4);
                } catch (InvocationTargetException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + a2, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + a2, e6);
                } catch (IllegalAccessException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + a2, e7);
                } catch (ClassCastException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + a2, e8);
                }
            }
        }
    }

    static void a(View view, Rect rect) {
        j jVar = (j) view.getLayoutParams();
        Rect rect2 = jVar.f1344b;
        rect.set((view.getLeft() - rect2.left) - jVar.leftMargin, (view.getTop() - rect2.top) - jVar.topMargin, view.getRight() + rect2.right + jVar.rightMargin, view.getBottom() + rect2.bottom + jVar.bottomMargin);
    }

    private void a(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.s.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof j) {
            j jVar = (j) layoutParams;
            if (!jVar.f1345c) {
                Rect rect = jVar.f1344b;
                Rect rect2 = this.s;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.s);
            offsetRectIntoDescendantCoords(view, this.s);
        }
        this.w.a(this, view, this.s, !this.E, view2 == null);
    }

    private void a(a aVar, boolean z2, boolean z3) {
        a aVar2 = this.v;
        if (aVar2 != null) {
            aVar2.unregisterAdapterDataObserver(this.k);
            this.v.onDetachedFromRecyclerView(this);
        }
        if (!z2 || z3) {
            t();
        }
        this.n.f();
        a aVar3 = this.v;
        this.v = aVar;
        if (aVar != null) {
            aVar.registerAdapterDataObserver(this.k);
            aVar.onAttachedToRecyclerView(this);
        }
        i iVar = this.w;
        if (iVar != null) {
            iVar.a(aVar3, this.v);
        }
        this.l.a(aVar3, this.v, z2);
        this.ra.f1369g = true;
    }

    private void a(x xVar, x xVar2, f.c cVar, f.c cVar2, boolean z2, boolean z3) {
        xVar.setIsRecyclable(false);
        if (z2) {
            e(xVar);
        }
        if (xVar != xVar2) {
            if (z3) {
                e(xVar2);
            }
            xVar.mShadowedHolder = xVar2;
            e(xVar);
            this.l.c(xVar);
            xVar2.setIsRecyclable(false);
            xVar2.mShadowingHolder = xVar;
        }
        if (this.W.a(xVar, xVar2, cVar, cVar2)) {
            s();
        }
    }

    private void a(int[] iArr) {
        int a2 = this.o.a();
        if (a2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < a2; i4++) {
            x g2 = g(this.o.c(i4));
            if (!g2.shouldIgnore()) {
                int layoutPosition = g2.getLayoutPosition();
                if (layoutPosition < i2) {
                    i2 = layoutPosition;
                }
                if (layoutPosition > i3) {
                    i3 = layoutPosition;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    private boolean a(MotionEvent motionEvent) {
        m mVar = this.A;
        if (mVar != null) {
            mVar.a(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.A = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return b(motionEvent);
        }
    }

    private boolean a(View view, View view2, int i2) {
        int i3;
        if (view2 == null || view2 == this || c(view2) == null) {
            return false;
        }
        if (view == null || c(view) == null) {
            return true;
        }
        this.s.set(0, 0, view.getWidth(), view.getHeight());
        this.t.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.s);
        offsetDescendantRectToMyCoords(view2, this.t);
        char c2 = 65535;
        int i4 = this.w.j() == 1 ? -1 : 1;
        Rect rect = this.s;
        int i5 = rect.left;
        int i6 = this.t.left;
        if ((i5 < i6 || rect.right <= i6) && this.s.right < this.t.right) {
            i3 = 1;
        } else {
            Rect rect2 = this.s;
            int i7 = rect2.right;
            int i8 = this.t.right;
            i3 = ((i7 > i8 || rect2.left >= i8) && this.s.left > this.t.left) ? -1 : 0;
        }
        Rect rect3 = this.s;
        int i9 = rect3.top;
        int i10 = this.t.top;
        if ((i9 < i10 || rect3.bottom <= i10) && this.s.bottom < this.t.bottom) {
            c2 = 1;
        } else {
            Rect rect4 = this.s;
            int i11 = rect4.bottom;
            int i12 = this.t.bottom;
            if ((i11 <= i12 && rect4.top < i12) || this.s.top <= this.t.top) {
                c2 = 0;
            }
        }
        if (i2 == 1) {
            return c2 < 0 || (c2 == 0 && i3 * i4 <= 0);
        }
        if (i2 == 2) {
            return c2 > 0 || (c2 == 0 && i3 * i4 >= 0);
        }
        if (i2 == 17) {
            return i3 < 0;
        }
        if (i2 == 33) {
            return c2 < 0;
        }
        if (i2 == 66) {
            return i3 > 0;
        }
        if (i2 == 130) {
            return c2 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i2 + i());
    }

    static void b(x xVar) {
        WeakReference<RecyclerView> weakReference = xVar.mNestedRecyclerView;
        if (weakReference != null) {
            Object obj = weakReference.get();
            while (true) {
                View view = (View) obj;
                while (true) {
                    if (view == null) {
                        xVar.mNestedRecyclerView = null;
                        return;
                    } else if (view != xVar.itemView) {
                        obj = view.getParent();
                        if (!(obj instanceof View)) {
                            view = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private boolean b(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.z.size();
        int i2 = 0;
        while (i2 < size) {
            m mVar = this.z.get(i2);
            if (!mVar.b(this, motionEvent) || action == 3) {
                i2++;
            } else {
                this.A = mVar;
                return true;
            }
        }
        return false;
    }

    private void c(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.ba) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.ba = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.fa = x2;
            this.da = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.ga = y2;
            this.ea = y2;
        }
    }

    static RecyclerView e(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView e2 = e(viewGroup.getChildAt(i2));
            if (e2 != null) {
                return e2;
            }
        }
        return null;
    }

    private void e(x xVar) {
        View view = xVar.itemView;
        boolean z2 = view.getParent() == this;
        this.l.c(f(view));
        if (xVar.isTmpDetached()) {
            this.o.a(view, -1, view.getLayoutParams(), true);
        } else if (!z2) {
            this.o.a(view, true);
        } else {
            this.o.a(view);
        }
    }

    static x g(View view) {
        if (view == null) {
            return null;
        }
        return ((j) view.getLayoutParams()).f1343a;
    }

    private b.h.j.l getScrollingChildHelper() {
        if (this.Ba == null) {
            this.Ba = new b.h.j.l(this);
        }
        return this.Ba;
    }

    private boolean k(int i2, int i3) {
        a(this.Aa);
        int[] iArr = this.Aa;
        return (iArr[0] == i2 && iArr[1] == i3) ? false : true;
    }

    private int l(View view) {
        int id;
        loop0:
        while (true) {
            id = view.getId();
            while (true) {
                if (view.isFocused() || !(view instanceof ViewGroup) || !view.hasFocus()) {
                    return id;
                }
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                }
            }
        }
        return id;
    }

    private void y() {
        M();
        setScrollState(0);
    }

    private void z() {
        int i2 = this.J;
        this.J = 0;
        if (i2 != 0 && m()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            b.h.j.a.b.a(obtain, i2);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    /* access modifiers changed from: package-private */
    public x a(int i2, boolean z2) {
        int b2 = this.o.b();
        x xVar = null;
        for (int i3 = 0; i3 < b2; i3++) {
            x g2 = g(this.o.d(i3));
            if (g2 != null && !g2.isRemoved()) {
                if (z2) {
                    if (g2.mPosition != i2) {
                        continue;
                    }
                } else if (g2.getLayoutPosition() != i2) {
                    continue;
                }
                if (!this.o.c(g2.itemView)) {
                    return g2;
                }
                xVar = g2;
            }
        }
        return xVar;
    }

    public x a(long j2) {
        a aVar = this.v;
        x xVar = null;
        if (aVar != null && aVar.hasStableIds()) {
            int b2 = this.o.b();
            for (int i2 = 0; i2 < b2; i2++) {
                x g2 = g(this.o.d(i2));
                if (g2 != null && !g2.isRemoved() && g2.getItemId() == j2) {
                    if (!this.o.c(g2.itemView)) {
                        return g2;
                    }
                    xVar = g2;
                }
            }
        }
        return xVar;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        int b2 = this.o.b();
        for (int i2 = 0; i2 < b2; i2++) {
            x g2 = g(this.o.d(i2));
            if (!g2.shouldIgnore()) {
                g2.clearOldPosition();
            }
        }
        this.l.b();
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        i iVar = this.w;
        if (iVar != null) {
            iVar.f(i2);
        }
        e(i2);
        n nVar = this.sa;
        if (nVar != null) {
            nVar.a(this, i2);
        }
        List<n> list = this.ta;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.ta.get(size).a(this, i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3) {
        if (i2 < 0) {
            f();
            if (this.S.isFinished()) {
                this.S.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            g();
            if (this.U.isFinished()) {
                this.U.onAbsorb(i2);
            }
        }
        if (i3 < 0) {
            h();
            if (this.T.isFinished()) {
                this.T.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            e();
            if (this.V.isFinished()) {
                this.V.onAbsorb(i3);
            }
        }
        if (i2 != 0 || i3 != 0) {
            y.E(this);
        }
    }

    public final void a(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().a(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public void a(int i2, int i3, Interpolator interpolator) {
        i iVar = this.w;
        if (iVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.H) {
            if (!iVar.a()) {
                i2 = 0;
            }
            if (!this.w.b()) {
                i3 = 0;
            }
            if (i2 != 0 || i3 != 0) {
                this.oa.a(i2, i3, Integer.MIN_VALUE, interpolator);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3, Object obj) {
        int i4;
        int b2 = this.o.b();
        int i5 = i2 + i3;
        for (int i6 = 0; i6 < b2; i6++) {
            View d2 = this.o.d(i6);
            x g2 = g(d2);
            if (g2 != null && !g2.shouldIgnore() && (i4 = g2.mPosition) >= i2 && i4 < i5) {
                g2.addFlags(2);
                g2.addChangePayload(obj);
                ((j) d2.getLayoutParams()).f1345c = true;
            }
        }
        this.l.c(i2, i3);
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int b2 = this.o.b();
        for (int i5 = 0; i5 < b2; i5++) {
            x g2 = g(this.o.d(i5));
            if (g2 != null && !g2.shouldIgnore()) {
                int i6 = g2.mPosition;
                if (i6 >= i4) {
                    g2.offsetPosition(-i3, z2);
                } else if (i6 >= i2) {
                    g2.flagRemovedAndOffsetPosition(i2 - 1, -i3, z2);
                }
                this.ra.f1369g = true;
            }
        }
        this.l.a(i2, i3, z2);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3, int[] iArr) {
        w();
        q();
        b.h.f.a.a("RV Scroll");
        a(this.ra);
        int a2 = i2 != 0 ? this.w.a(i2, this.l, this.ra) : 0;
        int b2 = i3 != 0 ? this.w.b(i3, this.l, this.ra) : 0;
        b.h.f.a.a();
        u();
        r();
        c(false);
        if (iArr != null) {
            iArr[0] = a2;
            iArr[1] = b2;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + i());
        }
        Resources resources = getContext().getResources();
        new C0188n(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(b.o.a.fastscroll_default_thickness), resources.getDimensionPixelSize(b.o.a.fastscroll_minimum_range), resources.getDimensionPixelOffset(b.o.a.fastscroll_margin));
    }

    /* access modifiers changed from: package-private */
    public void a(View view) {
        x g2 = g(view);
        i(view);
        a aVar = this.v;
        if (!(aVar == null || g2 == null)) {
            aVar.onViewAttachedToWindow(g2);
        }
        List<k> list = this.M;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.M.get(size).b(view);
            }
        }
    }

    public void a(h hVar) {
        a(hVar, -1);
    }

    public void a(h hVar, int i2) {
        i iVar = this.w;
        if (iVar != null) {
            iVar.a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.y.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.y.add(hVar);
        } else {
            this.y.add(i2, hVar);
        }
        o();
        requestLayout();
    }

    public void a(m mVar) {
        this.z.add(mVar);
    }

    public void a(n nVar) {
        if (this.ta == null) {
            this.ta = new ArrayList();
        }
        this.ta.add(nVar);
    }

    /* access modifiers changed from: package-private */
    public final void a(u uVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.oa.f1373c;
            uVar.p = overScroller.getFinalX() - overScroller.getCurrX();
            uVar.q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        uVar.p = 0;
        uVar.q = 0;
    }

    /* access modifiers changed from: package-private */
    public void a(x xVar, f.c cVar) {
        xVar.setFlags(0, 8192);
        if (this.ra.i && xVar.isUpdated() && !xVar.isRemoved() && !xVar.shouldIgnore()) {
            this.p.a(d(xVar), xVar);
        }
        this.p.c(xVar, cVar);
    }

    /* access modifiers changed from: package-private */
    public void a(x xVar, f.c cVar, f.c cVar2) {
        xVar.setIsRecyclable(false);
        if (this.W.a(xVar, cVar, cVar2)) {
            s();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        if (n()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + i());
            }
            throw new IllegalStateException(str);
        } else if (this.Q > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(BuildConfig.FLAVOR + i()));
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z2) {
        this.P--;
        if (this.P < 1) {
            this.P = 0;
            if (z2) {
                z();
                d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b5, code lost:
        if (r0 != 0) goto L_0x00ba;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(int r22, int r23, android.view.MotionEvent r24) {
        /*
            r21 = this;
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r21.b()
            androidx.recyclerview.widget.RecyclerView$a r0 = r8.v
            r12 = 1
            r13 = 0
            if (r0 == 0) goto L_0x0029
            int[] r0 = r8.Ea
            r0[r13] = r13
            r0[r12] = r13
            r8.a((int) r9, (int) r10, (int[]) r0)
            int[] r0 = r8.Ea
            r1 = r0[r13]
            r0 = r0[r12]
            int r2 = r9 - r1
            int r3 = r10 - r0
            r6 = r0
            r7 = r1
            r14 = r2
            r15 = r3
            goto L_0x002d
        L_0x0029:
            r6 = 0
            r7 = 0
            r14 = 0
            r15 = 0
        L_0x002d:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$h> r0 = r8.y
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0038
            r21.invalidate()
        L_0x0038:
            int[] r5 = r8.Ea
            r5[r13] = r13
            r5[r12] = r13
            int[] r4 = r8.Ca
            r16 = 0
            r0 = r21
            r1 = r7
            r2 = r6
            r3 = r14
            r17 = r4
            r4 = r15
            r18 = r5
            r5 = r17
            r19 = r6
            r6 = r16
            r20 = r7
            r7 = r18
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            int[] r0 = r8.Ea
            r1 = r0[r13]
            int r14 = r14 - r1
            r0 = r0[r12]
            int r15 = r15 - r0
            int r0 = r8.fa
            int[] r1 = r8.Ca
            r2 = r1[r13]
            int r0 = r0 - r2
            r8.fa = r0
            int r0 = r8.ga
            r2 = r1[r12]
            int r0 = r0 - r2
            r8.ga = r0
            if (r11 == 0) goto L_0x007c
            r0 = r1[r13]
            float r0 = (float) r0
            r1 = r1[r12]
            float r1 = (float) r1
            r11.offsetLocation(r0, r1)
        L_0x007c:
            int[] r0 = r8.Da
            r1 = r0[r13]
            int[] r2 = r8.Ca
            r3 = r2[r13]
            int r1 = r1 + r3
            r0[r13] = r1
            r1 = r0[r12]
            r2 = r2[r12]
            int r1 = r1 + r2
            r0[r12] = r1
            int r0 = r21.getOverScrollMode()
            r1 = 2
            if (r0 == r1) goto L_0x00af
            if (r11 == 0) goto L_0x00ac
            r0 = 8194(0x2002, float:1.1482E-41)
            boolean r0 = b.h.j.C0202h.d(r11, r0)
            if (r0 != 0) goto L_0x00ac
            float r0 = r24.getX()
            float r1 = (float) r14
            float r2 = r24.getY()
            float r3 = (float) r15
            r8.a((float) r0, (float) r1, (float) r2, (float) r3)
        L_0x00ac:
            r21.b(r22, r23)
        L_0x00af:
            r1 = r20
            if (r1 != 0) goto L_0x00b8
            r0 = r19
            if (r0 == 0) goto L_0x00bd
            goto L_0x00ba
        L_0x00b8:
            r0 = r19
        L_0x00ba:
            r8.d(r1, r0)
        L_0x00bd:
            boolean r2 = r21.awakenScrollBars()
            if (r2 != 0) goto L_0x00c6
            r21.invalidate()
        L_0x00c6:
            if (r1 != 0) goto L_0x00cc
            if (r0 == 0) goto L_0x00cb
            goto L_0x00cc
        L_0x00cb:
            r12 = 0
        L_0x00cc:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.a(int, int, android.view.MotionEvent):boolean");
    }

    public boolean a(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().a(i2, i3, iArr, iArr2, i4);
    }

    /* access modifiers changed from: package-private */
    public boolean a(AccessibilityEvent accessibilityEvent) {
        if (!n()) {
            return false;
        }
        int a2 = accessibilityEvent != null ? b.h.j.a.b.a(accessibilityEvent) : 0;
        if (a2 == 0) {
            a2 = 0;
        }
        this.J = a2 | this.J;
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean a(x xVar) {
        f fVar = this.W;
        return fVar == null || fVar.a(xVar, xVar.getUnmodifiedPayloads());
    }

    /* access modifiers changed from: package-private */
    public boolean a(x xVar, int i2) {
        if (n()) {
            xVar.mPendingAccessibilityState = i2;
            this.Fa.add(xVar);
            return false;
        }
        y.e(xVar.itemView, i2);
        return true;
    }

    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        i iVar = this.w;
        if (iVar == null || !iVar.a(this, arrayList, i2, i3)) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    public x b(int i2) {
        x xVar = null;
        if (this.N) {
            return null;
        }
        int b2 = this.o.b();
        for (int i3 = 0; i3 < b2; i3++) {
            x g2 = g(this.o.d(i3));
            if (g2 != null && !g2.isRemoved() && c(g2) == i2) {
                if (!this.o.c(g2.itemView)) {
                    return g2;
                }
                xVar = g2;
            }
        }
        return xVar;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (!this.E || this.N) {
            b.h.f.a.a("RV FullInvalidate");
            c();
            b.h.f.a.a();
        } else if (this.n.c()) {
            if (this.n.c(4) && !this.n.c(11)) {
                b.h.f.a.a("RV PartialInvalidate");
                w();
                q();
                this.n.e();
                if (!this.G) {
                    if (E()) {
                        c();
                    } else {
                        this.n.a();
                    }
                }
                c(true);
                r();
            } else if (this.n.c()) {
                b.h.f.a.a("RV FullInvalidate");
                c();
            } else {
                return;
            }
            b.h.f.a.a();
        }
    }

    /* access modifiers changed from: package-private */
    public void b(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.S;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.S.onRelease();
            z2 = this.S.isFinished();
        }
        EdgeEffect edgeEffect2 = this.U;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.U.onRelease();
            z2 |= this.U.isFinished();
        }
        EdgeEffect edgeEffect3 = this.T;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.T.onRelease();
            z2 |= this.T.isFinished();
        }
        EdgeEffect edgeEffect4 = this.V;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.V.onRelease();
            z2 |= this.V.isFinished();
        }
        if (z2) {
            y.E(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(View view) {
        x g2 = g(view);
        j(view);
        a aVar = this.v;
        if (!(aVar == null || g2 == null)) {
            aVar.onViewDetachedFromWindow(g2);
        }
        List<k> list = this.M;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.M.get(size).a(view);
            }
        }
    }

    public void b(h hVar) {
        i iVar = this.w;
        if (iVar != null) {
            iVar.a("Cannot remove item decoration during a scroll  or layout");
        }
        this.y.remove(hVar);
        if (this.y.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        o();
        requestLayout();
    }

    public void b(m mVar) {
        this.z.remove(mVar);
        if (this.A == mVar) {
            this.A = null;
        }
    }

    public void b(n nVar) {
        List<n> list = this.ta;
        if (list != null) {
            list.remove(nVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(x xVar, f.c cVar, f.c cVar2) {
        e(xVar);
        xVar.setIsRecyclable(false);
        if (this.W.b(xVar, cVar, cVar2)) {
            s();
        }
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z2) {
        this.O = z2 | this.O;
        this.N = true;
        p();
    }

    /* access modifiers changed from: package-private */
    public int c(x xVar) {
        if (xVar.hasAnyOfTheFlags(524) || !xVar.isBound()) {
            return -1;
        }
        return this.n.a(xVar.mPosition);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View c(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L_0x0010
            if (r0 == r2) goto L_0x0010
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0010
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r0 != r2) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.c(android.view.View):android.view.View");
    }

    /* access modifiers changed from: package-private */
    public void c() {
        String str;
        if (this.v == null) {
            str = "No adapter attached; skipping layout";
        } else if (this.w == null) {
            str = "No layout manager attached; skipping layout";
        } else {
            u uVar = this.ra;
            uVar.j = false;
            if (uVar.f1367e == 1) {
                A();
            } else if (!this.n.d() && this.w.q() == getWidth() && this.w.h() == getHeight()) {
                this.w.e(this);
                C();
                return;
            }
            this.w.e(this);
            B();
            C();
            return;
        }
        Log.e("RecyclerView", str);
    }

    public void c(int i2) {
        int a2 = this.o.a();
        for (int i3 = 0; i3 < a2; i3++) {
            this.o.c(i3).offsetLeftAndRight(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void c(int i2, int i3) {
        setMeasuredDimension(i.a(i2, getPaddingLeft() + getPaddingRight(), y.o(this)), i.a(i3, getPaddingTop() + getPaddingBottom(), y.n(this)));
    }

    /* access modifiers changed from: package-private */
    public void c(boolean z2) {
        if (this.F < 1) {
            this.F = 1;
        }
        if (!z2 && !this.H) {
            this.G = false;
        }
        if (this.F == 1) {
            if (z2 && this.G && !this.H && this.w != null && this.v != null) {
                c();
            }
            if (!this.H) {
                this.G = false;
            }
        }
        this.F--;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof j) && this.w.a((j) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        i iVar = this.w;
        if (iVar != null && iVar.a()) {
            return this.w.a(this.ra);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        i iVar = this.w;
        if (iVar != null && iVar.a()) {
            return this.w.b(this.ra);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        i iVar = this.w;
        if (iVar != null && iVar.a()) {
            return this.w.c(this.ra);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        i iVar = this.w;
        if (iVar != null && iVar.b()) {
            return this.w.d(this.ra);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        i iVar = this.w;
        if (iVar != null && iVar.b()) {
            return this.w.e(this.ra);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        i iVar = this.w;
        if (iVar != null && iVar.b()) {
            return this.w.f(this.ra);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public long d(x xVar) {
        return this.v.hasStableIds() ? xVar.getItemId() : (long) xVar.mPosition;
    }

    public x d(View view) {
        View c2 = c(view);
        if (c2 == null) {
            return null;
        }
        return f(c2);
    }

    /* access modifiers changed from: package-private */
    public void d() {
        int i2;
        for (int size = this.Fa.size() - 1; size >= 0; size--) {
            x xVar = this.Fa.get(size);
            if (xVar.itemView.getParent() == this && !xVar.shouldIgnore() && (i2 = xVar.mPendingAccessibilityState) != -1) {
                y.e(xVar.itemView, i2);
                xVar.mPendingAccessibilityState = -1;
            }
        }
        this.Fa.clear();
    }

    public void d(int i2) {
        int a2 = this.o.a();
        for (int i3 = 0; i3 < a2; i3++) {
            this.o.c(i3).offsetTopAndBottom(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void d(int i2, int i3) {
        this.Q++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        h(i2, i3);
        n nVar = this.sa;
        if (nVar != null) {
            nVar.a(this, i2, i3);
        }
        List<n> list = this.ta;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.ta.get(size).a(this, i2, i3);
            }
        }
        this.Q--;
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().a(f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().a(i2, i3, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().a(i2, i3, i4, i5, iArr);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z2;
        boolean z3;
        int i2;
        float f2;
        super.draw(canvas);
        int size = this.y.size();
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            this.y.get(i3).b(canvas, this, this.ra);
        }
        EdgeEffect edgeEffect = this.S;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.q ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.S;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.T;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.q) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.T;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.U;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.q ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.U;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.V;
        if (edgeEffect7 == null || edgeEffect7.isFinished()) {
            z3 = z2;
        } else {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.q) {
                f2 = (float) ((-getWidth()) + getPaddingRight());
                i2 = (-getHeight()) + getPaddingBottom();
            } else {
                f2 = (float) (-getWidth());
                i2 = -getHeight();
            }
            canvas.translate(f2, (float) i2);
            EdgeEffect edgeEffect8 = this.V;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z3 = z4 | z2;
            canvas.restoreToCount(save4);
        }
        if (!z3 && this.W != null && this.y.size() > 0 && this.W.g()) {
            z3 = true;
        }
        if (z3) {
            y.E(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    /* access modifiers changed from: package-private */
    public void e() {
        int i2;
        int i3;
        EdgeEffect edgeEffect;
        if (this.V == null) {
            this.V = this.R.a(this, 3);
            if (this.q) {
                edgeEffect = this.V;
                i3 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                edgeEffect = this.V;
                i3 = getMeasuredWidth();
                i2 = getMeasuredHeight();
            }
            edgeEffect.setSize(i3, i2);
        }
    }

    public void e(int i2) {
    }

    public boolean e(int i2, int i3) {
        i iVar = this.w;
        int i4 = 0;
        if (iVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.H) {
            return false;
        } else {
            boolean a2 = iVar.a();
            boolean b2 = this.w.b();
            if (!a2 || Math.abs(i2) < this.ja) {
                i2 = 0;
            }
            if (!b2 || Math.abs(i3) < this.ja) {
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            float f2 = (float) i2;
            float f3 = (float) i3;
            if (!dispatchNestedPreFling(f2, f3)) {
                boolean z2 = a2 || b2;
                dispatchNestedFling(f2, f3, z2);
                l lVar = this.ia;
                if (lVar != null && lVar.a(i2, i3)) {
                    return true;
                }
                if (z2) {
                    if (a2) {
                        i4 = 1;
                    }
                    if (b2) {
                        i4 |= 2;
                    }
                    j(i4, 1);
                    int i5 = this.ka;
                    int max = Math.max(-i5, Math.min(i2, i5));
                    int i6 = this.ka;
                    this.oa.a(max, Math.max(-i6, Math.min(i3, i6)));
                    return true;
                }
            }
            return false;
        }
    }

    public x f(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return g(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* access modifiers changed from: package-private */
    public void f() {
        int i2;
        int i3;
        EdgeEffect edgeEffect;
        if (this.S == null) {
            this.S = this.R.a(this, 0);
            if (this.q) {
                edgeEffect = this.S;
                i3 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                edgeEffect = this.S;
                i3 = getMeasuredHeight();
                i2 = getMeasuredWidth();
            }
            edgeEffect.setSize(i3, i2);
        }
    }

    public void f(int i2) {
        getScrollingChildHelper().c(i2);
    }

    /* access modifiers changed from: package-private */
    public void f(int i2, int i3) {
        int b2 = this.o.b();
        for (int i4 = 0; i4 < b2; i4++) {
            x g2 = g(this.o.d(i4));
            if (g2 != null && !g2.shouldIgnore() && g2.mPosition >= i2) {
                g2.offsetPosition(i3, false);
                this.ra.f1369g = true;
            }
        }
        this.l.a(i2, i3);
        requestLayout();
    }

    public View focusSearch(View view, int i2) {
        View view2;
        boolean z2;
        View d2 = this.w.d(view, i2);
        if (d2 != null) {
            return d2;
        }
        boolean z3 = this.v != null && this.w != null && !n() && !this.H;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z3 || !(i2 == 2 || i2 == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i2);
            if (findNextFocus != null || !z3) {
                view2 = findNextFocus;
            } else {
                b();
                if (c(view) == null) {
                    return null;
                }
                w();
                view2 = this.w.a(view, i2, this.l, this.ra);
                c(false);
            }
        } else {
            if (this.w.b()) {
                int i3 = i2 == 2 ? 130 : 33;
                z2 = instance.findNextFocus(this, view, i3) == null;
                if (f1318g) {
                    i2 = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.w.a()) {
                int i4 = (this.w.j() == 1) ^ (i2 == 2) ? 66 : 17;
                z2 = instance.findNextFocus(this, view, i4) == null;
                if (f1318g) {
                    i2 = i4;
                }
            }
            if (z2) {
                b();
                if (c(view) == null) {
                    return null;
                }
                w();
                this.w.a(view, i2, this.l, this.ra);
                c(false);
            }
            view2 = instance.findNextFocus(this, view, i2);
        }
        if (view2 == null || view2.hasFocusable()) {
            return a(view, view2, i2) ? view2 : super.focusSearch(view, i2);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i2);
        }
        a(view2, (View) null);
        return view;
    }

    /* access modifiers changed from: package-private */
    public void g() {
        int i2;
        int i3;
        EdgeEffect edgeEffect;
        if (this.U == null) {
            this.U = this.R.a(this, 2);
            if (this.q) {
                edgeEffect = this.U;
                i3 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                edgeEffect = this.U;
                i3 = getMeasuredHeight();
                i2 = getMeasuredWidth();
            }
            edgeEffect.setSize(i3, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void g(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int b2 = this.o.b();
        if (i2 < i3) {
            i6 = i2;
            i5 = i3;
            i4 = -1;
        } else {
            i5 = i2;
            i6 = i3;
            i4 = 1;
        }
        for (int i8 = 0; i8 < b2; i8++) {
            x g2 = g(this.o.d(i8));
            if (g2 != null && (i7 = g2.mPosition) >= i6 && i7 <= i5) {
                if (i7 == i2) {
                    g2.offsetPosition(i3 - i2, false);
                } else {
                    g2.offsetPosition(i4, false);
                }
                this.ra.f1369g = true;
            }
        }
        this.l.b(i2, i3);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        i iVar = this.w;
        if (iVar != null) {
            return iVar.c();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + i());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        i iVar = this.w;
        if (iVar != null) {
            return iVar.a(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + i());
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        i iVar = this.w;
        if (iVar != null) {
            return iVar.a(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + i());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public a getAdapter() {
        return this.v;
    }

    public int getBaseline() {
        i iVar = this.w;
        return iVar != null ? iVar.d() : super.getBaseline();
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        d dVar = this.za;
        return dVar == null ? super.getChildDrawingOrder(i2, i3) : dVar.a(i2, i3);
    }

    public boolean getClipToPadding() {
        return this.q;
    }

    public G getCompatAccessibilityDelegate() {
        return this.ya;
    }

    public e getEdgeEffectFactory() {
        return this.R;
    }

    public f getItemAnimator() {
        return this.W;
    }

    public int getItemDecorationCount() {
        return this.y.size();
    }

    public i getLayoutManager() {
        return this.w;
    }

    public int getMaxFlingVelocity() {
        return this.ka;
    }

    public int getMinFlingVelocity() {
        return this.ja;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (f1317f) {
            return System.nanoTime();
        }
        return 0;
    }

    public l getOnFlingListener() {
        return this.ia;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.na;
    }

    public o getRecycledViewPool() {
        return this.l.d();
    }

    public int getScrollState() {
        return this.aa;
    }

    /* access modifiers changed from: package-private */
    public Rect h(View view) {
        j jVar = (j) view.getLayoutParams();
        if (!jVar.f1345c) {
            return jVar.f1344b;
        }
        if (this.ra.d() && (jVar.b() || jVar.d())) {
            return jVar.f1344b;
        }
        Rect rect = jVar.f1344b;
        rect.set(0, 0, 0, 0);
        int size = this.y.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.s.set(0, 0, 0, 0);
            this.y.get(i2).a(this.s, view, this, this.ra);
            int i3 = rect.left;
            Rect rect2 = this.s;
            rect.left = i3 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        jVar.f1345c = false;
        return rect;
    }

    /* access modifiers changed from: package-private */
    public void h() {
        int i2;
        int i3;
        EdgeEffect edgeEffect;
        if (this.T == null) {
            this.T = this.R.a(this, 1);
            if (this.q) {
                edgeEffect = this.T;
                i3 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                edgeEffect = this.T;
                i3 = getMeasuredWidth();
                i2 = getMeasuredHeight();
            }
            edgeEffect.setSize(i3, i2);
        }
    }

    public void h(int i2, int i3) {
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().a();
    }

    /* access modifiers changed from: package-private */
    public String i() {
        return " " + super.toString() + ", adapter:" + this.v + ", layout:" + this.w + ", context:" + getContext();
    }

    public void i(int i2, int i3) {
        a(i2, i3, (Interpolator) null);
    }

    public void i(View view) {
    }

    public boolean isAttachedToWindow() {
        return this.B;
    }

    public final boolean isLayoutSuppressed() {
        return this.H;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().b();
    }

    public void j(View view) {
    }

    public boolean j() {
        return !this.E || this.N || this.n.c();
    }

    public boolean j(int i2, int i3) {
        return getScrollingChildHelper().a(i2, i3);
    }

    /* access modifiers changed from: package-private */
    public void k() {
        this.n = new C0175a(new C(this));
    }

    /* access modifiers changed from: package-private */
    public boolean k(View view) {
        w();
        boolean e2 = this.o.e(view);
        if (e2) {
            x g2 = g(view);
            this.l.c(g2);
            this.l.b(g2);
        }
        c(!e2);
        return e2;
    }

    /* access modifiers changed from: package-private */
    public void l() {
        this.V = null;
        this.T = null;
        this.U = null;
        this.S = null;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        AccessibilityManager accessibilityManager = this.L;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean n() {
        return this.P > 0;
    }

    /* access modifiers changed from: package-private */
    public void o() {
        int b2 = this.o.b();
        for (int i2 = 0; i2 < b2; i2++) {
            ((j) this.o.d(i2).getLayoutParams()).f1345c = true;
        }
        this.l.g();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r0 >= 30.0f) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            r0 = 0
            r4.P = r0
            r1 = 1
            r4.B = r1
            boolean r2 = r4.E
            if (r2 == 0) goto L_0x0014
            boolean r2 = r4.isLayoutRequested()
            if (r2 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            r4.E = r1
            androidx.recyclerview.widget.RecyclerView$i r1 = r4.w
            if (r1 == 0) goto L_0x001e
            r1.a((androidx.recyclerview.widget.RecyclerView) r4)
        L_0x001e:
            r4.xa = r0
            boolean r0 = f1317f
            if (r0 == 0) goto L_0x0067
            java.lang.ThreadLocal<androidx.recyclerview.widget.p> r0 = androidx.recyclerview.widget.p.f1477a
            java.lang.Object r0 = r0.get()
            androidx.recyclerview.widget.p r0 = (androidx.recyclerview.widget.p) r0
            r4.pa = r0
            androidx.recyclerview.widget.p r0 = r4.pa
            if (r0 != 0) goto L_0x0062
            androidx.recyclerview.widget.p r0 = new androidx.recyclerview.widget.p
            r0.<init>()
            r4.pa = r0
            android.view.Display r0 = b.h.j.y.h(r4)
            r1 = 1114636288(0x42700000, float:60.0)
            boolean r2 = r4.isInEditMode()
            if (r2 != 0) goto L_0x0052
            if (r0 == 0) goto L_0x0052
            float r0 = r0.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r0 = 1114636288(0x42700000, float:60.0)
        L_0x0054:
            androidx.recyclerview.widget.p r1 = r4.pa
            r2 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r2 = r2 / r0
            long r2 = (long) r2
            r1.f1481e = r2
            java.lang.ThreadLocal<androidx.recyclerview.widget.p> r0 = androidx.recyclerview.widget.p.f1477a
            r0.set(r1)
        L_0x0062:
            androidx.recyclerview.widget.p r0 = r4.pa
            r0.a((androidx.recyclerview.widget.RecyclerView) r4)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        p pVar;
        super.onDetachedFromWindow();
        f fVar = this.W;
        if (fVar != null) {
            fVar.b();
        }
        x();
        this.B = false;
        i iVar = this.w;
        if (iVar != null) {
            iVar.a(this, this.l);
        }
        this.Fa.clear();
        removeCallbacks(this.Ga);
        this.p.b();
        if (f1317f && (pVar = this.pa) != null) {
            pVar.b(this);
            this.pa = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.y.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.y.get(i2).a(canvas, this, this.ra);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        if (this.w != null && !this.H && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f3 = this.w.b() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.w.a()) {
                    f2 = motionEvent.getAxisValue(10);
                    if (!(f3 == 0.0f && f2 == 0.0f)) {
                        a((int) (f2 * this.la), (int) (f3 * this.ma), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.w.b()) {
                        f3 = -axisValue;
                    } else if (this.w.a()) {
                        f2 = axisValue;
                        f3 = 0.0f;
                        a((int) (f2 * this.la), (int) (f3 * this.ma), motionEvent);
                    }
                }
                f3 = 0.0f;
            }
            f2 = 0.0f;
            a((int) (f2 * this.la), (int) (f3 * this.ma), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.H) {
            return false;
        }
        this.A = null;
        if (b(motionEvent)) {
            y();
            return true;
        }
        i iVar = this.w;
        if (iVar == null) {
            return false;
        }
        boolean a2 = iVar.a();
        boolean b2 = this.w.b();
        if (this.ca == null) {
            this.ca = VelocityTracker.obtain();
        }
        this.ca.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.I) {
                this.I = false;
            }
            this.ba = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.fa = x2;
            this.da = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.ga = y2;
            this.ea = y2;
            if (this.aa == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                f(1);
            }
            int[] iArr = this.Da;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = a2 ? 1 : 0;
            if (b2) {
                i2 |= 2;
            }
            j(i2, 0);
        } else if (actionMasked == 1) {
            this.ca.clear();
            f(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.ba);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.ba + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.aa != 1) {
                int i3 = x3 - this.da;
                int i4 = y3 - this.ea;
                if (!a2 || Math.abs(i3) <= this.ha) {
                    z2 = false;
                } else {
                    this.fa = x3;
                    z2 = true;
                }
                if (b2 && Math.abs(i4) > this.ha) {
                    this.ga = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            y();
        } else if (actionMasked == 5) {
            this.ba = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.fa = x4;
            this.da = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.ga = y4;
            this.ea = y4;
        } else if (actionMasked == 6) {
            c(motionEvent);
        }
        return this.aa == 1;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        b.h.f.a.a("RV OnLayout");
        c();
        b.h.f.a.a();
        this.E = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        i iVar = this.w;
        if (iVar == null) {
            c(i2, i3);
            return;
        }
        boolean z2 = false;
        if (iVar.u()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.w.a(this.l, this.ra, i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            if (!z2 && this.v != null) {
                if (this.ra.f1367e == 1) {
                    A();
                }
                this.w.b(i2, i3);
                this.ra.j = true;
                B();
                this.w.d(i2, i3);
                if (this.w.A()) {
                    this.w.b(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.ra.j = true;
                    B();
                    this.w.d(i2, i3);
                }
            }
        } else if (this.C) {
            this.w.a(this.l, this.ra, i2, i3);
        } else {
            if (this.K) {
                w();
                q();
                I();
                r();
                u uVar = this.ra;
                if (uVar.l) {
                    uVar.f1370h = true;
                } else {
                    this.n.b();
                    this.ra.f1370h = false;
                }
                this.K = false;
                c(false);
            } else if (this.ra.l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            a aVar = this.v;
            if (aVar != null) {
                this.ra.f1368f = aVar.getItemCount();
            } else {
                this.ra.f1368f = 0;
            }
            w();
            this.w.a(this.l, this.ra, i2, i3);
            c(false);
            this.ra.f1370h = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (n()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof s)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        this.m = (s) parcelable;
        super.onRestoreInstanceState(this.m.a());
        i iVar = this.w;
        if (iVar != null && (parcelable2 = this.m.f1362c) != null) {
            iVar.a(parcelable2);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        s sVar = new s(super.onSaveInstanceState());
        s sVar2 = this.m;
        if (sVar2 != null) {
            sVar.a(sVar2);
        } else {
            i iVar = this.w;
            sVar.f1362c = iVar != null ? iVar.x() : null;
        }
        return sVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4 || i3 != i5) {
            l();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i2;
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean z3 = false;
        if (this.H || this.I) {
            return false;
        }
        if (a(motionEvent)) {
            y();
            return true;
        }
        i iVar = this.w;
        if (iVar == null) {
            return false;
        }
        boolean a2 = iVar.a();
        boolean b2 = this.w.b();
        if (this.ca == null) {
            this.ca = VelocityTracker.obtain();
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.Da;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        int[] iArr2 = this.Da;
        obtain.offsetLocation((float) iArr2[0], (float) iArr2[1]);
        if (actionMasked == 0) {
            this.ba = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.fa = x2;
            this.da = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.ga = y2;
            this.ea = y2;
            int i6 = a2 ? 1 : 0;
            if (b2) {
                i6 |= 2;
            }
            j(i6, 0);
        } else if (actionMasked == 1) {
            this.ca.addMovement(obtain);
            this.ca.computeCurrentVelocity(1000, (float) this.ka);
            float f2 = a2 ? -this.ca.getXVelocity(this.ba) : 0.0f;
            float f3 = b2 ? -this.ca.getYVelocity(this.ba) : 0.0f;
            if ((f2 == 0.0f && f3 == 0.0f) || !e((int) f2, (int) f3)) {
                setScrollState(0);
            }
            M();
            z3 = true;
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.ba);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.ba + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            int i7 = this.fa - x3;
            int i8 = this.ga - y3;
            int[] iArr3 = this.Ea;
            iArr3[0] = 0;
            iArr3[1] = 0;
            if (a(i7, i8, iArr3, this.Ca, 0)) {
                int[] iArr4 = this.Ea;
                i7 -= iArr4[0];
                i8 -= iArr4[1];
                int[] iArr5 = this.Ca;
                obtain.offsetLocation((float) iArr5[0], (float) iArr5[1]);
                int[] iArr6 = this.Da;
                int i9 = iArr6[0];
                int[] iArr7 = this.Ca;
                iArr6[0] = i9 + iArr7[0];
                iArr6[1] = iArr6[1] + iArr7[1];
            }
            if (this.aa != 1) {
                if (!a2 || Math.abs(i3) <= (i5 = this.ha)) {
                    z2 = false;
                } else {
                    i3 = i3 > 0 ? i3 - i5 : i3 + i5;
                    z2 = true;
                }
                if (b2 && Math.abs(i2) > (i4 = this.ha)) {
                    i2 = i2 > 0 ? i2 - i4 : i2 + i4;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
            if (this.aa == 1) {
                int[] iArr8 = this.Ca;
                this.fa = x3 - iArr8[0];
                this.ga = y3 - iArr8[1];
                if (a(a2 ? i3 : 0, b2 ? i2 : 0, obtain)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (!(this.pa == null || (i3 == 0 && i2 == 0))) {
                    this.pa.a(this, i3, i2);
                }
            }
        } else if (actionMasked == 3) {
            y();
        } else if (actionMasked == 5) {
            this.ba = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.fa = x4;
            this.da = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.ga = y4;
            this.ea = y4;
        } else if (actionMasked == 6) {
            c(motionEvent);
        }
        if (!z3) {
            this.ca.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void p() {
        int b2 = this.o.b();
        for (int i2 = 0; i2 < b2; i2++) {
            x g2 = g(this.o.d(i2));
            if (g2 != null && !g2.shouldIgnore()) {
                g2.addFlags(6);
            }
        }
        o();
        this.l.h();
    }

    /* access modifiers changed from: package-private */
    public void q() {
        this.P++;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        a(true);
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z2) {
        x g2 = g(view);
        if (g2 != null) {
            if (g2.isTmpDetached()) {
                g2.clearTmpDetachFlag();
            } else if (!g2.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + g2 + i());
            }
        }
        view.clearAnimation();
        b(view);
        super.removeDetachedView(view, z2);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.w.a(this, this.ra, view, view2) && view2 != null) {
            a(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.w.a(this, view, rect, z2);
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.z.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.z.get(i2).a(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public void requestLayout() {
        if (this.F != 0 || this.H) {
            this.G = true;
        } else {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public void s() {
        if (!this.xa && this.B) {
            y.a((View) this, this.Ga);
            this.xa = true;
        }
    }

    public void scrollBy(int i2, int i3) {
        i iVar = this.w;
        if (iVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.H) {
            boolean a2 = iVar.a();
            boolean b2 = this.w.b();
            if (a2 || b2) {
                if (!a2) {
                    i2 = 0;
                }
                if (!b2) {
                    i3 = 0;
                }
                a(i2, i3, (MotionEvent) null);
            }
        }
    }

    public void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!a(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(G g2) {
        this.ya = g2;
        y.a((View) this, (C0195a) this.ya);
    }

    public void setAdapter(a aVar) {
        setLayoutFrozen(false);
        a(aVar, false, true);
        b(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(d dVar) {
        if (dVar != this.za) {
            this.za = dVar;
            setChildrenDrawingOrderEnabled(this.za != null);
        }
    }

    public void setClipToPadding(boolean z2) {
        if (z2 != this.q) {
            l();
        }
        this.q = z2;
        super.setClipToPadding(z2);
        if (this.E) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(e eVar) {
        b.h.i.g.a(eVar);
        this.R = eVar;
        l();
    }

    public void setHasFixedSize(boolean z2) {
        this.C = z2;
    }

    public void setItemAnimator(f fVar) {
        f fVar2 = this.W;
        if (fVar2 != null) {
            fVar2.b();
            this.W.a((f.b) null);
        }
        this.W = fVar;
        f fVar3 = this.W;
        if (fVar3 != null) {
            fVar3.a(this.wa);
        }
    }

    public void setItemViewCacheSize(int i2) {
        this.l.f(i2);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(i iVar) {
        if (iVar != this.w) {
            x();
            if (this.w != null) {
                f fVar = this.W;
                if (fVar != null) {
                    fVar.b();
                }
                this.w.b(this.l);
                this.w.c(this.l);
                this.l.a();
                if (this.B) {
                    this.w.a(this, this.l);
                }
                this.w.f((RecyclerView) null);
                this.w = null;
            } else {
                this.l.a();
            }
            this.o.c();
            this.w = iVar;
            if (iVar != null) {
                if (iVar.f1332b == null) {
                    this.w.f(this);
                    if (this.B) {
                        this.w.a(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + iVar + " is already attached to a RecyclerView:" + iVar.f1332b.i());
                }
            }
            this.l.j();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().a(z2);
    }

    public void setOnFlingListener(l lVar) {
        this.ia = lVar;
    }

    @Deprecated
    public void setOnScrollListener(n nVar) {
        this.sa = nVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.na = z2;
    }

    public void setRecycledViewPool(o oVar) {
        this.l.a(oVar);
    }

    public void setRecyclerListener(q qVar) {
        this.x = qVar;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i2) {
        if (i2 != this.aa) {
            this.aa = i2;
            if (i2 != 2) {
                O();
            }
            a(i2);
        }
    }

    public void setScrollingTouchSlop(int i2) {
        int i3;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
            } else {
                i3 = viewConfiguration.getScaledPagingTouchSlop();
                this.ha = i3;
            }
        }
        i3 = viewConfiguration.getScaledTouchSlop();
        this.ha = i3;
    }

    public void setViewCacheExtension(v vVar) {
        this.l.a(vVar);
    }

    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().b(i2);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().c();
    }

    public final void suppressLayout(boolean z2) {
        if (z2 != this.H) {
            a("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.H = false;
                if (!(!this.G || this.w == null || this.v == null)) {
                    requestLayout();
                }
                this.G = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.H = true;
            this.I = true;
            x();
        }
    }

    /* access modifiers changed from: package-private */
    public void t() {
        f fVar = this.W;
        if (fVar != null) {
            fVar.b();
        }
        i iVar = this.w;
        if (iVar != null) {
            iVar.b(this.l);
            this.w.c(this.l);
        }
        this.l.a();
    }

    /* access modifiers changed from: package-private */
    public void u() {
        x xVar;
        int a2 = this.o.a();
        for (int i2 = 0; i2 < a2; i2++) {
            View c2 = this.o.c(i2);
            x f2 = f(c2);
            if (!(f2 == null || (xVar = f2.mShadowingHolder) == null)) {
                View view = xVar.itemView;
                int left = c2.getLeft();
                int top = c2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void v() {
        int b2 = this.o.b();
        for (int i2 = 0; i2 < b2; i2++) {
            x g2 = g(this.o.d(i2));
            if (!g2.shouldIgnore()) {
                g2.saveOldPosition();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void w() {
        this.F++;
        if (this.F == 1 && !this.H) {
            this.G = false;
        }
    }

    public void x() {
        setScrollState(0);
        O();
    }
}
