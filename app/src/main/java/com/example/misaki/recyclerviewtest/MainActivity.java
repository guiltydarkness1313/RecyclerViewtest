package com.example.misaki.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.misaki.recyclerviewtest.adapters.PersonAdapter;
import com.example.misaki.recyclerviewtest.models.Person;
import com.example.misaki.recyclerviewtest.repositories.PersonRepository;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView contactList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactList=(RecyclerView)findViewById(R.id.contacts_list);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        contactList.setLayoutManager(linearLayoutManager);

        //contactList.setAdapter();

        PersonAdapter personAdapter=new PersonAdapter();

        List<Person>personList= PersonRepository.getPersons();
        personAdapter.setPersons(personList);
        contactList.setAdapter(personAdapter);



    }
}
