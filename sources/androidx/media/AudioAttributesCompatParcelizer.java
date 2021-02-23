package androidx.media;

import androidx.versionedparcelable.b;
import androidx.versionedparcelable.d;

public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(b bVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f1260c = (a) bVar.a(audioAttributesCompat.f1260c, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, b bVar) {
        bVar.a(false, false);
        bVar.b((d) audioAttributesCompat.f1260c, 1);
    }
}
