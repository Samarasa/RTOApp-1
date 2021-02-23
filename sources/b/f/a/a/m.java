package b.f.a.a;

import java.util.Arrays;

public class m extends h {
    protected h[] va = new h[4];
    protected int wa = 0;

    public void J() {
        this.wa = 0;
    }

    public void b(h hVar) {
        int i = this.wa + 1;
        h[] hVarArr = this.va;
        if (i > hVarArr.length) {
            this.va = (h[]) Arrays.copyOf(hVarArr, hVarArr.length * 2);
        }
        h[] hVarArr2 = this.va;
        int i2 = this.wa;
        hVarArr2[i2] = hVar;
        this.wa = i2 + 1;
    }
}
