package com.luispuchades.popularmovies2.utils;

import com.luispuchades.popularmovies2.BuildConfig;

/**
 * This class updates the app constants.
 * Created by luisp on 11/03/2018.
 */

public class Constants {

    /* Create URL for the movie path*/
    public static final String THEMOVIEDB_POSTER_PATH_BASE_URL = "http://image.tmdb.org/t/p";
    public static final String THEMOVIEDB_POSTER_PHONE_SIZE = "/w185/";
    public static final String THEMOVIEDB_BACKDROP_PHONE_SIZE = "/w300/";

    /** String for putExtra */
    public static final String EXTRA_MOVIE = "intent_extra_movie";

    /*
     * URL EXAMPLES
     * http://api.themoviedb.org/3/movie/popular?api_key=[API_KEY]
     * http://api.themoviedb.org/3/movie/top_rated?api_key=[API_KEY]
     */

    public static final String THEMOVIEDB_BASE_URL = "https://api.themoviedb.org/3/movie/";

    public static final String THEMOVIEDB_ENDPOINT_API_KEY = "api_key";
    public static final String THEMOVIEDB_API_KEY = BuildConfig.API_KEY;
}
