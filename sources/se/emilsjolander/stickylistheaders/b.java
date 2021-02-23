package se.emilsjolander.stickylistheaders;

import android.view.View;

class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f15588a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f15589b;

    b(c cVar, int i) {
        this.f15589b = cVar;
        this.f15588a = i;
    }

    public void onClick(View view) {
        if (this.f15589b.f15595f != null) {
            this.f15589b.f15595f.a(view, this.f15588a, this.f15589b.f15590a.getHeaderId(this.f15588a));
        }
    }
}
