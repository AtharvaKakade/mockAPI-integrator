package com.ThirdPartyApis.API.postService;

import java.util.List;
import java.util.Map;

public interface PostService {
    List<Map<String, Object>> getPosts();

    Map<String, Object> getPostById(int id);

    Map<String,Object> insertPosts(Map<String, Object> payload);

    Map<String,Object> updatePost(Map<String, Object> payload, int id);

    Map<String,Object> deletePost(int id);
}
