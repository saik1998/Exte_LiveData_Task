package com.firstapp.exte_livedata_task;

import android.content.SharedPreferences;
import android.hardware.lights.LightState;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class Fragment_B extends Fragment {

    RecyclerView recyclerView;

    DataAdapter dataAdapter;

    List<DataModel> dataModelList=new ArrayList<>();



    public Fragment_B(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment__b, container, false);

        recyclerView=view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setHasFixedSize(true);




        final MyViewModel viewModel = ViewModelProviders.of(getActivity()).get(MyViewModel.class);

        viewModel.getUserMutableLiveData().observe(getActivity(), new Observer<List<String>>() {
            @Override
            public void onChanged(List<String> strings) {

                dataAdapter=new DataAdapter(getActivity(),strings);
                recyclerView.setAdapter(dataAdapter);

                loadData();

            }
        });


        viewModel.getUserMutableLiveData().observe(getActivity(), new Observer() {
            @Override
            public void onChanged(@Nullable Object o) {
                viewModel.getUserMutableLiveData();



            }
        });


        return view;

    }

    private void loadData() {
            // method to load arraylist from shared prefs
            // initializing our shared prefs with name as
            // shared preferences.
//            SharedPreferences sharedPreferences = getSharedPreferences("shared preferences", MODE_PRIVATE);
//
//            // creating a variable for gson.
//            Gson gson = new Gson();
//
//            // below line is to get to string present from our
//            // shared prefs if not present setting it as null.
//            String json = sharedPreferences.getString("courses", null);
//
//            // below line is to get the type of our array list.
//            Type type = new TypeToken<ArrayList<GridModel>>() {}.getType();
//
//            // in below line we are getting data from gson
//            // and saving it to our array list
//            courseModalArrayList = gson.fromJson(json, type);
//            // checking below if the array list is empty or not
//            if (courseModalArrayList == null)
//            {
//                // if the array list is empty
//                // creating a new array list.
//                courseModalArrayList = new ArrayList<>();
//            }
//        }
    }
}