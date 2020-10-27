package au.edu.unsw.infs3634.covidtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
    public static final String INTENT_MESSAGE = "au.edu.unsw.infs3634.covidtracker.intent_message";

    private TextView mAttraction;
    private ImageView mSearch;
    private TextView mLocation;
    private TextView mType;
    private TextView mRating;
    private TextView mInformation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);



        mAttraction = findViewById(R.id.tvAttraction);
        mLocation = findViewById(R.id.tvLocation);
        mType = findViewById(R.id.tvType);
        mRating = findViewById(R.id.tvRating);
        mInformation = findViewById(R.id.tvInformation);
        mSearch = findViewById(R.id.ivSearch);

        Intent intent = getIntent();
        String attractionCode= intent.getStringExtra(INTENT_MESSAGE);


        ArrayList<Attraction> attractions = Attraction.getAttractions();
        for(final Attraction attraction : attractions) {
            if(attraction.getAttractionCode().equals(attractionCode)) {
                setTitle(attraction.getAttractionCode());
                mAttraction.setText(attraction.getAttraction());
                mLocation.setText(attraction.getLocation());
                mType.setText(attraction.getType());
                mRating.setText(attraction.getRating());
                mInformation.setText(attraction.getInformation());
                mSearch.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        searchCountry(attraction.getAttraction());
                    }
                });
            }
        }
    }

    private void searchCountry(String attraction) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q= " + attraction));
        startActivity(intent);
    }
}