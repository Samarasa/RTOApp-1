package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.b;

public class IconCompatParcelizer {
    public static IconCompat read(b bVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f924b = bVar.a(iconCompat.f924b, 1);
        iconCompat.f926d = bVar.a(iconCompat.f926d, 2);
        iconCompat.f927e = bVar.a(iconCompat.f927e, 3);
        iconCompat.f928f = bVar.a(iconCompat.f928f, 4);
        iconCompat.f929g = bVar.a(iconCompat.f929g, 5);
        iconCompat.f930h = (ColorStateList) bVar.a(iconCompat.f930h, 6);
        iconCompat.j = bVar.a(iconCompat.j, 7);
        iconCompat.d();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.a(true, true);
        iconCompat.a(bVar.c());
        int i = iconCompat.f924b;
        if (-1 != i) {
            bVar.b(i, 1);
        }
        byte[] bArr = iconCompat.f926d;
        if (bArr != null) {
            bVar.b(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f927e;
        if (parcelable != null) {
            bVar.b(parcelable, 3);
        }
        int i2 = iconCompat.f928f;
        if (i2 != 0) {
            bVar.b(i2, 4);
        }
        int i3 = iconCompat.f929g;
        if (i3 != 0) {
            bVar.b(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f930h;
        if (colorStateList != null) {
            bVar.b((Parcelable) colorStateList, 6);
        }
        String str = iconCompat.j;
        if (str != null) {
            bVar.b(str, 7);
        }
    }
}
