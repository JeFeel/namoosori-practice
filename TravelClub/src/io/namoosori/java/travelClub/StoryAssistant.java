package io.namoosori.java.travelClub;


import io.namoosori.java.travelClub.ui.menu.ClubMenu;


public class StoryAssistant {

    private void startStory(){
        ClubMenu clubMenu = new ClubMenu();
        clubMenu.show();
    }

    public static void main(String[] args) {
//        TravelClub newClub = new TravelClub("Jeju Club", "Jeju TravelClub");
//        System.out.println(newClub);
//
//        System.out.println(TravelClub.getSample());
        StoryAssistant assistant = new StoryAssistant();
        assistant.startStory();


    }

}
