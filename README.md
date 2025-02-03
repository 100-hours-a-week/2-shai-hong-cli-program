# 🏀 NBA_Draft 시스템
## Class Diagram
<img src="https://github.com/user-attachments/assets/641301f5-d3b1-47bd-bc29-d29dfe86347f" width="85%">

## 🚀 목표
주어진 10명의 NBA선수 목록에서 사용자가 원하는 선수를 픽해 드림팀을 만든다!  

<br/>

## 시스템 동작방식
- ### 선수 선택
  
  ```
  🏀 NBA 선수 드래프트 시작! (최대 연봉 200 제한)

  💰 현재 연봉: 0 / 200

  📋 현재 선택 가능한 선수 목록:
  1. Stephen Curry (능력치: 93, 연봉: 50)
  2. LeBron James (능력치: 90, 연봉: 40)
  3. Kevin Durant (능력치: 92, 연봉: 45)
  4. Luka Doncic (능력치: 90, 연봉: 40)
  5. Anthony Davis (능력치: 85, 연봉: 35)
  6. Shai Gilgeous-Alexander (능력치: 95, 연봉: 40)
  7. Bam Adebayo (능력치: 80, 연봉: 30)
  8. Jayson Tatum (능력치: 85, 연봉: 40)
  9. Paul George (능력치: 80, 연봉: 35)
  10. Kawhi Leonard (능력치: 85, 연봉: 40)

  👉 1~10 사이의 번호를 입력해 선수를 선택하세요 (5명 남음): 1
  ```

- ### 스타선수 선택시
  
  ```
  🏀 NBA 선수 드래프트 시작! (최대 연봉 200 제한)

  💰 현재 연봉: 0 / 200

  📋 현재 선택 가능한 선수 목록:
  1. Stephen Curry (능력치: 93, 연봉: 50)
  2. LeBron James (능력치: 90, 연봉: 40)
  3. Kevin Durant (능력치: 92, 연봉: 45)
  4. Luka Doncic (능력치: 90, 연봉: 40)
  5. Anthony Davis (능력치: 85, 연봉: 35)
  6. Shai Gilgeous-Alexander (능력치: 95, 연봉: 40)
  7. Bam Adebayo (능력치: 80, 연봉: 30)
  8. Jayson Tatum (능력치: 85, 연봉: 40)
  9. Paul George (능력치: 80, 연봉: 35)
  10. Kawhi Leonard (능력치: 85, 연봉: 40)

  👉 1~10 사이의 번호를 입력해 선수를 선택하세요 (5명 남음): 1
  ```
  
- ### 일반선수 선택시
  ✅ 팀에 바로추가 되고, 선택한 선수의 연봉이 현재연봉에 더해짐  
  ✅ 선택한 선수는 선택가능한 선수 목록에서 사라짐
  
  <br/>
  
  ```
  🏀 NBA 선수 드래프트 시작! (최대 연봉 200 제한)

  💰 현재 연봉: 0 / 200

  📋 현재 선택 가능한 선수 목록:
  1. Stephen Curry (능력치: 93, 연봉: 50)
  2. LeBron James (능력치: 90, 연봉: 40)
  3. Kevin Durant (능력치: 92, 연봉: 45)
  4. Luka Doncic (능력치: 90, 연봉: 40)
  5. Anthony Davis (능력치: 85, 연봉: 35)
  6. Shai Gilgeous-Alexander (능력치: 95, 연봉: 40)
  7. Bam Adebayo (능력치: 80, 연봉: 30)
  8. Jayson Tatum (능력치: 85, 연봉: 40)
  9. Paul George (능력치: 80, 연봉: 35)
  10. Kawhi Leonard (능력치: 85, 연봉: 40)

  👉 1~10 사이의 번호를 입력해 선수를 선택하세요 (5명 남음): 1
  ```

- ### 5명이 될때까지 반복..
  
- ### 5명이 선출이 완료되면 (내 팀 목록 + 총 연봉) 보여주기
  
  ```
  🏀 당신의 최종 팀:
  Luka Doncic (능력치: 90, 연봉: 40)
  Kawhi Leonard (능력치: 85, 연봉: 40)
  Paul George (능력치: 80, 연봉: 35)
  Bam Adebayo (능력치: 80, 연봉: 30)
  Kevin Durant (능력치: 92, 연봉: 45)
  
  💰 총 연봉: 190
  ```
