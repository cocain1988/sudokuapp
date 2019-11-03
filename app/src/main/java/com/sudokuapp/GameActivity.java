package com.sudokuapp;


import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class GameActivity extends AppCompatActivity {


    private GridAdapter mGridAdapter;
    private GridHolder mGridHolder;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);

        RecyclerView recyclerView =  new RecyclerView(null);

        recyclerView.setLayoutManager(new GridLayoutManager(GameActivity.this, 3));
        recyclerView.setAdapter(new GridAdapter());

    }



    private class GridHolder extends RecyclerView.ViewHolder{

        private Button mNumButton;

        public GridHolder(@NonNull View itemView) {
            super(itemView);

            mNumButton = (Button) itemView.findViewById(R.id.button_number);
        }
    }

    private class GridAdapter extends RecyclerView.Adapter<GridHolder>{

        @NonNull
        @Override
        public GridHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            return new GridHolder(null);
        }

        @Override
        public void onBindViewHolder(@NonNull GridHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }

}
