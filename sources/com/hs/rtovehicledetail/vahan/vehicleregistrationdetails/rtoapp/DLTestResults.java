package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.C0094a;
import androidx.appcompat.app.C0107n;
import androidx.appcompat.app.o;
import androidx.fragment.app.C0159i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c.a.a.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DLTestResults extends o {
    private TextView correctCount;
    private ImageView goBack;
    private ImageView loadImage;
    private LinearLayout resultHead;
    private List<DLTestBean> resultList = new ArrayList();
    private RecyclerView resultRecycler;
    private TextView scoreText;
    private DLTestAdapter testAdapter;
    private TextView wrongText;

    private void setResults() {
        System.out.println(DLTest.testInstance.testList);
        DLTest dLTest = DLTest.testInstance;
        if (dLTest != null) {
            this.resultList = dLTest.testList;
            this.testAdapter = new DLTestAdapter(this.resultList, this);
            this.resultRecycler.setLayoutManager(new LinearLayoutManager(this));
            this.resultRecycler.setAdapter(this.testAdapter);
            int i = 0;
            for (int i2 = 0; i2 < this.resultList.size(); i2++) {
                if (this.resultList.get(i2).getqAnswer().equals(this.resultList.get(i2).getuAnswer())) {
                    i++;
                }
            }
            resultSetToText(i, this.resultList.size() - i);
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_dltest_results);
        ((C0094a) Objects.requireNonNull(getSupportActionBar())).d(true);
        setTitle("Driving Licence Test Result");
        this.resultRecycler = (RecyclerView) findViewById(R.id.result_recycler);
        this.resultHead = (LinearLayout) findViewById(R.id.result_head);
        this.correctCount = (TextView) findViewById(R.id.correct_count);
        this.loadImage = (ImageView) findViewById(R.id.load_image);
        this.scoreText = (TextView) findViewById(R.id.score_text);
        this.wrongText = (TextView) findViewById(R.id.wrong_text);
        setResults();
        c.a((C0159i) this).a(Integer.valueOf(R.drawable.loadinggif)).a(this.loadImage);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void resultSetToText(int i, int i2) {
        String str;
        TextView textView = this.scoreText;
        textView.setText(i + "/10");
        TextView textView2 = this.wrongText;
        textView2.setText(BuildConfig.FLAVOR + i2);
        TextView textView3 = this.correctCount;
        textView3.setText(BuildConfig.FLAVOR + i);
        this.resultHead.setVisibility(0);
        this.resultRecycler.setVisibility(0);
        this.loadImage.setVisibility(8);
        C0107n.a aVar = new C0107n.a(this);
        aVar.a(true);
        View inflate = LayoutInflater.from(this).inflate(R.layout.congrats_popup, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.emoji);
        TextView textView4 = (TextView) inflate.findViewById(R.id.congrats_text);
        TextView textView5 = (TextView) inflate.findViewById(R.id.congrats_head);
        if (i >= 7) {
            textView5.setText("Well Done!");
            c.a((C0159i) this).a(Integer.valueOf(R.drawable.winner)).a(imageView);
            str = "You made the day unforgettable congrats on achieving victory in Driving License Test.";
        } else {
            textView5.setText("Better Luck Next Time!");
            c.a((C0159i) this).a(Integer.valueOf(R.drawable.sad)).a(imageView);
            str = "You not failed. Your success is just postponed.";
        }
        textView4.setText(str);
        aVar.b(inflate);
        aVar.c();
    }
}
