package com.nic.oci.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.nic.oci.R;
import com.nic.oci.subActivities.Aboutus;
import com.nic.oci.subActivities.Faq;
import com.nic.oci.subActivities.Privacy;
import com.nic.oci.subActivities.TermsOfUse;

public class others extends Fragment {

Button aboutUs,privacy,faq,termsOfUse,signOut;

    public others() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_others, container, false);

        aboutUs= view.findViewById(R.id.button_aboutus);
        privacy= view.findViewById(R.id.buttonPrivacyPolicy);
        faq= view.findViewById(R.id.buttonFaq);
        termsOfUse= view.findViewById(R.id.buttonTermsOfUse);
        signOut= view.findViewById(R.id.buttonSignout);

        aboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getContext(), Aboutus.class);
                startActivity(intent);
            }
        });

        privacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getContext(),Privacy.class);
                startActivity(intent);
            }
        });

        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getContext(),Faq.class);
                startActivity(intent);
            }
        });

        termsOfUse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getContext(),TermsOfUse.class);
                startActivity(intent);
            }
        });

        signOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return view;
    }

}
