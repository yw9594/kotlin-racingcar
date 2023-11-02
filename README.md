# kotlin-racingcar
## Step 2
- 23.10.27 피드백 적용 방안
  - StringExpression 클래스 별도 파일 분리
  - StringCalculator 클래스 내 문자열 식 토큰화 로직 책임 분리
  - 문자열 식 내 토큰 Operator, Operand 분리 및 계산 로직 책임 분리
  - main 함수 생성 및 StringCalculator를 객체로 사용할 수 있도록 변경
## Step 3
- 23.10.29 
  - Car 클래스 구현
  - RacingcarGame 클래스 구현
  - InputView, ResultView 클래스 구현
  - RacingcarGameApplication 클래스 구현
- 23.10.31 피드백 적용 방안
  - RacingcarGameContext 및 CarMovementManager 클래스 구조 리팩토링 및 오류 수정
  - RacingcarGameContext 내 출력 기능 ResultView으로 이동
  - RacingcarGameContext 클래스 RacingcarGameManager로 이름 변경
  - View 클래스 object 선언으로 변경
  - currentDistance 함수 이름 동사로 변경 
  - RacingcarGameApplication -> RacingcarGame 명칭 변경 및 main 함수와 분리 
  - 테스트 이름 한글화 및 기능 명세 단위 분리
## Step 4
- 요구사항
  - 자동차는 이름을 가지며 5글자를 초과하지 않고 쉼표로 구분되어 입력
  - 게임 중 각 자동차 별로 이름 출력
  - 게임 완료 후 게임 우승자 출력(1명 이상 가능)
  - 리팩토링
    - 모든 함수 길이가 15라인 이하로 유지하도록 변경
    - 들여쓰기 깊이를 2미만으로 유지
- 기능 목록
  - Car 클래스
    - 자동차 이름 프로퍼티 및 검증 로직 추가
  - RacingcarGameInputView 클래스
    - 자동차 수 입력 -> 자동차 이름 입력 로직으로 변경 
    - 자동차 이름 입력 포맷 검증 로직 추가 
  - RacingcarGame 클래스
    - 자동차 진행 상황 로직 별로 메소드로 분리
    - 자동차 우승차 출력 로직 추가
  - RacingcarGameResultView 클래스
    - 자동차 이름 출력 기능 추가

    