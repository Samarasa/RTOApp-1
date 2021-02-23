package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;

class s implements Parcelable.Creator<LinearLayoutManager.d> {
    s() {
    }

    public LinearLayoutManager.d createFromParcel(Parcel parcel) {
        return new LinearLayoutManager.d(parcel);
    }

    public LinearLayoutManager.d[] newArray(int i) {
        return new LinearLayoutManager.d[i];
    }
}
