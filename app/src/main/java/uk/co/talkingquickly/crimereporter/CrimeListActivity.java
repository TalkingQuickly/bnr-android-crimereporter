package uk.co.talkingquickly.crimereporter;

import android.support.v4.app.Fragment;

/**
 * Created by ben on 12/01/2015.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
