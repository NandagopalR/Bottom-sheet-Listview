package com.flipboard.bottomsheet.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.flipboard.bottomsheet.R;
import com.flipboard.bottomsheet.commons.BottomSheetFragment;

import java.util.ArrayList;
import java.util.List;

public class MyFragment extends BottomSheetFragment {

    ListView mListview;
    List<String> mList = new ArrayList<>();
    ArrayAdapter<String> mAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mList.clear();
        for (int i = 0; i < 50; i++) {
            mList.add("Nanda - " + i);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_my, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mListview = (ListView) view.findViewById(R.id.listview);
        mAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_multiple_choice, mList);
        mListview.setAdapter(mAdapter);
    }
}
