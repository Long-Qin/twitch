package com.example.twitch.external.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Video(
        String id,
        @JsonProperty("stream_id") String streamId,
        @JsonProperty("user_id") String userId,
        @JsonProperty("user_login") String userLogin,
        @JsonProperty("user_name") String userName,
        String title,
        String description,
        @JsonProperty("created_at") String createdAt,
        @JsonProperty("published_at") String publishedAt,
        String url,
        String thumbnailUrl,
        String viewable,
        String viewCount,
        String language,
        String type,
        String duration,
        @JsonProperty("muted_segments") String mutedSegments
        ) {
}
