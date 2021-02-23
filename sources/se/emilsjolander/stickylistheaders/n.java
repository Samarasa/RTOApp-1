package se.emilsjolander.stickylistheaders;

import android.view.View;
import se.emilsjolander.stickylistheaders.q;

class n implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q f15608a;

    n(q qVar) {
        this.f15608a = qVar;
    }

    public void onClick(View view) {
        q.c f2 = this.f15608a.s;
        q qVar = this.f15608a;
        f2.onHeaderClick(qVar, qVar.f15613b, this.f15608a.f15615d.intValue(), this.f15608a.f15614c.longValue(), true);
    }
}
