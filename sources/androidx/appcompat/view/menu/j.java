package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.u;
import java.util.ArrayList;

public class j extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    k f331a;

    /* renamed from: b  reason: collision with root package name */
    private int f332b = -1;

    /* renamed from: c  reason: collision with root package name */
    private boolean f333c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f334d;

    /* renamed from: e  reason: collision with root package name */
    private final LayoutInflater f335e;

    /* renamed from: f  reason: collision with root package name */
    private final int f336f;

    public j(k kVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f334d = z;
        this.f335e = layoutInflater;
        this.f331a = kVar;
        this.f336f = i;
        a();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        o f2 = this.f331a.f();
        if (f2 != null) {
            ArrayList<o> j = this.f331a.j();
            int size = j.size();
            for (int i = 0; i < size; i++) {
                if (j.get(i) == f2) {
                    this.f332b = i;
                    return;
                }
            }
        }
        this.f332b = -1;
    }

    public void a(boolean z) {
        this.f333c = z;
    }

    public k b() {
        return this.f331a;
    }

    public int getCount() {
        ArrayList<o> j = this.f334d ? this.f331a.j() : this.f331a.n();
        return this.f332b < 0 ? j.size() : j.size() - 1;
    }

    public o getItem(int i) {
        ArrayList<o> j = this.f334d ? this.f331a.j() : this.f331a.n();
        int i2 = this.f332b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return j.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f335e.inflate(this.f336f, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f331a.o() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        u.a aVar = (u.a) view;
        if (this.f333c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.a(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
