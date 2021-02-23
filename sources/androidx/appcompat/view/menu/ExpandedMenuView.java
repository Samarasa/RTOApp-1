package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.Aa;

public final class ExpandedMenuView extends ListView implements k.b, u, AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f274a = {16842964, 16843049};

    /* renamed from: b  reason: collision with root package name */
    private k f275b;

    /* renamed from: c  reason: collision with root package name */
    private int f276c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        Aa a2 = Aa.a(context, attributeSet, f274a, i, 0);
        if (a2.g(0)) {
            setBackgroundDrawable(a2.b(0));
        }
        if (a2.g(1)) {
            setDivider(a2.b(1));
        }
        a2.a();
    }

    public void a(k kVar) {
        this.f275b = kVar;
    }

    public boolean a(o oVar) {
        return this.f275b.a((MenuItem) oVar, 0);
    }

    public int getWindowAnimations() {
        return this.f276c;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((o) getAdapter().getItem(i));
    }
}
