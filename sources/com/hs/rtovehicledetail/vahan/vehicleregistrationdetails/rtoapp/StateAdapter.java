package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class StateAdapter extends RecyclerView.a<StateViewHolder> {
    /* access modifiers changed from: private */
    public Context context;
    private List<StateBean> statesList;

    public StateAdapter(List<StateBean> list, RTOStates rTOStates) {
        this.context = rTOStates;
        this.statesList = list;
    }

    public int getItemCount() {
        return this.statesList.size();
    }

    public void onBindViewHolder(StateViewHolder stateViewHolder, int i) {
        final StateBean stateBean = this.statesList.get(i);
        stateViewHolder.stateName.setText(stateBean.getState());
        stateViewHolder.stateCard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                StateAdapter.this.context.startActivity(new Intent(StateAdapter.this.context, RTOCodes.class).putExtra("state", stateBean.getState()));
            }
        });
    }

    public StateViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new StateViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rto_state_card, viewGroup, false));
    }
}
