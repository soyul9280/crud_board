package study.crud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Builder
@ToString(of = {"username","email"})
public class User extends BaseUpdatableEntity{

    @NotBlank(message = "이름은 필수입니다.")
    @Column(unique = true, nullable = false)
    private String username;

    //비밀번호: 영문 대/소문자와 숫자, 특수문자를 1개 이상 포함한 8-15자의 비밀번호를 입력해야한다.
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[~@#$%^&+=!])(?=\\S+$).{8,15}$",
    message = "대/소문자, 숫자, 특수문자를 1개 이상 포함한 8-15자여야합니다.")
    @NotBlank(message = "비밀번호는 필수입니다.")
    @Column(nullable = false,unique = true)
    private String password;

    @Email(message = "올바른 이메일 형식을 입력해주세요.")
    @Column(nullable = false,unique = true)
    private String email;
}
