//package com.example.examen_lvaronistalguerrero;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.ViewGroup;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.List;
//
//public class RecordsAdapter extends RecyclerView.Adapter<RecordsViewHolder>  {
//
//    Context context;
//    List<MainActivity> records;
//    public RecordsAdapter(Context context, List<MainActivity> records) {
//        this.context = context;
//        this.records = records;
//    }
//
//    @NonNull
//    @Override
//    public RecordsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        return new RecordsViewHolder(LayoutInflater.from(context).inflate(R.layout.activity_records,parent, false));
//    }
//
////    @Override
////    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
////
////    }
//
//    @Override
//    public void onBindViewHolder(@NonNull RecordsViewHolder holder, int position) {
//        holder.t.setText(records.get(position).getT());
//        holder.seg.setText(records.get(position).getSeg());
//    }
//
//    @Override
//    public int getItemCount() {
//        return records.size();
//    }
//}