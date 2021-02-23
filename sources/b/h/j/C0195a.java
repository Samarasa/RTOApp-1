package b.h.j;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import b.h.j.a.c;
import b.h.j.a.d;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: b.h.j.a  reason: case insensitive filesystem */
public class C0195a {

    /* renamed from: a  reason: collision with root package name */
    private static final View.AccessibilityDelegate f2531a = new View.AccessibilityDelegate();

    /* renamed from: b  reason: collision with root package name */
    private final View.AccessibilityDelegate f2532b;

    /* renamed from: c  reason: collision with root package name */
    private final View.AccessibilityDelegate f2533c;

    /* renamed from: b.h.j.a$a  reason: collision with other inner class name */
    static final class C0034a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        final C0195a f2534a;

        C0034a(C0195a aVar) {
            this.f2534a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f2534a.a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            d a2 = this.f2534a.a(view);
            if (a2 != null) {
                return (AccessibilityNodeProvider) a2.a();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2534a.b(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            c a2 = c.a(accessibilityNodeInfo);
            a2.k(y.D(view));
            a2.i(y.y(view));
            a2.e(y.d(view));
            this.f2534a.a(view, a2);
            a2.a(accessibilityNodeInfo.getText(), view);
            List<c.a> b2 = C0195a.b(view);
            for (int i = 0; i < b2.size(); i++) {
                a2.a(b2.get(i));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2534a.c(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f2534a.a(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f2534a.a(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f2534a.a(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f2534a.d(view, accessibilityEvent);
        }
    }

    public C0195a() {
        this(f2531a);
    }

    public C0195a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2532b = accessibilityDelegate;
        this.f2533c = new C0034a(this);
    }

    private boolean a(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(b.h.c.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!a(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    private boolean a(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] a2 = c.a(view.createAccessibilityNodeInfo().getText());
            int i = 0;
            while (a2 != null && i < a2.length) {
                if (clickableSpan.equals(a2[i])) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    static List<c.a> b(View view) {
        List<c.a> list = (List) view.getTag(b.h.c.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    /* access modifiers changed from: package-private */
    public View.AccessibilityDelegate a() {
        return this.f2533c;
    }

    public d a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.f2532b.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new d(accessibilityNodeProvider);
    }

    public void a(View view, int i) {
        this.f2532b.sendAccessibilityEvent(view, i);
    }

    public void a(View view, c cVar) {
        this.f2532b.onInitializeAccessibilityNodeInfo(view, cVar.x());
    }

    public boolean a(View view, int i, Bundle bundle) {
        List<c.a> b2 = b(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= b2.size()) {
                break;
            }
            c.a aVar = b2.get(i2);
            if (aVar.a() == i) {
                z = aVar.a(view, bundle);
                break;
            }
            i2++;
        }
        if (!z && Build.VERSION.SDK_INT >= 16) {
            z = this.f2532b.performAccessibilityAction(view, i, bundle);
        }
        return (z || i != b.h.c.accessibility_action_clickable_span) ? z : a(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2532b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2532b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        this.f2532b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f2532b.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, AccessibilityEvent accessibilityEvent) {
        this.f2532b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
