package com.soleprojectname.soloproject.member.mapper;

import com.soleprojectname.soloproject.member.dto.MemberDto;
import com.soleprojectname.soloproject.member.entity.Member;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface MemberMapper {

    Member memberPostDtoToMember(MemberDto.Post post);
    Member memberPatchDtoTOMember(MemberDto.Patch patch);
    MemberDto.Response memberToMemberResponseDto(Member member);


}
