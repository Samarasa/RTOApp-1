package se.emilsjolander.stickylistheaders;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

public interface m extends ListAdapter {
    long getHeaderId(int i);

    View getHeaderView(int i, View view, ViewGroup viewGroup);
}
