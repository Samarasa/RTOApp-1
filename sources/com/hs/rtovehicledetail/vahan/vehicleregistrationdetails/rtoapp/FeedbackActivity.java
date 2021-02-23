package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.C0107n;
import androidx.appcompat.app.o;

public class FeedbackActivity extends o {
    public void onBackPressed() {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT < 26) {
            setRequestedOrientation(1);
        }
        C0107n.a aVar = new C0107n.a(this);
        aVar.b((CharSequence) "Send Us Feedback");
        aVar.a((CharSequence) "Please share your experience with us");
        aVar.b((CharSequence) "Yes", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "hangoverstudios.mobile@gmail.com", (String) null));
                intent.putExtra("android.intent.extra.SUBJECT", "Subject");
                intent.putExtra("android.intent.extra.TEXT", "Body");
                FeedbackActivity.this.startActivity(Intent.createChooser(intent, "Send email..."));
                FeedbackActivity.this.finish();
            }
        });
        aVar.a((CharSequence) "No", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
                FeedbackActivity.this.finish();
            }
        });
        aVar.c();
    }
}
