package b.h.j.a;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import b.h.j.a.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static int f2538a;

    /* renamed from: b  reason: collision with root package name */
    private final AccessibilityNodeInfo f2539b;

    /* renamed from: c  reason: collision with root package name */
    public int f2540c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f2541d = -1;

    public static class a {
        public static final a A = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
        public static final a B = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
        public static final a C = new a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
        public static final a D = new a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
        public static final a E = new a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
        public static final a F = new a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
        public static final a G = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
        public static final a H = new a(Build.VERSION.SDK_INT >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, (CharSequence) null, (f) null, f.C0036f.class);
        public static final a I = new a(Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, (CharSequence) null, (f) null, f.d.class);
        public static final a J = new a(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
        public static final a K;

        /* renamed from: a  reason: collision with root package name */
        public static final a f2542a = new a(1, (CharSequence) null);

        /* renamed from: b  reason: collision with root package name */
        public static final a f2543b = new a(2, (CharSequence) null);

        /* renamed from: c  reason: collision with root package name */
        public static final a f2544c = new a(4, (CharSequence) null);

        /* renamed from: d  reason: collision with root package name */
        public static final a f2545d = new a(8, (CharSequence) null);

        /* renamed from: e  reason: collision with root package name */
        public static final a f2546e = new a(16, (CharSequence) null);

        /* renamed from: f  reason: collision with root package name */
        public static final a f2547f = new a(32, (CharSequence) null);

        /* renamed from: g  reason: collision with root package name */
        public static final a f2548g = new a(64, (CharSequence) null);

        /* renamed from: h  reason: collision with root package name */
        public static final a f2549h = new a(128, (CharSequence) null);
        public static final a i = new a(256, (CharSequence) null, f.b.class);
        public static final a j = new a(512, (CharSequence) null, f.b.class);
        public static final a k = new a(1024, (CharSequence) null, f.c.class);
        public static final a l = new a(2048, (CharSequence) null, f.c.class);
        public static final a m = new a(4096, (CharSequence) null);
        public static final a n = new a(8192, (CharSequence) null);
        public static final a o = new a(16384, (CharSequence) null);
        public static final a p = new a(32768, (CharSequence) null);
        public static final a q = new a(65536, (CharSequence) null);
        public static final a r = new a(131072, (CharSequence) null, f.g.class);
        public static final a s = new a(262144, (CharSequence) null);
        public static final a t = new a(524288, (CharSequence) null);
        public static final a u = new a(1048576, (CharSequence) null);
        public static final a v = new a(2097152, (CharSequence) null, f.h.class);
        public static final a w = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
        public static final a x = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, (CharSequence) null, (f) null, f.e.class);
        public static final a y = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
        public static final a z = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
        final Object L;
        private final int M;
        private final Class<? extends f.a> N;
        protected final f O;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            K = new a(accessibilityAction, 16908357, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
        }

        public a(int i2, CharSequence charSequence) {
            this((Object) null, i2, charSequence, (f) null, (Class<? extends f.a>) null);
        }

        private a(int i2, CharSequence charSequence, Class<? extends f.a> cls) {
            this((Object) null, i2, charSequence, (f) null, cls);
        }

        a(Object obj) {
            this(obj, 0, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
        }

        a(Object obj, int i2, CharSequence charSequence, f fVar, Class<? extends f.a> cls) {
            this.M = i2;
            this.O = fVar;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                obj = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            }
            this.L = obj;
            this.N = cls;
        }

        public int a() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.L).getId();
            }
            return 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(android.view.View r5, android.os.Bundle r6) {
            /*
                r4 = this;
                b.h.j.a.f r0 = r4.O
                r1 = 0
                if (r0 == 0) goto L_0x0049
                r0 = 0
                java.lang.Class<? extends b.h.j.a.f$a> r2 = r4.N
                if (r2 == 0) goto L_0x0042
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x0020 }
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ Exception -> 0x0020 }
                b.h.j.a.f$a r1 = (b.h.j.a.f.a) r1     // Catch:{ Exception -> 0x0020 }
                r1.a(r6)     // Catch:{ Exception -> 0x001d }
                r0 = r1
                goto L_0x0042
            L_0x001d:
                r6 = move-exception
                r0 = r1
                goto L_0x0021
            L_0x0020:
                r6 = move-exception
            L_0x0021:
                java.lang.Class<? extends b.h.j.a.f$a> r1 = r4.N
                if (r1 != 0) goto L_0x0028
                java.lang.String r1 = "null"
                goto L_0x002c
            L_0x0028:
                java.lang.String r1 = r1.getName()
            L_0x002c:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to execute command with argument class ViewCommandArgument: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "A11yActionCompat"
                android.util.Log.e(r2, r1, r6)
            L_0x0042:
                b.h.j.a.f r6 = r4.O
                boolean r5 = r6.a(r5, r0)
                return r5
            L_0x0049:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: b.h.j.a.c.a.a(android.view.View, android.os.Bundle):boolean");
        }

        public CharSequence b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.L).getLabel();
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.L;
            return obj2 == null ? aVar.L == null : obj2.equals(aVar.L);
        }

        public int hashCode() {
            Object obj = this.L;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final Object f2550a;

        b(Object obj) {
            this.f2550a = obj;
        }

        public static b a(int i, int i2, boolean z) {
            return Build.VERSION.SDK_INT >= 19 ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z)) : new b((Object) null);
        }

        public static b a(int i, int i2, boolean z, int i3) {
            int i4 = Build.VERSION.SDK_INT;
            return i4 >= 21 ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3)) : i4 >= 19 ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z)) : new b((Object) null);
        }
    }

    /* renamed from: b.h.j.a.c$c  reason: collision with other inner class name */
    public static class C0035c {

        /* renamed from: a  reason: collision with root package name */
        final Object f2551a;

        C0035c(Object obj) {
            this.f2551a = obj;
        }

        public static C0035c a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = Build.VERSION.SDK_INT;
            return i5 >= 21 ? new C0035c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2)) : i5 >= 19 ? new C0035c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z)) : new C0035c((Object) null);
        }
    }

    private c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f2539b = accessibilityNodeInfo;
    }

    private int a(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals((ClickableSpan) sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f2538a;
        f2538a = i2 + 1;
        return i2;
    }

    public static c a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new c(accessibilityNodeInfo);
    }

    public static c a(c cVar) {
        return a(AccessibilityNodeInfo.obtain(cVar.f2539b));
    }

    private List<Integer> a(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f2539b.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f2539b.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    private void a(int i, boolean z) {
        Bundle f2 = f();
        if (f2 != null) {
            int i2 = f2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i ^ -1);
            if (!z) {
                i = 0;
            }
            f2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    private void a(ClickableSpan clickableSpan, Spanned spanned, int i) {
        a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    public static ClickableSpan[] a(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public static c b(View view) {
        return a(AccessibilityNodeInfo.obtain(view));
    }

    private static String b(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    private SparseArray<WeakReference<ClickableSpan>> e(View view) {
        SparseArray<WeakReference<ClickableSpan>> f2 = f(view);
        if (f2 != null) {
            return f2;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(b.h.c.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    private SparseArray<WeakReference<ClickableSpan>> f(View view) {
        return (SparseArray) view.getTag(b.h.c.tag_accessibility_clickable_spans);
    }

    private void g(View view) {
        SparseArray<WeakReference<ClickableSpan>> f2 = f(view);
        if (f2 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < f2.size(); i++) {
                if (f2.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                f2.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    public static c v() {
        return a(AccessibilityNodeInfo.obtain());
    }

    private void y() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2539b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f2539b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f2539b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f2539b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    private boolean z() {
        return !a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public List<a> a() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.f2539b.getActionList() : null;
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new a(actionList.get(i)));
        }
        return arrayList;
    }

    public void a(int i) {
        this.f2539b.addAction(i);
    }

    @Deprecated
    public void a(Rect rect) {
        this.f2539b.getBoundsInParent(rect);
    }

    public void a(View view) {
        this.f2539b.addChild(view);
    }

    public void a(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2539b.addChild(view, i);
        }
    }

    public void a(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2539b.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.L);
        }
    }

    public void a(CharSequence charSequence, View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19 && i < 26) {
            y();
            g(view);
            ClickableSpan[] a2 = a(charSequence);
            if (a2 != null && a2.length > 0) {
                f().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", b.h.c.accessibility_action_clickable_span);
                SparseArray<WeakReference<ClickableSpan>> e2 = e(view);
                int i2 = 0;
                while (a2 != null && i2 < a2.length) {
                    int a3 = a(a2[i2], e2);
                    e2.put(a3, new WeakReference(a2[i2]));
                    a(a2[i2], (Spanned) charSequence, a3);
                    i2++;
                }
            }
        }
    }

    public void a(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2539b.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f2550a);
        }
    }

    public void a(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2539b.setAccessibilityFocused(z);
        }
    }

    public boolean a(int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f2539b.performAction(i, bundle);
        }
        return false;
    }

    public int b() {
        return this.f2539b.getActions();
    }

    public void b(Rect rect) {
        this.f2539b.getBoundsInScreen(rect);
    }

    public void b(View view, int i) {
        this.f2540c = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2539b.setParent(view, i);
        }
    }

    public void b(CharSequence charSequence) {
        this.f2539b.setClassName(charSequence);
    }

    public void b(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2539b.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C0035c) obj).f2551a);
        }
    }

    public void b(boolean z) {
        this.f2539b.setCheckable(z);
    }

    public boolean b(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f2539b.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.L);
        }
        return false;
    }

    public int c() {
        return this.f2539b.getChildCount();
    }

    @Deprecated
    public void c(Rect rect) {
        this.f2539b.setBoundsInParent(rect);
    }

    public void c(View view) {
        this.f2540c = -1;
        this.f2539b.setParent(view);
    }

    public void c(View view, int i) {
        this.f2541d = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2539b.setSource(view, i);
        }
    }

    public void c(CharSequence charSequence) {
        this.f2539b.setContentDescription(charSequence);
    }

    public void c(boolean z) {
        this.f2539b.setChecked(z);
    }

    public CharSequence d() {
        return this.f2539b.getClassName();
    }

    public void d(Rect rect) {
        this.f2539b.setBoundsInScreen(rect);
    }

    public void d(View view) {
        this.f2541d = -1;
        this.f2539b.setSource(view);
    }

    public void d(CharSequence charSequence) {
        this.f2539b.setPackageName(charSequence);
    }

    public void d(boolean z) {
        this.f2539b.setClickable(z);
    }

    public CharSequence e() {
        return this.f2539b.getContentDescription();
    }

    public void e(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f2539b.setPaneTitle(charSequence);
        } else if (i >= 19) {
            this.f2539b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void e(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2539b.setDismissable(z);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2539b;
        if (accessibilityNodeInfo == null) {
            if (cVar.f2539b != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(cVar.f2539b)) {
            return false;
        }
        return this.f2541d == cVar.f2541d && this.f2540c == cVar.f2540c;
    }

    public Bundle f() {
        return Build.VERSION.SDK_INT >= 19 ? this.f2539b.getExtras() : new Bundle();
    }

    public void f(CharSequence charSequence) {
        this.f2539b.setText(charSequence);
    }

    public void f(boolean z) {
        this.f2539b.setEnabled(z);
    }

    public CharSequence g() {
        return this.f2539b.getPackageName();
    }

    public void g(boolean z) {
        this.f2539b.setFocusable(z);
    }

    public CharSequence h() {
        if (!z()) {
            return this.f2539b.getText();
        }
        List<Integer> a2 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> a3 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> a4 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> a5 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f2539b.getText(), 0, this.f2539b.getText().length()));
        for (int i = 0; i < a2.size(); i++) {
            spannableString.setSpan(new a(a5.get(i).intValue(), this, f().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), a2.get(i).intValue(), a3.get(i).intValue(), a4.get(i).intValue());
        }
        return spannableString;
    }

    public void h(boolean z) {
        this.f2539b.setFocused(z);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2539b;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public String i() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f2539b.getViewIdResourceName();
        }
        return null;
    }

    public void i(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2539b.setHeading(z);
        } else {
            a(2, z);
        }
    }

    public void j(boolean z) {
        this.f2539b.setLongClickable(z);
    }

    public boolean j() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f2539b.isAccessibilityFocused();
        }
        return false;
    }

    public void k(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2539b.setScreenReaderFocusable(z);
        } else {
            a(1, z);
        }
    }

    public boolean k() {
        return this.f2539b.isCheckable();
    }

    public void l(boolean z) {
        this.f2539b.setScrollable(z);
    }

    public boolean l() {
        return this.f2539b.isChecked();
    }

    public void m(boolean z) {
        this.f2539b.setSelected(z);
    }

    public boolean m() {
        return this.f2539b.isClickable();
    }

    public void n(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2539b.setVisibleToUser(z);
        }
    }

    public boolean n() {
        return this.f2539b.isEnabled();
    }

    public boolean o() {
        return this.f2539b.isFocusable();
    }

    public boolean p() {
        return this.f2539b.isFocused();
    }

    public boolean q() {
        return this.f2539b.isLongClickable();
    }

    public boolean r() {
        return this.f2539b.isPassword();
    }

    public boolean s() {
        return this.f2539b.isScrollable();
    }

    public boolean t() {
        return this.f2539b.isSelected();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        a(rect);
        sb.append("; boundsInParent: " + rect);
        b(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(g());
        sb.append("; className: ");
        sb.append(d());
        sb.append("; text: ");
        sb.append(h());
        sb.append("; contentDescription: ");
        sb.append(e());
        sb.append("; viewId: ");
        sb.append(i());
        sb.append("; checkable: ");
        sb.append(k());
        sb.append("; checked: ");
        sb.append(l());
        sb.append("; focusable: ");
        sb.append(o());
        sb.append("; focused: ");
        sb.append(p());
        sb.append("; selected: ");
        sb.append(t());
        sb.append("; clickable: ");
        sb.append(m());
        sb.append("; longClickable: ");
        sb.append(q());
        sb.append("; enabled: ");
        sb.append(n());
        sb.append("; password: ");
        sb.append(r());
        sb.append("; scrollable: " + s());
        sb.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<a> a2 = a();
            for (int i = 0; i < a2.size(); i++) {
                a aVar = a2.get(i);
                String b2 = b(aVar.a());
                if (b2.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                    b2 = aVar.b().toString();
                }
                sb.append(b2);
                if (i != a2.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int b3 = b();
            while (b3 != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(b3);
                b3 &= numberOfTrailingZeros ^ -1;
                sb.append(b(numberOfTrailingZeros));
                if (b3 != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean u() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f2539b.isVisibleToUser();
        }
        return false;
    }

    public void w() {
        this.f2539b.recycle();
    }

    public AccessibilityNodeInfo x() {
        return this.f2539b;
    }
}
