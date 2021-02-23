package se.emilsjolander.stickylistheaders;

import android.view.View;
import se.emilsjolander.stickylistheaders.q;

class o implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q f15609a;

    o(q qVar) {
        this.f15609a = qVar;
    }

    public void onClick(View view) {
        q.c f2 = this.f15609a.s;
        q qVar = this.f15609a;
        f2.onHeaderClick(qVar, qVar.f15613b, this.f15609a.f15615d.intValue(), this.f15609a.f15614c.longValue(), true);
    }
}
