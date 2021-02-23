package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.o;

public class UpdateActivity extends o {
    LinearLayout update_app;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_update);
        getWindow().setFlags(1024, 1024);
        this.update_app = (LinearLayout) findViewById(R.id.update_app);
        this.update_app.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=" + UpdateActivity.this.getPackageName()));
                UpdateActivity.this.startActivity(intent);
            }
        });
    }
}
