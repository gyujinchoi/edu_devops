package com.example.post.repository;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PostDAOTest{

        @Test
        public void test_전체포스트가져오기() {
            PostDAO dao = new PostDAO();
            //assertTrue();

        }

        @Test
        public void test_login() {
            PostDAO dao = new PostDAO();
            String id = "admin";
            String pwd  = "1234";
            assertTrue(dao.login(id, pwd));
        }



    }
