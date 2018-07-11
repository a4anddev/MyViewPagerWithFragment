package c.verbswithexample.myviewpagerwithfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import c.verbswithexample.myviewpagerwithfragment.AllFragments.FragmentFive;
import c.verbswithexample.myviewpagerwithfragment.AllFragments.FragmentFour;
import c.verbswithexample.myviewpagerwithfragment.AllFragments.FragmentOne;
import c.verbswithexample.myviewpagerwithfragment.AllFragments.FragmentSix;
import c.verbswithexample.myviewpagerwithfragment.AllFragments.FragmentThree;
import c.verbswithexample.myviewpagerwithfragment.AllFragments.FragmentTwo;

public class CustomAdapter extends FragmentStatePagerAdapter{

    private final int ITEMS = 6;

    public CustomAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        switch (i){
            case 0:
                return new FragmentOne();
            case 1:
                return new FragmentTwo();
            case 2:
                return new FragmentThree();
            case 3:
                return new FragmentFour();
            case 4:
                return new FragmentFive();
            case 5:
                return new FragmentSix();

                default:
                    return new FragmentOne();



        }


    }

    @Override
    public int getCount() {
        return ITEMS;
    }
}
