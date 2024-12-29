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
   - 테스트 툴 : JUnit5, TDD 기반 assertj 사용
- DB 테이블 (1개 사용) : GitInfo(Git Push를 위해 사용된 정보를 저장)
  
  |Column|Type|
  |------|----|
  |Id    |Long|
  |localpath|String|
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
