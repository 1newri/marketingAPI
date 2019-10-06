## 개발 프레임워크
#### SpringBoot 기반, H2 in-memory 방식 데이터베이스 사용.

## 문제해결 방법
 1. SpringBoot로 기반으로 서비스를 구축하였으며 원활한 테스트 환경을 위해 H2 Database와
    Swagger API 문서자동화 툴을 사용하여 Rest api를 만들었다.
 2. 데이터는 테이블에 insert되어있음을 가정하기 위하여 서비스 구동시, 
    table 생성과 data insert data.sql 파일을 통해 처리하였다.
 3. Jpa 연동 및 mybatis를 사용하여 서비스에서 요구하는 데이터를 추출하였다.

## 빌드 및 실행방법

 1. Relase 된 jar파일을 다운로드한다.
 2. cmd를 열어 다운로드된 위치로 이동하여 아래 명령어를 입력하여 서비스를 실행한다.
   ```shell
   java -jar [다운로드된 jar파일명]
   ex) java -jar marketingAPI-0.0.1-SNAPSHOT.jar
   ```
 3. http://localhost:7777/swagger-ui.html url로 접속한다.
 4. 호출된 화면에서 Branch Marketing API Documnetaion 를 클릭하면 개의 api 호출 서비스가 나타난다.
 5. /api/1 서비스를 클릭하고 Try it out! 버튼을 클릭하면 해당 서비스가 호출되며 결과값을 확인할 수 있다.
 6. /api/2 서비스를 클릭하고 Try it out! 버튼을 클릭하면 해당 서비스가 호출되며 결과값을 확인할 수 있다.
 7. /api/3 서비스를 클릭하고 Try it out! 버튼을 클릭하면 해당 서비스가 호출되며 결과값을 확인할 수 있다.
 8. /api/4/{brName} 서비스를 클릭하고 parameter 값에 '판교점'(지점명)을 입력한 후 Try it out! 버튼을 클릭한다.
    해당 서비스가 호출되며 리턴되는 결과값을 확인 할 수 있다.
