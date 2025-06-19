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




## 🔹 문자열

### 문자열을 문자로 변환

`[0]` 사용

- `[0]` 은 String의 인덱스 접근 문법이고, 이렇게 하면 Char 타입이 반환됨

  → Kotlin에서 "문자열"[인덱스] 하면 문자 하나(Char)를 뽑는 구조

- String.toChar( ) 는 사용 불가

  → Kotlin에서 String에는 toChar( ) 라는 함수가 없음

```kotlin
val line = "p q"
val stack = ArrayDeque<Char>()

val x = line.split(" ")[1]  // q (String 타입)
stack.addLast(x)            // ❌ (타입 불일치)

val y = line.split(" ")[1][0]  // q (Char 타입)
stack.addLast(y)               // 가능

val z = "a".toChar()  // ❌
```

<br>

### String / StringBuilder 차이

- String 은 불변 (immutable)
- StringBuilder 은 가변 (mutable)

| 기능        | String    | StringBuilder        |
| ----------- | --------- | -------------------- |
| 문자 조회   | st[0]     | sb[0]                |
| 문자열 추가 | st += "a" | sb.append("a")       |
| 문자 삽입   | ❌         | sb.insert(1, "xy")   |
| 문자 삭제   | ❌         | sb.delete(1, 3)      |
| 문자 수정   | ❌         | sb.setCharAt(1, 'x') |

<br>

### StringBuilder 에서 문자열 조작

- 예시 1. 문자 조회

  ``````kotlin
  val st = "hello"
  val sb = StringBuilder("kotlin")
  
  println(st[0])  // h
  println(sb[0])  // k
  ``````

- 예시 2. 문자열 추가

  ``````kotlin
  var st = "hello"
  val sb = StringBuilder()
  
  st += " world"
  sb.append("kot lin")
  
  println(st)  // hello world
  println(sb)  // kot lin
  ``````

- 예시 3. 문자 삽입

  ``````kotlin
  val sb = StringBuilder("hello")
  
  sb.insert(1, "xy")
  println(sb)  // hxyello
  
  sb.insert(1, 'x')
  println(sb)  // hxxyello
  ``````

- 예시 4. 문자 삭제

  ``````kotlin
  val sb = StringBuilder("kotlin")
  sb.delete(1, 3)
  println(sb)  // klin
  ``````

- 예시 5. 문자 수정

  ``````kotlin
  val sb = StringBuilder("hello")
  sb.setCharAt(0, 'H')
  println(sb)  // Hello
  ``````

