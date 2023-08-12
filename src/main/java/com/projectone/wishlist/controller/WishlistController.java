package com.projectone.wishlist.controller;

import com.projectone.wishlist.entity.Wishlist;
import com.projectone.wishlist.service.WishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/wishlist")
@RestController
public class WishlistController {

    @Autowired
    private WishlistService wishlistService;

    @PostMapping("/add")
    public ResponseEntity<Wishlist> addToWishlist(@RequestBody Wishlist wishlist){
        Wishlist wishlistitem = wishlistService.addToWishlist(wishlist);
         return ResponseEntity.ok(wishlistitem);  //200 status code
    }

    @GetMapping
    public ResponseEntity<List<Wishlist>> getAllWishlist(){
        List<Wishlist> wishlists = wishlistService.getAllWishlist();
        return ResponseEntity.ok(wishlists);
    }

    @DeleteMapping("/{wishlistId}")
    public ResponseEntity<Wishlist> deleteWishlistById(@PathVariable("wishlistId") Long wishlistId){
        Wishlist wishlist= wishlistService.deleteWishlistById(wishlistId);
        return ResponseEntity.ok(wishlist);
    }

    @PutMapping("/{wishlistId}")
    public ResponseEntity<Wishlist> updateWishlistById(@PathVariable("wishlistId") Long wishlistId, @RequestBody Wishlist wishlistFromClient){
        Wishlist wishlist = wishlistService.updateWishlistById(wishlistId, wishlistFromClient);
        return ResponseEntity.ok(wishlist);
    }

}
