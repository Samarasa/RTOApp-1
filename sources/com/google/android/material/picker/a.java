package com.google.android.material.picker;

import android.graphics.Canvas;
import android.os.Parcelable;
import android.widget.TextView;
import java.util.Calendar;

public interface a<S> extends Parcelable {
    void a(Canvas canvas, MaterialCalendarGridView materialCalendarGridView);

    void a(TextView textView, Calendar calendar);
}
