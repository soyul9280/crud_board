# 📋 Spring게시판

## 프로젝트 소개
- Spring 게시판 제작
  
## <a id="signup-page"></a> 결과 화면 


<details>
  <summary><b> 📃 2주차 내용</b></summary>
<div markdown="1">
    
  1. 추가 정보는 필요 없다고 판단 ➡️ 작성자 이름으로 변경

  2. entity 폴더 생성
      - [x] Board 생성 : id, title, content, writer 필드
  3. repository 폴더 생성  
      - [x] BoardRepository를 이용하여 다형성 활용 : create, findById, findByTitle, findAll, update, delete
      - [x] MemoryRepository로 구현체 생성 : 배열 대신 Map 사용, 등록 개수 제한 제거
  4. service 폴더 생성
      - [x] BoardService : 제목이 중복될 경우 예외 발생
  5. AppConfig 폴더 생성  
      - [x] IoC적용
      - [x] @Repository, @Service으로 자동 스캔하는 방법도 있지만 이번 주차에서는 Bean을 직접 등록하고 ApplicationContext를 사용해보았다.


  💾 [ ApplicationContext - Soyul블로그 ](https://soyulia.hashnode.dev/spring-applicationcontext)  
  💾 [ IoC와 DI - Soyul블로그 ](https://soyulia.hashnode.dev/spring-ioc-di)

</div>
</details>

<details>
  <summary><b> 📃 3주차 내용</b></summary>
<div markdown="1">
    
빈 자동화 : Config파일로 Bean을 따로 등록해주지 않아도 자동 인식
<img width="1360" alt="Image" src="https://github.com/user-attachments/assets/c847ffcf-3f91-4f06-86df-0785bd2ca015" />

</div>
</details>

<details>
  <summary><b> 📃 5주차 내용</b></summary>
<div markdown="1">

    
MVC 구조 도입
- [x] 컨트롤러, 서비스, 레포지토리, 엔티티 계층 나누기
- [x] UpdateBoardDto를 따로 만들기 ( 생성할때와 수정할때 필요한 필드 다르기 때문 )
<img width="231" alt="Image" src="https://github.com/user-attachments/assets/b456d5e6-5a59-4cf9-baa9-003e25091b74" />

</div>
</details>

<details>
  <summary><b> 📃 6주차 내용</b></summary>
<div markdown="1">

    
Validation 도입
- [x] 생성, 수정 관련 Dto로 나눈 후 유효성 검사 도입하기  
NotNull은 빈칸이어도 검사가 통과한다.  
NotBlank, NotNull의 차이를 모르고 썼었는데 NotBlank가 더 강한 검사임을 배웠다.
<img width="706" alt="Image" src="https://github.com/user-attachments/assets/c86ac373-f309-4669-bdb8-a7f7693638ee" />

</div>
</details>

<details>
  <summary><b> 📃 7주차 내용</b></summary>
<div markdown="1">

    
로그인 세션 도입

</div>
</details>

<details>
  <summary><b> 📃 9주차 내용</b></summary>
<div markdown="1">

    
DB연결 도입

</div>
</details>
