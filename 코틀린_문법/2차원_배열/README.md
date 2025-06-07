## 🔹 2차원 배열

### 고정형 배열

`Array<IntArray>`

- 정수형 2차원 배열
- 크기 고정, 빠른 속도
- 값 변경 가능
- 초기값 0으로 자동 설정

```kotlin
val arr = Array(2) { IntArray(2) }
println(arr[0][1])  // 0

val arr2 = Array(3) { IntArray(4) { 1 } }
println(arr[1][2])  // 1
```

<br>

### 가변형 배열

`MutableList<MutableList<T>>`

- 가변 크기의 2차원 리스트
- 타입 제한 없음, Int, String, Boolean 다 가능

- 값 변경 가능

```kotlin
val li = MutableList(3) { MutableList(3) { 0 } }
```

