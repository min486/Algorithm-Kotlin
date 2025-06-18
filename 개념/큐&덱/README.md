## 🔷 큐 & 덱

### ☁ 큐 (Queue)

- 큐는 한쪽 끝에서 데이터를 넣고, 반대쪽 끝에서만 데이터를 꺼낼 수 있는 자료구조
- 가장 먼저 들어온 데이터가 가장 먼저 나가기 때문에 FIFO (First-In, First-Out, 선입선출) 방식이다
- Kotlin 에서 큐를 구현할 수 있는 가장 효율적인 방식은 ArrayDeque 을 사용하는 것이다

<br>

### ☁ 큐 예시

`````` kotlin
val q = ArrayDeque<Int>()

q.addLast(1)  // 뒤에 삽입 (enqueue)
q.addLast(2)
val hi = q.removeFirst()  // 앞에서 제거 (dequeue)

println(hi)         // 1
println(q.first())  // 2 (현재 맨 앞 요소)
``````

<br>

### ☁ ArrayDeque 추천 이유

- ArrayDeque 은 양쪽에서의 삽입/삭제가 모두 O(1) 이다

- 양방향 삽입/삭제가 많거나, 큐처럼 사용하더라도 맨 앞 요소를 자주 제거하는 경우, ArrayDeque 가 효율적이다

- 큐를 MutableList 로 구현하는 경우

  - add( ) 는 O(1) 이지만,

    removeAt(0) 은 내부적으로 나머지 모든 요소를 한 칸씩 앞으로 이동시켜야 해서 O(n) 이다

  - 데이터가 많거나 시간 제한이 빡빡한 문제는 사용 지양

<br>

### ☁ 덱 (Deque)

- 덱은 양쪽 끝에서 삽입과 삭제가 모두 가능한 자료구조
- Kotlin 에서 ArrayDeque 을 사용하면 덱을 효율적으로 구현할 수 있다

<br>

### ☁ 덱 예시

`````` kotlin
val q = ArrayDeque<Int>()

q.addFirst(10)  // 앞에 삽입
q.addLast(20)   // 뒤에 삽입
q.addFirst(5)   // 앞에 또 삽입

println(q.removeLast())   // 20
println(q.removeFirst())  // 5
``````

<br>

### ☁ ArrayDeque 주요 함수

| 동작             | 함수명           | 설명                       |
| ---------------- | ---------------- | -------------------------- |
| 맨 뒤에 추가     | addLast(...)     | 기본 삽입 방식             |
| 맨 앞에 추가     | addFirst(...)    | 덱에서 앞쪽 삽입시         |
| 맨 앞 요소 제거  | removeFirst( )   | 기본 삭제 방식             |
| 맨 뒤 요소 제거  | removeLast( )    | 덱에서 뒤쪽 삭제시         |
| 맨 앞 요소 조회  | first( )         | 가장 앞 요소 확인          |
| 맨 뒤 요소 조회  | last( )          | 가장 뒤 요소 확인          |
| 비어 있는지 확인 | isEmpty( )       | 큐 또는 덱이 비었는지 확인 |
| 크기 확인        | size             | 덱에 있는 요소 개수        |
| 반복문           | for (x in duque) | 덱 전체 순회               |
