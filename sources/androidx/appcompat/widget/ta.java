package androidx.appcompat.widget;

import androidx.appcompat.widget.SearchView;

class ta implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SearchView.SearchAutoComplete f707a;

    ta(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f707a = searchAutoComplete;
    }

    public void run() {
        this.f707a.b();
    }
}
