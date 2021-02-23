package c.a.a.g.a;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import c.a.a.g.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated
public abstract class i<T extends View, Z> extends a<Z> {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f3575b;

    /* renamed from: c  reason: collision with root package name */
    private static Integer f3576c;

    /* renamed from: d  reason: collision with root package name */
    protected final T f3577d;

    /* renamed from: e  reason: collision with root package name */
    private final a f3578e;

    /* renamed from: f  reason: collision with root package name */
    private View.OnAttachStateChangeListener f3579f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3580g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3581h;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        static Integer f3582a;

        /* renamed from: b  reason: collision with root package name */
        private final View f3583b;

        /* renamed from: c  reason: collision with root package name */
        private final List<g> f3584c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        boolean f3585d;

        /* renamed from: e  reason: collision with root package name */
        private C0055a f3586e;

        /* renamed from: c.a.a.g.a.i$a$a  reason: collision with other inner class name */
        private static final class C0055a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a  reason: collision with root package name */
            private final WeakReference<a> f3587a;

            C0055a(a aVar) {
                this.f3587a = new WeakReference<>(aVar);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = (a) this.f3587a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.a();
                return true;
            }
        }

        a(View view) {
            this.f3583b = view;
        }

        private int a(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f3585d && this.f3583b.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f3583b.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return a(this.f3583b.getContext());
        }

        private static int a(Context context) {
            if (f3582a == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                c.a.a.i.i.a(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f3582a = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f3582a.intValue();
        }

        private boolean a(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        private boolean a(int i, int i2) {
            return a(i) && a(i2);
        }

        private void b(int i, int i2) {
            Iterator it = new ArrayList(this.f3584c).iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(i, i2);
            }
        }

        private int c() {
            int paddingTop = this.f3583b.getPaddingTop() + this.f3583b.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f3583b.getLayoutParams();
            return a(this.f3583b.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int d() {
            int paddingLeft = this.f3583b.getPaddingLeft() + this.f3583b.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f3583b.getLayoutParams();
            return a(this.f3583b.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (!this.f3584c.isEmpty()) {
                int d2 = d();
                int c2 = c();
                if (a(d2, c2)) {
                    b(d2, c2);
                    b();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(g gVar) {
            int d2 = d();
            int c2 = c();
            if (a(d2, c2)) {
                gVar.a(d2, c2);
                return;
            }
            if (!this.f3584c.contains(gVar)) {
                this.f3584c.add(gVar);
            }
            if (this.f3586e == null) {
                ViewTreeObserver viewTreeObserver = this.f3583b.getViewTreeObserver();
                this.f3586e = new C0055a(this);
                viewTreeObserver.addOnPreDrawListener(this.f3586e);
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            ViewTreeObserver viewTreeObserver = this.f3583b.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f3586e);
            }
            this.f3586e = null;
            this.f3584c.clear();
        }

        /* access modifiers changed from: package-private */
        public void b(g gVar) {
            this.f3584c.remove(gVar);
        }
    }

    public i(T t) {
        c.a.a.i.i.a(t);
        this.f3577d = (View) t;
        this.f3578e = new a(t);
    }

    private void a(Object obj) {
        Integer num = f3576c;
        if (num == null) {
            f3575b = true;
            this.f3577d.setTag(obj);
            return;
        }
        this.f3577d.setTag(num.intValue(), obj);
    }

    private Object b() {
        Integer num = f3576c;
        return num == null ? this.f3577d.getTag() : this.f3577d.getTag(num.intValue());
    }

    private void c() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f3579f;
        if (onAttachStateChangeListener != null && !this.f3581h) {
            this.f3577d.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f3581h = true;
        }
    }

    private void d() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f3579f;
        if (onAttachStateChangeListener != null && this.f3581h) {
            this.f3577d.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f3581h = false;
        }
    }

    public b a() {
        Object b2 = b();
        if (b2 == null) {
            return null;
        }
        if (b2 instanceof b) {
            return (b) b2;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public void a(g gVar) {
        this.f3578e.b(gVar);
    }

    public void a(b bVar) {
        a((Object) bVar);
    }

    public void b(Drawable drawable) {
        super.b(drawable);
        c();
    }

    public void b(g gVar) {
        this.f3578e.a(gVar);
    }

    public void c(Drawable drawable) {
        super.c(drawable);
        this.f3578e.b();
        if (!this.f3580g) {
            d();
        }
    }

    public String toString() {
        return "Target for: " + this.f3577d;
    }
}
