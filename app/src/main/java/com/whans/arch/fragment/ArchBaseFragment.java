package com.whans.arch.fragment;

import android.support.v4.app.Fragment;

import com.squareup.leakcanary.RefWatcher;
import com.whans.arch.ArchApplication;

/**
 * @author whans
 * @date 11/27/15
 */
public abstract class ArchBaseFragment extends Fragment{
    @Override
    public void onDestroy() {
        super.onDestroy();
        RefWatcher refWatcher = ArchApplication.getRefWatcher(getActivity());
        refWatcher.watch(this);
    }
}
