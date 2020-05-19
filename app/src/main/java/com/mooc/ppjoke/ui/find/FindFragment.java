package com.mooc.ppjoke.ui.find;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mooc.libnavannotation.FragmentDestination;
import com.mooc.ppjoke.R;
import com.mooc.ppjoke.model.SofaTab;
import com.mooc.ppjoke.ui.sofa.SofaFragment;
import com.mooc.ppjoke.utils.AppConfig;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;


@FragmentDestination(pageUrl = "main/tabs/find")
public class FindFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_find, container, false);
//        final TextView textView = root.findViewById(R.id.text_home);
//        homeViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
////            }
//        });
        return root;
    }

}