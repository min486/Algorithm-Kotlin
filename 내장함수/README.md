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
>   > 컬렉션(List, Set, Array) 등 Iterable< T > 타입에 적용되는 함수 
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
>   > 컬렉션(List, Set, Array) 등 Iterable< T > 타입에 적용되는 함수
>   
>   ```kotlin
>   val li = listOf(1, 2, 3)
>   println(li.any { it > 2 })
>   ```
>   
> - count
>
>   
>   - .count( ) → 전체 개수
>   - .count { 조건 } → 조건에 맞는 개수
>   - 컬렉션(List, Set, Array) 등 Iterable< T > 타입에 적용되는 함수 
>   
>   ```kotlin
>   val li = listOf(1, 2, 2, 3)
>   println(li.count())  // 4
>   println(li.count { it == 2 })  // 2
>   ```
>
> - float / int / str
>
>   - toFloat( ) : 숫자나 문자열을 실수형으로 변환
>
>   - toInt( ) : 문자열 형태의 숫자나 소수점이 있는 숫자 등을 정수 형태로 반환
>
>   - toString( ) : 문자열로 변환
>   
>   ```kotlin
>   val a = "3.14"
>   println(a.toFloat())  // 3.14 (kotlin.Float)
>   
>   val b = "10"
>   val bb = 3.1
>   println(b.toInt())  // 10 (kotlin.Int)
>   println(bb.toInt())  // 3
>   
>   val c = 10
>   println(c.toString())  // 10 (kotlin.String)
>   ```
>
> - find
>
>   > find { ... } 는 조건을 만족하는 첫 요소를 반환
>   >
>   > 컬렉션(List, Set, Array) 등 Iterable< T > 타입에 적용되는 함수 
>
>   ```kotlin
>   val li = listOf(3, 5, 7)
>   println(li.find { it > 4 })  // 5
>   ```
>
> - indexOf
>
>   > indexOf(...) 는 해당 요소가 처음 위치한 인덱스를 반환한다
>   >
>   > List, String 타입에서 사용 가능
>
>   ```kotlin
>   val li = listOf(3, 5, 7, 5)
>   println(li.indexOf(5))  // 1
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
>   > joinToString(...) 는 매개변수로 들어온 구분자를 값과 값 사이에 넣어서 하나의 문자열로 바꾸어 반환하는 함수
>   >
>   > 컬렉션(List, Set, Array) 등 Iterable< T > 타입에 적용되는 함수
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
> - list
>
>   > listOf( ), mutableListOf( ) 는 반복 가능한 자료형을 입력받아 리스트로 반환하는 함수
>
>   ```kotlin
>   val li = mutableListOf(1, 2, 3)
>   li.add(4)
>   println(li)  // [1, 2, 3, 4]
>   ```
>
> - add
>
>   - add(...) : 리스트의 끝에 값을 추가하는 함수
>   - add(index, value) : 리스트의 index 위치에 x 값을 추가하는 함수
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
>   - .map { ... } 는 컬렉션의 각 요소에 대해 주어진 함수를 적용하고, 결과를 새로운 컬렉션으로 반환한다
>   - 컬렉션(List, Set, Array) 등 Iterable< T > 타입에 적용되는 함수
>   - 입력 타입이 IntArray, List< Int > 인 경우, 반환 타입은 List< Int >
>
>   ```kotlin
>   val li = listOf(1, 2, 3)
>   val ans = li.map { it * it }
>   println(ans)  // [1, 4, 9]
>   ```
>
> - filter
>
>   - .filter { ... } 는 컬렉션의 각 요소에 대해 주어진 조건을 검사하고, true를 반환하는 요소만 걸러내서 새로운 컬렉션으로 반환한다
>
>   - 컬렉션(List, Set, Array) 등 Iterable< T > 타입에 적용되는 함수
>   - 입력 타입이 IntArray, List< Int > 인 경우, 반환 타입은 List< Int >
>
>   ```kotlin
>   val li = listOf(1, 2, 3, 4, 5)
>   val ans = li.filter { it % 2 == 0 }
>   println(ans)  // [2, 4]
>   ```
>
> - mapOf
>
>   - mapOf(...), mutableMapOf(...) 는 키와 값으로 이루어진 딕셔너리 생성 함수
>
>   - 딕셔너리에서 Key 사용해 Value 얻기
>
>     ```kotlin
>     val mp = mutableMapOf("a" to 1, "b" to 2)
>     println(mp["a"])  // 1
>     ```
>
>
>   - 딕셔너리 쌍 추가, 삭제
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
>     - map.keys → Set< K >
>     - 정렬, 인덱스로 접근, 변형이 필요할 때는 toList() 사용
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
>     - map.values → Collection< V >
>     - 정렬, 인덱스로 접근, 변형이 필요할 때는 toList() 사용
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
> - maxOrNull / minOrNull
>
>   - .maxOrNull( ) : 반복 가능한 자료형의 최댓값을 반환하는 함수
>   - .minOrNull( ) : 반복 가능한 자료형의 최솟값을 반환하는 함수
>
>   ```kotlin
>   val li = listOf(3, 5, 1)
>   println(li.maxOrNull())  // 5
>   println(li.minOrNull())  // 1
>   ```
>
> - code / toChar
>
>   - '문자'.code : 문자의 유니코드(Unicode) 값을 돌려주는 함수
>
>     (문자 → 정수)
>
>   - 정수.toChar : 유니코드 값을 입력받아 그 코드에 해당하는 문자를 출력하는 함수
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
> - remove / removeAt / clear
>
>
>   - .remove( ) : 리스트에 있는 값을 이용하여 항목을 삭제, 중복 값이 있을 때 앞의 값 하나만 제거
>   - .removeAt( ) : 인덱스 위치에 있는 요소 삭제
>   - .clear( ) : 리스트에 저장된 모든 요소 삭제
>
>   ```kotlin
>   val li = mutableListOf(3, 1, 2, 3)
>   
>   li.remove(3)
>   println(li)
>   
>   li.removeAt(0)
>   println(li)
>   
>   li.clear()
>   println(li)
>   ```
>
> - replace
>
>   > .replace(old, new) 는 문자열에서 old를 new로 변경하고, 결과를 문자열로 반환
>
>   ```kotlin
>   val st = "oxoxoO"
>   val ans = st.replace("o", "z")
>   println(ans)  // zxzxzO
>   ```
>
> - reverse / reversed
>
>   - 둘 다 데이터를 역순(뒤집기)으로 만듬
>   - reverse( ) : MutableList< T >에서 원형 변경, 리턴값 없음
>   - reversed( ) : MutableList< T >에서 원형 유지, 반복 가능한 reversed 객체 반환
>
>   ```kotlin
>   val li = mutableListOf(1, 2, 3)
>   
>   val ans = li.reversed()
>   println(li)  // [1, 2, 3]
>   println(ans)  // [3, 2, 1]
>   
>   li.reverse()
>   println(li)  // [3, 2, 1]
>   ```
>
> - round
>
>   > round(...) 는 반올림해서 반환하는 함수
>
>   ```kotlin
>   import kotlin.math.round
>   
>   val ans = round(3.6)
>   println(ans)  // 4.0
>   ```
>
> - sort / sorted
>
>   - 둘 다 데이터를 오름차순 또는 내림차순으로 정렬함
>   - sort( ) : 리스트에서 원형을 변경, 리턴값 없음
>   - sorted( ) : 리스트에서 원형을 변경하지 않고, 정렬된 새 리스트 반환
>
>   ```kotlin
>   val li = mutableListOf(3, 1, 2)
>   
>   val ans = li.sorted()
>   println(li)  // [3, 1, 2]
>   println(ans)  // [1, 2, 3]
>   
>   li.sort()
>   println(li)  // [1, 2, 3]
>   ```
>
>
> - set
>
>
>   - setOf(...) : 불변(immutable) set
>
>   - mutableSetOf(...) : 가변(mutable) set
>
>   - set은 중복을 허용하지 않음
>
>   - 연산 결과는 모두 Set< T >, toList() 등으로 타입 변환 가능
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
> - split
>
>   > split(...) 는 괄호 안의 값을 기준으로 문자열을 나누고, 리스트(List< String >)를 반환한다
>   
>   ```kotlin
>   val st = "a-b-c"
>   val ans = st.split("-")
>   println(ans)  // [a, b, c]
>   
>   val st2 = "hello world android"
>   val ans2 = st2.split(" ")
>   println(ans2)  // [hello, world, android]
>   ```
>
> - sum
>
>   - sum( ) : 숫자형 리스트의 합을 반환한다
>   - sumOf { ... } : 각 요소를 람다식으로 변환한 값의 합을 반환한다
>
>   ```kotlin
>   val nums = listOf(1, 2, 3)
>   println(nums.sum())  // 6
>   println(nums.sumOf { it * 2 })  // 12
>   ```
>
> - substring
>
>   - .substring(...) 는 문자열의 일부분을 잘라서 반환하는 함수
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
>   - 사용 예제
>   
>     ```kotlin
>     val st = "kotlin"
>     val ans = st.substring(1, 3)
>     println(ans)  // ot (1, 2번째 문자)
>     val ans2 = st.substring(3)
>     println(ans2)  // lin (3번째부터 끝까지)
>     ```
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
>   - .uppercase( ) : 문자열 내부에 모든 알파벳을 대문자로 변경
>   - .lowercase( ) : 문자열 내부에 모든 알파벳을 소문자로 변경
>   ```kotlin
>   val st = "hello"
>   
>   val ans = st.uppercase()
>   println(ans)  // HELLO
>   
>   val ans2 = st.lowercase()
>   println(ans2)  // hello
>   ```
>
> - isupper / islower
>
>   - 둘 다 문자(Char) 하나가 대문자 또는 소문자인지를 판별하는 함수
>   - Char.isUpperCase() : 문자가 대문자인지 확인
>   - Char.isLowerCase() : 문자가 소문자인지 확인
>
>   ```kotlin
>   val ch = 'A'
>   val ch2 = 'a'
>   
>   println(ch.isUpperCase())  // true
>   println(ch2.isUpperCase())  // false
>   
>   println(ch.isLowerCase())  // false
>   println(ch2.isLowerCase())  // true
>   ```
>
>   - 이 함수들은 Char 타입에만 적용됨
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
>   > .zip(...) 는 두 Iterable< T >을 병렬로 묶어 Pair로 구성된 List를 만든다
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