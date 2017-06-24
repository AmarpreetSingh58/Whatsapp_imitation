package com.amarpreetsinghprojects.whatsapp_imitation;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);
       // viewPager.setCurrentItem(1);

    }

    public class ViewPagerAdapter extends FragmentPagerAdapter {
        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            Fragment fragment = null;

            switch (position){
                case 0: fragment = new  Camera_fragment();
                    break;

                case 1:fragment =new Chat_fragment();
                    break;

                // These two fragments arre giving null pointer exception
                /*case 2:fragment =new Status_fragment();
                    break;

                case 3:fragment =new Call_fragment();
                    break;*/
                default: fragment = new Chat_fragment();

            }
            return fragment;

        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}
