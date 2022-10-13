package com.firstapp.exte_livedata_task;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.MyViewHolder> {
    Context context;
    List<String> dataModelList=new ArrayList<String>();

    public DataAdapter(Context context, List<String> dataModelList) {
        this.context = context;
        this.dataModelList = dataModelList;
    }

    @NonNull
    @Override
    public DataAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_recycler,parent,false);

        return new MyViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull DataAdapter.MyViewHolder holder, int position) {

//        DataModel dataModel = dataModelList.get(position);
//        DataAdapter viewHolder= (RecyclerViewViewHolder) holder;

        holder.ename.setText(dataModelList.get(position));
//        holder.eaddress.setText(dataModelList.get(position));


    }

    @Override
    public int getItemCount() {
        return dataModelList.size();
    }


    public void setDataModelList(final List<String> dataModelList) {
        this.dataModelList.clear();
        this.dataModelList = dataModelList;
        notifyDataSetChanged();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView ename,eaddress;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            ename=itemView.findViewById(R.id.recycler_empname);
//            eaddress=itemView.findViewById(R.id.recycler_empmail);
        }
    }
}








