package com.example.dhktpm15a_nhom18_loc_quanliduan;


import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DAO {
    private DatabaseReference databaseReference;

    public DAO() {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(Project.class.getSimpleName());
    }
    public Task<Void> add(Project user){
        return  databaseReference.push().setValue(user);
    }
}