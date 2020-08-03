package com.simon.boot.word.controller.library;

import com.google.common.collect.Lists;
import com.simon.boot.word.dto.UserInfoDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author simon.wei
 */
@RestController
@Slf4j
public class HeapController {

    @GetMapping("/heap")
    public void heap() {
        List<UserInfoDTO> list = Lists.newArrayList();
        while (true) {
            list.add(new UserInfoDTO());
            log.info("size:{}", list.size());
        }
    }

    @GetMapping("/lock")
    public void lock() {
        final Object obj1 = new Object();
        final Object obj2 = new Object();
        Thread t1 = new Thread("t1") {

            @Override
            public void run() {
                synchronized (obj1) {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj2) {
                        System.out.println("thread t1 done");
                    }
                }
            }

        };

        Thread t2 = new Thread("t2") {

            @Override
            public void run() {
                synchronized (obj2) {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj1) {
                        System.out.println("thread t2 done");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}
