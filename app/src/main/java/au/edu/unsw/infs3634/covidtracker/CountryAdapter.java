package au.edu.unsw.infs3634.covidtracker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryViewHolder> {
    private ArrayList<Attraction> mAttractions;
    private RecyclerViewClickListener mListener;

    public CountryAdapter(ArrayList<Attraction> attractions, RecyclerViewClickListener listener) {
        mAttractions = attractions;
        mListener = listener;
    }

    public interface RecyclerViewClickListener {
        void onClick(View view, String attractionCode);
    }
    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.country_list_row, parent, false);
        return new CountryViewHolder(v, mListener);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        Attraction attraction = mAttractions.get(position);
        holder.attraction.setText(attraction.getAttraction());
        holder.rating.setText(attraction.getRating());
        holder.location.setText(attraction.getLocation());
        holder.itemView.setTag(attraction.getAttractionCode());
    }

    @Override
    public int getItemCount() {
        return mAttractions.size();
    }

    public static class CountryViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView attraction, rating, location;
        private RecyclerViewClickListener listener;

        public CountryViewHolder(@NonNull View itemView, RecyclerViewClickListener listener) {
            super(itemView);
            this.listener = listener;
            itemView.setOnClickListener(this);
            attraction = itemView.findViewById(R.id.tvAttraction);
            rating = itemView.findViewById(R.id.tvRating);
            location = itemView.findViewById(R.id.tvLocation);
        }

        @Override
        public void onClick(View v) {
            listener.onClick(v, (String) v.getTag());
        }
    }
}
