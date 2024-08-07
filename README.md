# 백엔드 서버

* 백엔드와 프론트엔드

프론트엔드는 지금 보고 있는 웹사이트 내 '이 화면'처럼 사용자가 볼 수 있는 화면을, 
그리고 백엔드는 사용자가 볼 수 없는 환경을 구성하는 영역을 뜻한다.
 

* 백엔드 구성요소

서버 : 서버는 특별한 목적을 위해 프로그래밍된 컴퓨터이다. 웹서버, 메일 서버, 게임 서버 등 다양한 종류의 서버가 있지만, 그 기본적인 역할은 클라이언트(사용자의 컴퓨터나 모바일 기기)의 요청에 응답하는 것이다.

데이터베이스 : 데이터베이스는 정보를 저장, 검색, 삭제, 업데이트하는 시스템이다. 이것은 백엔드의 중심적인 부분이며, 사용자 정보, 제품 정보, 트랜잭션 정보 등 다양한 데이터를 저장하고 관리한다.

응용 프로그램(어플리케이션) : 어플리케이션은 서버와 데이터베이스 사이에서 중추적인 역할을 한다. 사용자의 요청을 받아 적절한 작업을 수행하고, 그 결과를 사용자에게 반환한다. 어플리케이션은 프로그래밍 언어로 작성되며, 여기에는 Java, Python, PHP, Ruby 등이 사용된다

이 세 가지 구성 요소가 서로 상호 작용하면서 백엔드 시스템이 완성된다. 사용자가 웹사이트나 앱에서 어떤 동작을 하면, 그 요청은 서버로 전달되어 어플리케이션에 의해 처리된다. 필요에 따라 어플리케이션은 데이터베이스에 접근하여 정보를 읽어오거나 업데이트하며, 그 결과를 다시 사용자에게 제공한다.

------

 * 클라이언트와 서버가 데이터를 주고받는 방식 개념

1. MVC 패턴
   
  ![다운로드](https://github.com/namgisung/webserver-Restful-API/assets/109130108/ade48c69-cc0f-46d7-bab2-b8d6d2137cab)
  
  Model - View - Controller 의 약어

  이 패턴은 프로그램 로직을 세 가지 주요 구성 요소인 모델(Model), 뷰(View), 컨트롤러(Controller)로 나누어 관리한다.

  팀 작업에서도 협업이 용이하며, 애플리케이션의 유지보수와 확장에 유리하다. 
  MVC 패턴을 이해하고 적용하는 것은 현대 웹 애플리케이션 개발에서 매우 중요한 기술 중 하나이다.
 
  (1) Model
  
  애플리케이션의 데이터와 비즈니스 로직을 관리한다. 
  데이터베이스와의 상호작용을 포함하여 데이터를 처리하고 그 결과를 컨트롤러에 전달한다.

 

  (2) View
  
  사용자에게 정보를 표시하는 방법을 정의한다. 
  HTML, CSS 등을 사용하여 사용자 인터페이스를 구성하며, 사용자의 입력을 받아 컨트롤러에 전달할 수도 있다.


  (3) Controller
  
  사용자의 입력을 받아 모델과 뷰를 업데이트한다. 
  사용자의 요청을 해석하고, 모델을 호출하여 데이터를 처리한 후, 그 결과를 뷰에 반영하여 사용자에게 피드백을 제공한다.

 * MVC 패턴 장점:
  
    * 분리된 관심사: MVC 패턴은 애플리케이션의 데이터 처리(모델), 사용자 인터페이스(뷰), 그리고 입력 처리(컨트롤러)를 분리하여 각각 독립적으로 개발할 수 있게 한다. 이로 인해 개발과 유지보수가 용이해진다.
    * 재사용성 및 확장성: 각 구성 요소는 독립적으로 작동하기 때문에, 코드의 재사용성과 확장성이 높아진다.
    * 다중 뷰 지원: 하나의 모델에 대해 여러 뷰를 가질 수 있어, 다양한 사용자 인터페이스를 쉽게 추가하거나 변경할 수 있다.

  
-----

2. Restful API

   ![다운로드44](https://github.com/namgisung/webserver-Restful-API/assets/109130108/12ccbf87-6414-4e74-b96e-516ee6deafb1)

  RESTful API는 현대 웹 서비스와 애플리케이션에서 데이터를 공유하고 통신하는 데 필수적인 기술입니다. 그것은 유연성, 확장성, 다양한 플랫폼과 언어의 지원을 제공하며, 개발자들이 효율적으로 시스템을 구축하고 관리할 수 있게 합니다. 
  
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


  ※ API (Application Programming Interface)
  응용프로그램에서 사용할 수 있도록 운영 체제가 프로그래밍 언어가 제공하는 기능을 제어할 수 있게 만든 인터페이스이다.
  데이터와 기능의 집합을 제공하여 컴퓨터 프로그램 간 상호작용을 촉진하며, 서로 정보 교환을 가능하도록 하는 것이다.


  * RESTful API의 핵심 원칙

   * Uniform Interface(통일된 인터페이스): API의 인터페이스는 일관되어야 하며, 리소스에 대한 식별, 자기 서술적 메시지, 하이퍼미디어를 통한 애플리케이션 상태의 엔진으로 구성됩니다.
   
   * Client-Server(클라이언트-서버 구조): 클라이언트와 서버는 서로 독립적으로 작동해야 하며, 이를 통해 각각의 부분을 독립적으로 개선할 수 있습니다.
   * Layered System(계층화된 시스템): 클라이언트는 종단 서버와 직접 통신할 필요가 없으며, 중간 서버를 통해 요청을 전달할 수 있습니다.
 

  * 장점
   
   * 유연성과 확장성: RESTful API는 다양한 데이터 포맷(JSON, XML 등)을 지원하며, 쉽게 확장할 수 있습니다.
  
   * 다양한 플랫폼과 언어 지원: HTTP 프로토콜을 기반으로 하기 때문에, 다양한 플랫폼과 프로그래밍 언어에서 사용할 수 있습니다.
  
   * 간결함과 효율성: RESTful API는 간결하고 이해하기 쉬운 구조를 가지고 있으며, 네트워크 트래픽을 최소화하여 효율적인 통신을 가능하게 합니다.

  
-----

 * 코드 설명

  이 코드는 Restful API형식으로 작성되었습니다.

  먼저, 유저의 아이디, 이메일, 이름을 등록한다.
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

-------

  * 수정
 
 유저의 ID를 링크에 그대로 작성하는 것에서 보안성이 취약하여 이를 암호키를 사용한 토큰으로 변경했다.
 
 유저 등록
 ![Insomnia 2024-07-21 오후 6_31_37](https://github.com/user-attachments/assets/e932af28-ee92-47c8-88df-d9e25a122fdd)

 유저를 조회할때
 ![Insomnia 2024-07-21 오후 6_31_28](https://github.com/user-attachments/assets/7de1ff28-4271-4384-8903-1bed1930f15a)

 유저 삭제할때
 ![Insomnia 2024-07-21 오후 6_31_58](https://github.com/user-attachments/assets/cfec973f-95c2-45d5-837b-ca118c4e7727)

 또한 대입정보포털에서 몇분 지나면 특정한 행동을 할수 없는 것과 같은 기능을 추가
 ![Insomnia 2024-07-21 오후 6_33_38](https://github.com/user-attachments/assets/b949e761-0e81-446f-bdb0-f62ad6776a75)

-------

 
  * 느낀점:
    백엔드 모식도를 보고 백엔드 개발에 관심이 생겨 처음으로 웹서버를 만들어 보았다. 막상 어려울것 같았지만 해보니까 재미있고 백엔드 모식도애서 데이터나 정보를 서버와 데이터베이스 그리고 클라이언트에게 서로 주고 받는 것에 흥미를 느꼈고 그런 것을 생각하면서 만들었더니 재밌었다. 만들면서 백엔드가 c언어의 포인터와 비슷하다고 느꼈다. c언어의 포인터는 변수를 선언하면 그 변수는 그 자신의 주솟값을 갖고 주솟값은 주솟값이 저장되는곳에 저장되고 변수에 들어있는 데이터는 대이터가 저장되는 곳에 저장된다. 주솟값으로 그걸로 데이터에 접근하여 주솟값에 맞는 데이터를 호출하고 주솟값에 있는 변수를 수정할 수 있다. 그러한 점에서 비슷하다고 느꼈다. 만들면서 "이렇게 하면 어떻게 될까"라는 호기심과 흥미가 생겨 나중에 기능이 더 많은 웹서버를 만들고 싶고 찾아보다가 WebSocket을 사용한 채팅형 RESTful API가 있어 나증에 한번 만들어 보려고 한다.
  
