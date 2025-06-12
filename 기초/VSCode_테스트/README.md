<div align="center">
  <p>
    <img src="../README.assets/kotlin-hero.png">
  </p>
  <br>
  <h2>기초</h2>
  <p>코딩테스트 관련 내용 정리</p>
  <br>
  <br>
</div>




## 🔹 Visual Studio Code 내에서 Kotlin 파일 테스트

### 1. 입력 파일 만들기

예시 : input.txt

```
3 23 85 34 17 74 25 52 65
10 7 39 42 88 52 14 72 63
87 42 18 78 53 45 18 84 53
34 28 64 85 12 16 75 36 55
21 77 45 35 28 75 90 76 1
25 87 65 15 28 11 37 28 74
65 27 75 41 7 89 78 64 39
47 47 70 45 23 65 3 41 44
87 13 82 38 31 12 29 29 80
```

<br>

### 2. Kotlin 코드에서 입력 받기

예시 : 2566_최댓값.kt

```kotlin
fun main() {
    val arr = Array(9) {
        readLine()!!.split(" ").map { it.toInt() }
    }
    ...
}
```

👉 `readLine()` 은 입력을 1줄씩 읽는다

👉 `< input.txt` 방식으로 실행하면, input.txt 파일 내용이 순서대로 readLine( ) 에 들어간다

👉 따라서 input.txt 에 9줄이 있어야 `Array(9)` 만큼 정상 작동한다

<br>

### 3. 문제 상황

``````
tempCodeRunnerFile.jar에 기본 Manifest 속성이 없습니다.
``````

👉 이 에러는 `.jar` 파일 내부에 실행 진입점(Main 클래스 경로)이 명시되지 않았을 때 발생한다

👉 Visual Studio Code 우측상단의 ▶ 버튼은 실행을 위해 명확한 `main()` 엔트리 정보를 요구하므로, 수동 실행이 필요하다

<br>

### 4. 해결 방법

터미널에서 아래 두 줄 순서대로 실행

``````bash
kotlinc 2566_최댓값.kt -include-runtime -d test.jar
``````

👉 `2566_최댓값.kt` : fun main( ) 이 정의된 파일 이름이어야 하며, 경로 상에 있어야함

👉 `-include-runtime` : Kotlin 표준 라이브러리를 `.jar` 에 포함시켜 독립 실행 가능하게함

👉 `-d test.jar` : 결과 파일명을 `test.jar` 로 설정

👉 컴파일된 `.jar` 는 현재 폴더에 생성됨

<br>

파일에서 자동 입력하게 하기

``````bash
java -jar test.jar < input.txt
``````

👉 `< input.txt` : 해당 파일을 입력으로 전달함

👉 `readLine()` 은 input.text 의 줄을 하나씩 읽게됨

👉 터미널에 정답 출력이 나타남
