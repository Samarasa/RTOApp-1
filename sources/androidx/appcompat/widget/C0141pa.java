package androidx.appcompat.widget;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: androidx.appcompat.widget.pa  reason: case insensitive filesystem */
class C0141pa implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SearchView f696a;

    C0141pa(SearchView searchView) {
        this.f696a = searchView;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.f696a.g();
        return true;
    }
}
