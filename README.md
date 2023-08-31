# AbilityCore
마인크래프트 능력자 시스템


SkilList.kt 파일(https://github.com/MAKEREKAM/AbilityCore/blob/master/src/main/java/kr/vanilage/main/SkillList.kt)에 자신이 추가할 능력을 넣습니다

Main 클래스 (https://github.com/MAKEREKAM/AbilityCore/blob/master/src/main/java/kr/vanilage/main/Main.kt)의 밑쪽에 register() 함수를 작성합니다.

```kotlin
register(SkillList."방금 작성한 능력명", "능력 설명 창에 표시될 이름 (능력 이름), "능력 설명", 이벤트를 발동할 때 사용할 아이템 타입(Material), 밑에서 작성할 이벤트 클래스의 객체 (class()처럼 작성), 능력 쿨타임(틱 단위, 크리에이티브에서는 적용되지 않음))
```
의 형태로 작성합니다.

능력이 실행될 이벤트 클래스를 만듭니다. (가능하면 abilities 패키지 안에 작성)

이벤트 클래스는 Ability 인터페이스(https://github.com/MAKEREKAM/AbilityCore/blob/master/src/main/java/kr/vanilage/main/Ability.kt)를 구현해야 합니다.
```kotlin
class Vampire : Ability{
}
```
의 식으로 작성합시다.

그 다음으로 클래스 안에 
```kotlin
override fun event(player : Player) {
}
```

꼴의 메서드를 작성해야 합니다.

그 안에 모든 시스템을 담으면 됩니다.

이벤트 발동 조건은 위의 register()함수에서 정의한 능력 아이템으로 좌클릭입니다. (또한 플레이어가 그 능력을 사용하고 있어야 합니다.)

크리에이티브가 아니라면 능력을 발동했을 때 아이템이 하나 소모됩니다.


예시로 뱀파이어 능력(레드스톤 블럭을 우클릭했을 때 주변 엔티티의 수만큼 체력이 회복됨)을 만들어 놓았으니 참고할 수도 있습니다.


/ac, /abilitycore 명령어로 능력 설정 창을 엽니다.(OP만 사용가능)

원하는 능력을 클릭하여 사용할수 있습니다.
