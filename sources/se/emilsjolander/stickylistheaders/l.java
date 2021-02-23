package se.emilsjolander.stickylistheaders;

import android.content.Context;
import android.widget.SectionIndexer;

class l extends c implements SectionIndexer {

    /* renamed from: h  reason: collision with root package name */
    SectionIndexer f15607h;

    l(Context context, m mVar) {
        super(context, mVar);
        this.f15607h = (SectionIndexer) mVar;
    }

    public int getPositionForSection(int i) {
        return this.f15607h.getPositionForSection(i);
    }

    public int getSectionForPosition(int i) {
        return this.f15607h.getSectionForPosition(i);
    }

    public Object[] getSections() {
        return this.f15607h.getSections();
    }
}
