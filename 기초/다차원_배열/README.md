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




## 🔹 다차원 배열 생성

### 2차원 고정형 배열

`Array<IntArray>`

- 정수형 2차원 배열
- 크기 고정, 빠른 속도
- Int 타입만 사용 가능 (String 등 불가)
- 초기값 0으로 자동 설정
- 값 변경 가능

```kotlin
// 2행 2열의 2차원 배열
val arr = Array(2) { IntArray(2) }
println(arr[0][1])  // 0

// 3행 4열의 2차원 배열
val arr2 = Array(3) { IntArray(4) { 1 } }
println(arr[1][2])  // 1
```

<br>

### 2차원 가변형 배열

`MutableList<MutableList<T>>`

- 가변 크기의 2차원 리스트
- 크기 변경 가능
- 타입 제한 없음, Int, String, Boolean 다 가능
- 초기값 설정 필요

- 값 변경 가능

```kotlin
val li = MutableList(2) { MutableList(2) { 0 } }

li[0][1] = 7
li[0].add(5)
li.add(MutableList(3) { 1 })

for (row in li) {
    println(row.joinToString(" "))  // 0 7 5
}                                   // 0 0
                                    // 1 1 1
```

