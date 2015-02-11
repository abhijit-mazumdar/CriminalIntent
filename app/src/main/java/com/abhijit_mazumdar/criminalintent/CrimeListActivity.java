package com.abhijit_mazumdar.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by abhijit_mazumdar on 2/4/15.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
