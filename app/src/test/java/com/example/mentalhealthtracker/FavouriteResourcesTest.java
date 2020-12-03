package com.example.mentalhealthtracker;

import com.example.mentalhealthtracker.FavouriteResources.Favourite;

import org.junit.Test;
import static org.junit.Assert.*;

// Unit tests for Favourite object
public class FavouriteResourcesTest {
    @Test
    public void checkFavouriteGetters() {
        Favourite favourite = new Favourite(1, "Yoga");
        assertEquals(1, favourite.getFavouriteNumber());
        assertEquals("Yoga", favourite.getResource());
    }

    @Test
    public void checkFavouriteSetters() {
        Favourite favourite = new Favourite();
        favourite.setFavouriteNumber(2);
        favourite.setResource("Mood Tracker");
        assertEquals(2, favourite.getFavouriteNumber());
        assertEquals("Mood Tracker", favourite.getResource());
    }
}
