package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

class K implements Parcelable.Creator<StaggeredGridLayoutManager.c.a> {
    K() {
    }

    public StaggeredGridLayoutManager.c.a createFromParcel(Parcel parcel) {
        return new StaggeredGridLayoutManager.c.a(parcel);
    }

    public StaggeredGridLayoutManager.c.a[] newArray(int i) {
        return new StaggeredGridLayoutManager.c.a[i];
    }
}
