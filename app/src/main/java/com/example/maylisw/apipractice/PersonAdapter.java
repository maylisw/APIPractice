package com.example.maylisw.apipractice;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by maylisw on 1/23/18.
 */

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.MyViewHolder> {
    private List<People> people;
    private Context context;

    public PersonAdapter(List<People> people, Context context) {
        this.people = people;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.name_display, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        People person = people.get(position);
        holder.name.setText(person.getName());
        holder.surname.setText(" "+person.getSurname());
        holder.gender.setText(person.getGender());
        holder.region.setText("     "+person.getRegion());
    }

    @Override
    public int getItemCount() {
        return people.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView name, surname, gender, region;
        public MyViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            surname = itemView.findViewById(R.id.surname);
            gender = itemView.findViewById(R.id.gender);
            region = itemView.findViewById(R.id.region);

        }
    }
}
