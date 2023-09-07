package com.kosa.kapple.mapper;

import com.kosa.kapple.domain.ComponentVO;
import com.kosa.kapple.vo.RequestComponent2;
import com.kosa.kapple.vo.RequestFile;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MapperBY {

    // 부품 리스트 조회
    public List<ComponentVO> getAllComponents();

    // 부품 등록
    public void saveComponent(RequestComponent2 component);

    // 공급사 제안서 등록
    public void saveFile(RequestFile file);

    // 공급사 제안서 회사 번호 업데이트
    public void updateFile(RequestFile file);
}
