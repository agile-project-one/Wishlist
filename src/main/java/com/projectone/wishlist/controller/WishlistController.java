package com.projectone.wishlist.controller;

import com.projectone.wishlist.entity.Wishlist;
import com.projectone.wishlist.service.WishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RequestMapping("/api/wishlist")
@RestController
public class WishlistController {

    @Autowired
    private WishlistService wishlistService;
/*
    POST http://localhost:9191/api/wishlist/add   + body
            *or
    POST http://localhost:9191/api/wishlist  + body

    GET  http://localhost:9191/api/wishlist

    @DeleteMapping
    @ExceptionHandler
    @Mapping
    @PutMapping
    @RequestBody
    @PathVariable
    @ReponseBody
    @ResponseBody

*/



    @PostMapping("/add")
    public ResponseEntity<Wishlist> addToWishlist(@RequestBody Wishlist wishlist){
        Wishlist wishlistitem = wishlistService.addToWishlist(wishlist);
         return ResponseEntity.ok(wishlistitem);  //200 status code
//        return ResponseEntity.created(URI.create("wishlist added with Product Id "+wishlistitem.getProductId())).build();
    }

    @GetMapping
    public ResponseEntity<List<Wishlist>> getAllWishlist(){
        List<Wishlist> wishlists = wishlistService.getAllWishlist();
        return ResponseEntity.ok(wishlists);
    }

}
