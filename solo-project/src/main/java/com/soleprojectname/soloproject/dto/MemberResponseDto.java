package com.soleprojectname.soloproject.dto;

import com.soleprojectname.soloproject.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MemberResponseDto {

    private Long memberId;

    private Member.Domain domain;

    private Member.Region region;
}
