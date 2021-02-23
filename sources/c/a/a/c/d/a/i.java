package c.a.a.c.d.a;

import android.util.Log;
import c.a.a.c.f;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

public final class i implements f {

    /* renamed from: a  reason: collision with root package name */
    static final byte[] f3375a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f3376b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f3377a;

        a(ByteBuffer byteBuffer) {
            this.f3377a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public int a() {
            return ((c() << 8) & 65280) | (c() & 255);
        }

        public int a(byte[] bArr, int i) {
            int min = Math.min(i, this.f3377a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f3377a.get(bArr, 0, min);
            return min;
        }

        public short b() {
            return (short) (c() & 255);
        }

        public int c() {
            if (this.f3377a.remaining() < 1) {
                return -1;
            }
            return this.f3377a.get();
        }

        public long skip(long j) {
            int min = (int) Math.min((long) this.f3377a.remaining(), j);
            ByteBuffer byteBuffer = this.f3377a;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f3378a;

        b(byte[] bArr, int i) {
            this.f3378a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        private boolean a(int i, int i2) {
            return this.f3378a.remaining() - i >= i2;
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return this.f3378a.remaining();
        }

        /* access modifiers changed from: package-private */
        public short a(int i) {
            if (a(i, 2)) {
                return this.f3378a.getShort(i);
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public void a(ByteOrder byteOrder) {
            this.f3378a.order(byteOrder);
        }

        /* access modifiers changed from: package-private */
        public int b(int i) {
            if (a(i, 4)) {
                return this.f3378a.getInt(i);
            }
            return -1;
        }
    }

    private interface c {
        int a();

        int a(byte[] bArr, int i);

        short b();

        int c();

        long skip(long j);
    }

    private static final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        private final InputStream f3379a;

        d(InputStream inputStream) {
            this.f3379a = inputStream;
        }

        public int a() {
            return ((this.f3379a.read() << 8) & 65280) | (this.f3379a.read() & 255);
        }

        public int a(byte[] bArr, int i) {
            int i2 = i;
            while (i2 > 0) {
                int read = this.f3379a.read(bArr, i - i2, i2);
                if (read == -1) {
                    break;
                }
                i2 -= read;
            }
            return i - i2;
        }

        public short b() {
            return (short) (this.f3379a.read() & 255);
        }

        public int c() {
            return this.f3379a.read();
        }

        public long skip(long j) {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f3379a.skip(j2);
                if (skip <= 0) {
                    if (this.f3379a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }
    }

    private static int a(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    private static int a(b bVar) {
        ByteOrder byteOrder;
        String str;
        StringBuilder sb;
        String str2;
        short a2 = bVar.a(6);
        if (a2 != 18761) {
            if (a2 != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + a2);
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        bVar.a(byteOrder);
        int b2 = bVar.b(10) + 6;
        short a3 = bVar.a(b2);
        for (int i = 0; i < a3; i++) {
            int a4 = a(b2, i);
            short a5 = bVar.a(a4);
            if (a5 == 274) {
                short a6 = bVar.a(a4 + 2);
                if (a6 >= 1 && a6 <= 12) {
                    int b3 = bVar.b(a4 + 4);
                    if (b3 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i + " tagType=" + a5 + " formatCode=" + a6 + " componentCount=" + b3);
                        }
                        int i2 = b3 + f3376b[a6];
                        if (i2 <= 4) {
                            int i3 = a4 + 8;
                            if (i3 < 0 || i3 > bVar.a()) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    str = "Illegal tagValueOffset=" + i3 + " tagType=" + a5;
                                    Log.d("DfltImageHeaderParser", str);
                                }
                            } else if (i2 >= 0 && i2 + i3 <= bVar.a()) {
                                return bVar.a(i3);
                            } else {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    sb = new StringBuilder();
                                    sb.append("Illegal number of bytes for TI tag data tagType=");
                                    sb.append(a5);
                                    str = sb.toString();
                                    Log.d("DfltImageHeaderParser", str);
                                }
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            sb = new StringBuilder();
                            str2 = "Got byte count > 4, not orientation, continuing, formatCode=";
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        str = "Negative tiff component count";
                        Log.d("DfltImageHeaderParser", str);
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    sb = new StringBuilder();
                    str2 = "Got invalid format code = ";
                }
                sb.append(str2);
                sb.append(a6);
                str = sb.toString();
                Log.d("DfltImageHeaderParser", str);
            }
        }
        return -1;
    }

    private int a(c cVar, c.a.a.c.b.a.b bVar) {
        int a2 = cVar.a();
        if (!a(a2)) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + a2);
            }
            return -1;
        }
        int b2 = b(cVar);
        if (b2 == -1) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
            }
            return -1;
        }
        byte[] bArr = (byte[]) bVar.b(b2, byte[].class);
        try {
            return a(cVar, bArr, b2);
        } finally {
            bVar.put(bArr);
        }
    }

    private int a(c cVar, byte[] bArr, int i) {
        int a2 = cVar.a(bArr, i);
        if (a2 != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + a2);
            }
            return -1;
        } else if (a(bArr, i)) {
            return a(new b(bArr, i));
        } else {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
    }

    private f.a a(c cVar) {
        int a2 = cVar.a();
        if (a2 == 65496) {
            return f.a.JPEG;
        }
        int a3 = ((a2 << 16) & -65536) | (cVar.a() & 65535);
        if (a3 == -1991225785) {
            cVar.skip(21);
            return cVar.c() >= 3 ? f.a.PNG_A : f.a.PNG;
        } else if ((a3 >> 8) == 4671814) {
            return f.a.GIF;
        } else {
            if (a3 != 1380533830) {
                return f.a.UNKNOWN;
            }
            cVar.skip(4);
            if ((((cVar.a() << 16) & -65536) | (cVar.a() & 65535)) != 1464156752) {
                return f.a.UNKNOWN;
            }
            int a4 = ((cVar.a() << 16) & -65536) | (cVar.a() & 65535);
            if ((a4 & -256) != 1448097792) {
                return f.a.UNKNOWN;
            }
            int i = a4 & 255;
            if (i == 88) {
                cVar.skip(4);
                return (cVar.c() & 16) != 0 ? f.a.WEBP_A : f.a.WEBP;
            } else if (i != 76) {
                return f.a.WEBP;
            } else {
                cVar.skip(4);
                return (cVar.c() & 8) != 0 ? f.a.WEBP_A : f.a.WEBP;
            }
        }
    }

    private static boolean a(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    private boolean a(byte[] bArr, int i) {
        boolean z = bArr != null && i > f3375a.length;
        if (!z) {
            return z;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f3375a;
            if (i2 >= bArr2.length) {
                return z;
            }
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    private int b(c cVar) {
        short b2;
        int a2;
        long j;
        long skip;
        do {
            short b3 = cVar.b();
            if (b3 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + b3);
                }
                return -1;
            }
            b2 = cVar.b();
            if (b2 == 218) {
                return -1;
            }
            if (b2 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            a2 = cVar.a() - 2;
            if (b2 == 225) {
                return a2;
            }
            j = (long) a2;
            skip = cVar.skip(j);
        } while (skip == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + b2 + ", wanted to skip: " + a2 + ", but actually skipped: " + skip);
        }
        return -1;
    }

    public int a(InputStream inputStream, c.a.a.c.b.a.b bVar) {
        c.a.a.i.i.a(inputStream);
        d dVar = new d(inputStream);
        c.a.a.i.i.a(bVar);
        return a((c) dVar, bVar);
    }

    public f.a a(InputStream inputStream) {
        c.a.a.i.i.a(inputStream);
        return a((c) new d(inputStream));
    }

    public f.a a(ByteBuffer byteBuffer) {
        c.a.a.i.i.a(byteBuffer);
        return a((c) new a(byteBuffer));
    }
}
