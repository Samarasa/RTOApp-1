package androidx.appcompat.widget;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: androidx.appcompat.widget.ia  reason: case insensitive filesystem */
class C0127ia implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SearchView f661a;

    C0127ia(SearchView searchView) {
        this.f661a = searchView;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f661a.b(charSequence);
    }
}
