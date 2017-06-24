package com.amarpreetsinghprojects.whatsapp_imitation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by kulvi on 06/24/17.
 */

public class Status_fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_status,container,false);

        ArrayList<Status_elements> status_elementsArrayList = new ArrayList<>();

        status_elementsArrayList.add(new Status_elements("Pawit Singh", "profile_three","Today, 8:59PM"));
        status_elementsArrayList.add(new Status_elements("Harsimran Singh","profile_eight","Today, 11:15AM"));
        status_elementsArrayList.add(new Status_elements("Akar","profile_two","Today, 7:30AM"));
        status_elementsArrayList.add(new Status_elements("Sahiba","profile_five","Yesterday, 9:58PM"));
        status_elementsArrayList.add(new Status_elements("Jessica", "profile_six","Yesterday, 6:12PM"));
        status_elementsArrayList.add(new Status_elements("Simran Kaur","profile_four","Yesterday, 4:00PM"));

        RecyclerView status_RV = (RecyclerView)v.findViewById(R.id.status_rV);
        RecyclerView.LayoutManager status_LM = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        status_RV.setLayoutManager(status_LM);

        Status_adapter sadapter = new Status_adapter(status_elementsArrayList,getContext());
        status_RV.setAdapter(sadapter);

        return v;
    }
}
