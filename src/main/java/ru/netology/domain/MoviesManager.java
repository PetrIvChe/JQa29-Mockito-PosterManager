package ru.netology.domain;

public class MoviesManager {
    private Movies[] movies = new Movies[0];
    private int limit = 10;


    public Movies[] getMovies() {
        return movies;
    }

    public MoviesManager() {

    }

    public MoviesManager(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return this.limit;
    }


    //   1. Добавление нового фильма.
    //и  2.Вывод всех фильмов в порядке добавления
    public void add(Movies movie) {
        int length = movies.length + 1;
        Movies[] tmp = new Movies[length];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    // 3. Вывод максимум лимит* последних добавленных фильмов в обратном от добавления порядке
    public Movies[] showLatestAddedMovies() {
        int resultLength;
        if (getLimit() > movies.length) {
            resultLength = movies.length;
        } else {
            resultLength = getLimit();
        }
        Movies[] result = new Movies[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

}





