package b.f.a;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.Arrays;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private static int f2358a = 1;

    /* renamed from: b  reason: collision with root package name */
    private String f2359b;

    /* renamed from: c  reason: collision with root package name */
    public int f2360c = -1;

    /* renamed from: d  reason: collision with root package name */
    int f2361d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f2362e = 0;

    /* renamed from: f  reason: collision with root package name */
    public float f2363f;

    /* renamed from: g  reason: collision with root package name */
    float[] f2364g = new float[7];

    /* renamed from: h  reason: collision with root package name */
    a f2365h;
    b[] i = new b[8];
    int j = 0;
    public int k = 0;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f2365h = aVar;
    }

    static void a() {
        f2358a++;
    }

    public final void a(b bVar) {
        int i2 = 0;
        while (true) {
            int i3 = this.j;
            if (i2 >= i3) {
                b[] bVarArr = this.i;
                if (i3 >= bVarArr.length) {
                    this.i = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.i;
                int i4 = this.j;
                bVarArr2[i4] = bVar;
                this.j = i4 + 1;
                return;
            } else if (this.i[i2] != bVar) {
                i2++;
            } else {
                return;
            }
        }
    }

    public void a(a aVar, String str) {
        this.f2365h = aVar;
    }

    public void b() {
        this.f2359b = null;
        this.f2365h = a.UNKNOWN;
        this.f2362e = 0;
        this.f2360c = -1;
        this.f2361d = -1;
        this.f2363f = 0.0f;
        this.j = 0;
        this.k = 0;
    }

    public final void b(b bVar) {
        int i2 = this.j;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.i[i3] == bVar) {
                for (int i4 = 0; i4 < (i2 - i3) - 1; i4++) {
                    b[] bVarArr = this.i;
                    int i5 = i3 + i4;
                    bVarArr[i5] = bVarArr[i5 + 1];
                }
                this.j--;
                return;
            }
        }
    }

    public final void c(b bVar) {
        int i2 = this.j;
        for (int i3 = 0; i3 < i2; i3++) {
            b[] bVarArr = this.i;
            bVarArr[i3].f2335d.a(bVarArr[i3], bVar, false);
        }
        this.j = 0;
    }

    public String toString() {
        return BuildConfig.FLAVOR + this.f2359b;
    }
}
