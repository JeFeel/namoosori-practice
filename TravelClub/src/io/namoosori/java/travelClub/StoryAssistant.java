package io.namoosori.java.travelClub;


import io.namoosori.java.travelClub.entity.TravelClub;
import io.namoosori.java.travelClub.util.DateUtil;


public class StoryAssistant {

    public static void main(String[] args) {
        TravelClub newClub = new TravelClub("Jeju Club", "Jeju TravelClub");
        System.out.println(newClub);

        System.out.println(TravelClub.getSample());
    }

}
