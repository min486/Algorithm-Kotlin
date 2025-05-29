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





## 🧊 알파벳순 정리

> 
>
> - abs
>
>   > abs(x) 는 어떤 숫자를 입력받았을 때, 그 숫자의 절댓값을 반환하는 함수
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
>   > all { } 는 모든 요소가 조건을 만족하면 true, 거짓이 하나라도 있으면 false
>
>   ```kotlin
>   val li = listOf(2, 4, 6)
>   println(li.all { it % 2 == 0 })  // true
>   ```
>
>
> - any
>
>   > any { } 는 하나라도 조건을 만족하면 true
>   >
>
>   ```kotlin
>   val li = listOf(1, 2, 3)
>   println(li.any { it > 2 })
>   ```
>   
> - count
>
>   
>   - .count() → 전체 개수
>   - .count { 조건 } → 조건에 맞는 개수
>   
>   ```kotlin
>   val li = listOf(1, 2, 2, 3)
>   println(li.count())  // 4
>   println(li.count { it == 2 })  // 2
>   ```
>
> - dict
>
>   - mapOf(), mutableMapOf() 는 키와 값으로 이루어진 딕셔너리 생성 함수
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
>     }												// b - 2
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
> - float / int / str
>
>   - toFloat( ) : 숫자나 문자열을 실수형으로 변환
>
>   - toInt( ) : 문자열 형태의 숫자나 소수점이 있는 숫자 등을 정수 형태로 반환하는 함수
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
> - format
>
>   > format() 내장 함수를 이용하면 숫자를 다른 진수의 문자열로 바꿀 때 접두어(0b, 0o, ox 등)를 제외할 수 있다
>
>   ```python
>     >>> format(42, 'b') # 2진수
>   '101010'
>   >>> format(42, 'o') # 8진수
>   '52'
>     >>> format(42, 'x') # 16진수
>   '2a'
>   ```
>
> - find
>
>   > find { } 는 조건을 만족하는 첫 요소를 반환한다
>
>   ```kotlin
>   val li = listOf(3, 5, 7)
>   println(li.find { it > 4 })  // 5
>   ```
>
> - indexOf
>
>   > indexOf( ) 는 괄호( ) 안에 문자가 처음 위치한 자리의 값을 찾을 수 있다
>
>   ```kotlin
>   val li = listOf(3, 5, 7)
>   println(li.indexOf(5))  // 1
>   ```
>
> - isLetter / isDigit / isLetterOrDigit
>
>    - isLetter( ) : 문자열의 구성이 알파벳 or 한글인지 확인 (문자열에 공백, 기호, 숫자가 있을시 false 리턴)
>    - isDigit( ) : 문자열의 구성이 숫자인지 확인
>    - isLetterOrDigit( ) : 문자열의 구성이 알파벳(한글) 또는 숫자인지 확인
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
>   > joinToString( ) 는 매개변수로 들어온 구분자를 값과 값 사이에 넣어서 하나의 문자열로 바꾸어 반환하는 함수
>
>   ```kotlin
>   val li = listOf("a", "b", "c")
>   println(li.joinToString("-"))  // a-b-c
>   ```
>
> - length / size
>
>   - .length : 문자열
>   - .size : 리스트, 배열 등
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
>    li.add(4)
>   println(li)  // [1, 2, 3, 4]
>   ```
>
> - add
>
>   - add( ) : 리스트의 끝에 값을 추가하는 함수
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
>   > 컬렉션의 각 요소에 대해 주어진 함수를 적용하고, 결과를 새로운 컬렉션으로 반환한다
>
>   ```kotlin
>   val li = listOf(1, 2, 3)
>   val ans = li.map { it * it }
>   println(ans)  // [1, 4, 9]
>   ```
>
> - fillter
>
>   > 컬렉션의 각 요소에 대해 주어진 조건을 검사하고, true를 반환하는 요소만 걸러내서 새로운 컬렉션으로 반환한다
>   
>   ```kotlin
>   val li = listOf(1, 2, 3, 4, 5)
>   val ans = li.filter { it % 2 == 0 }
>   println(ans)  // [2, 4]
>   ```
>
> - maxOrNull / minOrNull
>
>   - .maxOrNull( ) : 반복 가능한 자료형의 최댓값을 반환하는 함수
>   - .minOrNull( ) : 반복 가능한 자료형의 최솟값을 반환하는 함수
>
>   ```kotlin
>   val li = listOf(3, 5, 1)
>   println(li.maxOrNull())  // 5
> println(li.minOrNull())  // 1
>   ```
>
> - code / toChar
>
>   - ' '.code : 문자의 유니코드(Unicode) 값을 돌려주는 함수
>
>     (문자 → 정수)
>
>   - .toChar : 유니코드 값을 입력받아 그 코드에 해당하는 문자를 출력하는 함수
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
>   > .replace(old, new) 는 문자열에서 변경 전 문자(old)를 변경 후 문자(new)로 변경하고, 결과를 문자열로 반환
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
>   - reverse( ) : 리스트에서 원형을 변경, 리턴값 없음
>   - reversed( ) : 리스트에서 원형을 변경하지 않고, 반복 가능한 reversed 객체 반환
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
>   > round( ) 는 반올림해서 반환하는 함수
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
>   > setOf( ), mutableSetOf( ) 는 중복을 제거해주는 함수
>
>   ```kotlin
>   val se = mutableSetOf(1, 2, 2)
>   println(se)  // [1, 2]
>   ```
>
>   
>
>  - 
>
>  - 중복을 허용하지 않는다
>
>  - 순서가 없다 => 인덱싱으로 값을 얻을 수 없다
>
>   - 인덱싱으로 접근하려면 리스트 or 튜플로 변환해야 한다
>
>   - set() 하게되면 리스트가 set 타입이 되어서 {} 괄호로 묶인다
>
>   ```python
>  # 중복 제거
>   a = [1, 1, 2, 3]
>  >>> set(a)
>   {1, 2, 3}
>  >>> list(set(a))
>   [1, 2, 3]
> 
>   # | : 합집합 연산자
>   a = {1, 2, 3}
>   b = {2, 3, 4}
>   >>> a | b
>  {1, 2, 3, 4}
> 
>  # & : 교집합 연산자
>   a = {1, 2, 3}
>  b = {2, 3, 4}
>   >>> a & b
>   {2, 3}
> 
>   # - : 차집합 연산자
>   a = {1, 2, 3}
>   b = {2, 3, 4}
>  >>> a - b
>  {1}
> 
>  # 원소 추가
>   a = {1, 2, 3}
>  >>> a.add('a')
>   {1, 2, 3, 'a'}
> 
>   # 원소 삭제
>   a = {1, 2, 3}
>  >>> a.remove(2)
>   {1, 3}
>   ```
>
> - split
>
>   > split() 처럼 괄호 안에 아무 값도 넣어 주지 않으면 공백(스페이스, 탭, 엔터 등)을 기준으로 문자열을 나누어 준다
>   >
>   > 이렇게 나눈 값은 리스트에 하나씩 들어가게 된다
>
>  ```python
>   a = "Life is too short"
>  >>> a.split()
>   ['Life', 'is', 'too', 'short']
>  ```
>
> - str
>
>   > str(object) 은 문자열 형태로 객체를 변환하여 돌려주는 함수
>
>  ```python
>   >>> str(3)
>   '3'
>   >>> str('hi')
>   'hi'
>  ```
>
> - sum
>
>   > sum(iterable) 은 입력받은 리스트나 튜플의 모든 요소의 합을 돌려주는 함수
>
>   ```python
>  >>> sum([1,2,3])
>   6
>   >>> sum((4,5,6))
>   15
>
>   ```
> 
> - tuple
> 
>   > tuple(iterable) 은 반복 가능한 객체를 받아서, 튜플 자료형으로 변환해주는 함수
> 
>  ```python
>   # 리스트 > 튜플
>   a = [1, 2, 3]
>   t = tuple(a)
>   >>> print(t)  # (1, 2, 3)
> 
>   # 문자열 > 튜플
>  s = 'abc'
>   t = tuple(s)
>  >>> print(t)  # ('a', 'b', 'c')
>   ```
>
> - type
>
>   > type(object) 은 입력값의 자료형이 무엇인지 알려 주는 함수
>
>   ```python
>   >>> type("abc")
>   <class 'str'>
>   >>> type([ ])
>   <class 'list'>
>  ```
> 
> - upper / lower
> 
>  > string.upper() 는 문자열 내부에 모든 알파벳을 대문자로 변경
> 
>  > string.lower() 는 문자열 내부에 모든 알파벳을 소문자로 변경
> 
>   ```python
>   str = 'Hello'
>  >>> str.upper()
>   HELLO
>   >>> str.lower()
>   hello
>  ```
>
> - isupper / islower
>
>  > string.isupper() 는 문자열 내부에 있는 모든 문자가 대문자인지 검사하는 함수
>
>   > string.islower() 는 문자열 내부에 있는 모든 문자가 소문자인지 검사하는 함수
>
>  ```python
>   str1 = 'Hello'
>   str2 = 'WORLD'
>   >>> str1.islower()
>   False
>   >>> str2.isupper()
>     True
>  ```
>
> - zip
>
>   > zip(*iterable) 은 동일한 개수로 이루어진 자료형을 묶어 주는 역할을 하는 함수
>
>    *iterable 은 반복 가능(iterable)한 자료형 여러 개를 입력할 수 있다는 의미
>
>  ```python
>   >>> list(zip([1, 2, 3], [4, 5, 6]))
>  [(1, 4), (2, 5), (3, 6)]
>   >>> list(zip([1, 2, 3], [4, 5, 6], [7, 8, 9]))
>  [(1, 4, 7), (2, 5, 8), (3, 6, 9)]
>   >>> list(zip("abc", "def"))
>  [('a', 'd'), ('b', 'e'), ('c', 'f')]
>  ```
>
> 
>
> <hr>
> - enumerate
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