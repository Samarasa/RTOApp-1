package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.f;
import android.support.v4.media.g;
import android.text.TextUtils;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new e();

    /* renamed from: a  reason: collision with root package name */
    private final String f20a;

    /* renamed from: b  reason: collision with root package name */
    private final CharSequence f21b;

    /* renamed from: c  reason: collision with root package name */
    private final CharSequence f22c;

    /* renamed from: d  reason: collision with root package name */
    private final CharSequence f23d;

    /* renamed from: e  reason: collision with root package name */
    private final Bitmap f24e;

    /* renamed from: f  reason: collision with root package name */
    private final Uri f25f;

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f26g;

    /* renamed from: h  reason: collision with root package name */
    private final Uri f27h;
    private Object i;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f28a;

        /* renamed from: b  reason: collision with root package name */
        private CharSequence f29b;

        /* renamed from: c  reason: collision with root package name */
        private CharSequence f30c;

        /* renamed from: d  reason: collision with root package name */
        private CharSequence f31d;

        /* renamed from: e  reason: collision with root package name */
        private Bitmap f32e;

        /* renamed from: f  reason: collision with root package name */
        private Uri f33f;

        /* renamed from: g  reason: collision with root package name */
        private Bundle f34g;

        /* renamed from: h  reason: collision with root package name */
        private Uri f35h;

        public a a(Bitmap bitmap) {
            this.f32e = bitmap;
            return this;
        }

        public a a(Uri uri) {
            this.f33f = uri;
            return this;
        }

        public a a(Bundle bundle) {
            this.f34g = bundle;
            return this;
        }

        public a a(CharSequence charSequence) {
            this.f31d = charSequence;
            return this;
        }

        public a a(String str) {
            this.f28a = str;
            return this;
        }

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f28a, this.f29b, this.f30c, this.f31d, this.f32e, this.f33f, this.f34g, this.f35h);
        }

        public a b(Uri uri) {
            this.f35h = uri;
            return this;
        }

        public a b(CharSequence charSequence) {
            this.f30c = charSequence;
            return this;
        }

        public a c(CharSequence charSequence) {
            this.f29b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f20a = parcel.readString();
        this.f21b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f22c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f23d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f24e = (Bitmap) parcel.readParcelable(classLoader);
        this.f25f = (Uri) parcel.readParcelable(classLoader);
        this.f26g = parcel.readBundle(classLoader);
        this.f27h = (Uri) parcel.readParcelable(classLoader);
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f20a = str;
        this.f21b = charSequence;
        this.f22c = charSequence2;
        this.f23d = charSequence3;
        this.f24e = bitmap;
        this.f25f = uri;
        this.f26g = bundle;
        this.f27h = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x0080
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x0080
            android.support.v4.media.MediaDescriptionCompat$a r1 = new android.support.v4.media.MediaDescriptionCompat$a
            r1.<init>()
            java.lang.String r2 = android.support.v4.media.f.e(r8)
            r1.a((java.lang.String) r2)
            java.lang.CharSequence r2 = android.support.v4.media.f.g(r8)
            r1.c(r2)
            java.lang.CharSequence r2 = android.support.v4.media.f.f(r8)
            r1.b((java.lang.CharSequence) r2)
            java.lang.CharSequence r2 = android.support.v4.media.f.a((java.lang.Object) r8)
            r1.a((java.lang.CharSequence) r2)
            android.graphics.Bitmap r2 = android.support.v4.media.f.c(r8)
            r1.a((android.graphics.Bitmap) r2)
            android.net.Uri r2 = android.support.v4.media.f.d(r8)
            r1.a((android.net.Uri) r2)
            android.os.Bundle r2 = android.support.v4.media.f.b(r8)
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x004a
            android.support.v4.media.session.MediaSessionCompat.a(r2)
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L_0x004b
        L_0x004a:
            r4 = r0
        L_0x004b:
            if (r4 == 0) goto L_0x0063
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L_0x005d
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L_0x005d
            goto L_0x0064
        L_0x005d:
            r2.remove(r3)
            r2.remove(r5)
        L_0x0063:
            r0 = r2
        L_0x0064:
            r1.a((android.os.Bundle) r0)
            if (r4 == 0) goto L_0x006d
            r1.b((android.net.Uri) r4)
            goto L_0x007a
        L_0x006d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 < r2) goto L_0x007a
            android.net.Uri r0 = android.support.v4.media.g.a(r8)
            r1.b((android.net.Uri) r0)
        L_0x007a:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.a()
            r0.i = r8
        L_0x0080:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public Object a() {
        if (this.i != null || Build.VERSION.SDK_INT < 21) {
            return this.i;
        }
        Object a2 = f.a.a();
        f.a.a(a2, this.f20a);
        f.a.c(a2, this.f21b);
        f.a.b(a2, this.f22c);
        f.a.a(a2, this.f23d);
        f.a.a(a2, this.f24e);
        f.a.a(a2, this.f25f);
        Bundle bundle = this.f26g;
        if (Build.VERSION.SDK_INT < 23 && this.f27h != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f27h);
        }
        f.a.a(a2, bundle);
        if (Build.VERSION.SDK_INT >= 23) {
            g.a.a(a2, this.f27h);
        }
        this.i = f.a.a(a2);
        return this.i;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f21b + ", " + this.f22c + ", " + this.f23d;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.f20a);
            TextUtils.writeToParcel(this.f21b, parcel, i2);
            TextUtils.writeToParcel(this.f22c, parcel, i2);
            TextUtils.writeToParcel(this.f23d, parcel, i2);
            parcel.writeParcelable(this.f24e, i2);
            parcel.writeParcelable(this.f25f, i2);
            parcel.writeBundle(this.f26g);
            parcel.writeParcelable(this.f27h, i2);
            return;
        }
        f.a(a(), parcel, i2);
    }
}
