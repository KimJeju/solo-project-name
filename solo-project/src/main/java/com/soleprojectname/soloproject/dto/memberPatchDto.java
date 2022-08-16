package com.soleprojectname.soloproject.dto;


import com.soleprojectname.soloproject.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class memberPatchDto {

    private Long memberId;

    private Member.Domain domain;

    private Member.Region region;
}
