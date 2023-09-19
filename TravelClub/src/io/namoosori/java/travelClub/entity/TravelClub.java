package io.namoosori.java.travelClub.entity;


import io.namoosori.java.travelClub.util.DateUtil;

import java.util.UUID;


public class TravelClub {

    //    Field

    //    코드 수정 용이하게 하기 위해 private static final 필드를 만든다
    private static final int MINIMUM_NAME_LENGTH = 3;  //상수화
    private static final int MINIMUM_INTRO_LENGTH = 5;
    private final String id;
    private String clubName;
    private String intro;
    private String foundationDay; //클럽 개설일
    private String message;

    //외부 호출 불가 생성자
    private TravelClub() {
        // 자동화 id 구현 위해 UUID 발행
        this.id = UUID.randomUUID().toString();
    }


    // 생성자는 클래스명과 동일하게
    public TravelClub(String clubName, String intro) {
        this(); //위에서 ID 호출
        setClubName(clubName);
        setIntro(intro);
        this.foundationDay = DateUtil.today();
    }

//    public TravelClub(String clubName, String intro, String message) {
//        this(clubName, intro);
//        this.message = message;
//    }


    public String getClubName() {
        return this.clubName;
    }

    public void setClubName(String clubName) {
        if (clubName.length() < MINIMUM_NAME_LENGTH) {
            System.out.println("Club name should be longer than " + MINIMUM_NAME_LENGTH);
            return; //반환값이 없이 바로 종료
        }
        this.clubName = clubName;
    }

    /*
      intro getter setter
      자기소개 길이 검사
     */
    public void setIntro(String intro) {
        if (intro.length() < MINIMUM_INTRO_LENGTH) {
            System.out.println("Club intro should be longer than " + MINIMUM_INTRO_LENGTH);
            return;
        }
        this.intro = intro;
    }

    public String getIntro() {
        return this.intro;
    }

    public String getId() {
        return this.id;
    }

    public String getFoundationDay() {
        return this.foundationDay;
    }

    public static TravelClub getSample(){
        String clubName = "Sample Club";
        String intro = "Sample Club Intro";
        return new TravelClub(clubName, intro);
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Club id : ").append(id);
        builder.append(", Club name  : ").append(clubName);
        builder.append(", Intro : ").append(intro);
        builder.append(", FoundationDay : ").append(foundationDay);

        return builder.toString();
    }
}
