package androidx.media;

import androidx.versionedparcelable.b;

public final class AudioAttributesImplBaseParcelizer {
    public static c read(b bVar) {
        c cVar = new c();
        cVar.f1263a = bVar.a(cVar.f1263a, 1);
        cVar.f1264b = bVar.a(cVar.f1264b, 2);
        cVar.f1265c = bVar.a(cVar.f1265c, 3);
        cVar.f1266d = bVar.a(cVar.f1266d, 4);
        return cVar;
    }

    public static void write(c cVar, b bVar) {
        bVar.a(false, false);
        bVar.b(cVar.f1263a, 1);
        bVar.b(cVar.f1264b, 2);
        bVar.b(cVar.f1265c, 3);
        bVar.b(cVar.f1266d, 4);
    }
}
