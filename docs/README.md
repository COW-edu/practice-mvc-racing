## FrontController
- [x] Handler init, Mapping
- [x] Adapter init, Mapping
- [x] Request: 요청명, 요청 파라미터 전달
- [x] ModelView: 모델명, 모델 객체 전달 

### Adapter
- [x] supports: 찾은 핸들러가 찾고 있는 핸들러의 인스턴스인지
- [x] handle: 받은 요청과 핸들러로 핸들러 실

## Car
### controller
- [x] CarJoinController: 차량 등록
- [x] CarSetPositionController: 차량 전진
- [x] CarsGetController: 차량 결과 확인
### entity
- [x] Car: 이름, 위치 저장, 조건에 맞으면 전진
### model
- [x] CarRepository: 참여 차량 저장, 조회, 위치 저장
### service
- [x] CarService: 초기 차량 문자열 변환, 최소 차량 수 확인 및 참여 차량 저장, 조회, 위치 저장
 
## Game
### controller
- [x] GameSetRoundController: 라운드 수 저장
- [x] GameGetRoundController: 라운드 수 조회
- [x] GameInsertWinnerController: 우승자 저장
- [x] GameGetWinnerSheetController: 우승자 정보 조회
### entity
- [x] Winner: 우승 차량 이름
### model
- [x] GameRepository: 라운드 수 저장, 조회 및 우승자 저장 및 조회
### service
- [x] GameService: 우승자 선정 및 라운드 수 저장, 조회 및 우승자 저장 및 조회
## Manager
- [x] GameManager: 게임 초기화, 라운드 조회 및 실행, 참여자 조회, 우승자 등록 및 조회
## etc
- [x] GameConfig: IoC
- [x] GameRun: 게임 쓰레드 Run
- [x] RacingStadium: 게임 진행, 출전 차량, 라운드 수 초기화, 게임 결과 반환 (View)
