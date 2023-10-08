package io.namoosori.java.travelClub.ui.console;


import io.namoosori.java.travelClub.entity.TravelClub;
import io.namoosori.java.travelClub.service.ClubService;
import io.namoosori.java.travelClub.service.ServiceLogicLifeCycler;
import io.namoosori.java.travelClub.service.logic.ClubServiceLogic;
import io.namoosori.java.travelClub.util.ConsoleUtil;

import java.util.List;


public class ClubConsole {

    private final ConsoleUtil util;
    private final ClubService service;

    public ClubConsole() {
        this.util = new ConsoleUtil();
//        이후 변경될 코드
//        this.service = new ClubServiceLogic(); // 객체지향에 위배되는 코드 : ClubConsole이 직접 ClubServiceLogic을 생성
        this.service = ServiceLogicLifeCycler.getUniqueInstance().getClubService();
    }

    public void register() {

        while (true) {
            String clubName = util.getValueOf("Club Name (0. return to Club Menu)");
            if (clubName.equals("0")) {
                return;
            }

            String intro = util.getValueOf("Club Intro (0. return to Club Menu");
            if (intro.equals("0")) {
                return;
            }

            TravelClub club = new TravelClub(clubName, intro);

            service.register(club); //배열에 저장

            System.out.println("Registered Club : " + club);

        }
    }

    public void findAll() {
//        System.out.println("Find All");
        List<TravelClub> foundClubs = service.findAll();
        if (foundClubs.isEmpty()) { // foundClubs.length에서 변경
            System.out.println("Club is Empty");
            return;
        }

        for (TravelClub club : foundClubs) {
            System.out.println(club.toString());
        }

    }

    public void findById() {
        TravelClub foundClub;
        while (true) {
            String clubId = util.getValueOf("Club Id to find(0. return to Club Menu)");
            if (clubId.equals("0")) {
                break;
            }

            foundClub = service.findById(clubId);

            if (foundClub != null) {
                System.out.println(foundClub);
            } else {
                System.out.println("Cannot find club, ID :" + clubId);
            }
        }
    }

    public void findName() {
        List<TravelClub> foundClubs;
        while (true) {
            String clubName = util.getValueOf("Club Name to find(0. return to Club Menu)");

            if (clubName.equals("0")) {
                break;
            }

            foundClubs = service.findByName(clubName);

            if (foundClubs != null && !foundClubs.isEmpty()) { // foundClubs.length !=0
                for (TravelClub club : foundClubs) {
                    System.out.println(club);
                }
            } else {
                System.out.println("Cannot find club, Name:" + clubName);
            }
        }
    }


    private TravelClub findOne() {
        TravelClub foundClub = null;
        while (true) {
            String clubId = util.getValueOf("Club Id to find(0. return to Club Menu)");
            if (clubId.equals("0")) {
                break;
            }

            foundClub = service.findById(clubId);

            if (foundClub != null) {
                break;
            } else {
                System.out.println("Cannot find club, ID :" + clubId);
            }
        }
        return foundClub;
    }

    public void modify() {
        TravelClub targetClub = findOne();

        String newName = util.getValueOf("New Club name(0. return to Club Menu, Enter. No Change)");
        if (newName.equals("0")) {
            return;
        }
        if (!newName.isEmpty()) {
            targetClub.setClubName(newName);
        }
        String newIntro = util.getValueOf("New Club Intro(0. return to Club Menu, Enter. No Change)");
        if (!newIntro.isEmpty()) {
            targetClub.setIntro(newIntro);
        }

        service.modify(targetClub);

        System.out.println("Modified Club : " + targetClub);

    }

    public void remove() {
        TravelClub targetClub = findOne();

        String confirmStr = util.getValueOf("Remove this club? (Y: yes, N: no)");
        if (confirmStr.toLowerCase().equals("y") || confirmStr.toLowerCase().equals("yes")) { // 경고 표시 뜨는 이유?
            System.out.println("Removed Club ➡️ " + targetClub);
            service.remove(targetClub.getId());
        } else {
            System.out.println("Remove cancelled, Club is safe. " + targetClub.getClubName());
        }

    }
}
