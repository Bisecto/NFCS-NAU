package com.bisector.nfcsnau;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class arrayadapter extends RecyclerView.Adapter<arrayadapter.arrayViewHolder>{
    ArrayList<array> List;
    //Prayer context;
    private OnItemClickListener mListener;
    public interface OnItemClickListener{
        void OnItemClick(int position);
    }
    public arrayadapter( ArrayList<array> List) {
        this.List = List;
    }
    public void setOnClickListener(OnItemClickListener Listener){
mListener=Listener;
    }
    @NonNull
    @Override
    public arrayViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.populate,parent,false);
        arrayViewHolder arrat=new arrayViewHolder(view,mListener);
        return  arrat;
    }

    @Override
    public void onBindViewHolder(@NonNull arrayViewHolder holder, int position) {
        array arr= List.get(position);
        holder.textView.setText(arr.getList());

    }

    @Override
    public int getItemCount() {
        return List.size();
    }

    public static class  arrayViewHolder extends RecyclerView.ViewHolder  {
        public RelativeLayout relativeLayout;
public TextView textView;
        public arrayViewHolder(@NonNull View itemView,OnItemClickListener listener) {
            super(itemView);
            textView=itemView.findViewById(R.id.title);
            relativeLayout=itemView.findViewById(R.id.relateOffline);
            relativeLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
               if (listener!=null){
                  int position= getAdapterPosition();
                  if (position!=RecyclerView.NO_POSITION){
                      listener.OnItemClick(position);
                  }
                }
                }
            });
        }
    }
}
