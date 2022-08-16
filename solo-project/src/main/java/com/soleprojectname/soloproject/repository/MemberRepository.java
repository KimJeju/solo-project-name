package com.soleprojectname.soloproject.repository;

import com.soleprojectname.soloproject.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member,Long> {
    Optional<Member> findByDomain(Member.Domain domain);
    Optional<Member> findByRegion(Member.Region region);
}
