package com.soleprojectname.soloproject.member.dto;

import com.soleprojectname.soloproject.company.Company;
import com.soleprojectname.soloproject.member.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class MemberDto {

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Post{

        private String name;

        private String password;

        private Member.Sex sex = Member.Sex.SEX_M;

        private String company_name;

        private Company company;
    }


    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Patch{

        private Long memberId;

        private String name;

        private String password;

        private Member.Sex sex = Member.Sex.SEX_M;

        private String company_name;

    }

    @AllArgsConstructor
    @Getter
    public static class Response{

        private Long memberId;

        private String name;

        private String password;

        private Member.Sex sex = Member.Sex.SEX_M;

        private String company_name;

        private Company company;
    }
}
