package com.soleprojectname.soloproject.service;

import com.soleprojectname.soloproject.entity.Member;

import java.util.List;

public interface MemberService {


    Member memberPost(Member member);

    Member memberPatch(Member member);

    Member memberSearch(Long memberId);

    List<Member> memberAllSearch();

    Member memberSearchDomain(Member.Domain domain);

    Member memberSearchRegion(Member.Region region);

    void memberDelete(Long memberId);
}
