package c.a.a.c.c;

import android.util.Log;
import c.a.a.c.d;
import c.a.a.c.k;
import c.a.a.i.a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: c.a.a.c.c.e  reason: case insensitive filesystem */
public class C0243e implements d<ByteBuffer> {
    public boolean a(ByteBuffer byteBuffer, File file, k kVar) {
        try {
            a.a(byteBuffer, file);
            return true;
        } catch (IOException e2) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e2);
            }
            return false;
        }
    }
}
