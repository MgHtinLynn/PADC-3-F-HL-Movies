package xyz.htinlynn.movies.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import xyz.htinlynn.movies.delegates.MoviesActionDelegate;
import xyz.htinlynn.movies.viewholders.ItemMoviesViewHolder;
import xyz.htinlynn.movies.R;

/**
 * Created by htinlynn on 12/14/17.
 */

public class MoviesAdapter extends RecyclerView.Adapter {
    private MoviesActionDelegate mMoviesActionDelegate;

    public MoviesAdapter(MoviesActionDelegate moviesActionDelegate) {
        mMoviesActionDelegate = moviesActionDelegate;

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View moviesItemView = inflater.inflate(R.layout.item_movies, parent, false);
        ItemMoviesViewHolder itemMoviesViewHolder = new ItemMoviesViewHolder(moviesItemView,mMoviesActionDelegate);
        return itemMoviesViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
