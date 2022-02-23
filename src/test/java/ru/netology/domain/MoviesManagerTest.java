package ru.netology.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoviesManagerTest {

    private MoviesManager manager = new MoviesManager();

    Movies first = new Movies(1, "Bloodshot", "Action");
    Movies second = new Movies(2, "Onward", "Cartoon");
    Movies third = new Movies(3, "Hotel Belgrade", "Comedy");
    Movies fourth = new Movies(4, "Gentlemen", "Fighter");
    Movies fifth = new Movies(5, "The invisible man", "Horror");
    Movies sixth = new Movies(6, "Trolls World tour", "Cartoon");
    Movies seventh = new Movies(7, "Number one", "Comedy");
    Movies eighth = new Movies(8, "Harry Potter", "Fantasy");
    Movies ninth = new Movies(9, "Men in black 1", "Science fiction");
    Movies tenth = new Movies(10, "Men in black 2", "Science fiction");
    Movies eleventh = new Movies(11, "Men in black 3", "Science fiction");
    Movies twelfth = new Movies(12, "Men in black 4", "Science fiction");

    @BeforeEach
    public void setUp() {

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
    }

    @Test
    public void shouldAddNewMovie() {
        manager.add(sixth);

        Movies[] actual = manager.getMovies();
        Movies[] expected = new Movies[]{first, second, third, fourth, fifth, sixth};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAllMovieOnPoster() {
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);

        Movies[] actual = manager.getMovies();
        Movies[] expected = new Movies[]{first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAll10from11MovieOnPoster() {
        MoviesManager manager = new MoviesManager(10);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);

        Movies[] actual = manager.showLatestAddedMovies();
        Movies[] expected = new Movies[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAll5from10MovieOnPoster() {
        MoviesManager manager = new MoviesManager(5);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);


        Movies[] actual = manager.showLatestAddedMovies();
        Movies[] expected = new Movies[]{eleventh, tenth, ninth, eighth, seventh};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAll1from10MovieOnPoster() {
        MoviesManager manager = new MoviesManager(1);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);


        Movies[] actual = manager.showLatestAddedMovies();
        Movies[] expected = new Movies[]{eleventh};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAll11from12MovieOnPoster() {
        MoviesManager manager = new MoviesManager(11);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);


        Movies[] actual = manager.showLatestAddedMovies();
        Movies[] expected = new Movies[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAll9from10MovieOnPoster() {
        MoviesManager manager = new MoviesManager(9);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);


        Movies[] actual = manager.showLatestAddedMovies();
        Movies[] expected = new Movies[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third};
        assertArrayEquals(expected, actual);
    }

}