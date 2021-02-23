package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Message;

class g implements Handler.Callback {
    g() {
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            ((BaseTransientBottomBar) message.obj).l();
            return true;
        } else if (i != 1) {
            return false;
        } else {
            ((BaseTransientBottomBar) message.obj).b(message.arg1);
            return true;
        }
    }
}
