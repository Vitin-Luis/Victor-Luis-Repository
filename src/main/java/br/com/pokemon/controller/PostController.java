package br.com.pokemon.controller;

import br.com.pokemon.entity.Post;
import br.com.pokemon.entity.Usuario;
import br.com.pokemon.repository.PostRespository;
import br.com.pokemon.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {


    @Autowired
    private PostService postService;

   // @PostMapping
   // public ResponseEntity<List<Post>> lista() {
   //       return ResponseEntity.status(HttpStatus.OK).body();
  //  }

}
