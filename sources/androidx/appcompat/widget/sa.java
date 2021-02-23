package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.SearchView;

class sa implements Parcelable.ClassLoaderCreator<SearchView.e> {
    sa() {
    }

    public SearchView.e createFromParcel(Parcel parcel) {
        return new SearchView.e(parcel, (ClassLoader) null);
    }

    public SearchView.e createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new SearchView.e(parcel, classLoader);
    }

    public SearchView.e[] newArray(int i) {
        return new SearchView.e[i];
    }
}
