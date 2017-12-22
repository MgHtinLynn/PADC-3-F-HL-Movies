package xyz.htinlynn.movies.data.vo;

import java.util.List;

/**
 * Created by htinlynn on 12/23/17.
 */

public class MoviesVO {
    private int voteCount;
    private int Id;
    private boolean video;
    private double voteAverAge;
    private String title;
    private double popularity;
    private String posterPath;
    private String originalLanguages;
    private String originalTitle;
    private int[] genreIds;
    private String backdropPath;
    private boolean adult;
    private String overview;
    private String releasedDate;

    public int getVoteCount() {
        return voteCount;
    }

    public int getId() {
        return Id;
    }

    public boolean isVideo() {
        return video;
    }

    public double getVoteAverAge() {
        return voteAverAge;
    }

    public String getTitle() {
        return title;
    }

    public double getPopularity() {
        return popularity;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getOriginalLanguages() {
        return originalLanguages;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public int[] getGenreIds() {
        return genreIds;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public boolean isAdult() {
        return adult;
    }

    public String getOverview() {
        return overview;
    }

    public String getReleasedDate() {
        return releasedDate;
    }
}
