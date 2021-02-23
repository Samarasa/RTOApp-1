package c.a.a.c.c;

import android.os.ParcelFileDescriptor;
import c.a.a.c.c.i;
import java.io.File;

class j implements i.d<ParcelFileDescriptor> {
    j() {
    }

    public ParcelFileDescriptor a(File file) {
        return ParcelFileDescriptor.open(file, 268435456);
    }

    public Class<ParcelFileDescriptor> a() {
        return ParcelFileDescriptor.class;
    }

    public void a(ParcelFileDescriptor parcelFileDescriptor) {
        parcelFileDescriptor.close();
    }
}
