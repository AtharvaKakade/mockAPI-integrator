package com.ThirdPartyApis.API.controller;

import com.ThirdPartyApis.API.postService.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/getPosts")
    List<Map<String, Object>> getAllPosts(){
        return postService.getPosts();
    }

    @GetMapping("/getPostById/{id}")
    Map<String, Object> getPostById(@PathVariable int id){
        return postService.getPostById(id);
    }

    @PostMapping("/insertPost")
    Map<String, Object> getPostById(@RequestBody Map<String, Object> payload){
        return postService.insertPosts(payload);
    }

    @PutMapping("/updatePost/{id}")
    Map<String, Object> getPostById(@RequestBody Map<String, Object> payload, @PathVariable int id){
        return postService.updatePost(payload,id);
    }
    @DeleteMapping("/deletePost/{id}")
    Map<String, Object> deletePost(@PathVariable int id){
        return postService.deletePost(id);
    }


//    @PostMapping("/posts")

}
