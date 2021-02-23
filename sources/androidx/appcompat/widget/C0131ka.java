package androidx.appcompat.widget;

import android.database.Cursor;
import b.i.a.a;

/* renamed from: androidx.appcompat.widget.ka  reason: case insensitive filesystem */
class C0131ka implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SearchView f672a;

    C0131ka(SearchView searchView) {
        this.f672a = searchView;
    }

    public void run() {
        a aVar = this.f672a.S;
        if (aVar instanceof ua) {
            aVar.a((Cursor) null);
        }
    }
}
