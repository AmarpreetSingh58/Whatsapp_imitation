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

public class Call_fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View callv = inflater.inflate(R.layout.fragment_call,container,false);

        ArrayList<Call_elements> call_elementsArrayList = new ArrayList<>();

        call_elementsArrayList.add(new Call_elements("Pawit Singh", "profile_three","Today, 8:59PM",getString(R.string.recived)));
        call_elementsArrayList.add(new Call_elements("Harsimran Singh","profile_eight","Today, 11:15AM",getString(R.string.missed)));
        call_elementsArrayList.add(new Call_elements("Akar","profile_two","Today, 7:30AM",getString(R.string.dialled)));
        call_elementsArrayList.add(new Call_elements("Sahiba","profile_five","Yesterday, 9:58PM",getString(R.string.recived)));
        call_elementsArrayList.add(new Call_elements("Jessica", "profile_six","Yesterday, 6:12PM",getString(R.string.dialled)));
        call_elementsArrayList.add(new Call_elements("Simran Kaur","profile_four","Yesterday, 4:00PM",getString(R.string.missed)));

        RecyclerView callRV = (RecyclerView)callv.findViewById(R.id.callRV);
        RecyclerView.LayoutManager callLM = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        callRV.setLayoutManager(callLM);

        Call_adapter call_adapter = new Call_adapter(call_elementsArrayList,getContext());
        callRV.setAdapter(call_adapter);

        return callv;
    }
}
