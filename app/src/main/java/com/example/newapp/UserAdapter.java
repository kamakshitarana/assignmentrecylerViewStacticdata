package com.example.newapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {
    private List<User> userList;

    public UserAdapter(List<User> userList) {
        this.userList = userList;
    }


    @NonNull
    @Override
    public UserAdapter.UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyler_view_item,parent,false);

        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.UserViewHolder holder, int position) {

        User user =userList.get(position);
        holder.textUsername.setText(user.getUsername());
        holder.textMobile.setText(user.getMobile());
        holder.textAddress.setText(user.getAddress());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        TextView textUsername,textMobile,textAddress;
        UserViewHolder(@NonNull View itemView){
            super(itemView);
            textUsername =itemView.findViewById(R.id.username);
            textMobile =itemView.findViewById(R.id.mobileNo);
            textAddress =itemView.findViewById(R.id.address);

        }

    }
}
