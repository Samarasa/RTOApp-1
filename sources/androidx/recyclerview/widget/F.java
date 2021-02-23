package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;

class F implements Parcelable.ClassLoaderCreator<RecyclerView.s> {
    F() {
    }

    public RecyclerView.s createFromParcel(Parcel parcel) {
        return new RecyclerView.s(parcel, (ClassLoader) null);
    }

    public RecyclerView.s createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new RecyclerView.s(parcel, classLoader);
    }

    public RecyclerView.s[] newArray(int i) {
        return new RecyclerView.s[i];
    }
}
