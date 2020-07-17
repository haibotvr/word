package com.simon.boot.word;

import com.alibaba.druid.filter.config.ConfigTools;
import lombok.extern.slf4j.Slf4j;

/**
 * @author simon.wei
 */
@Slf4j
public class GeneratePwd {

    public static void main(String[] args) throws Exception {
        //密码明文
        String password = "123456";

        log.info("密码[" + password + "]的加密信息如下：\n");

        String [] keyPair = ConfigTools.genKeyPair(512);
        //私钥
        String privateKey = keyPair[0];
        //公钥
        String publicKey = keyPair[1];
        //用私钥加密后的密文
        password = ConfigTools.encrypt(privateKey, password);
        //打印私钥
        log.info("privateKey:{}", privateKey);
        //打印公钥
        log.info("publicKey:{}", publicKey);
        //打印密文
        log.info("password:{}", password);
        //解密后的明文
        String decryptPassword = ConfigTools.decrypt(publicKey, password);
        //打印明文
        log.info("decryptPassword:{}", decryptPassword);
    }
}
