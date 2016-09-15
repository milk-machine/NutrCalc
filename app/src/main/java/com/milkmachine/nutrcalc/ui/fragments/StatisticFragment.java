package com.milkmachine.nutrcalc.ui.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.milkmachine.nutrcalc.R;
import com.milkmachine.nutrcalc.data.UserStatisticData;
import com.milkmachine.nutrcalc.ui.adapters.UserAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class StatisticFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private ArrayList<UserStatisticData> mStatistics;
    private UserAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_statistic, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycle_view);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        loadInfo();

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    private void loadInfo() {
        mStatistics = new UserStatisticData().getInfo();
        mAdapter = new UserAdapter(mStatistics);
        mRecyclerView.setAdapter(mAdapter);
    }

    public static StatisticFragment newInstance() {

        Bundle args = new Bundle();

        StatisticFragment fragment = new StatisticFragment();
        fragment.setArguments(args);
        return fragment;
    }

}
