package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.C0094a;
import androidx.appcompat.app.o;
import androidx.cardview.widget.CardView;
import java.util.Objects;

public class UsefulLinks extends o {
    CardView addChange;
    CardView diplomaticVeh;
    CardView dupRc;
    CardView dupTrade;
    CardView hpEndorse;
    CardView hpTermina;
    CardView noObjection;
    CardView ownership;
    CardView permReg;
    CardView rcRenewal;
    CardView reassign;
    CardView regDisplay;
    CardView tempReg;
    CardView tradeCert;

    public void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_useful_links);
        ((C0094a) Objects.requireNonNull(getSupportActionBar())).d(true);
        this.tempReg = (CardView) findViewById(R.id.temp_reg);
        this.rcRenewal = (CardView) findViewById(R.id.rc_renewal);
        this.noObjection = (CardView) findViewById(R.id.no_objection);
        this.hpTermina = (CardView) findViewById(R.id.hp_termina);
        this.reassign = (CardView) findViewById(R.id.reassign);
        this.dupTrade = (CardView) findViewById(R.id.dup_trade);
        this.diplomaticVeh = (CardView) findViewById(R.id.diplomatic_veh);
        this.permReg = (CardView) findViewById(R.id.perm_reg);
        this.hpEndorse = (CardView) findViewById(R.id.hp_endorse);
        this.addChange = (CardView) findViewById(R.id.add_change);
        this.tradeCert = (CardView) findViewById(R.id.trade_cert);
        this.ownership = (CardView) findViewById(R.id.ownership);
        this.regDisplay = (CardView) findViewById(R.id.reg_display);
        this.dupRc = (CardView) findViewById(R.id.dup_rc);
        this.tempReg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                UsefulLinks usefulLinks = UsefulLinks.this;
                usefulLinks.startActivity(new Intent(usefulLinks, RcWebView.class).putExtra("pageName", "file:///android_asset/temporaryRegistration.html"));
            }
        });
        this.rcRenewal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                UsefulLinks usefulLinks = UsefulLinks.this;
                usefulLinks.startActivity(new Intent(usefulLinks, RcWebView.class).putExtra("pageName", "file:///android_asset/rcRenewal.html"));
            }
        });
        this.noObjection.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                UsefulLinks usefulLinks = UsefulLinks.this;
                usefulLinks.startActivity(new Intent(usefulLinks, RcWebView.class).putExtra("pageName", "file:///android_asset/Objection.html"));
            }
        });
        this.hpTermina.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                UsefulLinks usefulLinks = UsefulLinks.this;
                usefulLinks.startActivity(new Intent(usefulLinks, RcWebView.class).putExtra("pageName", "file:///android_asset/termination.html"));
            }
        });
        this.reassign.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                UsefulLinks usefulLinks = UsefulLinks.this;
                usefulLinks.startActivity(new Intent(usefulLinks, RcWebView.class).putExtra("pageName", "file:///android_asset/reassignment.html"));
            }
        });
        this.dupTrade.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                UsefulLinks usefulLinks = UsefulLinks.this;
                usefulLinks.startActivity(new Intent(usefulLinks, RcWebView.class).putExtra("pageName", "file:///android_asset/duplicateTradeIssue.html"));
            }
        });
        this.diplomaticVeh.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                UsefulLinks usefulLinks = UsefulLinks.this;
                usefulLinks.startActivity(new Intent(usefulLinks, RcWebView.class).putExtra("pageName", "file:///android_asset/diplomatic.html"));
            }
        });
        this.permReg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                UsefulLinks usefulLinks = UsefulLinks.this;
                usefulLinks.startActivity(new Intent(usefulLinks, RcWebView.class).putExtra("pageName", "file:///android_asset/permanentRegistration.html"));
            }
        });
        this.hpEndorse.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                UsefulLinks usefulLinks = UsefulLinks.this;
                usefulLinks.startActivity(new Intent(usefulLinks, RcWebView.class).putExtra("pageName", "file:///android_asset/endorsement.html"));
            }
        });
        this.addChange.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                UsefulLinks usefulLinks = UsefulLinks.this;
                usefulLinks.startActivity(new Intent(usefulLinks, RcWebView.class).putExtra("pageName", "file:///android_asset/addressChange.html"));
            }
        });
        this.tradeCert.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                UsefulLinks usefulLinks = UsefulLinks.this;
                usefulLinks.startActivity(new Intent(usefulLinks, RcWebView.class).putExtra("pageName", "file:///android_asset/trade.html"));
            }
        });
        this.ownership.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                UsefulLinks usefulLinks = UsefulLinks.this;
                usefulLinks.startActivity(new Intent(usefulLinks, RcWebView.class).putExtra("pageName", "file:///android_asset/ownership.html"));
            }
        });
        this.regDisplay.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                UsefulLinks usefulLinks = UsefulLinks.this;
                usefulLinks.startActivity(new Intent(usefulLinks, RcWebView.class).putExtra("pageName", "file:///android_asset/registrationDisplay.html"));
            }
        });
        this.dupRc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                UsefulLinks usefulLinks = UsefulLinks.this;
                usefulLinks.startActivity(new Intent(usefulLinks, RcWebView.class).putExtra("pageName", "file:///android_asset/duplicateRC.html"));
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
