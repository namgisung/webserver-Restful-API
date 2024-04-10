# 백엔드 서버

* 백엔드와 프론트엔드

프론트엔드는 지금 보고 있는 웹사이트 내 '이 화면'처럼 사용자가 볼 수 있는 화면을, 
그리고 백엔드는 사용자가 볼 수 없는 환경을 구성하는 영역을 뜻한다.

* 백엔드 서버

평소 우리는 인터넷을 통해 정보를 얻거나 웹사이트 혹은 앱에서 작업을 많이 수행합니다. 
그때 우리가 보는 화면, 즉 사용자 인터페이스를 가능하게 하는 것이 바로 ‘백엔드 서버’입니다. 

* 백엔드 구성요소

서버 : 서버는 특별한 목적을 위해 프로그래밍된 컴퓨터입니다. 웹서버, 메일 서버, 게임 서버 등 다양한 종류의 서버가 있지만, 그 기본적인 역할은 클라이언트(사용자의 컴퓨터나 모바일 기기)의 요청에 응답하는 것입니다.

데이터베이스 : 데이터베이스는 정보를 저장, 검색, 삭제, 업데이트하는 시스템입니다. 이것은 백엔드의 중심적인 부분이며, 사용자 정보, 제품 정보, 트랜잭션 정보 등 다양한 데이터를 저장하고 관리합니다.

응용 프로그램(어플리케이션) : 어플리케이션은 서버와 데이터베이스 사이에서 중추적인 역할을 합니다. 사용자의 요청을 받아 적절한 작업을 수행하고, 그 결과를 사용자에게 반환합니다. 어플리케이션은 프로그래밍 언어로 작성되며, 여기에는 Java, Python, PHP, Ruby 등이 사용됩니다

이 세 가지 구성 요소가 서로 상호 작용하면서 백엔드 시스템이 완성됩니다. 사용자가 웹사이트나 앱에서 어떤 동작을 하면, 그 요청은 서버로 전달되어 어플리케이션에 의해 처리됩니다. 필요에 따라 어플리케이션은 데이터베이스에 접근하여 정보를 읽어오거나 업데이트하며, 그 결과를 다시 사용자에게 제공합니다.

 * 클라이언트와 서버가 데이터를 주고받는 방식 개념

1. MVC 패턴
  ![다운로드](https://github.com/namgisung/webserver-Restful-API/assets/109130108/ade48c69-cc0f-46d7-bab2-b8d6d2137cab)
  
  Model - View - Controller 의 약어
 
  (1) Model
  
  데이터 처리 영역.

  데이터 구조를 표현하는 Entity와 Dto, (초기에는 Entity와 Dto를 결합한 Vo(Value Object) 형태로 사용함.)

  DB와 연동하여 데이터 저장 및 검색, 수정, 삭제하는  DAO (Data Access Object)로 구성됨.

  실무에서는 Controller의 비중을 줄여주기 위해 사용자에게 제공할 비즈니스 로직을 기능으로 구현한 Service 단도 사용됨.

  Model은 View와 Controller에 의존하지 않아야 함.

 

  (2) View
  
  사용자에게 보이는 화면. 흔히 UI(User Interface) 라고 부름.

  Controller로부터 전달된 데이터의 출력과 HTML, CSS, JS 등을 통해 화면의 디자인을 처리함.

  모델, 컨트롤러와의 종속성 없이 구현해야 함.


  (3) Controller
  
  모든 사용자 요청을 컨트롤러에서 우선적으로 받아들여 처리함.

  들어온 요청을 특정 뷰를 지정하여 보내야 하기에 뷰와 종속관계가 발생할 수 밖에 없는 구조임.

  따라서 프로그램의 규모가 커질수록 컨트롤러의 역할이 커져 복잡해지고 관리가 어려워짐.

  이러한 부하를 줄여주고 유지보수를 보다 용이하게 하기 위해 실무에서 Service 단이 많이 사용됨.

-----

2. JPA

  ![다운로드109](https://github.com/namgisung/webserver-Restful-API/assets/109130108/f96c46ba-492d-48ed-81d7-0b2a507b1fc6)

  JPA는 Java Persistence API의 약자로, 자바 애플리케이션에서 관계형 데이터베이스를 사용하는 방법을 정의한 APId이다. 
  JPA는 자바 객체와 데이터베이스 테이블 간의 매핑을 관리하며, 이를 통해 개발자는 데이터베이스 작업을 더 쉽고 직관적으로 
  수행할 수 있습니다.

  JPA는 아래의 세 가지 영역으로 구성된다.

  * javax.persistance 패키지로 정의 된 API 그 자체
  * 자바 퍼시스턴스 쿼리 언어 (JPQL)
  * 객체/관계 메타데이터

-----

3. Restful API
   ![다운로드44](https://github.com/namgisung/webserver-Restful-API/assets/109130108/12ccbf87-6414-4e74-b96e-516ee6deafb1)

   (1) REST
  REST (Representational State Transfer) 란,

  HTTP URI 를 통해 자원(Resource)을 명시하고,

  HTTP Method(POST, GET, PUT, DELETE) 를 통해 해당 자원에 대한

  CRUD Operation을 적용하는 것을 의미한다.

  ※ CRUD Operation
  - Create: 생성 (POST)
  - Read: 조회 (GET)
  - Update: 수정 (PUT)
  - Delete: 삭제 (DELETE)
  - HEAD: header 정보 조회 (HEAD)
  
  (2) REST API
  REST API는 REST 기반으로 서비스 API를 구현한 것으로,

  두 개의 컴퓨터가 인터넷을 통해 정보를 안전하게 교환하기 위해 사용하는 인터페이스이다.

  OpenAPI는 대부분 REST API를 제공한다.

  (백과 프론트에서 모두 구현 가능하며, 프론트에서 JS로 구현하는 방식이 훨씬 간편하다,,)

  ※ API (Application Programming Interface)
  응용프로그램에서 사용할 수 있도록 운영 체제가 프로그래밍 언어가 제공하는 기능을 제어할 수 있게 만든 인터페이스이다.
  데이터와 기능의 집합을 제공하여 컴퓨터 프로그램 간 상호작용을 촉진하며, 서로 정보 교환을 가능하도록 하는 것이다.

  REST API 사용 이유
  REST는 복잡한 네트워크에서 통신을 관리하기 위한 지침으로 만들어졌다.

  REST 기반 아키텍처를 사용하면, 대규며의 고성능 통신을 안정적으로 지원할 수 있다.

  또한 쉽게 구현하고 수정할 수 있다.

 

  * 장점
  1. 쉬운 사용성

  REST API의 메시지를 읽는 것만으로 메시지의 의도를 확실히 파악할 수 있다.

  또한 HTTP의 인프라를 그대로 사용하기 때문에 API 사용을 위한 별도의 인프라 구축이 필요하지 않다.

 

  2. 클라이언트와 서버의 완전한 분리

  클라이언트와 서버는 REST API를 이용해 정보를 주고 받는다. 

  따라서 서버는 클라이언트의 히스토리, 문맥을 유지할 필요가 없게 된다. (stateless: 상태 유지 안함)

  => session 보다 token으로 상태 유지

  즉, 각자의 역할이 명확하게 나뉘어져 있어 플랫폼의 독립성이 확장되고 개발자의 업무량이 감소하는 효과를 가져온다.

  HTTP 프로토콜 서비스라는 요구조건만 충족된다면,

  더 다양한 플랫폼에서 원하는 서비스를 쉽고 빠르게 개발하고 배포할 수 있다.

 

  3. 특정한 데이터의 명확한 표현

  REST API는 헤더 부분에 URI 처리 메서드를 명시한다.

  이는 특정 메서드의 세부 표현을 다양한 언어 (JSON, xml)로 작성할 수 있는 장점이 있고,

  헤더 표현의 가독성이 향상되어 메시지의 의도를 쉽게 파악할 수 있다.

 

  * 단점
  HTTP 메서드를 사용해 URI를 표현하기 때문에 다양한 인프라에서 사용이 가능하지만,

  메서드 형태가 제한적이다.

  또한 표준이 존재하지 않다.

-----

 * 코드 설명

  이 코드는 Restful API형식으로 작성되었습니다.

  먼저, 유저의 아이디, 이메일, 이름을 등록한다.ㅣ
  ![Insomnia 2024-04-10 오후 10_36_22](https://github.com/namgisung/webserver-Restful-API/assets/109130108/0008bb03-3837-4f03-a012-202a9c0a4389)

  그런다음, 조회를 해보면 이렇게 나온다.
  ![Insomnia 2024-04-10 오후 10_36_39](https://github.com/namgisung/webserver-Restful-API/assets/109130108/16951a8f-0787-4998-a425-c8c2c38f0f5a)

  다른 유저의 정보를 등록하고 조회하면 이렇게 나온다.
  ![Insomnia 2024-04-10 오후 10_37_50](https://github.com/namgisung/webserver-Restful-API/assets/109130108/1a6fd2c7-6802-46bf-9def-a6000338863f)

  전부 조회를 하면
  ![Insomnia 2024-04-10 오후 10_37_58](https://github.com/namgisung/webserver-Restful-API/assets/109130108/68093ad2-31bb-4430-a1ba-7f9cdf3f75b7)

  만약 두번째 유저의 정보를 수정하고 조회하면
  ![Insomnia 2024-04-10 오후 10_39_10](https://github.com/namgisung/webserver-Restful-API/assets/109130108/df5d72b3-9856-44eb-8687-23716abaa489)

  ![Insomnia 2024-04-10 오후 10_39_19](https://github.com/namgisung/webserver-Restful-API/assets/109130108/9558c86a-33a4-4720-83e2-c541d2b450d9)

  그리고 두번째 유저의 정보를 삭제하면
  ![Insomnia 2024-04-10 오후 10_39_43](https://github.com/namgisung/webserver-Restful-API/assets/109130108/9f98db5c-0461-4544-bfa1-5087e70e6ee8)
  
  ![Insomnia 2024-04-10 오후 10_40_00](https://github.com/namgisung/webserver-Restful-API/assets/109130108/c39b51e5-6949-4ae1-aeb8-34d838271a02)

  나머지도 삭제하면
  ![Insomnia 2024-04-10 오후 10_40_20](https://github.com/namgisung/webserver-Restful-API/assets/109130108/7fb99900-5d64-4078-b638-6c4d2aaed27d)
  
  ![Insomnia 2024-04-10 오후 10_40_28](https://github.com/namgisung/webserver-Restful-API/assets/109130108/80df6004-8860-4ff9-a2ba-c5c85f149637)

  

  

  

  
  
  
