package com.amarpreetsinghprojects.whatsapp_imitation;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kulvi on 06/24/17.
 */

public class Status_adapter extends RecyclerView.Adapter<Status_adapter.ViewHolder> {

    ArrayList<Status_elements> status_elementsArrayList;
    Context sc;

    public Status_adapter(ArrayList<Status_elements> status_elementsArrayList, Context sc) {
        this.status_elementsArrayList = status_elementsArrayList;
        this.sc = sc;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater sl = LayoutInflater.from(sc);
        View sv =sl.inflate(R.layout.fragment_status,parent,false);

        ViewHolder svH = new ViewHolder(sv);

        return svH;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Status_elements s = status_elementsArrayList.get(position);

        holder.nameTV.setText(s.getStatus_name());
        holder.timeTV.setText(s.getUpdate_time());
        holder.statusIV.setImageResource(sc.getResources().getIdentifier(s.getStatus_image(),"drawable",sc.getPackageName()));

    }

    @Override
    public int getItemCount() {
        return status_elementsArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView nameTV, timeTV;
        ImageView statusIV;
        public ViewHolder(View itemView) {
        super(itemView);

            nameTV = (TextView)itemView.findViewById(R.id.status_nameTV);
            timeTV = (TextView)itemView.findViewById(R.id.status_timeTV);
            statusIV = (ImageView)itemView.findViewById(R.id.status_iV);
    }
}
}
