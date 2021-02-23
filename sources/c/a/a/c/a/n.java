package c.a.a.c.a;

import android.content.res.AssetManager;
import java.io.InputStream;

public class n extends b<InputStream> {
    public n(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* access modifiers changed from: protected */
    public InputStream a(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }

    public Class<InputStream> a() {
        return InputStream.class;
    }

    /* access modifiers changed from: protected */
    public void a(InputStream inputStream) {
        inputStream.close();
    }
}
