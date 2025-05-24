package study.crud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import study.crud.dto.BoardUpdateForm;

@Getter
@NoArgsConstructor
@Entity
@Builder
@AllArgsConstructor
@Table(name = "boards")
@ToString(of = {"title","content","writer"})
public class Board extends BaseUpdatableEntity{
    @NotBlank(message = "제목은 필수입니다.")
    @Column(nullable = false)
    private String title;

    @NotBlank(message = "내용을 입력해주세요.")
    @Column(nullable = false)
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User writer;

    public void updateBoard(BoardUpdateForm dto) {
        if(dto.getTitle() != null|| dto.getTitle() != title) {
            this.title = dto.getTitle();
        }
        if(dto.getContent() != null|| dto.getContent() != content) {
            this.content = dto.getContent();
        }
        changeUpdatedAt();
    }
}
