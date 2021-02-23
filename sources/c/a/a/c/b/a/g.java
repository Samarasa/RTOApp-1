package c.a.a.c.b.a;

public final class g implements a<byte[]> {
    public int a() {
        return 1;
    }

    public int a(byte[] bArr) {
        return bArr.length;
    }

    public String getTag() {
        return "ByteArrayPool";
    }

    public byte[] newArray(int i) {
        return new byte[i];
    }
}
