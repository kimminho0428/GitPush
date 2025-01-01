# Git Push 프로젝트
- 해당 프로젝트 생성 목적
   - COBOL TO Java로 전환된 소스를 Github Repository로 Push하는 Git Push 기능을 설명하기 위한 모의 프로젝트이다.
   - 따라서 복잡한 DB구조를 가지지 않으며(1개 테이블 사용) UI적인면을 크게 고려하기 보단 기능적인 측면을 설명하기 위해 제작했다.
- 개발 환경
   - IDE Tools : IntelliJ Ultimate
   - 개발 플랫폼 : Spring Boot 3.4, Java 17, Spring Data JPA
   - Front-End : Thymeleaf Engine
   - Database : Postgre SQL, H2(내부 테스트용)
   - 외부 라이브러리 : JGit(Eclipse 기반 Git API)
   - 테스트 툴 : JUnit5 및 AssertJ를 활용한 TDD 기반 테스트
 
     
- DB 테이블 (1개 사용) : GitInfo(Git Push를 위해 사용된 정보를 저장)
  
  |Column|Type|
  |------|----|
  |Id    |Long|
  |localPath|String|
  |url|String|
  |username|String|
  |token|String|
  |message|String|
  |createdDateTime|LocalDateTime|

- 컬럼 설명
   - Id : DB 저장 시 기본키 역할을 하는 컬럼, DB에 데이터가 저장 시 1씩 증가
   - localPath : Github Repository로 Push를 수행할 로컬 디렉터리를 저장하는 컬럼
   - url : Github Repository의 Url을 저장하는 컬럼
   - username : Github 유저명을 저장하는 컬럼
   - token : Github Token을 암호화하여 저장하는 컬럼
   - message : Git Push 시 Commit Message를 저장하는 컬럼
   - createdDateTime : Git Push를 수행한 시간을 저장하는 컬럼

- 주요 클래스1(Service 및 도메인)
   - GitInfo : GitInfo 테이블의 매핑되는 엔티티 클래스, 컬럼역할을 하는 필드들이 존재
   - BaseEntity : 추상 클래스로 GitPush 시간을 자동으로 저장하기 위한 역할 수행
   - GitService : 프로젝트에서 사용되는 모든 서비스의 인터페이스
   - GitServiceImpl : 실제 기능을 구현하기 위한 서비스들이 존재
   - AESUtil : Github 토큰의 암호화, 복호화를 구현하기 위한 주요 설정 및 메서드가 존재하는 클래스
   - GitInfoDto : Spring Data JPA를 통해 조회한 엔티티 클래스를 화면으로 전달하기 위해 사용하는 DTO 클래스
   - PushList : Spring Data JPA에서 반환되는 List 컬렉션 형태의 값을 화면으로 전달하기 위해 사용하는 DTO 클래스
   - GitInfoRepository : Spring Data JPA 사용 시 필요한 Repository 인터페이스
 
- 주요 클래스2(Controller)
   - HomeController : 서버 기동 시 웹 페이지에서 가장 먼저 보여지는 화면
   - PushController : 프로젝트에서 사용하는 Gitpush, Gitpush 이력 조회 등 대부분의 서비스를 수행하기 위한 Controller
   - PushForm : GitPush를 위해 사용한 Form에서 입력받은 내용들을 Model로 Add하기위해 사용한 클래스
   - SearchForm : GitPush 정보를 조회하기 위해 입력한 Username을 Model로 Add하기위해 사용한 클래스
   - UpdatePushForm : GitRepository 변경을 위해 조회한 데이터를 Model로 Add하기 위해 사용한 클래스
 
- 테스트 코드
   - PushControllerTest : @MockMvc를 사용하여 Controller에서 수행되는 Post,Get Method 등을 테스트
   - GitServiceImplTest : @SpringBootTest로 기능을 구현한 서비스들을 테스트, 테스트 시에는 @ActiveProfiles를 사용하여 H2 데이터베이스를 사용하여 실제 DB에 반영되지 않도록 테스트
