package com.firefinch.vcfcontact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.firefinch.vcfcontact.fragments.VFile.VFileFragment;
import com.firefinch.vcfcontact.fragments.VFile.dummy.DummyContent;

public class MainActivity extends AppCompatActivity implements VFileFragment.OnVFileListFragmentInteractionListener {

    FrameLayout vFileFragContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vFileFragContainer = findViewById(R.id.vfile_frag_container);
        setupVFileFragment(vFileFragContainer);
    }

    private void setupVFileFragment(ViewGroup vFileFragContainer) {
        VFileFragment vFileFragment = VFileFragment.newInstance();
        getSupportFragmentManager().beginTransaction().add(vFileFragContainer.getId(), vFileFragment).commit();
    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

    }
}
