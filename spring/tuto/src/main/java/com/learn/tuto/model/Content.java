package com.learn.tuto.model;

import java.time.LocalDateTime;

public record Content(
        Integer id,
        String title,
        String desc,
        Status status,
        Type type,
        LocalDateTime createDate,
        LocalDateTime updateDate,
        String url

) {
}
