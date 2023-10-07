package io.namoosori.java.travelClub.store.logic;


import io.namoosori.java.travelClub.entity.TravelClub;
import io.namoosori.java.travelClub.store.ClubStore;

import java.util.*;


public class ClubMapStore implements ClubStore {

    private final Map<String, TravelClub> clubMap;

    public ClubMapStore() {
        this.clubMap = new HashMap<>();
    }

    @Override
    public void create(TravelClub club) {
        this.clubMap.put(club.getId(), club);
    }

    @Override
    public TravelClub retrieve(String clubId) {
        return this.clubMap.get(clubId);  //map으로부터 id를 찾아 반환
    }

    @Override
    public List<TravelClub> retrieveAllByName(String clubName) {
        //List로 반환
        List<TravelClub> foundClubs = new ArrayList<>();

        for (TravelClub club : this.clubMap.values()) {
            if (club.getClubName().equals(clubName)) {
                foundClubs.add(club);
            }
        }

//        Iterator 방식
//        Iterator<TravelClub> iterator = this.clubMap.values().iterator();
//        while(iterator.hasNext()){
//            TravelClub club = iterator.next();
//            if(club.getClubName().equals(clubName)){
//                foundClubs.add(club);
//            }
//        }
        return foundClubs;
    }

    @Override
    public List<TravelClub> retrieveAll() {
        return new ArrayList<>(this.clubMap.values());
    }

    @Override
    public void update(TravelClub updateClub) {
        this.clubMap.put(updateClub.getId(), updateClub);
    }

    @Override
    public void delete(String clubId) {
        this.clubMap.remove(clubId);
    }
}
