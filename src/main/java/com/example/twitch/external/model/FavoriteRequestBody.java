package com.example.twitch.external.model;

import com.example.twitch.db.entity.ItemEntity;

public record FavoriteRequestBody(
        ItemEntity favorite
) {
}
