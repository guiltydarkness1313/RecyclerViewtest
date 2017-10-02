package com.example.misaki.recyclerviewtest.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.misaki.recyclerviewtest.R;
import com.example.misaki.recyclerviewtest.holders.PersonHolder;
import com.example.misaki.recyclerviewtest.models.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by misaki on 10/2/17.
 */

public class PersonAdapter extends RecyclerView.Adapter<PersonHolder>{
    private List<Person>persons;

    public PersonAdapter(){
        this.persons=new ArrayList<>();
    }
    public void setPersons(List<Person> persons){
        this.persons=persons;
    }

    @Override
    public PersonHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact,parent,false);
        PersonHolder holder=new PersonHolder(itemView);
        //exec on first load of adapter
        return holder;
    }

    @Override
    public void onBindViewHolder(PersonHolder holder, int position) {//0
        //seteo de posicion a un objeto clase Person
        Person person=this.persons.get(position);
        //seteo de valores
        holder.fullname.setText(person.getFullname());
        holder.email.setText(person.getEmail());

        holder.picture.setImageResource(R.drawable.ic_profile);

    }

    @Override
    public int getItemCount() {
        return this.persons.size();
    }
}
