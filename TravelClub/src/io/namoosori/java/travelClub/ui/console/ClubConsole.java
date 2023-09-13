package io.namoosori.java.travelClub.ui.console;


import io.namoosori.java.travelClub.entity.TravelClub;
import io.namoosori.java.travelClub.util.ConsoleUtil;


public class ClubConsole {

    private final ConsoleUtil util;

    public ClubConsole() {
        this.util = new ConsoleUtil();
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
//             배열에 저장
            System.out.println("Registered Club : " + club);

        }
    }

    public void findAll() {
        System.out.println("Find All");
    }

    public void findById() {
    }

    public void findName() {
    }

    public void modify() {
    }

    public void remove() {
    }
}
