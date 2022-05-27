
# 📋 Intro
AI기반 음식 분석 애플리케이션, 플랜밀

<p align="center">
  <img src = "https://user-images.githubusercontent.com/56522878/170629000-4a237356-9c32-414a-bf45-af9f039a36d7.jpg" width="250px">

</p>

## Our Team
어니스트(Honest)

* 팀장 박주희([@juhee77](https://github.com/juhee77 "github link"))

* 팀원 변정원([@Byungul](https://github.com/Byungul "github link"))

* 팀원 이지수([@dlwltn0350](https://github.com/dlwltn0350 "github link"))

* 팀원 박한별([@happyfox11](https://github.com/happyfox11 "github link"))

* 팀원 박소영([@kdmsws](https://github.com/kdmsws "github link")) <br><br>

## 🗂 Content

1. [🔈 프로젝트 소개]
   <br>
   - [📑 개요 및 목표]
   - [📑 개발 환경]
   - [📑 기술 스택]
   <br><br>
2. [🔈 구현 결과]
   <br><br>

---

## 🥜 프로젝트 소개

### 🔔 개요 및 목표

#### 🧿 개요

    생활이 바쁘고 코로나19 사태로 인해 배달 음식 주문이 증가함
    영양분 불균형 섭취, 만성질환 유발 등으로 균형있는 영양소 섭취가 필요함

#### 🏃‍ 목표
    ✔ AI 머신러닝 기술을 활용해 사진으로 식단 기록
    ✔ 사용자 영양 균형에 도움
    ✔ 섭취 영양소를 바탕으로 음식 추천 기능 제공
    ✔ 기존 식단 애플리케이션 개선

### 🔨 개발 환경

- OS : Windows 10

- Server : Naver Cloud Platform

  - Ubuntu Server 18.04 (64-bit)

- Backend

  - Java : Java 1.11.0
  - Framework : SpringBoot 2.6.4
  - ORM : JPA(Hibernate)
  - Tomcat : Tomcat 9 (Ubuntu)
  - IDE : Intellij 2021.3.3
  - Dependency tool : gradle-7.4.1
  - Database : MySQL Ver 14.14 Distrib 5.7.37 (Ubuntu)

- Frontend 

    - Java : Java 1.15.0
    - Dependency tool : gradle-7.0.4
    - IDE : Android Studio

- AI

    - Python : 
    - 
  <br><br>



## 주요 기능 설명
#### 1. 로그인 후 개인정보(나이, 신장, 체중, 활동량) 및 목표 칼로리를 입력하면 그 바탕으로 기초대사량에 알맞은     탄수화물, 단백질, 지방 비율이 표시된다.
#### 2. 자신의 식단을 촬영하여 식단 관리를 할 수 있다. 카메라로 식단 촬영을 마치면 학습시킨 모델이 사진을 분석하여 음식을 판별한다. 판멸된 음식은 (-) 버튼으로 삭제할 수 있고 (+) 버튼을 이용하면 수기로 음식 추가가 가능하다.     AI가 음식을 잘못 인식한 경우 수정하기 버튼을 이용하여 수정할 수 있다. 상세보기 버튼(>)을 누르면 음식별 세부 영양소 보기 액티비티로 이동된다. 
#### 3. 사용자는 자신에게 부족한 영양소가 무엇인지 메인 화면에서 그래프를 통해 파악할 수 있으며 이를 채울 수 있는 식단을 추천받을 수 있다. 식단 추천받으러 가기 버튼을 클릭하면 식단 및 레시피 추천 액티비티가 실행된다.    식단 및 레시피 추천 액티비티에서 자신에게 부족한 영양소를 채울 수 있는 식단이 랜덤으로 3개가 추천되며 해당 음식을 직접 만들어 먹을 수 있게 레시피를 알려주거나 밀키트를 주문할 수 있는 화면으로 이동하게 된다.
#### 4. 사용자는 한 주간 자신이 저장한 식단을 기반으로 생성된 주간 통계를 푸시 알림을 통해 받을 수 있다.    기기 상단바에서 알림을 누르면 알림 액티비티가 실행되고 알림을 클릭하면 주간 보고서 액티비티가 실행된다.     주간 보고서에서 일일 누적 칼로리 정보 및 평균 일일 섭취 칼로리 정보, 목표 칼로리와의 비교 정보, 사용자가 일주일간 섭취한 식단의 탄수화물, 단백질, 지방의 양을 계산하고 목표 칼로리와 건강한 식단을 위해 섭취해야 하는 평균적인 3대 영양소의 양을 그래프로 표시하며 각 영양소에 대한 평가를 확인할 수 있다.      또한, 일주일간 섭취한 모든 식단의 사진과 칼로리가 요일별로 정리되어 표시된다.    마지막으로 사용자는 일주일간 활동 칼로리 및 지난 주 혹은 목표 활동량과 비교 정보 등 모든 정보를 종합한 총평을 확인할 수 있다. 


#### 5. 사용자는 과거 자신의 식단에 대한 통계를 확인할 수 있다. 메인 화면에서 통계 보기 버튼을 클릭하면 월별 캘린더가 표시된다.     날짜를 선택하면 하단 버튼에 해당 날짜가 표시되며 확인하러 가기 버튼을 누르면 과거 특정일에 대한 칼로리, 식단, 영양소 정보를 보여주는 액티비티가 실행된다. 
