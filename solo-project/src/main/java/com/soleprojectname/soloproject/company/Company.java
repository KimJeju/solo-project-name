package com.soleprojectname.soloproject.company;


import com.soleprojectname.soloproject.member.entity.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Company {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyId;

    private CompanyAdd company = CompanyAdd.COMPANY_GOOGLE;

    @OneToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;





    public enum CompanyAdd{
        COMPANY_NAVER(1,1),
        COMPANY_GOOGLE(2,2),
        COMPANY_AMAZON(3,3);


        @Getter
        int company_type;


        @Getter
        int company_location;

        CompanyAdd(int company_type, int company_location) {
            this.company_type = company_type;
            this.company_location = company_location;
        }
    }


}

