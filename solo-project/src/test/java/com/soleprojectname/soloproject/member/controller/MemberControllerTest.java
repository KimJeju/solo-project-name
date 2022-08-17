//package com.soleprojectname.soloproject.member.controller;
//
//
//import com.google.gson.Gson;
//import com.soleprojectname.soloproject.company.Company;
//import com.soleprojectname.soloproject.member.dto.MemberDto;
//import com.soleprojectname.soloproject.member.entity.Member;
//import com.soleprojectname.soloproject.member.mapper.MemberMapper;
//import com.soleprojectname.soloproject.member.service.MemberServiceImpl;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.data.jpa.mapping.JpaMetamodelMappingContext;
//import org.springframework.http.MediaType;
//import org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders;
//import org.springframework.restdocs.payload.JsonFieldType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.ResultActions;
//
//import java.util.Arrays;
//import java.util.List;
//
//import static org.mockito.BDDMockito.given;
//import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
//import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.patch;
//import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.post;
//import static org.springframework.restdocs.operation.preprocess.Preprocessors.*;
//import static org.springframework.restdocs.payload.PayloadDocumentation.*;
//import static org.springframework.restdocs.request.RequestDocumentation.parameterWithName;
//import static org.springframework.restdocs.request.RequestDocumentation.pathParameters;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@WebMvcTest(MemberController.class)
//@MockBean(JpaMetamodelMappingContext.class)
//@AutoConfigureRestDocs
//class MemberControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//
//    @Autowired
//    private Gson gson;
//
//    @MockBean
//    private MemberServiceImpl memberService;
//
//    @MockBean
//    private MemberMapper mapper;
//
//
//
//
//
//    @Test
//    void getMember() throws Exception {
//
//        Long memberId = 1L;
//        MemberDto.Response response =
//                new MemberDto.Response(1L,"김코딩","1234", Member.Sex.SEX_M,"코딩회사",new Company());
//
//
//        given(memberService.memberSearch(Mockito.anyLong())).willReturn(new Member());
//        given(mapper.memberToMemberResponseDto(Mockito.any(Member.class))).willReturn(response);
//
//        // when
//        ResultActions actions = mockMvc.perform(
//                RestDocumentationRequestBuilders.get("/v1/solo/1")
//                        .accept(MediaType.APPLICATION_JSON));
//
//        // then
//        actions
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.data.memberId").value(memberId))
//                .andExpect(jsonPath("$.data.name").value(response.getName()))
//                .andDo(
//                        document("get-member",
//                                preprocessRequest(prettyPrint()),
//                                preprocessResponse(prettyPrint()),
//                                pathParameters(
//                                        Arrays.asList(parameterWithName("member-id").description("회원 식별자 ID"))
//                                ),
//                                responseFields(
//                                        Arrays.asList(
//                                                fieldWithPath("data").type(JsonFieldType.OBJECT).description("결과 데이터").optional(),
//                                                fieldWithPath("data.memberId").type(JsonFieldType.NUMBER).description("아이디"),
//                                                fieldWithPath("data.name").type(JsonFieldType.STRING).description("이름"),
//                                                fieldWithPath("data.password").type(JsonFieldType.STRING).description("비밀번호"),
//                                                fieldWithPath("data.sex").type(JsonFieldType.STRING)
//                                                        .description(" SEX_M / SEX_F"),
//                                                fieldWithPath("data.company_name").type(JsonFieldType.STRING).description("회사이름"),
//                                                fieldWithPath("data.company").type(JsonFieldType.NUMBER).description("회사")
//                                        )
//                                )
//                        ));
//    }
//
//
//}