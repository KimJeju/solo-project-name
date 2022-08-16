package com.soleprojectname.soloproject.dto;

import com.soleprojectname.soloproject.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class MemberDto {

    @Getter
    public class Post{

        private Member.Domain domain;

        private Member.Region region;
    }


    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public class Patch{

        private Long memberId;

        private Member.Domain domain;

        private Member.Region region;
    }

    @AllArgsConstructor
    @Getter
    public class Response{

        private Long memberId;

        private Member.Domain domain;

        private Member.Region region;
    }
}
