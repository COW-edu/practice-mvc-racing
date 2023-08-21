# 구현 기능 목록

## Controller

- [ ] InputView를 사용하여 자동차 이름, 시도 횟수 입력 받고 처리
- [ ] Service와 Model을 사용하여 레이스 진행
- [ ] OutputView를 사용하여 결과 출력 처리

## Model

### Domain

#### Car

- [ ] 현재 위치 변경

### Service

#### RunRace

- [ ] 레이스를 1회 진행

#### RandomNumberGenerator

- [ ] 0~9 사이의 난수 생성

#### ResultCalculator

- [ ] 결과 계산 후 우승자 반환

## View

### InputView

- [ ] 자동차 이름 입력 받기
- [ ] 시도 횟수 입력 받기
- [ ] 입력 값에 따라 예외 처리

### OutputView

- [ ] 실행 결과 출력
- [ ] 최종 우승자 출력 (단독, 공동 우승에 따라 다르게 출력)
