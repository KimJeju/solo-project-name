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



}
