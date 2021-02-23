package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.n;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new l();

    /* renamed from: a  reason: collision with root package name */
    final int f61a;

    /* renamed from: b  reason: collision with root package name */
    final long f62b;

    /* renamed from: c  reason: collision with root package name */
    final long f63c;

    /* renamed from: d  reason: collision with root package name */
    final float f64d;

    /* renamed from: e  reason: collision with root package name */
    final long f65e;

    /* renamed from: f  reason: collision with root package name */
    final int f66f;

    /* renamed from: g  reason: collision with root package name */
    final CharSequence f67g;

    /* renamed from: h  reason: collision with root package name */
    final long f68h;
    List<CustomAction> i;
    final long j;
    final Bundle k;
    private Object l;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new m();

        /* renamed from: a  reason: collision with root package name */
        private final String f69a;

        /* renamed from: b  reason: collision with root package name */
        private final CharSequence f70b;

        /* renamed from: c  reason: collision with root package name */
        private final int f71c;

        /* renamed from: d  reason: collision with root package name */
        private final Bundle f72d;

        /* renamed from: e  reason: collision with root package name */
        private Object f73e;

        CustomAction(Parcel parcel) {
            this.f69a = parcel.readString();
            this.f70b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f71c = parcel.readInt();
            this.f72d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f69a = str;
            this.f70b = charSequence;
            this.f71c = i;
            this.f72d = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            CustomAction customAction = new CustomAction(n.a.a(obj), n.a.d(obj), n.a.c(obj), n.a.b(obj));
            customAction.f73e = obj;
            return customAction;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.f70b + ", mIcon=" + this.f71c + ", mExtras=" + this.f72d;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f69a);
            TextUtils.writeToParcel(this.f70b, parcel, i);
            parcel.writeInt(this.f71c);
            parcel.writeBundle(this.f72d);
        }
    }

    PlaybackStateCompat(int i2, long j2, long j3, float f2, long j4, int i3, CharSequence charSequence, long j5, List<CustomAction> list, long j6, Bundle bundle) {
        this.f61a = i2;
        this.f62b = j2;
        this.f63c = j3;
        this.f64d = f2;
        this.f65e = j4;
        this.f66f = i3;
        this.f67g = charSequence;
        this.f68h = j5;
        this.i = new ArrayList(list);
        this.j = j6;
        this.k = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f61a = parcel.readInt();
        this.f62b = parcel.readLong();
        this.f64d = parcel.readFloat();
        this.f68h = parcel.readLong();
        this.f63c = parcel.readLong();
        this.f65e = parcel.readLong();
        this.f67g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.j = parcel.readLong();
        this.k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f66f = parcel.readInt();
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList;
        Object obj2 = obj;
        Bundle bundle = null;
        if (obj2 == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        List<Object> d2 = n.d(obj);
        if (d2 != null) {
            ArrayList arrayList2 = new ArrayList(d2.size());
            for (Object a2 : d2) {
                arrayList2.add(CustomAction.a(a2));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = o.a(obj);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(n.i(obj), n.h(obj), n.c(obj), n.g(obj), n.a(obj), 0, n.e(obj), n.f(obj), arrayList, n.b(obj), bundle);
        playbackStateCompat.l = obj2;
        return playbackStateCompat;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f61a + ", position=" + this.f62b + ", buffered position=" + this.f63c + ", speed=" + this.f64d + ", updated=" + this.f68h + ", actions=" + this.f65e + ", error code=" + this.f66f + ", error message=" + this.f67g + ", custom actions=" + this.i + ", active item id=" + this.j + "}";
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f61a);
        parcel.writeLong(this.f62b);
        parcel.writeFloat(this.f64d);
        parcel.writeLong(this.f68h);
        parcel.writeLong(this.f63c);
        parcel.writeLong(this.f65e);
        TextUtils.writeToParcel(this.f67g, parcel, i2);
        parcel.writeTypedList(this.i);
        parcel.writeLong(this.j);
        parcel.writeBundle(this.k);
        parcel.writeInt(this.f66f);
    }
}
