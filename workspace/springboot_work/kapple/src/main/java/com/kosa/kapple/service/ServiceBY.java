package com.kosa.kapple.service;

import com.kosa.kapple.domain.Component2;
import com.kosa.kapple.domain.ComponentVO;
import com.kosa.kapple.vo.*;
import org.apache.coyote.Response;

import java.util.List;

public interface ServiceBY {

    public List<ResponseComponent2> getAllComponents();

    public RequestComponent2 saveComponent(RequestComponent2 compo);

    public RequestFile saveFile(RequestFile file);

    public RequestFile updateFile(RequestFile file);

    public RequestLogo saveLogo(RequestLogo logo);

    public RequestLogo updateLogo(RequestLogo logo);

    public RequestDraft saveDraft(RequestDraft draft);

    public List<ResponseDraft> getAllDrafts();

    public ResponseDraft getOneDraft(int draft_no);

    public void deleteDraft(int draft_no);

    public List<ResponseSupplier> getAllSuppliers2();

    public ResponseSupplier getOneSupplier2();
}
