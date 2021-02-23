package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

class H {
    static int a(RecyclerView.u uVar, w wVar, View view, View view2, RecyclerView.i iVar, boolean z) {
        if (iVar.e() == 0 || uVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(iVar.l(view) - iVar.l(view2)) + 1;
        }
        return Math.min(wVar.g(), wVar.a(view2) - wVar.d(view));
    }

    static int a(RecyclerView.u uVar, w wVar, View view, View view2, RecyclerView.i iVar, boolean z, boolean z2) {
        if (iVar.e() == 0 || uVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (uVar.a() - Math.max(iVar.l(view), iVar.l(view2))) - 1) : Math.max(0, Math.min(iVar.l(view), iVar.l(view2)));
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(wVar.a(view2) - wVar.d(view))) / ((float) (Math.abs(iVar.l(view) - iVar.l(view2)) + 1)))) + ((float) (wVar.f() - wVar.d(view))));
    }

    static int b(RecyclerView.u uVar, w wVar, View view, View view2, RecyclerView.i iVar, boolean z) {
        if (iVar.e() == 0 || uVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return uVar.a();
        }
        return (int) ((((float) (wVar.a(view2) - wVar.d(view))) / ((float) (Math.abs(iVar.l(view) - iVar.l(view2)) + 1))) * ((float) uVar.a()));
    }
}
