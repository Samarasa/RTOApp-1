package se.emilsjolander.stickylistheaders;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

public class ExpandableStickyListHeadersListView extends q {
    h y;
    a z = new i(this);

    public interface a {
        void a(View view, int i);
    }

    public ExpandableStickyListHeadersListView(Context context) {
        super(context);
    }

    public ExpandableStickyListHeadersListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExpandableStickyListHeadersListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private void a(View view, int i) {
        a aVar;
        if (i != 0 || view.getVisibility() != 0) {
            if ((1 != i || view.getVisibility() == 0) && (aVar = this.z) != null) {
                aVar.a(view, i);
            }
        }
    }

    public void a(long j) {
        if (!this.y.d(j)) {
            this.y.a(j);
            List<View> c2 = this.y.c(j);
            if (c2 != null) {
                for (View a2 : c2) {
                    a(a2, 1);
                }
            }
        }
    }

    public void b(long j) {
        if (this.y.d(j)) {
            this.y.b(j);
            List<View> c2 = this.y.c(j);
            if (c2 != null) {
                for (View a2 : c2) {
                    a(a2, 0);
                }
            }
        }
    }

    public boolean c(long j) {
        return this.y.d(j);
    }

    public h getAdapter() {
        return this.y;
    }

    public void setAdapter(m mVar) {
        this.y = new h(mVar);
        super.setAdapter(this.y);
    }

    public void setAnimExecutor(a aVar) {
        this.z = aVar;
    }
}
