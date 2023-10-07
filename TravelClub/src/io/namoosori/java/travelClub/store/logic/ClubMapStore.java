package io.namoosori.java.travelClub.store.logic;


import io.namoosori.java.travelClub.entity.TravelClub;
import io.namoosori.java.travelClub.store.ClubStore;

import java.util.List;


public class ClubMapStore implements ClubStore {

    @Override
    public void create(TravelClub club) {

    }

    @Override
    public TravelClub retrieve(String clubId) {
        return null;
    }

    @Override
    public List<TravelClub> retrieveAllByName(String clubName) {
        return null;
    }

    @Override
    public List<TravelClub> retrieveAll() {
        return null;
    }

    @Override
    public void update(TravelClub updateClub) {

    }

    @Override
    public void delete(String clubId) {

    }
}
