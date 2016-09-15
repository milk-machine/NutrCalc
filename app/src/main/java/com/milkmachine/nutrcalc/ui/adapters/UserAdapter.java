package com.milkmachine.nutrcalc.ui.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.milkmachine.nutrcalc.R;
import com.milkmachine.nutrcalc.data.UserStatisticData;
import com.milkmachine.nutrcalc.ui.views.CustomProgress;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    Context mContext;
    ArrayList<UserStatisticData> mStatisticList;

    public UserAdapter(ArrayList<UserStatisticData> statisticList) {
        mStatisticList = statisticList;
    }

    @Override
    public int getItemCount() {
        return mStatisticList.size();
    }

    @Override
    public UserAdapter.UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View convertView = LayoutInflater.from(mContext).inflate(R.layout.item_statistic_list, parent, false);
        return new UserViewHolder(convertView);
    }

    @Override
    public void onBindViewHolder(UserAdapter.UserViewHolder holder, int position) {
        UserStatisticData values = mStatisticList.get(position);

        holder.progressBar.setMaximumPercentage(values.getPercent());
        holder.progressBar.setText(values.getNutrient());
        holder.percent.setText((int)(values.getPercent()*100) + "%");

    }

    public static class UserViewHolder extends RecyclerView.ViewHolder {

        protected CustomProgress progressBar;
        protected TextView percent;

        public UserViewHolder(View itemView) {
            super(itemView);

            progressBar = (CustomProgress) itemView.findViewById(R.id.progress_bar);
            percent = (TextView) itemView.findViewById(R.id.percent);
        }
    }
}

