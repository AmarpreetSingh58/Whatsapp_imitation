package com.amarpreetsinghprojects.whatsapp_imitation;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kulvi on 06/23/17.
 */

public class Chat_Adapter extends RecyclerView.Adapter<Chat_Adapter.ViewHolder> {

    ArrayList<Chat_elements> chat_elementsArrayList;
    private Context context;

    public Chat_Adapter(ArrayList<Chat_elements> chat_elementsArrayList, Context context) {
        this.chat_elementsArrayList = chat_elementsArrayList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater l = LayoutInflater.from(context);
        View v = l.inflate(R.layout.chat_single_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Chat_elements c = chat_elementsArrayList.get(position);

        holder.chat_name.setText(c.getName());
        holder.chat_chat.setText(c.getChat());
        holder.chat_img.setImageResource(context.getResources().getIdentifier(c.getImage(),"drawable",context.getPackageName()));

    }

    @Override
    public int getItemCount() {
        return chat_elementsArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView chat_img;
        TextView chat_name,chat_chat;

        public ViewHolder(View itemView) {
            super(itemView);

            chat_img = (ImageView)itemView.findViewById(R.id.chat_img);
            chat_name = (TextView)itemView.findViewById(R.id.chat_name);
            chat_chat = (TextView)itemView.findViewById(R.id.chat_chat);
        }
    }
}
