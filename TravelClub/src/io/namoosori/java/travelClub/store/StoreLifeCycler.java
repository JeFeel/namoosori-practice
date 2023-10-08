package io.namoosori.java.travelClub.store;


import io.namoosori.java.travelClub.store.logic.ClubMapStore;


public class StoreLifeCycler {
//    ServiceLogicLifeCycler와 유사하게 ClubStore의 interface를 구현한
//    ClubMapStore를 제공하게끔 만듦

    private static StoreLifeCycler uniqueInstance; //싱글턴 패턴?

    private final ClubStore clubStore;

    private StoreLifeCycler() {
        this.clubStore = new ClubMapStore();
    }

    public static StoreLifeCycler getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new StoreLifeCycler();
        }
        return uniqueInstance;
    }

    public ClubStore requestClubStored(){
        return this.clubStore;
    }


}
