package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

class y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ RecyclerView f1505a;

    y(RecyclerView recyclerView) {
        this.f1505a = recyclerView;
    }

    public void run() {
        RecyclerView.f fVar = this.f1505a.W;
        if (fVar != null) {
            fVar.i();
        }
        this.f1505a.xa = false;
    }
}
