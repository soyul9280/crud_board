package study.crud.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Getter
@NoArgsConstructor
public class Board {
    private UUID id;
    private Instant createdAt;
    private String title;
    private String content;
    private String writer;

    public Board(String title, String content, String writer) {
        id = UUID.randomUUID();
        createdAt = Instant.now();
        this.title = title;
        this.content = content;
        this.writer = writer;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Board{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}
