package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.List;

public class MediaSessionCompat {

    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new g();

        /* renamed from: a  reason: collision with root package name */
        private final MediaDescriptionCompat f49a;

        /* renamed from: b  reason: collision with root package name */
        private final long f50b;

        /* renamed from: c  reason: collision with root package name */
        private Object f51c;

        QueueItem(Parcel parcel) {
            this.f49a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f50b = parcel.readLong();
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j != -1) {
                this.f49a = mediaDescriptionCompat;
                this.f50b = j;
                this.f51c = obj;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        public static QueueItem a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new QueueItem(obj, MediaDescriptionCompat.a(j.a(obj)), j.b(obj));
        }

        public static List<QueueItem> a(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object a2 : list) {
                arrayList.add(a((Object) a2));
            }
            return arrayList;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f49a + ", Id=" + this.f50b + " }";
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f49a.writeToParcel(parcel, i);
            parcel.writeLong(this.f50b);
        }
    }

    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new h();

        /* renamed from: a  reason: collision with root package name */
        ResultReceiver f52a;

        ResultReceiverWrapper(Parcel parcel) {
            this.f52a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f52a.writeToParcel(parcel, i);
        }
    }

    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new i();

        /* renamed from: a  reason: collision with root package name */
        private final Object f53a;

        /* renamed from: b  reason: collision with root package name */
        private b f54b;

        /* renamed from: c  reason: collision with root package name */
        private Bundle f55c;

        Token(Object obj) {
            this(obj, (b) null, (Bundle) null);
        }

        Token(Object obj, b bVar, Bundle bundle) {
            this.f53a = obj;
            this.f54b = bVar;
            this.f55c = bundle;
        }

        public b a() {
            return this.f54b;
        }

        public void a(Bundle bundle) {
            this.f55c = bundle;
        }

        public void a(b bVar) {
            this.f54b = bVar;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f53a;
            if (obj2 == null) {
                return token.f53a == null;
            }
            Object obj3 = token.f53a;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f53a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f53a, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.f53a);
            }
        }
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }
}
