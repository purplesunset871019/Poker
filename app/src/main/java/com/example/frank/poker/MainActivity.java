package com.example.frank.poker;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Deck deck = new Deck();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        deck.shuffle();
        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new PokerAdapter());
    }

    class PokerAdapter extends RecyclerView.Adapter<PokerAdapter.PokerHolder> {
        @NonNull
        @Override
        public PokerHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
            return new PokerHolder(getLayoutInflater().inflate(R.layout.poker_row,parent,false));
        }

        @Override
        public void onBindViewHolder(@NonNull PokerHolder holder, int position) {
            holder.pokerText.setText(deck.cards[position].get());
        }

        @Override
        public int getItemCount() {
            return deck.cards.length;
        }

        class PokerHolder extends RecyclerView.ViewHolder {
            TextView pokerText;
            public PokerHolder(View itemView) {
                super(itemView);
                pokerText = itemView.findViewById(android.R.id.text1);
            }
        }
    }
}
