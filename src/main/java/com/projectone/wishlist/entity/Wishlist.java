package com.projectone.wishlist.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Wishlist {


    // generatedValue is used to increment primary key automatically
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="wishlist_id")
    Long wishlistId;

    @Column(name="product_id")
    Long productId;

    @Column(name="user_id")
    Long userId;

    String category;

}
