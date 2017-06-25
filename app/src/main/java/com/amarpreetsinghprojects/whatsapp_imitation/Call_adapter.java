package com.amarpreetsinghprojects.whatsapp_imitation;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kulvi on 06/24/17.
 */

public class Call_adapter extends RecyclerView.Adapter<Call_adapter.ViewHolder> {

    ArrayList<Call_elements> call_elementsArrayList;
    Context cC;

    public Call_adapter(ArrayList<Call_elements> call_elementsArrayList, Context cC) {
        this.call_elementsArrayList = call_elementsArrayList;
        this.cC = cC;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater cl = LayoutInflater.from(cC);

        View cv = cl.inflate(R.layout.call_single_item,parent,false);

        ViewHolder cvH = new ViewHolder(cv);

        return cvH;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Call_elements cE = call_elementsArrayList.get(position);

        holder.callname.setText(cE.getCallName());
        holder.calltime.setText(cE.getCallTime());
        holder.callimg.setImageResource(cC.getResources().getIdentifier(cE.getCallImage(),"drawable",cC.getPackageName()));

        switch (cE.getCallType()){

            case "Recieved" : holder.calltype.setImageResource(cC.getResources().getIdentifier("callrecived","drawable",cC.getPackageName()));
                break;
            case "Missed": holder.calltype.setImageResource(cC.getResources().getIdentifier("missedcall","drawable",cC.getPackageName()));
                break;
            case "Dialled": holder.calltype.setImageResource(cC.getResources().getIdentifier("dialledcall","drawable",cC.getPackageName()));
                break;
            default: holder.calltype.setImageResource(cC.getResources().getIdentifier("dialledcall","drawable",cC.getPackageName()));
        }
    }

    @Override
    public int getItemCount() {
        return call_elementsArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView callname,calltime;
        ImageView callimg;
        ImageView calltype;

        public ViewHolder(View itemView) {
            super(itemView);

            callname = (TextView)itemView.findViewById(R.id.callname);
            calltime = (TextView)itemView.findViewById(R.id.calltime);
            callimg = (ImageView)itemView.findViewById(R.id.callIV);
            calltype = (ImageView)itemView.findViewById(R.id.callButton);
        }
    }
}
