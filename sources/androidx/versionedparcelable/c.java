package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import b.e.b;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.lang.reflect.Method;

class c extends b {

    /* renamed from: d  reason: collision with root package name */
    private final SparseIntArray f1637d;

    /* renamed from: e  reason: collision with root package name */
    private final Parcel f1638e;

    /* renamed from: f  reason: collision with root package name */
    private final int f1639f;

    /* renamed from: g  reason: collision with root package name */
    private final int f1640g;

    /* renamed from: h  reason: collision with root package name */
    private final String f1641h;
    private int i;
    private int j;
    private int k;

    c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), BuildConfig.FLAVOR, new b(), new b(), new b());
    }

    private c(Parcel parcel, int i2, int i3, String str, b<String, Method> bVar, b<String, Method> bVar2, b<String, Class> bVar3) {
        super(bVar, bVar2, bVar3);
        this.f1637d = new SparseIntArray();
        this.i = -1;
        this.j = 0;
        this.k = -1;
        this.f1638e = parcel;
        this.f1639f = i2;
        this.f1640g = i3;
        this.j = this.f1639f;
        this.f1641h = str;
    }

    public void a() {
        int i2 = this.i;
        if (i2 >= 0) {
            int i3 = this.f1637d.get(i2);
            int dataPosition = this.f1638e.dataPosition();
            this.f1638e.setDataPosition(i3);
            this.f1638e.writeInt(dataPosition - i3);
            this.f1638e.setDataPosition(dataPosition);
        }
    }

    public void a(Parcelable parcelable) {
        this.f1638e.writeParcelable(parcelable, 0);
    }

    /* access modifiers changed from: protected */
    public void a(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f1638e, 0);
    }

    public void a(String str) {
        this.f1638e.writeString(str);
    }

    public void a(boolean z) {
        this.f1638e.writeInt(z ? 1 : 0);
    }

    public void a(byte[] bArr) {
        if (bArr != null) {
            this.f1638e.writeInt(bArr.length);
            this.f1638e.writeByteArray(bArr);
            return;
        }
        this.f1638e.writeInt(-1);
    }

    public boolean a(int i2) {
        while (this.j < this.f1640g) {
            int i3 = this.k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            this.f1638e.setDataPosition(this.j);
            int readInt = this.f1638e.readInt();
            this.k = this.f1638e.readInt();
            this.j += readInt;
        }
        return this.k == i2;
    }

    /* access modifiers changed from: protected */
    public b b() {
        Parcel parcel = this.f1638e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.j;
        if (i2 == this.f1639f) {
            i2 = this.f1640g;
        }
        int i3 = i2;
        return new c(parcel, dataPosition, i3, this.f1641h + "  ", this.f1634a, this.f1635b, this.f1636c);
    }

    public void b(int i2) {
        a();
        this.i = i2;
        this.f1637d.put(i2, this.f1638e.dataPosition());
        c(0);
        c(i2);
    }

    public void c(int i2) {
        this.f1638e.writeInt(i2);
    }

    public boolean d() {
        return this.f1638e.readInt() != 0;
    }

    public byte[] e() {
        int readInt = this.f1638e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f1638e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    public CharSequence f() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f1638e);
    }

    public int g() {
        return this.f1638e.readInt();
    }

    public <T extends Parcelable> T h() {
        return this.f1638e.readParcelable(c.class.getClassLoader());
    }

    public String i() {
        return this.f1638e.readString();
    }
}
