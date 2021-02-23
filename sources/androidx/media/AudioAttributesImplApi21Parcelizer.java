package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;
import androidx.versionedparcelable.b;

public final class AudioAttributesImplApi21Parcelizer {
    public static b read(b bVar) {
        b bVar2 = new b();
        bVar2.f1261a = (AudioAttributes) bVar.a(bVar2.f1261a, 1);
        bVar2.f1262b = bVar.a(bVar2.f1262b, 2);
        return bVar2;
    }

    public static void write(b bVar, b bVar2) {
        bVar2.a(false, false);
        bVar2.b((Parcelable) bVar.f1261a, 1);
        bVar2.b(bVar.f1262b, 2);
    }
}
