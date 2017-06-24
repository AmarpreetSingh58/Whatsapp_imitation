package com.amarpreetsinghprojects.whatsapp_imitation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by kulvi on 06/23/17.
 */

public class Chat_fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_chat,container,false);

        ArrayList<Chat_elements> chat_elementsArrayList = new ArrayList<>();

        chat_elementsArrayList.add(new Chat_elements("Amarpreet Singh","profile_zero","I had a nice day coding." ));
        chat_elementsArrayList.add(new Chat_elements("Pawit Singh", "profile_three","In the UK, it is illegal to eat mince pies on Christmas Day!"));
        chat_elementsArrayList.add(new Chat_elements("Harsimran Singh","profile_eight","Pteronophobia is the fear of being tickled by feathers!"));
        chat_elementsArrayList.add(new Chat_elements("Akar","profile_two","“Facebook Addiction Disorder” is a mental disorder identified by Psychologists."));
        chat_elementsArrayList.add(new Chat_elements("Sahiba","profile_five","29th May is officially “Put a Pillow on Your Fridge Day“."));
        chat_elementsArrayList.add(new Chat_elements("Jessica", "profile_six","During your lifetime, you will produce enough saliva to fill two swimming pools."));
        chat_elementsArrayList.add(new Chat_elements("Simran Kaur","profile_four","An eagle can kill a young deer and fly away with it."));
        chat_elementsArrayList.add(new Chat_elements("Karandeep Singh","profile_three","Heart attacks are more likely to happen on a Monday."));
        chat_elementsArrayList.add(new Chat_elements("Hashneet Singh","profile_eight","If you consistently fart for 6 years & 9 months, enough gas is produced to create the energy of an atomic bomb!"));
        chat_elementsArrayList.add(new Chat_elements("Prabhjot Singh", "profile_two","in 2015, more people were killed from injuries caused by taking a selfie than by shark attacks."));
        chat_elementsArrayList.add(new Chat_elements("Chanpreet Singh", "profile_one","Catfish are the only animals that naturally have an odd number of whiskers."));
        chat_elementsArrayList.add(new Chat_elements("Ajit Singh","profile_two","Facebook, Skype and Twitter are all banned in China."));
        chat_elementsArrayList.add(new Chat_elements("Akshit", "profile_three","Essential Phone one of the best"));
        chat_elementsArrayList.add(new Chat_elements("Shivam","profile_four","95% of people text things they could never say in person."));
        chat_elementsArrayList.add(new Chat_elements("Avinash","profile_five","The Titanic was the first ship to use the SOS signal."));
        chat_elementsArrayList.add(new Chat_elements("Jaskaran Singh","profile_six","In Uganda, 50% of the population is under 15 years of age."));
        chat_elementsArrayList.add(new Chat_elements("Zues","profile_seven","i'm god of Lightning"));
        chat_elementsArrayList.add(new Chat_elements("Robert","profile_eight","Arab women can initiate a divorce if their husbands don’t pour coffee for them."));
        chat_elementsArrayList.add(new Chat_elements("Alex", "profile_one","A sheep, a duck and a rooster were the first passengers in a hot air balloon."));
        chat_elementsArrayList.add(new Chat_elements("Cristian", "profile_nine","We WON!.. HOLLA MADRID......"));
        chat_elementsArrayList.add(new Chat_elements("Mirenda","profile_six","A baby octopus is about the size of a flea when it is born."));


        Chat_Adapter chat_adapter = new Chat_Adapter(chat_elementsArrayList,getContext());

        RecyclerView chat_list = (RecyclerView)v.findViewById(R.id.chat_recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        chat_list.setLayoutManager(layoutManager);
        chat_list.setAdapter(chat_adapter);

        return v;
    }
}
