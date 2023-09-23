package io.namoosori.java.travelClub.service;


import io.namoosori.java.travelClub.service.logic.ClubServiceLogic;


public class ServiceLogicLifeCycler {

    private static ServiceLogicLifeCycler uniqueInstance;

    private final ClubService clubService;

    private ServiceLogicLifeCycler() { // 외부에서 ServiceLogicLifeCycler를 new 할 수 없음
        this.clubService = new ClubServiceLogic();
    }

    public static ServiceLogicLifeCycler getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ServiceLogicLifeCycler();
        }
        return uniqueInstance;
    }

    public ClubService getClubService() {
        return this.clubService;
    }
}
