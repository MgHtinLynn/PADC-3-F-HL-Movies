package xyz.htinlynn.movies.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import butterknife.BindView;
import butterknife.ButterKnife;

import xyz.htinlynn.movies.R;
import xyz.htinlynn.movies.adapters.MoviesAdapter;
import xyz.htinlynn.movies.delegates.MoviesActionDelegate;


public class MainActivity extends AppCompatActivity implements MoviesActionDelegate{

    @BindView(R.id.rv_movies)
    RecyclerView rvMovies;

    @BindView(R.id.toolbar)
    Toolbar toolbar;


    private MoviesAdapter mMoviesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this, this);

        setSupportActionBar(toolbar);

        mMoviesAdapter = new MoviesAdapter(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL, false);
        rvMovies.setAdapter(mMoviesAdapter);

        rvMovies.setLayoutManager(linearLayoutManager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onTrapMoviesItem() {
        Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
        startActivity(intent);
    }
}
