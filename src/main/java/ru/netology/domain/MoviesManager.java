package ru.netology.domain;

public class MoviesManager {
    private int id;
    private String Title;
    private String genre;
    private MoviesManager[] movies = new MoviesManager[0];
    private int limit = 10;

    public MoviesManager() {

    }
    public MoviesManager(int limit) {
        this.limit = limit;
    }

    public MoviesManager[] getMovies() {
        return movies;
    }

    public MoviesManager(int id, String title, String genre) {
        this.id = id;
        this.Title = title;
        this.genre = genre;
    }

    public int getLimit() {
        return this.limit;
    }



    //   1. Добавление нового фильма.
    //и  2.Вывод всех фильмов в порядке добавления
    public void add(MoviesManager movie) {
        int length = movies.length + 1;
        MoviesManager[] tmp = new MoviesManager[length];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    // 3. Вывод максимум лимит* последних добавленных фильмов в обратном от добавления порядке
    public MoviesManager[] show10LatestAddedMovies() {
        int resultLength;
        if (getLimit() > movies.length) {
            resultLength = movies.length;
        } else {
            resultLength = getLimit();
        }
        MoviesManager[] result = new MoviesManager[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

}


