package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.o;

public class V_NoRegistration extends o {
    Button contact;
    Button home;
    Button search;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_v__no_registration);
        this.home = (Button) findViewById(R.id.home);
        this.contact = (Button) findViewById(R.id.contactus);
        this.search = (Button) findViewById(R.id.search);
        Button button = this.home;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    V_NoRegistration.this.finish();
                }
            });
        }
        Button button2 = this.contact;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    String str;
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("message/rfc822");
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{"hangoverstudios.mobile@gmail.com"});
                    if (MainActivity.mObj != null) {
                        intent.putExtra("android.intent.extra.SUBJECT", "Vehicle Number : " + V_SearchActivity.vehicleNo + " Not Found");
                        str = "Hello Sir,\n\n My Vehicle Number is : " + V_SearchActivity.vehicleNo + "\n\n Vehicle details are not found in the database. \n\n Please check and update the info\n\n Thank you,";
                    } else {
                        intent.putExtra("android.intent.extra.SUBJECT", "Feedback");
                        str = BuildConfig.FLAVOR;
                    }
                    intent.putExtra("android.intent.extra.TEXT", str);
                    try {
                        V_NoRegistration.this.startActivity(Intent.createChooser(intent, "Send mail..."));
                        V_NoRegistration.this.finish();
                    } catch (ActivityNotFoundException unused) {
                        Toast.makeText(V_NoRegistration.this, "There are no email clients installed.", 0).show();
                    }
                }
            });
        }
        Button button3 = this.search;
        if (button3 != null) {
            button3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    V_NoRegistration.this.finish();
                }
            });
        }
    }
}
