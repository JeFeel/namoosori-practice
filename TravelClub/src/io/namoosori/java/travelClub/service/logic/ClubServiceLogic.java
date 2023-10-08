package io.namoosori.java.travelClub.service.logic;


import io.namoosori.java.travelClub.entity.TravelClub;
import io.namoosori.java.travelClub.service.ClubService;
import io.namoosori.java.travelClub.store.ClubStore;
import io.namoosori.java.travelClub.store.StoreLifeCycler;

import java.util.Arrays;
import java.util.List;


public class ClubServiceLogic implements ClubService {
//    주석 부분은 List 사용 이전 코드
//    private final TravelClub[] clubs; // 데이터를 저장할 배열
//    private int index;

    private final ClubStore clubStore;

    public ClubServiceLogic() {
//        this.clubs = new TravelClub[10]; // 10개의 club를 저장할 수 있는 공간
//          this.index = 0; 기본적으로 heap에 0으로 잡히기 때문에 생략해도 무방
        this.clubStore = StoreLifeCycler.getUniqueInstance().requestClubStored();
    }

    @Override
    public void register(TravelClub travelClub) {
//        clubs[index] = travelClub;
//        index++;
        this.clubStore.create(travelClub);
    }

    @Override
    public List<TravelClub> findAll() {
//        return Arrays.copyOfRange(clubs, 0, index);
//        현재 배열 데이터에서 필요한 정보들만 가져오고, 원본을 훼손하지 않기 위해 copyOf 사용
        return this.clubStore.retrieveAll();
    }

    @Override
    public List<TravelClub> findByName(String clubName) {
//        TravelClub[] copyClub = Arrays.copyOfRange(clubs, 0, index);
//        TravelClub[] foundClubs = new TravelClub[copyClub.length];
//        int subIndex = 0;
//        for (TravelClub club : copyClub) {
//            if (club.getClubName().equals(clubName)) {
//                foundClubs[subIndex] = club;
//                subIndex++;
//            }
//        }
//        return Arrays.copyOfRange(foundClubs, 0, subIndex);
        return this.clubStore.retrieveAllByName(clubName);
    }

    @Override
    public TravelClub findById(String clubId) {
//        TravelClub[] copyClub = Arrays.copyOfRange(clubs, 0, index);
//        TravelClub foundClub = null;
//        for (TravelClub club : copyClub) {
//            if (club.getId().equals(clubId)) {
//                foundClub = club;
//                break;
//            }
//        }
//        return foundClub;
        return this.clubStore.retrieve(clubId);
    }

    @Override
    public void modify(TravelClub modifyClub) {
//        int foundIndex = 0;
//        for (int i = 0; i < clubs.length; i++) {
//            if (clubs[i].getId().equals(modifyClub.getId())) {
//                foundIndex = i;
//                break;
//            }
//        }
//
//        this.clubs[foundIndex] = modifyClub;
        this.clubStore.update(modifyClub);
    }

    @Override
    public void remove(String clubId) {
//        int foundIndex = 0;
//        for (int i = 0; i < clubs.length; i++) {
//            if (clubs[i].getId().equals(clubId)) {
//                foundIndex = i;
//                break;
//            }
//        }
//
//        // club 하나 지움으로써 index를 당기는 작업
//        for (int i = foundIndex; i < this.index + 1; i++) {
//            clubs[i] = clubs[i + 1];
//        }
//
//        this.index--;
        this.clubStore.delete(clubId);
    }
}
