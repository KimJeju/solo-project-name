package com.soleprojectname.soloproject.member.repository;

import com.soleprojectname.soloproject.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member,Long> {

}
