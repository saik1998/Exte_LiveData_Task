package com.firstapp.exte_livedata_task;


import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import java.util.ArrayList;
import java.util.List;

public class Fragment_A extends Fragment {

    private MyViewModel viewModel;
    EditText ename;
//    EditText eaddress;

//    ArrayList<String> dataModelList=new ArrayList<String>();

    List<String> dataModelList=new ArrayList<String>();

    public Fragment_A(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment__a, container, false);




         ename=view.findViewById(R.id.ename);
//         eaddress=view.findViewById(R.id.eaddrerss);

        viewModel= ViewModelProviders.of(requireActivity()).get(MyViewModel.class);



        Button send=view.findViewById(R.id.save);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enameStr=ename.getText().toString();
//                String eaddressStr=eaddress.getText().toString();

                if(TextUtils.isEmpty(enameStr))
                {
                    ename.setError("enter details");
                }
//                if(TextUtils.isEmpty(eaddressStr))
//                {
//                    eaddress.setError("enter details");
//                }
                else
                {
                    dataModelList.add(enameStr);
//                    dataModelList.add(eaddressStr);



                    viewModel.setDataModelList(dataModelList);

                    Toast.makeText(getContext(), "Data Saved", Toast.LENGTH_SHORT).show();

                }





            }
        });
        return view;

    }
}