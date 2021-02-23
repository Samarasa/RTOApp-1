package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.backends.i;
import com.google.android.datatransport.runtime.backends.n;

@Keep
public class CctBackendFactory implements e {
    public n create(i iVar) {
        return new d(iVar.a(), iVar.d(), iVar.c());
    }
}
