package io.namoosori.java.travelClub.service.logic;


import io.namoosori.java.travelClub.entity.TravelClub;
import io.namoosori.java.travelClub.service.ClubService;

import java.util.Arrays;


public class ClubServiceLogic implements ClubService {

    private final TravelClub[] clubs; // 데이터를 저장할 배열
    private int index;

    public ClubServiceLogic() {
        this.clubs = new TravelClub[10]; // 10개의 club를 저장할 수 있는 공간
//          this.index = 0; 기본적으로 heap에 0으로 잡히기 때문에 생략해도 무방
    }

    @Override
    public void register(TravelClub travelClub) {
        clubs[index] = travelClub;
        index++;
    }

    @Override
    public TravelClub[] findAll() {
        return Arrays.copyOfRange(clubs, 0, index);
//        현재 배열 데이터에서 필요한 정보들만 가져오고, 원본을 훼손하지 않기 위해 copyOf 사용
    }

    @Override
    public TravelClub[] findByName(String clubName) {
        return new TravelClub[0];
    }

    @Override
    public TravelClub[] findById(String clubId) {
        return new TravelClub[0];
    }

    @Override
    public void modify(TravelClub modifyClub) {

    }

    @Override
    public void remove(String clubId) {

    }
}
