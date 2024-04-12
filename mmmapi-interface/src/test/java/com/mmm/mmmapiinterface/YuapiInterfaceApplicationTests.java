package com.mmm.mmmapiinterface;

import com.mmm.mmmapiclientsdk.client.MmmApiClient;
import com.mmm.mmmapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * 测试类
 *

 */
@SpringBootTest
class mmmapiinterfaceApplicationTests {

    @Resource
    private MmmApiClient mmmApiClient;

    @Test
    void contextLoads() {
        String result = mmmApiClient.getNameByGet("mmm");
        User user = new User();
        user.setUsername("ming");
        String usernameByPost = mmmApiClient.getUsernameByPost(user);
        System.out.println(result);
        System.out.println(usernameByPost);
    }

}
