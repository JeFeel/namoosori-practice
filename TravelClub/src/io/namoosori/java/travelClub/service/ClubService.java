package io.namoosori.java.travelClub.service;


import io.namoosori.java.travelClub.entity.TravelClub;

import java.util.List;


public interface ClubService {

    void register(TravelClub travelClub);

    List<TravelClub> findAll(); //전체 travelclub 반환

    List<TravelClub> findByName(String clubName);

    TravelClub findById(String clubId);

    void modify(TravelClub modifyClub);

    void remove(String clubId);
}
