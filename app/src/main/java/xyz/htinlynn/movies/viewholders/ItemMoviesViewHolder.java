package xyz.htinlynn.movies.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;
import xyz.htinlynn.movies.R;
import xyz.htinlynn.movies.delegates.MoviesActionDelegate;

/**
 * Created by htinlynn on 12/14/17.
 */

public class ItemMoviesViewHolder extends RecyclerView.ViewHolder {
    private MoviesActionDelegate mMoviesActionDelegate;
    public ItemMoviesViewHolder(View itemView,MoviesActionDelegate mMoviesActionDelegate) {
        super(itemView);
        ButterKnife.bind(this, itemView);

        this.mMoviesActionDelegate = mMoviesActionDelegate;
    }


    @OnClick(R.id.cv_item_movies_root)
    public void onTrapMoviesItem(View view) {
        mMoviesActionDelegate.onTrapMoviesItem();
        //Toast.makeText(view.getContext(),"News Item Clicked",Toast.LENGTH_LONG).show();
    }
}
