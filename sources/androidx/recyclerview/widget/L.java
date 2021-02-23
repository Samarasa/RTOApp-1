package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

class L implements Parcelable.Creator<StaggeredGridLayoutManager.d> {
    L() {
    }

    public StaggeredGridLayoutManager.d createFromParcel(Parcel parcel) {
        return new StaggeredGridLayoutManager.d(parcel);
    }

    public StaggeredGridLayoutManager.d[] newArray(int i) {
        return new StaggeredGridLayoutManager.d[i];
    }
}
