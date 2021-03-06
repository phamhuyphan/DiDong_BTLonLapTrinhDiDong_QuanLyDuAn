package com.example.dhktpm15a_nhom18_loc_quanliduan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class list extends AppCompatActivity {

    DatabaseReference data = FirebaseDatabase.getInstance().getReference();
    ArrayList<User> arrayList;
    RecyclerView tv_tampill;
    FloatingActionButton tambal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        tambal = findViewById(R.id.btn_tambal);
        tambal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(list.this,add.class);
                startActivity(intent);
            }
        });

        tv_tampill = findViewById(R.id.tv_tampill);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        tv_tampill.setLayoutManager(manager);
        tv_tampill.setItemAnimator(new DefaultItemAnimator());
        tempiData();
    }
    private void tempiData() {
        data.child("User").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                arrayList = new ArrayList<>();
                for(DataSnapshot item: snapshot.getChildren()){
                    User user = item.getValue(User.class);
                    user.setKey(item.getKey());
                    arrayList.add(user);
                }
//                adapterLoad = new AdapterLoad(arrayList,list.this);
//                tv_tampill.setAdapter(adapterLoad);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}