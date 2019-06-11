package com.example.ranklist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<Student> studentList;
    private ArrayList<String>data;
    private ArrayList<Student> studList1;

    public MyAdapter(Context context) {
        this.context = context;
        this.studList1 = new ArrayList<>();

    }

    public ArrayList<Student> getStudList1() {
        return studList1;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {

        Student student = (Student) studList1.get(position);

        myViewHolder.textView.setText(student.getName());
        myViewHolder.textView1.setText(Integer.toString(student.getMarks()));
        myViewHolder.textViewRank.setText(Integer.toString(student.getRank()));


    }

    @Override
    public int getItemCount() {
        return studList1.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        TextView textView1;
        TextView textViewRank;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.text);
            textView1 = (TextView) itemView.findViewById(R.id.text1);
            textViewRank = (TextView) itemView.findViewById(R.id.rank);
        }

    }

public void updateList()
{
    notifyDataSetChanged();
}
}
