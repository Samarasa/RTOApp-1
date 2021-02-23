package androidx.appcompat.app;

import android.view.View;

/* renamed from: androidx.appcompat.app.b  reason: case insensitive filesystem */
class C0095b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0096c f187a;

    C0095b(C0096c cVar) {
        this.f187a = cVar;
    }

    public void onClick(View view) {
        C0096c cVar = this.f187a;
        if (cVar.f193f) {
            cVar.c();
            return;
        }
        View.OnClickListener onClickListener = cVar.i;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
