<div align="center">
  <p>
    <img src="./README.assets/kotlin-hero.png">
  </p>
  <br>
  <h2>내장함수</h2>
  <p>코딩테스트 대비 내장함수 정리</p>
  <br>
  <br>
</div>





## 🔹 알파벳순 정리

> 
>
> - abs
>
>   > abs(...) 는 정수(Int), 실수(Float, Double) 타입의 숫자에서 절댓값을 반환하는 함수
>
>   ```kotlin
>   import kotlin.math.abs
>
>   val x = -10
>   println(abs(x))  // 10
>   ```
>
> - all
>
>   > all { ... } 는 모든 요소가 조건을 만족하면 true, 거짓이 하나라도 있으면 false
>   >
>   > 컬렉션(List, Set, Array) 등 `Iterable<T>` 타입에 적용되는 함수 
>
>   ```kotlin
>   val li = listOf(2, 4, 6)
>   println(li.all { it % 2 == 0 })  // true
>   ```
>
>
> - any
>
>   > any { ... } 는 하나라도 조건을 만족하면 true
>   >
>   > 컬렉션(List, Set, Array) 등 `Iterable<T>` 타입에 적용되는 함수
>
>   ```kotlin
>   val li = listOf(1, 2, 3)
>   println(li.any { it > 2 })
>   ```
>
> - average
>
>   - .average( ) 는 숫자 컬렉션의 평균값을 Double 타입으로 반환하는 함수
>   - 지원 타입 : `IntArray`, `LongArray`, `DoubleArray`, `List<Int>`, `List<Long>`, `List<Double>` 등
>   - 반환 타입 : Double
>
>   ```kotlin
>   val a = listOf(1, 2, 3)
>   println(a.average())  // 2.0
>
>   val b = intArrayOf(1, 2, 3)
>   println(b.average())  // 2.0
>   ```
>
> - count
>
>
>   - .count( ) → 전체 개수
>   - .count { 조건 } → 조건에 맞는 개수
>   - 컬렉션(List, Set, Array) 등 `Iterable<T>` 타입에 적용되는 함수
>
>   ```kotlin
>   val li = listOf(1, 2, 2, 3)
>   println(li.count())  // 4
>   println(li.count { it == 2 })  // 2
>   ```
>
>
> - code / toChar
>
>   - '문자'.code : 문자의 유니코드(Unicode) 값을 반환
>
>     (문자 → 정수)
>
>   - 정수.toChar : 유니코드 값을 입력받아 그 코드에 해당하는 문자를 반환
>
>     (정수 → 문자)
>
>   - A ~ Z 문자와 65 ~ 90 숫자 / a ~ z 문자와 97 ~ 122 숫자 서로 변환
>
>   ```kotlin
>   println('A'.code)  // 65
>   println(97.toChar())  // a
>   ```
>
> - int / str / double
>
>   - toInt( )
>     - 정수 또는 정수 형태의 문자열을 Int 타입으로 변환
>
>     - 실수형은 정수 부분만 잘림 (소수점 이하 제거)
>
>     - 문자(Char) 형태에는 직접 사용 불가 → toString( ) 후 변환 필요
>
>     - "3.14" 같은 소수점 포함 문자열은 사용 불가
>
>   - toString( ) 
>     - 어떤 타입이든 문자열로 변환 (Int, Double, Char 등)
>
>   - toDouble( )
>     - 정수, 실수 또는 숫자 형태의 문자열을 Double 타입(실수형)으로 변환
>     - 소수점이 있는 문자열도 변환 가능
>   
>   ```kotlin
>   val a1 = "10"
>   val a2 = 3.1
>   val a3 = "+123"
>   val a4 = "-123"
>   println(a1.toInt())  // 10 (kotlin.Int)
>   println(a2.toInt())  // 3
>   println(a3.toInt())  // 123
>   println(a4.toInt())  // -123
>   
>   val a5 = '1'
>   val a6 = "3.14"
>   println(a5.toInt())  // ❌
>   println(a6.toInt())  // ❌
>   
>   val b = 10
>   println(b.toString())  // 10 (kotlin.String)
>   
>   val c1 = 10
>   println(c1.toDouble())  // 10.0
>   val c2 = "3.14"
>   println(c2.toDouble())  // 3.14
>   println(c2::class)      // class kotlin.Double
>   ```
>
> - find
>
>   - find { ... } 는 조건을 만족하는 첫 요소를 반환
>   - 컬렉션(List, Set, Array) 등 `Iterable<T>` 타입에 적용되는 함수
>
>   ```kotlin
>   val li = listOf(3, 5, 7)
>   println(li.find { it > 4 })  // 5
>   ```
>
> - indexOf
>
>   - indexOf(...) 는 해당 요소가 처음 위치한 인덱스를 반환
>   - List, String 타입에서 사용 가능
>
>   ```kotlin
>   val li = listOf(3, 5, 7, 5)
>   println(li.indexOf(5))  // 1
>
>   val st = "abc"
>   println(st.indexOf("c"))  // 2
>   ```
>
> - in
>
>   in 은 2가지 용도로 사용된다
>
>   ### 1. 포함 여부 확인
>
>   - 컬렉션이나 문자열에 특정 값의 포함 여부를 Boolean 값으로 반환
>
>   - 대소문자 구분
>
>   - 지원 타입 : String, List, Set, Map 등
>
>   - 반환 타입 : Boolean
>
>   - in 은 연산자이지만, 내부적으로 contains( ) 함수를 호출하는 간편 문법
>
>     → in 을 사용하는 것이 짧고 가독성 좋음
>
>   ``````kotlin
>   val li = listOf(1, 2, 3)
>   println(2 in li)  // true
>   println(5 in li)  // false
>
>   println("ko" in "kotlin")  // true
>   println("KO" in "kotlin")  // false
>   ``````
>
>   ### 2. 요소 순회
>
>   - in 을 반복문에서 사용하는 경우, 순회 가능한 타입(Iterable)을 순회하기 위한 문법
>   - `Iterable<T>` 혹은 Array 타입에 대해 for 반복문을 사용할 수 있게 해준다
>
>   ```kotlin
>   val li = listOf(1, 2, 3)
>   for (i in li) {
>       println(i)
>   }
>
>   val st = "hello"
>   for (j in st) {
>       println(j)
>   }
>   ```
>
> - isLetter / isDigit / isLetterOrDigit
>
>    - 셋 다 Char 타입에 적용되며, String에 직접 적용은 안된다 (순회하며 적용해야함)
>    - .isLetter( ) : 문자열의 구성이 알파벳 또는 한글인지 확인 (문자열에 공백, 기호, 숫자가 있을시 false 리턴)
>    - .isDigit( ) : 문자열의 구성이 숫자인지 확인
>    - .isLetterOrDigit( ) : 문자열의 구성이 알파벳(한글) 또는 숫자인지 확인
>
>    ```kotlin
>    val a1 = "A"
>    val a2 = "테스트"
>    val a3 = "s520"
>    val a4 = "code_test"
>    val a5 = "code test"
>
>    println(a1.all { it.isLetter() })  // true
>    println(a2.all { it.isLetter() })  // true
>    println(a3.all { it.isLetter() })  // false (숫자 포함)
>    println(a4.all { it.isLetter() })  // false (기호 포함)
>    println(a5.all { it.isLetter() })  // false (공백 포함)
>
>    val b1 = "123"
>    val b2 = "010-1234-5678"
>    val b3 = "전화번호010"
>
>    println(b1.all { it.isDigit() })  // true
>    println(b2.all { it.isDigit() })  // false
>    println(b3.all { it.isDigit() })  // false
>
>    val c1 = "123"
>    val c2 = "010-1234-5678"
>    val c3 = "전화번호010"
>    val c4 = "Phone 010"
>
>    println(c1.all { it.isLetterOrDigit() })  // true
>    println(c2.all { it.isLetterOrDigit() })  // false
>    println(c3.all { it.isLetterOrDigit() })  // true
>    println(c4.all { it.isLetterOrDigit() })  // false
>    ```
>
> - joinToString
>
>   - .joinToString(...) 는 요소들 사이에 구분자를 넣어서 하나의 문자열로 반환
>
>   - 지원 타입 :  `List<T>`, `MutableList<T>`, `Set<T>`, `Array<T>`
>
>   - 미지원 타입 : `String`
>
>   ```kotlin
>   val li = listOf("a", "b", "c")
>   println(li.joinToString("-"))  // a-b-c
>   ```
>
> - length / size
>
>   - .length : 문자열의 길이(요소의 전체 개수)를 반환
>   - .size : 리스트, 배열 등의 길이 반환
>
>   ```kotlin
>   val st = "hello"
>   println(st.length)  // 5
>   
>   val li = listOf(1, 2)
>   println(li.size)  // 2
>   ```
>
> - add
>
>   - .add(...) : 리스트의 끝에 값을 추가하는 함수
>   - .add(index, value) : 리스트의 index 위치에 값(value)을 삽입하는 함수
>   - 지원 타입 : `MutableList<T>`, `MutableSet<T>`, `ArrayDeque<T>` 등 변경 가능한 컬렉션
>
>   ```kotlin
>   val li = mutableListOf(1, 2)
>   
>   li.add(3)
>   println(li)  // [1, 2, 3]
>   
>   li.add(1, 10)
>   println(li)  // [1, 10, 2, 3]
>   ```
>
> - map
>
>   - .map { ... } 는 컬렉션의 각 요소에 대해 주어진 함수를 적용하고, 결과를 새로운 리스트로 반환
>   - 지원 타입 : `List<T>`, `Set<T>`, `Array<T>`, `String` 등
>   - 반환 타입 : `List<R>`
>   - `String` 에 적용한 경우 → 반환 타입은 `List<Char>`
>
>   ```kotlin
>   val li = listOf(1, 2, 3)
>   val ans = li.map { it * it }
>   println(ans)  // [1, 4, 9]
>   
>   val st = "abc"
>   val ans2 = st.map { it.uppercaseChar() }     
>   println(ans2)  // [A, B, C] 
>   ```
>
> - filter
>
>   - .filter { ... } 는 컬렉션의 각 요소에 대해 주어진 조건을 검사하고, true를 반환하는 요소만 걸러내서 새로운 컬렉션으로 반환
>
>   - 지원 타입 : `List<T>`, `Array<T>`, `Set<T>`, `Map<K, V>`, `String` 등
>
>   - 반환 타입 :
>
>     - List, Array, Set → `List<T>`
>     - String → `List<Char>`
>     - Map<K, V> → `Map<K, V>`
>
>   - 예시 : 짝수 필터링
>
>     ``````kotlin
>     val li = listOf(1, 2, 3, 4, 5)
>     val ans = li.filter { it % 2 == 0 }
>     println(ans)  // [2, 4]
>     ``````
>
>   - 예시 : 문자열에서 숫자만 필터링
>
>     ``````kotlin
>     val st = "A913Z"
>     val ans = st.filter { ch -> ch.isDigit() }
>     println(ans)  // 913
>     ``````
>
>     👉 `filter { ch -> ch.isDigit() }` 는 문자열 st의 각 문자 ch가 숫자인지 여부를 검사
>
>     👉 숫자인 문자만 남기고 나머지는 제거한 결과가 반환됨
>
> - Map
>
>   - mapOf(...), mutableMapOf(...) 는 키와 값으로 이루어진 해시 테이블 생성 함수
>
>   - Key 사용해 Value 얻기
>
>     ```kotlin
>     val mp = mutableMapOf("a" to 1, "b" to 2)
>     println(mp["a"])  // 1
>     ```
>
>   - Key-Value 쌍 추가, 삭제
>
>     ```kotlin
>     val mp = mutableMapOf<Any, Any>()
>     mp[1] = "a"
>     mp[2] = "b"
>     mp["name"] = "pp"
>     mp[3] = listOf(1, 2)
>     println(mp)  // {1=a, 2=b, name=pp, 3=[1, 2]}
>
>     mp.remove(2)
>     println(mp)  // {1=a, name=pp, 3=[1, 2]}
>     ```
>
>   - Key 리스트 만들기
>
>     - map.keys → `Set<K>`
>     - 정렬, 인덱스로 접근, 변형이 필요할 때는 toList( ) 사용
>
>     ```kotlin
>     val mp = mutableMapOf("a" to 1, "b" to 2)
>
>     val li = mp.keys.toList()
>     println(li)  // [a, b]
>
>     for (k in mp.keys) {
>         print(k)  // ab
>     }
>     ```
>
>   - Value 리스트 만들기
>
>     - map.values → `Collection<V>`
>     - 정렬, 인덱스로 접근, 변형이 필요할 때는 toList( ) 사용
>
>     ```kotlin
>     val mp = mutableMapOf("a" to 1, "b" to 2)
>
>     val li = mp.values.toList()
>     println(li)  // [1, 2]
>
>     for (v in mp.values) {
>         print(v)  // 12
>     }
>     ```
>
>   - Key-Value 쌍 얻기
>
>     ```kotlin
>     val mp = mutableMapOf("a" to 1, "b" to 2)
>
>     for ((k, v) in mp) {
>         println("$k - $v")  // a - 1
>     }                       // b - 2
>     ```
>
>   - 특정 Key 존재 여부
>
>     ```kotlin
>     val mp = mutableMapOf("a" to 1, "b" to 2)
>
>     println("a" in mp)  // true
>     println("c" in mp)  // false
>     ```
>
>   - Key, Value 단일 접근
>
>     - Map 을 순회할 때 it.key 와 it.value 로 각 요소에 접근할 수 있다
>
>     ``````kotlin
>     val map = mapOf("apple" to 2, "banana" to 3)
>     
>     map.filter { it.value >= 3 }
>     map.forEach { println("${it.key} : ${it.value}") }
>     ``````
>
> - getOrDefault
>
>    - Map 에서 지정한 키가 존재하면 해당 값을 반환하고, 존재하지 않으면 기본값(default)을 반환하는 함수
>    - Map, MutableMap 에서 사용 가능
>    - null 안전성을 확보할 수 있어서 !! 사용을 피할 수 있음
>
>    ``````kotlin
>    val mp = mutableMapOf<String, Int>()
>    mp["apple"] = 2
>    mp["banana"] = 5
>    
>    val a = mp.getOrDefault("apple", 0)
>    println(a)  // 2 (키가 존재함)
>    
>    val b = mp.getOrDefault("orange", 0)
>    println(b)  // 0 (키가 없음 → 기본값 반환)
>    ``````
>
>
> - min / max
>
>   - 최솟값 반환
>     - min
>       - .min( ) 는 컬렉션의 최솟값 반환
>       - 비어있는 경우 예외 발생
>       - 지원 타입 : `List<Int>`, `IntArray`, `Set<Int>`, `Map.values` 등 
>
>     - minOrNull
>       - .minOrNull( ) 는 컬렉션의 최솟값 반환
>       - 비어있는 경우 null 반환
>       - 지원 타입 : `List<Int>`, `IntArray`, `Set<Int>`, `Map.values` 등 
>     - minOf
>       - .minOf { ... } 는 각 요소에 특정 조건을 적용해서 최솟값 반환
>       - 조건이 없는 `minOf(a, b)` 형식도 가능 (2개 이상의 값)
>       - 비어있는 경우 예외 발생
>       - 지원 타입 : 일반 값 비교 또는 `Iterable<T>.minOf { selector }`
>
>   - 최댓값 반환
>     - max( ) : 컬렉션의 최댓값 반환
>     - maxOrNull( ) : 컬렉의 최댓값 반환
>     - maxOf(...) : 조건 적용 후 최댓값 반환 또는 2개 이상의 값 중 최댓값 반환
>   
>   ```kotlin
>   val a = listOf(3, 5, 1)
>   val b = intArrayOf(9, 2, 6)
>   println(a.minOrNull())  // 1
>   println(b.minOrNull())  // 2
>   
>   val c = listOf(5, 3, 7)
>   val ans = c.minOf { it * 2 }
>   println(ans)  // 6
>   
>   println(minOf(3, 10))  // 3
>   println(minOf("a", "b", "c"))  // "a"
>   ```
>
> - .. / until
>
>   - MIN..MAX
>
>     > MIN 에서부터 MAX 까지의 숫자를 차례대로 반환 (MAX 포함)
>     >
>     > (MIN <= x <= MAX) 
>
>   - MIN until MAX
>
>     > MIN 에서부터 MAX - 1 까지의 숫자를 차례대로 반환 (MAX 미포함)
>     >
>     > (MIN <= x < MAX)
>   - ~ step GAP
>
>     > 각 숫자들 사이에 GAP 만큼의 차이를 둔다
>
>   ```kotlin
>   for (i in 1..3) print(i)  // 123
>   for (i in 0..6 step 2) print(i)  // 0246
>   
>   for (i in 1 until 3) print(i)  // 12
>   for (i in 0 until 5 step 2) print(i)  // 024
>   ```
>
>
> - readLine
>
>
>   - readLine( ) 는 Kotlin에서 한 줄 입력 받을 때 사용
>   - 반환 타입 : String? (nullable)
>   - 예전부터 사용되던 방식이며 호환성이 좋아서 많이 사용됨
>
>   ```kotlin
>   // input : 1 2
>   fun main() {
>       val (a, b) = readLine()!!.split(" ").map { it.toInt() }
>   }
>   ```
>
>   👉 `readLine()!!` : 컴파일러에게 null 아니라고 선언
>
>   👉 `split(" ").map { it.toInt() }` : 문자열을 공백 기준으로 나누고 정수로 변환
>
> - remove / removeAt / clear
>
>   - .remove(...) : 리스트에 있는 값을 이용하여 항목을 삭제, 중복 값이 있을 때 앞의 값 하나만 제거
>   - .removeAt(...) : 인덱스 위치에 있는 요소 삭제
>   - .clear( ) : 리스트에 저장된 모든 요소 삭제
>
>   ```kotlin
>   val li = mutableListOf(3, 1, 2, 3)
>
>   li.remove(3)
>   println(li)  // [1, 2, 3]
>
>   li.removeAt(0)
>   println(li)  // [2, 3]
>
>   li.clear()
>   println(li)  // []
>   ```
>
> - repeat
>
>   repeat 관련 2가지 함수가 있음
>
>   ### 1. String.repeat(count: Int)
>
>   - .repeat(...) 는 문자열을 지정한 횟수만큼 반복한 새 문자열 반환
>   - String 타입에만 사용 가능
>
>   ```kotlin
>   val st = "*".repeat(5)
>   val st2 = "abc".repeat(3)
>   println(st)  // *****
>   println(st2)  // abcabcabc
>   ```
>
>   ### 2. repeat(times: Int) { block }
>
>   - repeat(i) { ... } 는 ... 안의 코드를 i번 반복 실행
>
>     ``````kotlin
>     repeat(3) {
>         println("*".repeat(5))
>     }
>     ``````
>
>   - 내부적으로 아래와 동일하게 작동
>
>     ```kotlin
>     for (i in 0 until 3) {
>         println("*".repeat(5))
>     }
>     ```
>
> - replace
>
>   - .replace(old, new) 는 문자열에서 old를 new로 변경하고, 결과를 문자열로 반환
>   - 일치 항목을 전부 바꾸고, 횟수 제한은 지정 불가
>   - String 타입에만 사용 가능
>
>   ```kotlin
>   val st = "oxoxoX"
>   val ans = st.replace("x", "z")
>   println(ans)  // ozozoX
>   ```
>
> - reverse / reversed
>
>   - 둘 다 데이터를 역순(뒤집기)으로 만듬
>   - reverse( )
>     - 원본 변경, 반환값 없음
>     - 변경 가능한 컬렉션에서만 사용 가능
>     - String, List, Set 등 불변 타입에서 사용 불가
>   - reversed( )
>     - 원본 유지, 역순 복사본 반환
>     - 다양한 타입에 적용 가능
>
>   ```kotlin
>   // reverse
>   val li = mutableListOf(1, 2, 3)
>   li.reverse()
>   println(li)  // [3, 2, 1]
>
>   val li2 = listOf(1, 2, 3)
>   li2.reverse()  // ❌
>
>   val st = "abc"
>   st.reverse()  // ❌
>
>   // reversed
>   val li = mutableListOf(1, 2, 3)
>   val ans = li.reversed()
>   println(ans)  // [3, 2, 1]
>
>   val li2 = listOf(1, 2, 3)
>   val ans2 = li2.reversed()
>   println(ans2)  // [3, 2, 1]
>
>   val st = "abc"
>   val ans3 = st.reversed()
>   println(ans3)  // cba
>   ```
>
> - round
>
>   - 함수 : `round(x: Double): Double`
>   - 소수점 첫째 자리에서 반올림한 값을 Double 타입으로 반환
>   - Int, Long 같은 정수 타입은 사용 불가, 실수형으로 변환 필요
>   - 다른 소수점 자리에서 반올림하려면 직접 구현 필요
>   
>   ```kotlin
>   import kotlin.math.round
>   
>   val a = round(3.5)  // 4.0
>   val b = round(3.4)  // 3.0
>   val c = round(3.toDouble())  // 3.0
>   val d = round(3)  // ❌ 
>   ```
>   
> - sort / sorted
>
>   - sort
>
>     - 원본 변경, 반환값 없음
>     - `MutableList<T>` 타입에 사용 가능
>     - .sort( ) : 오름차순 정렬
>     - .sortDescending( ) : 내림차순 정렬
>
>   - sorted
>
>     - 원본 유지, 정렬된 새 List 반환
>     - `List<T>`, `Array<T>`, `Set<T>` 등 사용 가능
>
>     - .sorted( ) : 오름차순 정렬
>     - .sortedDescending( ) : 내림차순 정렬
>
>   ```kotlin
>   val li = mutableListOf(3, 1, 2)
>   li.sort()
>   println(li)  // [1, 2, 3]
>   li.sortDescending()
>   println(li)  // [3, 2, 1]
>   
>   val li2 = mutableListOf(3, 1, 2)
>   val ans = li.sorted()
>   val ans2 = li.sortedDescending()
>   println(ans)  // [1, 2, 3]
>   println(ans2)  // [3, 2, 1]
>   println(li2)  // [3, 1, 2]
>   
>   val se = setOf(3, 1, 4)
>   val li3 = se.sorted()
>   println(li3)  // [1, 3, 4]
>   ```
>
>
> - sortedWith & compareBy
>
>
>     - 두 가지 함수 조합으로 오름차순, 내림차순 모두 구현 가능
>
>
>     - compareBy 는 정렬 기준을 만들고, sortedWith 는 해당 기준대로 정렬함
>
>
>     - 내림차순은 부호(-)를 붙여 처리
>
>
>     - 지원 타입 : `List<T>`, `MutableList<T>`
>
>
>     - 반환 타입 : `List<T>`
>
>   ``````kotlin
>   val li = listOf("sun", "bed", "car")
>   val ans = li.sortedWith(compareBy({ it[1] }, { it }))
>   println(ans)  // [car, bed, sun]
>   ``````
>
>   👉 it[n] : 각 문자열의 n번째 문자로 1차 정렬
>
>   👉 it : 문자열 전체 기준으로 2차 정렬 (1차 기준이 같은 경우 알파벳순)
>
>   ```kotlin
>   data class Student(
>       val name: String,
>       val korean: Int,
>       val english: Int,
>   )
>   
>   val students = listOf(
>       Student("Junkyu", 50, 60),
>       Student("Sangkeun", 50, 60),
>       Student("Sunyoung", 80, 70),
>       Student("Donghyuk", 80, 60)
>   )
>   
>   val li = students.sortedWith(
>       compareBy(
>           { -it.korean },  // 국어 점수 내림차순
>           { it.english },  // 영어 점수 오름차순
>           { it.name }      // 이름 오름차순
>       )
>   )
>   
>   val ans = li.map { it.name }
>   println(ans)  // [Donghyuk, Sunyoung, Junkyu, Sangkeun]
>   ```
>
> - toTypedArray
>
>   - sortedWith 함수의 결과는 `List<String>`,
>
>     만약 함수 반환 타입이 `Array<String>` 이면, List → Array 변환이 필요함
>
>   - toTypedArray( ) 는 컬렉션을 배열(Array)로 바꿔주는 함수
>
>   ``````kotlin
>   listOf("a", "b").toTypedArray()  // arrayOf("a", "b")
>   ``````
>
> - take / takeLast
>
>   - .take(...)
>     - 앞에서부터 n개 요소를 가져온 새 객체 반환
>
>     - String, List, Array 등에 사용 가능
>
>   - .takeLast(...)
>     - 뒤에서부터 n개 요소를 가져온 새 객체 반환
>     - String, List, Array 등에 사용 가능
>
>   ```kotlin
>     val st = "abcde".take(3)
>     val li = listOf(1, 2, 3).take(2)
>     println(st)  // abc
>     println(li)  // [1, 2]
>   
>     val st2 = "abcde".takeLast(3)
>     val li2 = listOf(1, 2, 3).takeLast(2)
>     println(st2)  // cde
>     println(li2)  // [2, 3]
>   ```
>
> - set
>
>   - setOf(...) : 불변(immutable) set
>
>   - mutableSetOf(...) : 가변(mutable) set
>
>   - set은 중복을 허용하지 않음
>
>   - 연산 결과는 모두 `Set<T>` / toList( ) 등으로 타입 변환 가능
>
>   - 중복 제거
>
>     ```kotlin
>     val se = mutableSetOf(1, 2, 2)
>     println(se)  // [1, 2]
>     ```
>
>   - 합집합, 교집합, 차집합
>
>     ```kotlin
>     val a = setOf(1, 2, 3)
>     val b = setOf(2, 3, 4)
>     
>     val ans = a union b
>     print(ans)  // [1, 2, 3, 4]
>     
>     val ans2 = a intersect b
>     print(ans2)  // [2, 3]
>     
>     val ans3 = a subtract b
>     print(ans3)  // [1]
>     ```
>
>   - 원소 추가, 삭제
>
>     ```kotlin
>     val se = mutableSetOf(1, 2, 3)
>     
>     se.add(4)
>     println(se)  // [1, 2, 3, 4]
>     
>     se.remove(2)
>     println(se)  // [1, 3, 4]
>     ```
>
>
> - split
>
>   - .split(...) 는 구분자를 기준으로 잘라서 `List<String>` 형태로 반환
>   - String 타입에만 사용 가능
>   - 구분자를 1개 혹은 2개 이상 입력 가능
>
>   ```kotlin
>   val st = "a-b-c"
>   val ans = st.split("-")
>   println(ans)  // [a, b, c]
>   
>   val st2 = "hello world android"
>   val ans2 = st2.split(" ")
>   println(ans2)  // [hello, world, android]
>   
>   val st3 = "apple.orange:banana"
>   val ans3 = st3.split(".", ":")
>   println(ans3)  // [apple, orange, banana]
>   ```
>
> - sqrt
>
>   - sqrt(...) 는 제곱근을 구할 때 사용
>   - 입력 타입 : Double만 허용, 정수값(Int, Long) 바로 사용 불가
>   - 반환 타입 : Double
>
>   ``````kotlin
>   import kotlin.math.sqrt
>   
>   val x = 9.0
>   println(sqrt(x))  // 3.0
>   
>   val y = 2.0
>   println(sqrt(y))  // 1.414...
>   ``````
>
> - sum
>
>   - .sum( )
>
>     - 숫자형 요소(Int, Long, Double)를 갖는 컬렉션의 합계를 반환
>     - `List<Int>`, `List<Long>`, `List<Double>` 등에서 사용 가능
>
>     ``````kotlin
>     val li = listOf(1, 2, 3)
>     println(li.sum())  // 6
>
>     val li2 = mutableListOf(1.2, 2.3, 3.1)
>     println(li2.sum())  // 6.6
>     ``````
>
>   - .sumOf { ... }
>
>     - 컬렉션의 각 요소를 람다식으로 변환한 후, 그 결과값의 총합을 반환
>
>     - 요소 타입이 숫자가 아니어도 사용 가능, 람다식의 결과값이 숫자형이면 합산 가능
>
>     - `List<Item>`, `List<String>`, `String` 등에서 사용 가능
>
>     - 예시 : 객체 리스트에서 특정 속성의 총합 구하기
>
>       ``````kotlin
>       data class Item(val name: String, val price: Int)
>
>       val li = listOf(Item("a", 1000), Item("b", 2000))
>       println(li.sumOf { it.price })  // 3000
>       ``````
>
>     - 예시 : 문자열 숫자의 합
>
>       ```kotlin
>       val st = "12345"
>       val sum = st.sumOf { it.toString().toInt() }
>       println(sum)  // 15
>       ```
>
>     - 예시 : 문자열 길이 총합
>
>       ```kotlin
>       listOf("a", "bb", "ccc").sumOf { it.length }  // 6
>       ```
>
> - substring
>
>   - .substring(...) 는 문자열의 일부분을 잘라서 반환하는 함수
>
>   - String 타입만 사용 가능
>
>   - 기본 형태
>
>     ```kotlin
>     fun String.substring(startIndex: Int, endIndex: Int): String
>     ```
>
>     👉 startIndex는 포함, endIndex는 미포함
>
>     👉 반환 타입은 항상 String
>
>   - 예시
>
>     ``````kotlin
>     val st = "kotlin"
>     val ans = st.substring(1, 3)
>     println(ans)  // ot (1, 2번째 문자)
>     val ans2 = st.substring(3)
>     println(ans2)  // lin (3번째부터 끝까지)
>     ``````
>
> - startsWith / endsWith
>
>
>   - 문자열이 특정 문자나 문자열로 시작하는지/끝나는지 확인하는 함수
>
>   - 지원 타입 : String
>   - 반환 타입 : Boolean
>
>   ```kotlin
>   val st = "kot lin"
>   
>   println(st.startsWith("k"))    // true
>   println(st.startsWith("kot"))  // true 
>   println(st.endsWith("kotl"))   // false
>   
>   println(st.endsWith("lin"))    // true
>   println(st.endsWith(" lin"))   // ture
>   println(st.endsWith(" liN"))   // false (대소문자 구분)
>   ```
>
> - type
>
>   > ::class 으로 타입 확인 가능
>
>   ```kotlin
>   val st = "hello"
>   println(st::class)  // class kotlin.String
>   ```
>
> - upper / lower
>
>   - uppercase( ) / lowercase( )
>
>     - 적용 가능 타입 : String
>     - 문자열 내의 모든 문자를 대문자/소문자로 변경한 새로운 문자열(String)을 반환
>
>     ``````kotlin
>     val st = "Hello"
>
>     val ans = st.uppercase()
>     println(ans)  // HELLO
>
>     val ans2 = st.lowercase()
>     println(ans2)  // hello
>     ``````
>
>   - uppercaseChar( ) / lowercaseChar( )
>
>     - 적용 타입 : Char
>     - 단일 문자를 대문자/소문자로 변경한 새로운 문자(Char)를 반환
>
>     ```kotlin
>     val ch = 'a'
>     val ans = ch.uppercaseChar()
>     println(ans)  // 'A'
>     
>     val ch2 = 'A'
>     val ans2 = ch2.lowercaseChar()
>     println(ans2)  // 'a'
>     ```
>
> - isupper / islower
>
>   - 적용 가능 타입 : Char
>
>   - .isUpperCase( ) / .isLowerCase( ) : 문자가 대문자/소문자 인지 확인해서 Boolean 값으로 반환
>
>     ``````kotlin
>     val ch = 'A'
>     val ch2 = 'a'
>
>     println(ch.isUpperCase())  // true
>     println(ch2.isUpperCase())  // false
>
>     println(ch.isLowerCase())  // false
>     println(ch2.isLowerCase())  // true
>     ``````
>
>   - 문자열 전체 검사하는 방법
>
>     ```kotlin
>     // 문자열 모두 대문자인지
>     val st = "HELLO"
>     val ans = st.all { it.isUpperCase() }
>     println(ans)
>     
>     // 문자열에 소문자 하나라도 있는지
>     val st2 = "HeLLo"
>     val ans2 = st2.any { it.isLowerCase() }
>     println(ans2)
>     ```
>
> - zip
>
>   > .zip(...) 는 두 `Iterable<T>`을 병렬로 묶어 Pair로 구성된 List를 만든다
>
>   ```kotlin
>   val a = listOf(1, 2, 3)
>   val b = listOf("a", "b", "c")
>   val ans = a.zip(b)
>   println(ans)  // [(1, a), (2, b), (3, c)]
>   ```
>
> <br>
>
> <hr>
>
> <br>
>
> - 문자열 템플릿
>
> 
>
> 
>
> - Enumerate
>
> ​	
>
>
>  > 반복문 사용 시 몇 번째 반복문인지 확인할 때 사용
>   >
>   > 인덱스 번호와 컬렉션의 원소를 tuple형태로 반환
>
>   ```python
>   t = [1, 5, 7, 33, 39]
>   for p in enumerate(t):
>   	print(p)
> 
>   (0, 1)
>   (1, 5)
>   (2, 7)
>   (3, 33)
>   (4, 39)
> 
>   t1 = [1, 3, 5]
>   t2 = [2, 4, 6]
>   for i, (r, a) in enumerate(zip(t1, t2)):
>       print(i)
>       print(r, a)
> 
>   0
>   1 2
>   1
>   3 4
>   2
>  5 6
>   ```
>
> - find / startswith / endswith
>
>  > 특정문자 찾을 때 사용
>
>   ### string.find(찾을 문자, 시작index, 끝index + 1)
>
>   > 찾는 문자가 존재 한다면 해당 위치의 index를 반환
>   >
>  > 찾는 문자가 존재 하지 않는다면 -1을 반환
>
>  - find 함수 첫번째 인자
>
>     > 찾을 문자열 혹은 찾을 문자
>
>  - find 함수 두번째 인자 (생략가능)
>
>     > 문자를 찾을때 어디서부터 찾을지, 생략시 index 0부터
>
>   - find 함수 세번째 인자 (생략가능)
>
>    > 문자를 찾을때 어디까지 찾을지 끝, 생략시 맨 마지막 index
>
>  ```python
>   # index 1~3번째 사이에 문자 'll'가 위치한 자리
> 
>   a = 'hello'
>   >>> a.find('ll', 1, 3)  # 1~2 탐색
>   -1
> 
>   >>> a.find('ll', 1, 4)  # 1~3 탐색
>   2
>  ```
>
>  ### string.startswith(특정 문자)
>
>  > 현재 문자열이 사용자가 지정하는 특정 문자로 시작하는지 확인
>   >
>   > True or False 반환
>
>   ```python
>   a = 'final exam'
>   >>> a.startswith('final')
>  True
>   ```
>
>   ### string.endswith(특정 문자)
>
>   > 현재 문자열이 사용자가 지정하는 특정 문자로 끝나는지 확인
>   >
>   > True or False 반환IndexError: string index out of range
>
>   ```python
>     a = 'final exam'
>   >>> a.endswith('exam')
>   True
> 
>   # 비교 (endswith vs [-1])
>   a = ''
>  if a.endswith('.'):
>       a = a[:-1]
>  >>> a
>   '' (Error X)
>  --------------------------
>   a = ''
>   if a[-1] == '.'
>       a = a[:-1]
>   >>> a
>   IndexError: string index out of range
>   ```
>
> - 문자열 템플릿
>
>   > $, ${ } eval(expression)에서 입력으로 받은 expression (=식)을 문자열로 받아서, 이를 계산하고 반환해주는 함수
>
>   - expression(식)은 값, 연산자, 변수 등 하나 이상의 값으로 표현될 수 있는 코드
>  - 문자열, 표현식, 변수들이 모두 str 타입이어야 한다
>
>   ```kotlin
>   val name = "Kim"
>   val age = 30
>   println("name: $name, age: $age")  // name: Kim, age: 30
>   ```