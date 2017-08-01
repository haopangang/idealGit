package com.haopangang.SSM;

import com.haopangang.beans.User;

/**
 * Created by haopangang on 2017/8/1.
 */
public class HelloGit {
    public static void main(String args[]) {

        System.out.println("Hello git");
        User user = new User();
        user.setName("郝攀刚");
        user.setId(1);
        user.setSex("男");

        System.out.println(user.toString());
    }
}
