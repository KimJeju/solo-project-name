package com.soleprojectname.soloproject.member.entity;

import com.soleprojectname.soloproject.company.Company;
import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    private String name;

    private String password;

    private Sex sex = Sex.SEX_M;

    private String company_name;

    @OneToOne(mappedBy = "member", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Company company;

    public enum Sex{
        SEX_M(1,"남성"),
        SEX_F(2,"여성");

        @Getter
        int number;

        @Getter
        String male;

        Sex(int number, String male) {
            this.number = number;
            this.male = male;
        }
    }

    @Builder
    public Member(Long memberId, String name, String password, Sex sex, String company_name) {
        this.memberId = memberId;
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.company_name = company_name;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", company_name='" + company_name + '\'' +
                '}';
    }

//
//    public enum Domain{
//        DOMAIN_DESIGNER(1,"디자이너"),
//        DOMAIN_PROGRAMMER(2,"프로그래머"),
//        DOMAIN_PM(3,"프로젝트 매니저");
//
//        @Getter
//        int Number;
//
//        @Getter
//        String domain;
//
//        Domain(int number, String domain) {
//            Number = number;
//            this.domain = domain;
//        }
//    }
//
//
//
//    //지역
//    public enum Region{
//        REGION_SEOUL(1,"서울"),
//        REGION_BuSAN(2,"부산"),
//        REGION_DAEGU(2,"대구"),
//        REGION_JEJU(4,"제주");
//
//        @Getter
//        int number;
//
//        @Getter
//        String region;
//
//        Region(int number, String region) {


//            this.number = number;
//            this.region = region;
//        }
//    }




}
