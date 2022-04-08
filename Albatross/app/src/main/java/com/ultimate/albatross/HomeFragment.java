package com.ultimate.albatross;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        String items[] = new String[] {"1. Funeral Plans for individuals: " +
                "Group - Voluntary and Compulsory. " +
                "More optional value-added." +
                "Benefits for peace of mind. " +
                "  " +
                "From R13,000 up to R75,000. Covers per each member in the policy." +
                "" +
                "Beef Cover, Widers Children",
                "2. Legal: " +
                        "Comprehensive Legal Service and Protection Product" +
                        "Labour matters, criminal, family, motor matters, general. " +
                        "Only from R80 up to R100,000 PER CASE",
                "3. Medical Aid Product: " +
                        "Comprehensive Group Medical Aid, " +
                        "Hospital Cover, " +
                        "Gap Cover. " +
                        "" +
                        "" +
                        "" +
                        "More than 30 years, providing structures and sustainable health care solutions",
                "4. Traders & Fuel Insurance Specialised: " +
                        "Service stations all brands. Taxi Scheme, Workshops for All...",
                "5. Other Short Term Insurance House, House Contents, Vehicles: " + "Flying above the sky",
                        "6. In house training for brokers and agents: " +
                        "Empowering the Industry",
                "7. Risk Management: " + "Holistic and flexible integrated approach"
        };

        ListView listview = (ListView) view.findViewById(R.id.listview);
        ArrayAdapter <String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(), android.R.layout.simple_list_item_1,
                items
        );
        listview.setAdapter(listViewAdapter);

        // inflate the layout for this fragment
        return view;


    }
}
