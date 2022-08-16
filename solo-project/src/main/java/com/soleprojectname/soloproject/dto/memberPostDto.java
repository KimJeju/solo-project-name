package com.soleprojectname.soloproject.dto;

import com.soleprojectname.soloproject.entity.Member;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class memberPostDto {

    private Member.Domain domain;

    private Member.Region region;

}
