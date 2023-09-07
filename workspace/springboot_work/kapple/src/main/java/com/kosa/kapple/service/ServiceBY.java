package com.kosa.kapple.service;

import com.kosa.kapple.domain.ComponentVO;
import com.kosa.kapple.vo.RequestComponent2;
import com.kosa.kapple.vo.RequestFile;

import java.util.List;

public interface ServiceBY {

    public List<ComponentVO> getAllComponents();

    public RequestComponent2 saveComponent(RequestComponent2 compo);

    public RequestFile saveFile(RequestFile file);

    public RequestFile updateFile(RequestFile file);
}
