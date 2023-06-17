
package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private UserAdapter userAdapter;
    private List<User> userList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView =findViewById(R.id.recylerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        userList =new ArrayList<>();
        userList.add(new User("kamakshi","000000000","meerut"));
        userList.add(new User("kamakshi","000000000","meerut"));
        userList.add(new User("kamakshi","000000000","meerut"));
        userList.add(new User("kamakshi","000000000","meerut"));
        userList.add(new User("kamakshi","000000000","meerut"));
        userList.add(new User("kamakshi","000000000","meerut"));

        userAdapter=new UserAdapter(userList);
        recyclerView.setAdapter(userAdapter);


    }
}