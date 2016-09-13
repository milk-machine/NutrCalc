package com.milkmachine.nutrcalc.ui.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.TextView;

import com.milkmachine.nutrcalc.R;
import com.milkmachine.nutrcalc.data.CustomProgress;

/**
 * A simple {@link Fragment} subclass.
 */
public class StatisticFragment extends Fragment {

    private CustomProgress mProgress;
    private TextView mTextView;
    private GridLayout mParentLayout;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_statistic, container, false);
    }


    public static StatisticFragment newInstance() {
        return new StatisticFragment();
    }

    @Override
    public void onStart() {
        super.onStart();
        addStatisticLine();
    }

    private void addStatisticLine() {
        CustomProgress customProgress = new CustomProgress(getContext());
        GridLayout.LayoutParams progressParams = new GridLayout.LayoutParams(
                new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        customProgress.setLayoutParams(progressParams);
        customProgress.setMaximumPercentage(0.75f);
        customProgress.setText("Mg");
        mTextView = new TextView(getContext());
        mTextView.setText(customProgress.getPercentage() + "%");
        mTextView.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
        mTextView.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);

        mParentLayout = (GridLayout) getView().findViewById(R.id.fragment_layout);


        mParentLayout.addView(customProgress);
        mParentLayout.addView(mTextView);
    }
}
