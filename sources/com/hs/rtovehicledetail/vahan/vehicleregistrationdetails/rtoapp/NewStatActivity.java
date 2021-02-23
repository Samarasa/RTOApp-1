package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.o;

public class NewStatActivity extends o {
    LinearLayout start;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_new_stat);
        this.start = (LinearLayout) findViewById(R.id.start);
        this.start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                NewStatActivity newStatActivity = NewStatActivity.this;
                newStatActivity.startActivity(new Intent(newStatActivity, MainActivity.class));
                NewStatActivity.this.finish();
            }
        });
    }
}
