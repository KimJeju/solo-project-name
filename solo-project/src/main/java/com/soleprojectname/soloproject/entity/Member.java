package com.soleprojectname.soloproject.entity;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    private Domain domain = Domain.DOMAIN_PROGRAMMER;

    private Region region = Region.REGION_JEJU;


    public enum Domain{
        DOMAIN_DESIGNER(1,"디자이너"),
        DOMAIN_PROGRAMMER(2,"프로그래머"),
        DOMAIN_PM(3,"프로젝트 매니저");

        @Getter
        int Number;

        @Getter
        String domain;

        Domain(int number, String domain) {
            Number = number;
            this.domain = domain;
        }
    }



    //지역
    public enum Region{
        REGION_SEOUL(1,"서울"),
        REGION_BuSAN(2,"부산"),
        REGION_DAEGU(2,"대구"),
        REGION_JEJU(4,"제주");

        @Getter
        int number;

        @Getter
        String region;

        Region(int number, String region) {
            this.number = number;
            this.region = region;
        }
    }



}
