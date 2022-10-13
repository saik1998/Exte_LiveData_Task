package com.firstapp.exte_livedata_task;


import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class MyViewModel extends ViewModel {

    String info[];

    List<String> dataModelList=new ArrayList<>();

    MutableLiveData<List<String>> mutableLiveData;
//    ArrayList<String> dataModelArrayList;

    public MyViewModel() {
        mutableLiveData = new MutableLiveData<>();

        // call your Rest API in init method
    }

//    public MutableLiveData<ArrayList<DataModel>> getUserMutableLiveData(){
    public MutableLiveData<List<String>> getUserMutableLiveData(){



        return mutableLiveData;
//        List<String> dataModelList=new ArrayList<>();

    }




    public void setDataModelList(List<String> dataModelList){
        info=new String[dataModelList.size()];

        for (int i=0; i<dataModelList.size();i++)
        {
            info[i]=dataModelList.get(i);
            mutableLiveData.setValue(dataModelList);
        }
//
//        DataModel dataModel = new DataModel();
//        dataModel.setEname(dataModel.ename);
//        dataModel.setEaddress(dataModel.eaddress);
//
//
//        dataModelArrayList = new ArrayList<>();
//        dataModelArrayList.add(dataModel);

    }


//
//    private MutableLiveData<List<String>> dataModelMutableLiveData = new MutableLiveData<>();
//
//    public MutableLiveData<List<String>> getDataModelMutableLiveData() {
//
//        return dataModelMutableLiveData;
//    }
//
//    public void setDataModelMutableLiveData(List<String> dataModelMutableLiveData) {
//
//
//        //DataModel dataModel = new DataModel(ename, eaddress);
//
//        this.dataModelMutableLiveData.setValue(this.dataModelList);
//    }

//
}
