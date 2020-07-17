package com.simon.boot.word.service.udp;

import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.udp.UdpUser;
import com.simon.boot.word.vo.LoginVO;

/**
 * @author simon.wei
 */
public interface UdpUserService {

    ReturnValue login(LoginVO vo);

    ReturnValue add(UdpUser record);

    ReturnValue edit(UdpUser record);

    ReturnValue del(Long id);

    UdpUser findById(Long id);

}
