package com.bigrichman.android.nerdlauncher;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;

public class NerdLauncherActivity extends SingleFragmentActivity {

    public Fragment createFragment(){
        return NerdLauncherFragment.newInstance();
    }

}
