package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;
import ru.netology.manager.MovieManager;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MovieManagerTest {

    @Test
    public void addTest() {

        MovieManager manager = new MovieManager();


        Movie one = new Movie(15, "url1", "Everest", "scientific");
        Movie two = new Movie(16, "url2", "Bumbarach", "comedy");
        Movie three = new Movie(17, "url3", "Avatar", "fantasy");


        manager.save(one);
        manager.save(two);
        manager.save(three);

        Movie[] expected = {one, two, three};
        Movie[] actual = manager.getMovies();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void getLastFilmIfMoreThanTen() {
        MovieManager manager = new MovieManager();
        Movie eleven = new Movie(15, "url1", "Everest", "scientific");
        Movie ten = new Movie(16, "url2", "Bumbarach", "comedy");
        Movie nine = new Movie(17, "url3", "Avatar", "fantasy");
        Movie eight = new Movie(18, "url1", "Everest", "scientific");
        Movie seven = new Movie(19, "url2", "Bumbarach", "comedy");
        Movie six = new Movie(20, "url3", "Avatar", "fantasy");
        Movie five = new Movie(21, "url1", "Everest", "scientific");
        Movie four = new Movie(22, "url2", "Bumbarach", "comedy");
        Movie three = new Movie(23, "url3", "Avatar", "fantasy");
        Movie two = new Movie(24, "url1", "Everest", "scientific");
        Movie one = new Movie(25, "url2", "Bumbarach", "comedy");

        manager.save(eleven);
        manager.save(ten);
        manager.save(nine);
        manager.save(eight);
        manager.save(seven);
        manager.save(six);
        manager.save(five);
        manager.save(four);
        manager.save(three);
        manager.save(two);
        manager.save(one);

        Movie[] expected = {one, two, three, four, five, six, seven, eight, nine, ten};
        Movie[] actual = manager.getLastFilm();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void getLastFilmIfLessThanTen() {
        MovieManager manager = new MovieManager();

        Movie six = new Movie(17, "url3", "Avatar", "fantasy");
        Movie five = new Movie(15, "url1", "Everest", "scientific");
        Movie four = new Movie(16, "url2", "Bumbarach", "comedy");
        Movie three = new Movie(17, "url3", "Avatar", "fantasy");
        Movie two = new Movie(15, "url1", "Everest", "scientific");
        Movie one = new Movie(16, "url2", "Bumbarach", "comedy");

        manager.save(six);
        manager.save(five);
        manager.save(four);
        manager.save(three);
        manager.save(two);
        manager.save(one);

        Movie[] expected = {one, two, three, four, five, six};
        Movie[] actual = manager.getLastFilm();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void getLastFilmRandomAmount() {
        MovieManager manager = new MovieManager(8);
        Movie eleven = new Movie(15, "url1", "Everest", "scientific");
        Movie ten = new Movie(16, "url2", "Bumbarach", "comedy");
        Movie nine = new Movie(17, "url3", "Avatar", "fantasy");
        Movie eight = new Movie(18, "url1", "Everest", "scientific");
        Movie seven = new Movie(19, "url2", "Bumbarach", "comedy");
        Movie six = new Movie(20, "url3", "Avatar", "fantasy");
        Movie five = new Movie(21, "url1", "Everest", "scientific");
        Movie four = new Movie(22, "url2", "Bumbarach", "comedy");
        Movie three = new Movie(23, "url3", "Avatar", "fantasy");
        Movie two = new Movie(24, "url1", "Everest", "scientific");
        Movie one = new Movie(25, "url2", "Bumbarach", "comedy");

        manager.save(eleven);
        manager.save(ten);
        manager.save(nine);
        manager.save(eight);
        manager.save(seven);
        manager.save(six);
        manager.save(five);
        manager.save(four);
        manager.save(three);
        manager.save(two);
        manager.save(one);

        Movie[] expected = {one, two, three, four, five, six, seven, eight};
        Movie[] actual = manager.getLastFilm();

        assertArrayEquals(expected, actual);

    }


}
