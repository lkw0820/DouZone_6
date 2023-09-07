package com.kosa.kapple.mapper;

import com.kosa.kapple.domain.ComponentVO;
import com.kosa.kapple.vo.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MapperBY {

    // 부품 리스트 조회
    public List<ResponseComponent2> getAllComponents();

    // 부품 등록
    public void saveComponent(RequestComponent2 component);

    // 공급사 제안서 등록
    public void saveFile(RequestFile file);

    // 공급사 제안서 회사 번호 업데이트
    public void updateFile(RequestFile file);

    // 공급사 로고 등록
    public void saveLogo(RequestLogo logo);

    // 공급사 로고 회사 번호 등록(업데이트)
    public void updateLogo(RequestLogo logo);

    // 임시저장 등록
    public void saveDraft(RequestDraft draft);

    // 임시저장 리스트 조회
    public List<ResponseDraft> getAllDrafts();

    // 임시저장 상세 조회
    public ResponseDraft getOneDraft(int draft_no);

    // 임시저장 삭제
    public void deleteDraft(int draft_no);

    // 공급사 불러오기
    public List<ResponseSupplier> getAllSuppliers2();

    // 공급사 상세 보기
   // public ResponseSupplier getOneSupplier2();


}