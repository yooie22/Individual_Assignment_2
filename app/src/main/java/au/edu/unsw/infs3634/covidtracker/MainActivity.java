package au.edu.unsw.infs3634.covidtracker;

import androidx.appcompat.app.AppCompatActivity;
        import androidx.recyclerview.widget.RecyclerView;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;


public class MainActivity extends AppCompatActivity {
    //Made classes for funtionality of Assignment

    private RecyclerView mRecyclerView;
    private CountryAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.rvList);
        mRecyclerView.setHasFixedSize(true);
        CountryAdapter.RecyclerViewClickListener listener = new CountryAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, String Attraction) {
                launchDetailActivity(Attraction);
            }
        };
        mAdapter = new CountryAdapter(Attraction.getAttractions(), listener);
        mRecyclerView.setAdapter(mAdapter);


    }

    private void launchDetailActivity(String message) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(DetailActivity.INTENT_MESSAGE, message);
        startActivity(intent);
    }
}