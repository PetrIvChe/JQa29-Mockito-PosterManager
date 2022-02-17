package ru.netology.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoviesManagerTest {

    private MoviesManager manager = new MoviesManager();
    MoviesManager first = new MoviesManager(1, "Bloodshot", "Action");
    MoviesManager second = new MoviesManager(2, "Onward", "Cartoon");
    MoviesManager third = new MoviesManager(3, "Hotel Belgrade", "Comedy");
    MoviesManager fourth = new MoviesManager(4, "Gentlemen", "Fighter");
    MoviesManager fifth = new MoviesManager(5, "The invisible man", "Horror");
    MoviesManager sixth = new MoviesManager(6, "Trolls World tour", "Cartoon");
    MoviesManager seventh = new MoviesManager(7, "Number one", "Comedy");
    MoviesManager eighth = new MoviesManager(8, "Harry Potter", "Fantasy");
    MoviesManager ninth = new MoviesManager(9, "Men in black 1", "Science fiction");
    MoviesManager tenth = new MoviesManager(10, "Men in black 2", "Science fiction");
    MoviesManager eleventh = new MoviesManager(11, "Men in black 3", "Science fiction");
    MoviesManager twelfth = new MoviesManager(11, "Men in black 4", "Science fiction");

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

        MoviesManager[] actual = manager.getMovies();
        MoviesManager[] expected = new MoviesManager[]{first, second, third, fourth, fifth, sixth};
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

        MoviesManager[] actual = manager.getMovies();
        MoviesManager[] expected = new MoviesManager[]{first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh};
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

        MoviesManager[] actual = manager.show10LatestAddedMovies();
        MoviesManager[] expected = new MoviesManager[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
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


        MoviesManager[] actual = manager.show10LatestAddedMovies();
        MoviesManager[] expected = new MoviesManager[]{eleventh, tenth, ninth, eighth, seventh};
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


        MoviesManager[] actual = manager.show10LatestAddedMovies();
        MoviesManager[] expected = new MoviesManager[]{eleventh};
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



        MoviesManager[] actual = manager.show10LatestAddedMovies();
        MoviesManager[] expected = new MoviesManager[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third,second, first};
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



        MoviesManager[] actual = manager.show10LatestAddedMovies();
        MoviesManager[] expected = new MoviesManager[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third};
        assertArrayEquals(expected, actual);
    }

}